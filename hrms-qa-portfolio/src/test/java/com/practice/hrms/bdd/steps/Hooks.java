package com.practice.hrms.bdd.steps;
import com.practice.hrms.core.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class Hooks {
    @Before public void beforeScenario() { DriverFactory.startBrowser(); }
    @After public void afterScenario() { DriverFactory.stopBrowser(); }
}
