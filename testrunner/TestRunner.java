package org.testrunner;

import org.junit.runner.RunWith;
import org.stepdefinition.stepDefnition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources", glue = "org.stepdefinition", dryRun = false, monochrome = true, strict = true)
public class TestRunner {
}
 