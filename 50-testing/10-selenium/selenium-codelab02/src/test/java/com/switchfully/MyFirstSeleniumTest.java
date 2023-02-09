package com.switchfully;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.URL;

public class MyFirstSeleniumTest {

    @Test
    void aSeleniumTest() {
        System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
        ChromeDriver driver = new ChromeDriver();
    }

    public URL getChromeDriverUrl() {
        try {
            return ResourceUtils.getURL("classpath:drivers/chromedriver-109.exe");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
