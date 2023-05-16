package com.nopcommerce.cucumber.sw6.pages;

import com.nopcommerce.cucumber.sw6.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {

    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//td[@class='quantity']/child::input")
    WebElement qtyTextBox;

    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateShoppingCartButton;

    @CacheLookup
    @FindBy(xpath = "//tr[@class='order-total']//td[@class='cart-total-right']")
    WebElement totalPriceText;

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement agreementCheckbox;

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkoutButton;


    public String verifyTitleOfShoppingCartPage() {
        log.info("Getting title of shopping cart page : " + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public void changeTheQty(String qty) throws InterruptedException {
        clearTextField(qtyTextBox);
        Thread.sleep(1000);
        sendTextToElement(qtyTextBox, qty);
        log.info("Changing the quantity : " + qtyTextBox.toString());
    }

    public void clickOnUpdateShoppingCartButton() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(updateShoppingCartButton);
        log.info("Clicking on update shopping cart : " + updateShoppingCartButton.toString());

    }

    public String verifyTotalPriceOfProduct() {
        log.info("Getting total price of product : " + totalPriceText.toString());
        return getTextFromElement(totalPriceText);
    }

    public void clickOnAgreeWithTermsOfServiceBox() {
        clickOnElement(agreementCheckbox);
        log.info("Clicking on agree with terms of service box : " + agreementCheckbox.toString());

    }

    public void clickOnCheckoutButton() {
        clickOnElement(checkoutButton);
        log.info("Clicking on checkout button : " + checkoutButton.toString());

    }


}
