package com.switchfully.selenium;

import io.cucumber.spring.ScenarioScope;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.URL;
import java.time.Duration;

@Configuration
@ComponentScan({"com.switchfully.selenium","com.switchfully.cucumber.state"})
public class SeleniumConfiguration {

    @Bean
    @ScenarioScope
    /**
     * For the most mysterious reason on earth the return type of this method needs to be ChromeDriver
     * If you change the type to WebDriver, the bean will be null when trying to take a screenshot on failure.
     */
    public ChromeDriver webDriver() {
        System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        return driver;
    }

    public URL getChromeDriverUrl() {
        try {
            return ResourceUtils.getURL("classpath:drivers/chromedriver-109.exe");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
