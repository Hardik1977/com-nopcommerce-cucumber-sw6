package com.nopcommerce.cucumber.sw6.steps;

import com.nopcommerce.cucumber.sw6.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ComputersTestSteps {
    @Given("^I am on home page$")
    public void iIsOnHomePage() {

    }

    @When("^I click on the Computers top menu tab$")
    public void iClicksOnTheTopMenuTab()  {
        new HomePage().clickOnComputersTopMenu();
    }

    @And("^I click on Desktop link in Computers top menu dropdown$")
    public void iClickOnDesktopLinkInComputersTopMenuDropdown() {
        new HomePage().clickOnDesktopLinkInComputersTopMenuDropdown();
    }

    @And("^I select \"([^\"]*)\" option from the Sort By dropdown$")
    public void iSelectOptionFromTheSortByDropdown(String sortOption)  {
        new DeskTopsPage().selectSortByName(sortOption);

    }

    @Then("^Products should be arranged in descending order by name$")
    public void productsShouldBeArrangedInDescendingOrderByName() {
        new DeskTopsPage().verifySortedElementsInReverseOrder();
    }

    @And("^I add 'Build Your Own Computer' in the cart$")
    public void iAddBuildYourOwnComputerInTheCart() throws InterruptedException {
        Thread.sleep(1000);
        new DeskTopsPage().addBuildYourOwnComputerProductInCart();
    }

    @Then("^I verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String expectedText)  {
        String actualText = new ProductPage().verifyTitleOfBuildYourOwnComputerProduct();
        Assert.assertEquals(actualText,expectedText,"Invalid text" );
    }

    @When("^I select the \"([^\"]*)\" processor$")
    public void iSelectTheProcessor(String processor)  {
        new ProductPage().selectProcessorsOfBuildYourOwnComputer(processor);
    }

    @And("^I select \"([^\"]*)\" of RAM$")
    public void iSelectOfRAM(String ram)  {
        new ProductPage().selectRamOfBuildYourOwnComputer(ram);
    }


    @And("^I click on desired  HDD$")
    public void iClickOnDesiredHDD() {
        new ProductPage().clickOnHddOfBuildYourOwnComputer();
    }

    @And("^I click on desired  OS$")
    public void iClickOnDesiredOS() throws InterruptedException {
        new ProductPage().clickOnOsOfBuildYourOwnComputer();
    }

    @And("^I click on the software needed$")
    public void iClickOnTheSoftwareNeeded() {
        new ProductPage().clickOnSoftwareOfBuildYourOwnComputer();
    }

    @Then("^I verify the price \"([^\"]*)\" of Build Your Own Computer$")
    public void iVerifyThePriceOfBuildYourOwnComputer(String expectedPrice) throws InterruptedException {
        String actualPrice = new ProductPage().verifyPriceOfBuildYourOwnComputer();
        Assert.assertEquals(actualPrice,expectedPrice);
    }

    @When("^I click on 'Add To Cart' button after filters added$")
    public void iClickOnAddToCartButtonAfterFiltersAdded() {
        new ProductPage().clickOnAddToCartAfterFiltersAdded();
    }

    @Then("^I verify the message \"([^\"]*)\" on top green Bar$")
    public void iVerifyTheMessageOnTopGreenBar(String expectedMessage)  {
        String actualMessage = new ProductPage().verifyMessageOfProductAddedToCart();
        Assert.assertEquals(actualMessage,expectedMessage);
        new ProductPage().clickOnCloseBarToCloseMessage();
    }

    @When("^I mouse hover on 'Shopping Cart' link$")
    public void iMouseHoverOnShoppingCartLink() {
        new ProductPage().mouseHoverOnShoppingCartLink();
    }

    @And("^I mouse hover and click on 'Go to Cart' button button$")
    public void iMouseHoverAndClickOnGoToCartButtonButton() throws InterruptedException {
        new ProductPage().mouseHoverAndClickOnGoToCartButton();
    }

    @Then("^I verify the message \"([^\"]*)\"$")
    public void iVerifyTheMessage(String expectedMessage)  {
        String actualMessage = new ShoppingCartPage().verifyTitleOfShoppingCartPage();
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @When("^I change the quantity to \"([^\"]*)\"$")
    public void iChangeTheQuantityTo(String qty) throws InterruptedException {
        new ShoppingCartPage().changeTheQty(qty);
    }

    @And("^I click on 'Update shopping cart' button$")
    public void iClickOnUpdateShoppingCartButton() throws InterruptedException {
        new ShoppingCartPage().clickOnUpdateShoppingCartButton();
    }

    @Then("^I verify the total price \"([^\"]*)\"$")
    public void iVerifyTheTotalPrice(String expectedTotalPrice)  {
        String actualTotalPrice = new ShoppingCartPage().verifyTotalPriceOfProduct();
        Assert.assertEquals(actualTotalPrice,expectedTotalPrice);
    }

    @When("^I click on checkbox 'I agree with the terms of service'$")
    public void iClickOnCheckboxIAgreeWithTheTermsOfService() {
        new ShoppingCartPage().clickOnAgreeWithTermsOfServiceBox();
    }

    @And("^I click on 'Checkout' button$")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckoutButton();
    }

    @Then("^I verify the text as \"([^\"]*)\"$")
    public void iVerifyTheTextAs(String expectedText)  {
        String actualText = new SignInPage().verifyTitleOfSignPage();
        Assert.assertEquals(actualText,expectedText);
    }

    @When("^I click on 'Checkout As Guest' button$")
    public void iClickOnCheckoutAsGuestButton() {
        new SignInPage().clickOnCheckoutAsGuestButton();
    }

    @And("^I enter first name as \"([^\"]*)\"$")
    public void iEnterFirstNameAs(String firstName)  {
        new CheckoutPage().enterFirstName(firstName);
    }

    @And("^I enter last name as \"([^\"]*)\"$")
    public void iEnterLastNameAs(String lastName)  {
        new CheckoutPage().enterLastName(lastName);


    }

    @And("^I enter email as \"([^\"]*)\"$")
    public void iEnterEmailAs(String email)  {
        new CheckoutPage().enterEmail(email);

    }

    @And("^I select country from country field as \"([^\"]*)\"$")
    public void iSelectCountryFromCountryFieldAs(String country)  {
        new CheckoutPage().selectCountryFromCountryField(country);

    }

    @And("^I enter city as \"([^\"]*)\"$")
    public void iEnterCityAs(String city)  {
        new CheckoutPage().enterCity(city);

    }

    @And("^I enter address as \"([^\"]*)\"$")
    public void iEnterAddressAs(String address)  {
        new CheckoutPage().enterAddress(address);

    }

    @And("^I enter postal code as \"([^\"]*)\"$")
    public void iEnterPostalCodeAs(String postcode)  {
        new CheckoutPage().enterPostalCode(postcode);

    }

    @And("^I enter number as \"([^\"]*)\"$")
    public void iEnterNumberAs(String number)  {
        new CheckoutPage().enterNumber(number);

    }

    @And("^I click on 'Continue' button to shipping method$")
    public void iClickOnContinueButtonToShippingMethod() throws InterruptedException {
        new CheckoutPage().clickOnContinueButtonToShippingMethod();
    }

    @And("^I click on Next Day Air Shipping Method$")
    public void iClickOnNextDayAirShippingMethod() {
        new ShippingMethodPage().clickOnNextDayAirShippingMethod();
    }

    @And("^I click on 'Continue' for payment method$")
    public void iClickOnContinueForPaymentMethod() {
        new ShippingMethodPage().clickOnContinueForPaymentMethod();
    }

    @And("^I click on 'Credit card' radio button$")
    public void iClickOnCreditCardRadioButton() {
        new PaymentMethodPage().clickOnCreditCardRadioButton();
    }

    @And("^I click on 'Continue' button to payment information$")
    public void iClickOnContinueButtonToPaymentInformation() {
        new PaymentMethodPage().clickOnContinueButtonToPaymentInformation();
    }

    @And("^I select credit card type \"([^\"]*)\"$")
    public void iSelectCreditCardType(String creditCardType)  {
        new PaymentInformationPage().selectCreditCardType(creditCardType);
    }

    @And("^I enter card holder name as \"([^\"]*)\"$")
    public void iEnterCardHolderNameAs(String cardHolderName)  {
        new PaymentInformationPage().enterCardHolderName(cardHolderName);

    }

    @And("^I enter card number as \"([^\"]*)\"$")
    public void iEnterCardNumberAs(String cardNumber)  {
        new PaymentInformationPage().enterCardNumber(cardNumber);

    }

    @And("^I select expiry month as \"([^\"]*)\"$")
    public void iSelectExpiryMonthAs(String expiryMonth)  {
        new PaymentInformationPage().selectExpiryMonth(expiryMonth);

    }

    @And("^I select expiry year as \"([^\"]*)\"$")
    public void iSelectExpiryYearAs(String expiryYear)  {
        new PaymentInformationPage().selectExpiryYear(expiryYear);

    }

    @And("^I enter card code as \"([^\"]*)\"$")
    public void iEnterCardCodeAs(String cardCode)  {
        new PaymentInformationPage().enterCardCode(cardCode);

    }

    @And("^I click on 'Continue' to confirm order$")
    public void iClickOnContinueToConfirmOrder() {
        new PaymentInformationPage().clickOnContinueToConfirmOrder();

    }

    @Then("^I verify payment method is \"([^\"]*)\"$")
    public void iVerifyPaymentMethodIs(String expectedPaymentMethod)  {
        String actualPaymentMethod = new ConfirmOrderPage().verifyPaymentMethodName();
        Assert.assertEquals(actualPaymentMethod,expectedPaymentMethod);

    }

    @And("^I verify shipping method is \"([^\"]*)\"$")
    public void iVerifyShippingMethodIs(String expectedShippingMethod)  {
        String actualShippingMethod = new ConfirmOrderPage().verifyShippingMethodName();
        Assert.assertEquals(actualShippingMethod,expectedShippingMethod);

    }

    @And("^I verify total price is \"([^\"]*)\"$")
    public void iVerifyTotalPriceIs(String expectedTotalPrice)  {
        String actualTotalPrice = new ConfirmOrderPage().verifyTotalPrice();
        Assert.assertEquals(actualTotalPrice,expectedTotalPrice);

    }

    @When("^I click on 'Confirm' button$")
    public void iClickOnConfirmButton() {
        new ConfirmOrderPage().clickOnConfirmButton();
    }

    @Then("^I verify text \"([^\"]*)\"$")
    public void iVerifyText(String expectedText)  {
        String actualText =  new ConfirmOrderPage().verifyGreetingMessage();
        Assert.assertEquals(actualText,expectedText);

    }

    @And("^I verify the message on confirm order page as \"([^\"]*)\"$")
    public void iVerifyTheMessageOnConfirmOrderPageAs(String expectedMessage)  {
        String actualMessage = new ConfirmOrderPage().verifyOrderSuccessMessage();
        Assert.assertEquals(actualMessage,expectedMessage);
    }

    @When("^I click on 'Continue' to storage page$")
    public void iClickOnContinueToStoragePage() {
        new ConfirmOrderPage().clickOnContinueToStorePage();

    }


    @Then("^I verify the text pn login page \"([^\"]*)\"$")
    public void iVerifyTheTextPnLoginPage(String expectedText)  {
        new LogInPage().verifyTitleOfLoginPage();
    }
}
