package com.test.serenityBddTests.runners;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(features = "src/test/resources/features", tags = "@UI", glue = "com.test.serenityBddTests")
public class UiRunner {
}
