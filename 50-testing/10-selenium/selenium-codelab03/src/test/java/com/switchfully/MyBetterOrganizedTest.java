package com.switchfully;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.URL;

public class MyBetterOrganizedTest {

    @Test
    void aSeleniumTest() {
        System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://archive.switchfully.com/track/test/element-selection/");
        WebElement element = driver.findElement(By.id("paragraph"));
        String text = element.getText();
        Assertions.assertThat(text).isEqualTo("I am some text in a paragraph");
        driver.quit();
    }

    @Test
    void anotherSeleniumTest() {
        System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://archive.switchfully.com/track/test/element-selection/");
        WebElement element = driver.findElement(By.id("paragraph"));
        String text = element.getText();
        Assertions.assertThat(text).isEqualTo("I am some text in a paragraph");
        driver.quit();
    }

    @Test
    void addingAnElementToTheList() {
        System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://archive.switchfully.com/track/test/element-selection/");

        WebElement addItem = driver.findElement(By.id("add-item"));
        addItem.sendKeys("A new element");

        WebElement addItemButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addItemButton.click();

        WebElement lastListItem = driver.findElement(By.xpath("//ul/li[last()]"));
        Assertions.assertThat(lastListItem.getText()).isEqualTo("A new element");
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
