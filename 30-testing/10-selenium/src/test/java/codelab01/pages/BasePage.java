package codelab01.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BasePage {

    @Autowired
    protected WebDriver driver;

    @PostConstruct
    public void init() {
        PageFactory.initElements(driver, this);
    }
}
