package com.practice.hrms.pages;
import com.practice.hrms.core.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
    private final WebDriver driver;
    private final By username = By.name("username");
    private final By password = By.name("password");
    private final By loginButton = By.cssSelector("button[type='submit']");
    private final By dashboard = By.xpath("//h6[normalize-space()='Dashboard']");
    public LoginPage(WebDriver driver) { this.driver = driver; }
    public LoginPage open(String url) { driver.get(url); return this; }
    public void login(String user, String pass) {
        Waits.visible(driver, username).clear();
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        Waits.clickable(driver, loginButton).click();
    }
    public boolean isDashboardVisible() {
        try { return Waits.visible(driver, dashboard).isDisplayed(); }
        catch (RuntimeException e) { return false; }
    }
    public boolean isLoginFormVisible() {
        return !driver.findElements(username).isEmpty() && !driver.findElements(password).isEmpty();
    }
}
