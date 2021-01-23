package com.hepsiburada.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultPage extends Base {

    @FindBy(css = "li[class = 'search-item col lg-1 md-1 sm-1  custom-hover not-fashion-flex']")
    private List<WebElement> listedProducts;

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public void seeProductDetailsPage(int index) throws InterruptedException {
        WebElement specificProduct = waitUntilAllElementsVisible(listedProducts).get(index - 1);
        waitUntilClickable(specificProduct).click();
        Thread.sleep(2500);
    }
}
