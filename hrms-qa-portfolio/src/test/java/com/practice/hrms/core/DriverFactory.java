package com.practice.hrms.core;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public final class DriverFactory {
    private static final ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();
    private DriverFactory() {}
    public static void startBrowser() {
        if (DRIVER.get() != null) return;
        ChromeOptions options = new ChromeOptions();
        if (Boolean.parseBoolean(System.getProperty("headless", "false"))) options.addArguments("--headless=new");
        options.addArguments("--window-size=1440,1000", "--disable-notifications");
        DRIVER.set(new ChromeDriver()); // Selenium Manager handles driver resolution in supported setups
        DRIVER.get().manage().timeouts().implicitlyWait(Duration.ZERO);
        DRIVER.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }
    public static WebDriver getDriver() {
        if (DRIVER.get() == null) throw new IllegalStateException("Browser not started");
        return DRIVER.get();
    }
    public static void stopBrowser() {
        WebDriver d = DRIVER.get();
        if (d != null) { try { d.quit(); } finally { DRIVER.remove(); } }
    }
}
