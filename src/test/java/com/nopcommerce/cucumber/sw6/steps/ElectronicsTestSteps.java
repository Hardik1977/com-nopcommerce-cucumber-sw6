package com.nopcommerce.cucumber.sw6.steps;

import com.nopcommerce.cucumber.sw6.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ElectronicsTestSteps {
    @When("^I mouse hover on 'Electronics' top menu tab$")
    public void iMouseHoverOnElectronicsTopMenuTab() {
        new HomePage().mouseHoverOnElectronicsTopMenuTab();
    }

    @And("^I mouse hover and click on 'Cell Phones' option in electronics tab$")
    public void iMouseHoverAndClickOnCellPhonesOptionInElectronicsTab() {
        new HomePage().mouseHoverAndClickOnCellPhonesOptionInElectronics();
    }

    @Then("^I verify the text on cell phones page as \"([^\"]*)\"$")
    public void iVerifyTheTextOnCellPhonesPageAs(String expectedText)  {
        String actualText = new CellPhonesPage().verifyCellPhonesText();
        Assert.assertEquals(actualText,expectedText);
    }

    @When("^I click on 'List View' tab$")
    public void iClickOnListViewTab() {
        new CellPhonesPage().clickOnListViewTab();
    }

    @And("^I click on the product name 'Nokia Lumia' link$")
    public void iClickOnTheProductNameNokiaLumiaLink() throws InterruptedException {
        new CellPhonesPage().clickOnNokiaLumiaCellPhone();
    }

    @Then("^I verify the product name as \"([^\"]*)\"$")
    public void iVerifyTheProductNameAs(String expectedProductName)  {
        String actualProductName = new ProductPage().verifyNokiaLumia1020();
        Assert.assertEquals(actualProductName,expectedProductName);
    }

    @And("^I verify the price of the product as \"([^\"]*)\"$")
    public void iVerifyThePriceOfTheProductAs(String expectedPrice)  {
        String actualPrice = new ProductPage().verifyPriceOfNokiaLumia();
        Assert.assertEquals(actualPrice,expectedPrice);
    }

    @And("^I click on 'Add To Cart' to add Nokia Lumia CellPhone$")
    public void iClickOnAddToCartToAddNokiaLumiaCellPhone() {
        new ProductPage().addToCartNokiaLumiaCellPhone();
    }

    @When("^I click on 'Register' tab$")
    public void iClickOnRegisterTab() {
        new SignInPage().clickOnRegisterTab();
    }

    @Then("^I verify the text on Register page as \"([^\"]*)\"$")
    public void iVerifyTheTextOnRegisterPageAs(String expectedTitle)  {
        String actualTitle = new RegisterPage().verifyRegisterTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @And("^I enter first name on register page as \"([^\"]*)\"$")
    public void iEnterFirstNameOnRegisterPageAs(String firstName)  {
        new RegisterPage().enterFirstName(firstName);
    }

    @And("^I enter last name on register page as \"([^\"]*)\"$")
    public void iEnterLastNameOnRegisterPageAs(String lastName)  {
        new RegisterPage().enterLastName(lastName);

    }

    @And("^I enter email on register page as \"([^\"]*)\"$")
    public void iEnterEmailOnRegisterPageAs(String email)  {
        new RegisterPage().enterEmail(email);

    }

    @And("^I enter password on register page as \"([^\"]*)\"$")
    public void iEnterPasswordOnRegisterPageAs(String password)  {
        new RegisterPage().enterPassword(password);

    }

    @And("^I enter confirm password on register page as \"([^\"]*)\"$")
    public void iEnterConfirmPasswordOnRegisterPageAs(String cPassword)  {
        new RegisterPage().enterConfirmPassword(cPassword);

    }

    @And("^I click on 'Register' button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("^I verify the message on register page as \"([^\"]*)\"$")
    public void iVerifyTheMessageOnRegisterPageAs(String expectedText)  {
        String actualText = new RegisterPage().verifyRegisterTitle();
    }

    @When("^I click on 'Continue' on register page$")
    public void iClickOnContinueOnRegisterPage() throws InterruptedException {
        new RegisterPage().clickOnContinueToShoppingCart();
    }

    @And("^I click on Second Day Air Shipping method$")
    public void iClickOnSecondDayAirShippingMethod() {
        new ShippingMethodPage().clickOnSecondDayAirShippingMethod();
    }

    @And("^I click on 'Logout' link$")
    public void iClickOnLogoutLink() {
        new LogInPage().clickOnLogoutLink();
    }

    @Then("^I verify the URL \"([^\"]*)\"$")
    public void iVerifyTheURL(String expectedUrl)  {

    }

    @When("^I change the quantity to \"([^\"]*)\" on product page$")
    public void iChangeTheQuantityToOnProductPage(String qty)  {
        new ProductPage().changeTheQty(qty);
    }
}
