package com.sparta.logan.TestFramework;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"com.sparta.logan.TestFramework.StepDefs"},
        plugin={"pretty", "html:target/testReport.html", "json:target/jsonReport.json"},
        publish=true
)

public class TestRunner {
}
