package com.hepsiburada.pages;

import com.hepsiburada.configuration.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class HomePage extends Base {

    @FindBy(css = "[class='desktopOldAutosuggestTheme-input']")
    private WebElement searchBox;

    @FindBy(css = "[class='SearchBoxOld-buttonContainer']")
    private WebElement searchBtn;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigateToHomePage() throws IOException {
        driver.get(Config.getValue("url"));
    }

    public void searchProduct(String productName) {
        waitUntilClickable(searchBox).sendKeys(productName);
        waitUntilClickable(searchBtn).click();
    }
}
