package com.practice.hrms.bdd.steps;
import com.practice.hrms.core.ConfigReader;
import com.practice.hrms.core.DriverFactory;
import com.practice.hrms.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
public class LoginSteps {
    private LoginPage page;
    @Given("the user opens the OrangeHRM login page")
    public void openLogin() { page = new LoginPage(DriverFactory.getDriver()).open(ConfigReader.get("base.url")); }
    @When("the user submits invalid login credentials")
    public void invalidLogin() { page.login("invalid_user_qa", "invalid_password_qa"); }
    @Then("the dashboard should not be displayed")
    public void dashboardNotDisplayed() { Assert.assertFalse(page.isDashboardVisible()); }
}
