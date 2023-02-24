package com.switchfully.selenium.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class HeaderPage {
    private WebDriver webDriver;

    private ProfilePage profilePage;

    @FindBy(how = How.ID, using = "profile-link")
    private WebElement profileLink;

    public HeaderPage(WebDriver webDriver, ProfilePage profilePage) {
        this.webDriver = webDriver;
        this.profilePage = profilePage;
    }

    public ProfilePage goToProfilePage() {
        profileLink.click();
        return profilePage;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(webDriver, this);
    }
}
