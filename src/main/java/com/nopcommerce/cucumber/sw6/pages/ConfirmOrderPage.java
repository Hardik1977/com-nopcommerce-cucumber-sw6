package com.nopcommerce.cucumber.sw6.pages;

import com.nopcommerce.cucumber.sw6.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmOrderPage extends Utility {


    private static final Logger log = LogManager.getLogger(ConfirmOrderPage.class.getName());

    public ConfirmOrderPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Credit Card']")
    WebElement paymentMethodText;

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']")
    WebElement shippingMethodText;

    @CacheLookup
    @FindBy(xpath = "//td[@class='subtotal']" )
    WebElement totalPriceText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmButton;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Thank you']")
    WebElement greetingMessage;

    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement orderSuccessMessage;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']" )
    WebElement continueButton;



    public String verifyPaymentMethodName(){
        log.info("Getting payment method name : " + paymentMethodText.toString());
        return getTextFromElement(paymentMethodText);
    }

    public String verifyShippingMethodName(){
        log.info("Getting shipping method name : " + shippingMethodText.toString());
        return getTextFromElement(shippingMethodText);
    }

    public String verifyTotalPrice(){
        log.info("Getting total price : " + totalPriceText.toString());
        return getTextFromElement(totalPriceText);
    }

    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
        log.info("Clicking on confirm button : " + confirmButton.toString());
    }

    public String verifyGreetingMessage(){
        log.info("Getting greeting message : " + greetingMessage.toString());
        return getTextFromElement(greetingMessage);
    }

    public String verifyOrderSuccessMessage(){
        log.info("Getting order success message : " + orderSuccessMessage.toString());
        return getTextFromElement(orderSuccessMessage);
    }

    public void clickOnContinueToStorePage(){
        clickOnElement(continueButton);
        log.info("Clicking on continue : " + continueButton.toString());

    }

}
