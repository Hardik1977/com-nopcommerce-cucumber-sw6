package com.nopcommerce.cucumber.sw6.pages;

import com.nopcommerce.cucumber.sw6.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeskTopsPage extends Utility {

    private static final Logger log = LogManager.getLogger(DeskTopsPage.class.getName());

    public DeskTopsPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortByTextField;

    @CacheLookup
    @FindBy(xpath = "//div[@class='details']/child::h2/a")
    List<WebElement> allProductsOnPageLinks;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputer;


    public void selectSortByName(String text) {
        selectByVisibleTextFromDropDown(sortByTextField, text);
        log.info("Selecting sort by name : " + sortByTextField.toString());
    }


    public void addBuildYourOwnComputerProductInCart() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(buildYourOwnComputer);
        log.info("Adding product in cart : " + buildYourOwnComputer.toString());
    }


    public void verifySortedElementsInReverseOrder() {
        List<WebElement> elements = allProductsOnPageLinks;
        ArrayList<String> originalElementList = new ArrayList<>();
        for (WebElement e : elements) {
            originalElementList.add(e.getText());
        }
        System.out.println(originalElementList);
        // Sort By Reverse order
        Collections.reverse(originalElementList);
        System.out.println(originalElementList);

        // After filter Z -A Get all the products name and stored into array list
        elements = allProductsOnPageLinks;
        ArrayList<String> afterSortByReverseList = new ArrayList<>();
        for (WebElement e : elements) {
            afterSortByReverseList.add(e.getText());
        }
        System.out.println(afterSortByReverseList);
        log.info("Verifying sorted elements in reverse : " + allProductsOnPageLinks.toString());

    }

    public void selectProductByName(String product) {
        List<WebElement> products = allProductsOnPageLinks;
        for (WebElement e : products) {
            if (e.getText().equals(product)) {
                e.click();
                break;
            }
        }
        log.info("Selecting product by name : " + allProductsOnPageLinks.toString());

    }

    public void selectSortByOption(String option) {
        selectByVisibleTextFromDropDown(sortByTextField, option);
        log.info("Selecting sort by option : " + sortByTextField.toString());
    }

}
