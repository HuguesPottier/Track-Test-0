package com.switchfully;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.List;

public class MyBetterOrganizedTest {

    ElementSelectionPage elementSelectionPage;
    ChromeDriver driver;

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", getChromeDriverUrl().getPath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        elementSelectionPage = new ElementSelectionPage(driver);
        PageFactory.initElements(driver, elementSelectionPage);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void aSeleniumTest() {
        String text = elementSelectionPage.open()
                .getParagraphText();

        Assertions.assertThat(text).isEqualTo("I am some text in a paragraph");
    }

    @Test
    void anotherSeleniumTest() {
        String text = elementSelectionPage.open()
                .getSpanText();

        Assertions.assertThat(text).isEqualTo("I am some text in a span");
    }

    @Test
    void addingAnElementToTheList() {
        List<String> itemList = elementSelectionPage.open()
                .addListItem("Strawberry")
                .getListItemList();

        Assertions.assertThat(itemList.get(itemList.size() - 1)).isEqualTo("Strawberry");
    }

    @Test
    void addingTwoElementsToTheList() {
        List<String> listItemList = elementSelectionPage.open()
                .addListItem("Strawberry")
                .addListItem("Stock")
                .getListItemList();

        Assertions.assertThat(listItemList.get(listItemList.size() - 2)).isEqualTo("Strawberry");
        Assertions.assertThat(listItemList.get(listItemList.size() - 1)).isEqualTo("Stock");
    }

    public URL getChromeDriverUrl() {
        try {
            return ResourceUtils.getURL("classpath:drivers/chromedriver-109.exe");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
