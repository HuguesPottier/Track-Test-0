package com.switchfully.cucumber.steps;

import com.switchfully.selenium.pages.HomePage;
import io.cucumber.java.en.Given;

public class LoginSteps {

    private HomePage homePage;

    public LoginSteps(HomePage homePage) {
        this.homePage = homePage;
    }

    @Given("A step")
    public void aStep() {
        homePage.open();
    }
}
