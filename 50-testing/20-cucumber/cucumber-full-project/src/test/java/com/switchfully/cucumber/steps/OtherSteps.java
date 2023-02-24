package com.switchfully.cucumber.steps;

import io.cucumber.java.After;
import io.cucumber.java.en.When;

public class OtherSteps {

    @When("I do something")
    public void doSomething() {
        System.out.println("Hello world");
    }

}
