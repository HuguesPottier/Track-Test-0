package com.switchfully;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

import static org.openqa.selenium.support.How.ID;
import static org.openqa.selenium.support.How.XPATH;

public class ElementSelectionPage {
    private ChromeDriver driver;

    @FindBy(how = ID, using = "paragraph")
    private WebElement paragraph;

    @FindBy(how = ID, using = "span")
    private WebElement span;

    @FindBy(how = ID, using = "add-item")
    private WebElement addItemInput;

    @FindBy(how = XPATH, using = "//button[text()='Add Element']")
    private WebElement addItemButton;

    @FindBy(how = XPATH, using = "//ul/li")
    private List<WebElement> listItemList;

    public ElementSelectionPage(ChromeDriver driver) {
        this.driver = driver;
    }


    public ElementSelectionPage open() {
        driver.get("https://archive.switchfully.com/track/test/element-selection/");
        return this;
    }

    public String getParagraphText() {
        WebElement paragraph = driver.findElement(By.id("paragraph"));
        return paragraph.getText();
    }

    public String getSpanText() {
        return span.getText();
    }

    public ElementSelectionPage addListItem(String elementName) {
        addItemInput.sendKeys(elementName);
        addItemButton.click();
        return this;
    }

    public List<String> getListItemList() {
        return listItemList
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

    }
}
