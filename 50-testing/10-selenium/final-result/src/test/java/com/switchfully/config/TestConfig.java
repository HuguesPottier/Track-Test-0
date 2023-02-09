package com.switchfully.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.*;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.URL;
import java.time.Duration;

@Configuration
@ComponentScan({"com.switchfully.pages"})
public class TestConfig {

    @Bean
    @Scope("singleton")
    public WebDriver webDriver() {
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
