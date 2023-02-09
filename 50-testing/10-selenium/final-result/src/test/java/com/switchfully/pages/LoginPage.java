package com.switchfully.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class LoginPage extends BasePage {

    @FindBy
    private WebElement nonExistent;

    public void throwError() {
        nonExistent.click();
    }
}
