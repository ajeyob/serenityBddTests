package com.test.serenityBddTests.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.rest.SerenityRest;

import org.junit.Assert;

public class SpringBootDemoDefinitions {
    @Steps
    AbstractRestAssuredHelper helper;
    private Response response;

    @Given("I send a request to the URL {string}")
    public void iSendARequest(String endpoint) throws Exception  {
        response = helper.getAnonymousRequest()
                .header("Content-Type", "application/json").when().get(endpoint);
    }

    @Then("the response will return {string}")
    public void extractResponse(String Expected ) {
        SerenityRest.restAssuredThat(response -> response.statusCode(200));
        String Actual = response.asString();
        System.out.println("Result :"+Actual);
        Assert.assertEquals(Expected, Actual);
    }

    @When("I call the end point {string}")
    public void iCallTheEndPoint(String fullUrl) {
        helper.configureRestAssured();
        response = helper.getAnonymousRequest()
                .header("Content-Type", "application/json").
                when()
                .get(fullUrl);
    }


    @Then("The status should be {int}")
    public void theStatusShouldBe(int statusCode) {
        Assert.assertEquals(200,response.getStatusCode());
    }
}
