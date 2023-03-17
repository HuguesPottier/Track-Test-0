package com.switchfully.selenium.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class HomePage {

    private ChromeDriver chromeDriver;

    public HomePage(ChromeDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public HomePage open() {
        chromeDriver.get("https://archive.switchfully.com/track/test/digibooky");
        return this;
    }

    @PostConstruct
    public void init() {
        PageFactory.initElements(chromeDriver, this);
    }
}
