package com.jw.testing;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FizzBuzzStepdefs {
    FizzBuzz fizzBuzz;
    String result;

    @Given("^create a FizzBuzz game$")
    public void createAFizzBuzzGame() throws Throwable {
        fizzBuzz = new FizzBuzz();
    }

    @When("^pass a number (\\d+)$")
    public void passANumber(int num) throws Throwable {
        result = fizzBuzz.play(num);
    }

    @Then("^I will get \"([^\"]*)\"$")
    public void iWillGet(String resultStr) throws Throwable {
        Assert.assertEquals(resultStr, result);
    }
}
