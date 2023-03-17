package com.switchfully.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

import static org.openqa.selenium.support.How.XPATH;

@Component
public class HomePage {

    private ChromeDriver chromeDriver;

    private LoginPage loginPage;

    @FindBy(how = XPATH, using = "//a[text()='Login']")
    private WebElement loginLink;

    public HomePage(ChromeDriver chromeDriver, LoginPage loginPage) {
        this.chromeDriver = chromeDriver;
        this.loginPage = loginPage;
    }


    public HomePage open() {
        chromeDriver.get("https://archive.switchfully.com/track/test/digibooky/");
        return this;
    }

    public LoginPage goToLogin() {
        loginLink.click();
        return loginPage;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(chromeDriver, this);
    }
}
