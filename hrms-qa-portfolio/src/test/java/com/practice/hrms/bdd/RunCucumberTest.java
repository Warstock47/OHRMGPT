package com.practice.hrms.bdd;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/test/resources/features",
 glue = "com.practice.hrms.bdd.steps",
 plugin = {"pretty", "html:target/cucumber-report.html"},
 tags = "not @wip")
public class RunCucumberTest extends AbstractTestNGCucumberTests {}
