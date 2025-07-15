package com.test.serenityBddTests.definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UiSteps {

    @Managed
    WebDriver driver;

    Actor systemUser= Actor.named("systemUser");

    @Before("@UI")
    public void setupActor(){
        systemUser.can(BrowseTheWeb.with(driver));
    }
    @After("@UI")
    public void tearDown(){
        driver.close();
        driver.quit();
    }


    @When("I try to access {string}")
    public void accessWebPage(String urlOfWebPage){
       systemUser.attemptsTo(Open.url(urlOfWebPage));
    }


    @Then("The page should be loaded successfully")
    public void thePageShouldBeLoadedSuccessfully() {
        Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Google"));
    }
}
