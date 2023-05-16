package com.nopcommerce.cucumber.sw6.pages;

import com.nopcommerce.cucumber.sw6.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());
    public ProductPage() {
        PageFactory.initElements(driver, this);
    }



    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerText;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processorOfBuildYourOwnComputer;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ramOfBuildYourOwnComputer;

    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hddOfBuildYourOwnComputer;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement osOfBuildYourOwnComputer;

    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement softwareOfBuildYourOwnComputer;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='bar-notification success']")
    WebElement productAddedToCartMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeMessage;

    @CacheLookup
    @FindBy(id = "topcartlink")
    WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCartButton;

    @CacheLookup
    @FindBy(id = "price-value-1")
    WebElement priceOfBuildYourOwnComputer;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Nokia Lumia 1020']")
    WebElement nokiaLumiaText;

    @CacheLookup
    @FindBy(id = "price-value-20")
    WebElement priceTextOfNokiaLumia;

    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement qtyTextBox;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-20")
    WebElement addToCartTab;




    public String verifyTitleOfBuildYourOwnComputerProduct(){
        log.info("Getting title of build your own computer product : " + buildYourOwnComputerText.toString());
        return getTextFromElement(buildYourOwnComputerText);
    }

    public void selectProcessorsOfBuildYourOwnComputer(String processor){
        selectByVisibleTextFromDropDown(processorOfBuildYourOwnComputer,processor);
        log.info("Selecting processor of build your own computer : " + priceOfBuildYourOwnComputer.toString());

    }

    public void selectRamOfBuildYourOwnComputer(String ram){
        selectByVisibleTextFromDropDown(ramOfBuildYourOwnComputer, ram);
        log.info("Selecting RAM of build your own computer : " + ramOfBuildYourOwnComputer.toString());

    }

    public void clickOnHddOfBuildYourOwnComputer(){
        clickOnElement(hddOfBuildYourOwnComputer);
        log.info("Clicking on hdd of build your own computer : " + hddOfBuildYourOwnComputer.toString());

    }

    public void clickOnOsOfBuildYourOwnComputer() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(osOfBuildYourOwnComputer);
        log.info("Clicking on os of build your own computer : " + osOfBuildYourOwnComputer.toString());

    }

    public void clickOnSoftwareOfBuildYourOwnComputer(){
        clickOnElement(softwareOfBuildYourOwnComputer);
        log.info("Clicking on software of build your own computer : " + softwareOfBuildYourOwnComputer.toString());

    }

    public String verifyPriceOfBuildYourOwnComputer() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Getting price of build your own computer : " + priceOfBuildYourOwnComputer.toString());
        return getTextFromElement(priceOfBuildYourOwnComputer) ;

    }



    public void clickOnAddToCartAfterFiltersAdded(){
        clickOnElement(addToCartButton);
        log.info("Adding to cart : " + addToCartButton.toString());

    }

    public String verifyMessageOfProductAddedToCart(){
        log.info("Getting Message of product added to cart : " + productAddedToCartMessage.toString());
        return getTextFromElement(productAddedToCartMessage);
    }

    public void clickOnCloseBarToCloseMessage(){
        clickOnElement(closeMessage);
        log.info("Clicking on close bar to close message : " + closeMessage.toString());
    }

    public void mouseHoverOnShoppingCartLink(){
        mouseHoverToElement(shoppingCartLink);
        log.info("Mouse hovering on shopping cart link : " + shoppingCartLink.toString());
    }

    public void mouseHoverAndClickOnGoToCartButton() throws InterruptedException {
        Thread.sleep(1000);
        mouseHoverToElementAndClick(goToCartButton);
        log.info("Mouse hover and click on go to cart button : " + goToCartButton.toString());
    }

    public String verifyNokiaLumia1020(){
        log.info("Getting nokia lumia text : " + nokiaLumiaText.toString());
        return getTextFromElement(nokiaLumiaText);
    }

    public String verifyPriceOfNokiaLumia(){
        log.info("Getting price of nokia lumia: " + priceTextOfNokiaLumia.toString());
        return getTextFromElement(priceTextOfNokiaLumia);
    }

    public void changeTheQty(String qty){
        clearTextField(qtyTextBox);
        sendTextToElement(qtyTextBox,qty);
        log.info("Change the quantity : " + qtyTextBox.toString());

    }

    public void addToCartNokiaLumiaCellPhone(){
        clickOnElement(addToCartTab);
        log.info("Clicking on add to cart : " + addToCartTab.toString());

    }


}
