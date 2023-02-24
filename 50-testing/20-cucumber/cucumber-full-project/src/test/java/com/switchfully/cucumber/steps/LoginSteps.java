package com.switchfully.cucumber.steps;

import com.switchfully.selenium.pages.HeaderPage;
import com.switchfully.selenium.pages.HomePage;
import com.switchfully.selenium.pages.ProfilePage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    private HomePage homePage;

    private HeaderPage headerPage;
    private ProfilePage profilePage;

    public LoginSteps(HomePage homePage, HeaderPage headerPage, ProfilePage profilePage) {
        this.homePage = homePage;
        this.headerPage = headerPage;
        this.profilePage = profilePage;
    }

    @Given("I am logged in as {string} with password {string}")
    public void iAmLoggedIn(String username, String password) {
        homePage.open()
                .clickLoginLink()
                .logIn(username, password);
    }

    @When("I am going to the profile page")
    public void goingToProfilePage() {
        headerPage.goToProfilePage();
    }

    @Then("I can see that the inss is {string}")
    public void thenICanSeeTheInss(String inss) {
        profilePage.assertThatInss(inss);
    }
}
