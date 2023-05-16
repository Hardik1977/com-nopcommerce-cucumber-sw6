package com.nopcommerce.cucumber.sw6.steps;

import com.nopcommerce.cucumber.sw6.pages.HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TopMenuTests {
    @When("^I select top menu as \"([^\"]*)\"$")
    public void iSelectTopMenuAs(String topMenuTabs)  {
        new HomePage().selectAllTopMenuTabs(topMenuTabs);
    }


    @Then("^I verify the expected title on Computers page as \"([^\"]*)\"$")
    public void iVerifyTheExpectedTitleOnComputersPageAs(String expectedTitle)  {
        String actualTitle = new HomePage().verifyPaveNavigationOfComputerTopMenuTab();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("^I verify the expected title on Electronics page as \"([^\"]*)\"$")
    public void iVerifyTheExpectedTitleOnElectronicsPageAs(String expectedTitle)  {
        String actualTitle = new HomePage().verifyPaveNavigationOfElectronicsTopMenuTab();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("^I verify the expected title on Apparel page as \"([^\"]*)\"$")
    public void iVerifyTheExpectedTitleOnApparelPageAs(String expectedTitle)  {
        String actualTitle = new HomePage().verifyPaveNavigationOfApparelTopMenuTab();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("^I verify the expected title on Digital downloads page as \"([^\"]*)\"$")
    public void iVerifyTheExpectedTitleOnDigitalDownloadsPageAs(String expectedTitle)  {
        String actualTitle = new HomePage().verifyPaveNavigationOfDigitalDownloadsTopMenuTab();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("^I verify the expected title on Books page as \"([^\"]*)\"$")
    public void iVerifyTheExpectedTitleOnBooksPageAs(String expectedTitle)  {
        String actualTitle = new HomePage().verifyPaveNavigationOfBooksTopMenuTab();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("^I verify the expected title on Jewelry page as \"([^\"]*)\"$")
    public void iVerifyTheExpectedTitleOnJewelryPageAs(String expectedTitle)  {
        String actualTitle = new HomePage().verifyPaveNavigationOfJewelryTopMenuTab();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("^I verify the expected title on Gift cards page as \"([^\"]*)\"$")
    public void iVerifyTheExpectedTitleOnGiftCardsPageAs(String expectedTitle)  {
        String actualTitle = new HomePage().verifyPaveNavigationOfGiftCardsTopMenuTab();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}