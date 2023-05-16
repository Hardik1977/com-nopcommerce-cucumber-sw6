package com.nopcommerce.cucumber.sw6.pages;

import com.nopcommerce.cucumber.sw6.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/child::li")
    List<WebElement> allTopMenu;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersTopMenuTab;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computersTopMenuPageTitle;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronicsTopMenuTab;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Electronics')]")
    WebElement electronicsTopMenuPageTitle;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Apparel')]")
    WebElement apparelTopMenuPageTitle;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Digital downloads')]")
    WebElement digitalDownloadsTopMenuPageTitle;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Books')]")
    WebElement booksTopMenuPageTitle;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Jewelry')]")
    WebElement jewelryTopMenuPageTitle;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Gift Cards')]")
    WebElement giftsCardsTopMenuPageTitle;

    @CacheLookup
    @FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Desktops']")
    WebElement desktopDropDownLinkOfComputers;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
    WebElement cellPhonesLink;

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }


    public void selectAllTopMenuTabs(String text) {
        listOfElements(allTopMenu, text);
        log.info("Selecting all top menu tabs : " + allTopMenu.toString());

    }

    public void clickOnComputersTopMenu() {
        clickOnElement(computersTopMenuTab);
        log.info("Clicking on computers top menu tab : " + computersTopMenuTab.toString());

    }

    public String verifyPaveNavigationOfComputerTopMenuTab() {
        log.info("Getting title from computers top menu page : " + computersTopMenuPageTitle.toString());
        return getTextFromElement(computersTopMenuPageTitle);
    }


    public String verifyPaveNavigationOfElectronicsTopMenuTab() {
        log.info("Getting title from electronics top menu page : " + electronicsTopMenuPageTitle.toString());
        return getTextFromElement(electronicsTopMenuPageTitle);
    }


    public String verifyPaveNavigationOfApparelTopMenuTab() {
        log.info("Getting title from apparel top menu page : " + apparelTopMenuPageTitle.toString());
        return getTextFromElement(apparelTopMenuPageTitle);
    }


    public String verifyPaveNavigationOfDigitalDownloadsTopMenuTab() {
        log.info("Getting title from digital downloads top menu page : " + digitalDownloadsTopMenuPageTitle.toString());
        return getTextFromElement(digitalDownloadsTopMenuPageTitle);
    }


    public String verifyPaveNavigationOfBooksTopMenuTab() {
        log.info("Getting title from books top menu page : " + booksTopMenuPageTitle.toString());
        return getTextFromElement(booksTopMenuPageTitle);
    }


    public String verifyPaveNavigationOfJewelryTopMenuTab() {
        log.info("Getting text title from jewelry top menu page : " + jewelryTopMenuPageTitle.toString());
        return getTextFromElement(jewelryTopMenuPageTitle);
    }


    public String verifyPaveNavigationOfGiftCardsTopMenuTab() {
        log.info("Getting title from gift cards top menu page : " + giftsCardsTopMenuPageTitle.toString());
        return getTextFromElement(giftsCardsTopMenuPageTitle);
    }


    public void clickOnDesktopLinkInComputersTopMenuDropdown() {
        clickOnElement(desktopDropDownLinkOfComputers);
        log.info("Clicking on desktops link in computers top menu dropdown : " + desktopDropDownLinkOfComputers.toString());
    }

    public void mouseHoverOnElectronicsTopMenuTab() {
        mouseHoverToElement(electronicsTopMenuTab);
        log.info("Mouse hovering on electronics top menu tab : " + electronicsTopMenuTab.toString());

    }

    public void mouseHoverAndClickOnCellPhonesOptionInElectronics() {
        mouseHoverToElementAndClick(cellPhonesLink);
        log.info("Mouse hover and clicking on cell phones option in electronics : " + cellPhonesLink.toString());

    }

}
