package com.practice.hrms.tests;
import com.practice.hrms.core.ConfigReader;
import com.practice.hrms.core.DriverFactory;
import com.practice.hrms.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class OrangeHRMLoginTest {
    private WebDriver driver;
    @BeforeMethod public void setUp() { DriverFactory.startBrowser(); driver = DriverFactory.getDriver(); }
    @Test public void loginPageShouldLoad() {
        LoginPage page = new LoginPage(driver).open(ConfigReader.get("base.url"));
        Assert.assertTrue(page.isLoginFormVisible(), "Login form should be visible");
    }
    @Test public void invalidLoginShouldNotOpenDashboard() {
        LoginPage page = new LoginPage(driver).open(ConfigReader.get("base.url"));
        page.login("invalid_user_qa", "invalid_password_qa");
        Assert.assertFalse(page.isDashboardVisible(), "Invalid credentials must not open dashboard");
    }
    @AfterMethod(alwaysRun = true) public void tearDown() { DriverFactory.stopBrowser(); }
}
