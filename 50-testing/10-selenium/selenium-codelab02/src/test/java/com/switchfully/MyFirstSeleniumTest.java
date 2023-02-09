package com.switchfully;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.URL;

public class MyFirstSeleniumTest {

    @Test
    void aSeleniumTest() {
        System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://archive.switchfully.com/track/test/element-selection/");
        WebElement element = driver.findElement(By.id("paragraph"));
        String text = element.getText();
        Assertions.assertThat(text).isEqualTo("I am some text in a paragraph");
        driver.quit();
    }

    public URL getChromeDriverUrl() {
        try {
            return ResourceUtils.getURL("classpath:drivers/chromedriver-109.exe");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
