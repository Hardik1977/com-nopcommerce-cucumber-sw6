package com.nopcommerce.cucumber.sw6.pages;

import com.nopcommerce.cucumber.sw6.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Cell phones']")
    WebElement cellPhonesText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement listViewTab;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement productNokiaLumia;

    private static final Logger log = LogManager.getLogger(CellPhonesPage.class.getName());

    public CellPhonesPage() {
        PageFactory.initElements(driver, this);
    }


    public String verifyCellPhonesText() {
        log.info("Getting cell phones text : " + cellPhonesText.toString());
        return getTextFromElement(cellPhonesText);
    }

    public void clickOnListViewTab() {
        clickOnElement(listViewTab);
        log.info("Clicking on list view tab : " + listViewTab.toString());

    }

    public void clickOnNokiaLumiaCellPhone() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(productNokiaLumia);
        log.info("Clicking on nokia lumia phone : " + productNokiaLumia.toString());

    }


}
