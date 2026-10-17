package com.practice.hrms.core;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public final class Waits {
    private Waits() {}
    public static WebElement visible(WebDriver d, By by) {
        return new WebDriverWait(d, Duration.ofSeconds(ConfigReader.getInt("explicit.wait.seconds")))
            .until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static WebElement clickable(WebDriver d, By by) {
        return new WebDriverWait(d, Duration.ofSeconds(ConfigReader.getInt("explicit.wait.seconds")))
            .until(ExpectedConditions.elementToBeClickable(by));
    }
}
