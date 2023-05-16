package com.nopcommerce.cucumber.sw6.pages;

import com.nopcommerce.cucumber.sw6.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentInformationPage extends Utility {

    private static final Logger log = LogManager.getLogger(PaymentInformationPage.class.getName());

    public PaymentInformationPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement creditCardField;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderNameField;

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumberField;

    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonthField;

    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expiredYearField;

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCodeField;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement continueButton;


    public void selectCreditCardType(String creditCardType) {
        selectByVisibleTextFromDropDown(creditCardField, creditCardType);
        log.info("Selecting credit card type : " + creditCardField.toString());

    }

    public void enterCardHolderName(String cardHolderName) {
        sendTextToElement(cardHolderNameField, cardHolderName);
        log.info("Entering card holder name : " + cardHolderNameField.toString());
    }

    public void enterCardNumber(String cardNumber) {
        sendTextToElement(cardNumberField, cardNumber);
        log.info("Entering card number : " + cardNumberField.toString());

    }

    public void selectExpiryMonth(String expiredMonth) {
        selectByVisibleTextFromDropDown(expireMonthField, expiredMonth);
        log.info("Selecting expiry month : " + expireMonthField.toString());

    }

    public void selectExpiryYear(String expiredYear) {
        selectByVisibleTextFromDropDown(expiredYearField, expiredYear);
        log.info("Selecting expiry year : " + expiredYearField.toString());

    }

    public void enterCardCode(String cardCode) {
        sendTextToElement(cardCodeField, cardCode);
        log.info("Entering card code : " + cardCodeField.toString());

    }

    public void clickOnContinueToConfirmOrder() {
        clickOnElement(continueButton);
        log.info("Clicking on continue button : " + continueButton.toString());

    }
}
