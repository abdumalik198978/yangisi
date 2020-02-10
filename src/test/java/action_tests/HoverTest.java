package action_tests;

import Pages.Practice_Cybertek_pages.HoversPage;
import Pages.amazon_Pages.AmazonLandingPage;
import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest {
    @Test
    public void Hovertest(){
        //1-get the gape
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        //2- create the object of pages class to reach the web elements
        HoversPage page = new HoversPage();
//3-create the object of Actions classs and passs the driver clss int consstructor
        Actions actions = new Actions(Driver.getDriver());
        //4- we will move to the link using action instance and meethod
        actions.moveToElement(page.user1).perform();
        Assert.assertTrue(page.user1Text.isDisplayed());
        actions.moveToElement(page.user2).perform();
        Assert.assertTrue(page.user2Text.isDisplayed());
        actions.moveToElement(page.user3).perform();
        Assert.assertTrue(page.user3Text.isDisplayed());


    }

}
