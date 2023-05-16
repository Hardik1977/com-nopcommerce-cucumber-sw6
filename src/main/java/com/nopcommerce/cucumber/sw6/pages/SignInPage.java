package com.nopcommerce.cucumber.sw6.pages;

import com.nopcommerce.cucumber.sw6.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement signInText;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 checkout-as-guest-button']")
    WebElement checkoutAsGuestButton;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement checkoutWithRegister;

    @CacheLookup
    @FindBy(xpath = "//input[@class='email']")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//input[@class='password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;


    public String verifyTitleOfSignPage() {
        log.info("Getting title of Sign in page : " + signInText.toString());
        return getTextFromElement(signInText);
    }

    public void clickOnCheckoutAsGuestButton() {
        clickOnElement(checkoutAsGuestButton);
        log.info("Clicking on checkout as guest button : " + checkoutAsGuestButton.toString());

    }

    public void clickOnRegisterTab() {
        clickOnElement(checkoutWithRegister);
        log.info("Clicking on checkout with register button : " + checkoutWithRegister.toString());

    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
        log.info("Entering email : " + emailField.toString());

    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Entering password : " + passwordField.toString());


    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on login button : " + loginButton.toString());

    }


}
