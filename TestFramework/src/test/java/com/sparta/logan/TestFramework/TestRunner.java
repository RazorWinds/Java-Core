package com.sparta.logan.TestFramework;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"com.sparta.logan.TestFramework.StepDefs"}
)

public class TestRunner {
}
