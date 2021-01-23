package com.hepsiburada.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class PageBase {

    public static WebDriver driver;
    public WebDriverWait wait;

    protected PageBase(WebDriver driver) {
        PageBase.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public WebElement waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public WebElement waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

    public List<WebElement> waitUntilAllElementsVisible(List<WebElement> listedProducts) {
        wait.until(ExpectedConditions.visibilityOfAllElements(listedProducts));
        return listedProducts;
    }
}
