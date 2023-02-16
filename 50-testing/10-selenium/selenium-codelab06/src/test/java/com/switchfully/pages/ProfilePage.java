package com.switchfully.pages;

import jakarta.annotation.PostConstruct;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

import static org.openqa.selenium.support.How.ID;

@Component
public class ProfilePage {

    private ChromeDriver chromeDriver;

    @FindBy(how = ID, using = "inss")
    private WebElement inssField;

    public ProfilePage(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public ProfilePage asserThatInss(String inss) {
        Assertions.assertThat(inssField.getAttribute("value")).isEqualTo(inss);
        return this;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(chromeDriver, this);
    }
}
