package com.hepsiburada.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends Base {

    @FindBy(css = "[id='addToCart']")
    private WebElement addToChart;

    @FindBy(css = "[class='sf-SalesFrontCashProductInfo-3jPka']")
    private WebElement basketMsg;

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }
    public void addTheProductToChart() {
        waitUntilClickable(addToChart).sendKeys(Keys.ENTER);
    }

    public String seeTheMessage(String msg) {
        return waitUntilVisible(basketMsg).getText();
    }
}
