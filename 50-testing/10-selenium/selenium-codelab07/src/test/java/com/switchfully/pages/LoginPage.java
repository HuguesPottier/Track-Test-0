package com.switchfully.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

import static org.openqa.selenium.support.How.ID;
import static org.openqa.selenium.support.How.XPATH;

@Component
public class LoginPage {

    private ChromeDriver chromeDriver;

    private ProfilePage profilePage;

    @FindBy(how = ID, using = "email")
    private WebElement emailInput;

    @FindBy(how = ID, using = "password")
    private WebElement passwordInput;

    @FindBy(how = XPATH, using = "//button[text()='Login']")
    private WebElement loginButton;

    public LoginPage(ChromeDriver chromeDriver, ProfilePage profilePage) {
        this.chromeDriver = chromeDriver;
        this.profilePage = profilePage;
    }

    public ProfilePage logIn(String username, String password) {
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
        return profilePage;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(chromeDriver, this);
    }
}
