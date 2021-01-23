package com.hepsiburada.pages;

import com.hepsiburada.core.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base extends PageBase {
    public Base(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        driver.manage().window().maximize();
    }
}
