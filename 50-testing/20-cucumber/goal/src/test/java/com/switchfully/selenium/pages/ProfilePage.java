package com.switchfully.selenium.pages;

import jakarta.annotation.PostConstruct;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

import static org.openqa.selenium.support.How.ID;

@Component
public class ProfilePage {

    private WebDriver webDriver;

    @FindBy(how = ID, using = "inss")
    private WebElement inssField;

    public ProfilePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public ProfilePage assertThatInss(String inss) {
        Assertions.assertThat(inssField.getAttribute("value")).isEqualTo(inss);
        return this;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(webDriver, this);
    }
}
