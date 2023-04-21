package com.switchfully;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.List;

public class MyBetterOrganizedTest {

    @Test
    void aSeleniumTest() {
        System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://archive.switchfully.com/track/test/element-selection/");
        WebElement paragraph = driver.findElement(By.id("paragraph"));
        Assertions.assertThat(paragraph.getText()).isEqualTo("I am some text in a paragraph");
        driver.quit();
    }

    @Test
    void anotherSeleniumTest() {
        System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://archive.switchfully.com/track/test/element-selection/");
        WebElement span = driver.findElement(By.id("span"));

        Assertions.assertThat(span.getText()).isEqualTo("I am some text in a span");
        driver.quit();
    }

    @Test
    void addingAnElementToTheList() {
        System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://archive.switchfully.com/track/test/element-selection/");
        WebElement addItem = driver.findElement(By.id("add-item"));
        addItem.sendKeys("Strawberry");

        WebElement addItemButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addItemButton.click();

        WebElement lastListItem = driver.findElement(By.xpath("//ul/li[last()]"));
        Assertions.assertThat(lastListItem.getText()).isEqualTo("Strawberry");
        driver.quit();
    }

    @Test
    void addingTwoElementsToTheList() {
        System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://archive.switchfully.com/track/test/element-selection/");
        WebElement addItem = driver.findElement(By.id("add-item"));
        addItem.sendKeys("Strawberry");

        WebElement addItemButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addItemButton.click();

        addItem.sendKeys("Stock");
        addItemButton.click();

        WebElement previousLastListItem = driver.findElement(By.xpath("//ul/li[last() - 1]"));
        WebElement lastListItem = driver.findElement(By.xpath("//ul/li[last()]"));
        Assertions.assertThat(previousLastListItem.getText()).isEqualTo("Strawberry");
        Assertions.assertThat(lastListItem.getText()).isEqualTo("Stock");
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
