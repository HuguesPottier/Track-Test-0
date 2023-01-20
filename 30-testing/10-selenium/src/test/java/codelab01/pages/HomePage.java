package codelab01.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.openqa.selenium.support.How.ID;

@Component
public class HomePage extends BasePage {

    @Autowired
    private LoginPage loginPage;

    @FindBy(how = ID, using = "login-nav-button")
    private WebElement webElement;

    public HomePage open() {
        driver.get("http://localhost:4200");
        return this;
    }

    public LoginPage goToLogin() {
        webElement.click();
        return loginPage;
    }


}
