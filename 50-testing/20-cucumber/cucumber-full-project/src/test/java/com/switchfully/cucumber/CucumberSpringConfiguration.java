package com.switchfully.cucumber;

import com.switchfully.selenium.SeleniumConfiguration;
import com.switchfully.selenium.screenshot.ScreenshotTaker;
import com.switchfully.selenium.screenshot.WebDriverQuitter;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SeleniumConfiguration.class)
public class CucumberSpringConfiguration {


    @Autowired
    private ScreenshotTaker screenshotTaker;

    @Autowired
    private WebDriverQuitter webDriveQuiter;

    @After
    public void after(Scenario scenario) {
        if(scenario.isFailed()) {
            screenshotTaker.takeScreenshot(scenario.getName());
        }
        webDriveQuiter.quit();
    }

}