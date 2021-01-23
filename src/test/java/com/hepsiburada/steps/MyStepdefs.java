package com.hepsiburada.steps;

import com.hepsiburada.core.TestBase;
import com.hepsiburada.pages.HomePage;
import com.hepsiburada.pages.ProductDetailsPage;
import com.hepsiburada.pages.ResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;

public class MyStepdefs extends TestBase {
    private HomePage homePage;
    private ResultPage resultPage;
    private ProductDetailsPage productDetailsPage;

    public MyStepdefs() {
        this.homePage = new HomePage(driver);
        this.resultPage = new ResultPage(driver);
        this.productDetailsPage = new ProductDetailsPage(driver);
    }

    @Given("User is on the HomePage")
    public void userIsOnTheHomePage() throws IOException {
        homePage.navigateToHomePage();
    }

    @When("User search for {string}")
    public void userSearchFor(String productName) {
        homePage.searchProduct(productName);
    }

    @And("User should see the details of {int}th product")
    public void userShouldSeeTheDetailsOfThProduct(int productIndex) throws InterruptedException {
        resultPage.seeProductDetailsPage(productIndex);
    }

    @And("User should click add")
    public void userShouldClickAdd() {
        productDetailsPage.addTheProductToChart();
    }

    @Then("User should see message {string}")
    public void userShouldSeeMessage(String msg) {
        Assert.assertEquals(msg, productDetailsPage.seeTheMessage(msg));
    }
}
