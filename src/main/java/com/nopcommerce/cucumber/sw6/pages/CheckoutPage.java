package com.nopcommerce.cucumber.sw6.pages;

import com.nopcommerce.cucumber.sw6.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends Utility {
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countryField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postalCodeField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement numberField;

    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButtonToShoppingCart;

    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());
    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }




    public void enterFirstName(String firstName){
        sendTextToElement(firstNameField, firstName);
        log.info("Entering first name : " + firstNameField.toString());

    }

    public void enterLastName(String lastName){
        sendTextToElement(lastNameField, lastName);
        log.info("Entering last name : " + lastNameField.toString());

    }

    public void enterEmail(String email){
        sendTextToElement(emailField, email);
        log.info("Entering email : " + emailField.toString());

    }

    public void selectCountryFromCountryField(String country){
        selectByVisibleTextFromDropDown(countryField, country);
        log.info("Selecting country from country field : " + countryField.toString());

    }


    public void enterCity(String city){
        sendTextToElement(cityField, city);
        log.info("Entering city : " + cityField.toString());

    }

    public void enterAddress(String address){
        sendTextToElement(addressField, address);
        log.info("Entering address : " + addressField.toString());

    }

    public void enterPostalCode(String postcode){
        sendTextToElement(postalCodeField, postcode);
        log.info("Entering postcode : " + postalCodeField.toString());

    }

    public void enterNumber(String number){
        sendTextToElement(numberField, number);
        log.info("Entering number : " + numberField.toString());

    }

    public void clickOnContinueButtonToShippingMethod() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(continueButton);
        log.info("Clicking on continue button : " + continueButton.toString());

    }

    public void clickOnContinueButtonToShoppingCart() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(continueButtonToShoppingCart);
        log.info("Clicking on continue button : " + continueButtonToShoppingCart.toString());

    }


}
