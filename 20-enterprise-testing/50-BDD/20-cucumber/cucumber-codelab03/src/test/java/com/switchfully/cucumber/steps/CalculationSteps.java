package com.switchfully.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class CalculationSteps {
    private Integer leftHand;
    private Integer rightHand;
    private Integer solution;

    @Given("The numbers {int} and {int}")
    public void givenTwoNumbers(Integer leftHand, Integer rightHand) {
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }


    @When("Adding these together")
    public void adding_these_together() {
        this.solution = leftHand + rightHand;
    }

    @Then("The result will be {int}")
    public void the_result_will_be(Integer solution) {
        Assertions.assertThat(this.solution).isEqualTo(solution);
    }

    @When("Subtracting one from the other")
    public void subtractingTheseFromEachOther() {
        this.solution = rightHand - leftHand;
    }

    @When("Multiplying these with each other")
    public void multiplyingTheseWithEachOther() {
        this.solution = leftHand * rightHand;
    }

    @When("Dividing one with the other")
    public void dividingOneWithTheOther() {
        this.solution = leftHand / rightHand;
    }
}
