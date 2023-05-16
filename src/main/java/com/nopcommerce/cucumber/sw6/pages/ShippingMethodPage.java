package com.nopcommerce.cucumber.sw6.pages;

import com.nopcommerce.cucumber.sw6.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingMethodPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShippingMethodPage.class.getName());

    public ShippingMethodPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement nextDayAirRadiobutton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_2']")
    WebElement secondDayAirRadioButton;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement continueButton;



    public void clickOnNextDayAirShippingMethod(){
        clickOnElement(nextDayAirRadiobutton);
        log.info("Clicking on next day air shipping method : " + nextDayAirRadiobutton.toString());

    }

    public void clickOnSecondDayAirShippingMethod(){
        clickOnElement(secondDayAirRadioButton);
        log.info("Clicking on second day air shipping method : " + secondDayAirRadioButton.toString());

    }

    public void clickOnContinueForPaymentMethod(){
        clickOnElement(continueButton);
        log.info("Clicking on continue button : " + continueButton.toString());

    }


}
