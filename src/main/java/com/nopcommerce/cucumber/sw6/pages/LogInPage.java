package com.nopcommerce.cucumber.sw6.pages;

import com.nopcommerce.cucumber.sw6.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends Utility {

    private static final Logger log = LogManager.getLogger(LogInPage.class.getName());

    public LogInPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
    WebElement welcomeToStoreText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;


    public String verifyTitleOfLoginPage() {
        log.info("Getting title of login page : " + welcomeToStoreText.toString());
        return getTextFromElement(welcomeToStoreText);
    }

    public void clickOnLogoutLink() {
        clickOnElement(logoutLink);
        log.info("Clicking on logout link: " + logoutLink.toString());

    }

}
