package com.test.serenityBddTests.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features", tags = "", glue = "com.test.serenityBddTests", publish = true)
public class SpringRunnerTests {
}
