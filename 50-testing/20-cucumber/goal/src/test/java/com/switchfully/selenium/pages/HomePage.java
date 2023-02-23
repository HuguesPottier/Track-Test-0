package com.switchfully.selenium.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

import static org.openqa.selenium.support.How.XPATH;

@Component
public class HomePage {

    private WebDriver webDriver;

    private LoginPage loginPage;

    @FindBy(how = XPATH, using = "//a[text()='Login']")
    private WebElement loginLink;

    public HomePage(WebDriver webDriver, LoginPage loginPage) {
        this.webDriver = webDriver;
        this.loginPage = loginPage;
    }

    public HomePage open() {
        webDriver.get("https://archive.switchfully.com/track/test/digibooky");
        return this;
    }

    public LoginPage clickLoginLink() {
        loginLink.click();
        return loginPage;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(webDriver, this);
    }


}
