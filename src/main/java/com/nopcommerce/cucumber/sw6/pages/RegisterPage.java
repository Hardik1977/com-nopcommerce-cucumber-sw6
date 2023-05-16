package com.nopcommerce.cucumber.sw6.pages;

import com.nopcommerce.cucumber.sw6.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {


    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerTitle;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueToCart;



    public String verifyRegisterTitle(){
        log.info("Getting register title : " + registerTitle.toString());
        return getTextFromElement(registerTitle);
    }

    public void enterFirstName(String firstName){
        sendTextToElement(firstNameField,firstName);
        log.info("Entering first name : " + firstNameField.toString());

    }

    public void enterLastName(String lastName){
        sendTextToElement(lastNameField,lastName);
        log.info("Entering last name : " + lastNameField.toString());

    }

    public void enterEmail(String email){
        sendTextToElement(emailField,email);
        log.info("Entering email : " + emailField.toString());


    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
        log.info("Entering password : " + passwordField.toString());
    }

    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordField,confirmPassword);
        log.info("Entering confirmed password : " + confirmPasswordField.toString());

    }


    public void clickOnRegisterButton(){
        clickOnElement(registerButton);
        log.info("Clicking on register button : " + registerButton.toString());

    }

    public String verifyRegistrationMessage(){
        log.info("Getting registration message : " + registrationMessage.toString());
        return getTextFromElement(registrationMessage);
    }

    public void clickOnContinueToShoppingCart() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(continueToCart);
        log.info("Clicking on continue : " + continueToCart.toString());
    }


    public void clickOnLoginLink(){
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }


}
