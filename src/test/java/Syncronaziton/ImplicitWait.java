package Syncronaziton;

import Pages.Practice_Cybertek_pages.DynamicLoading2Page;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ImplicitWait {
    @Test
    public void threadSleepTest()throws InterruptedException{
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/2");
        // Creating onject to be able to rach Page class Webelement
        DynamicLoading2Page dynamicLoding2Page = new DynamicLoading2Page();
        // Clickin on start button using the object that we created
        dynamicLoding2Page.startButton.click();
       // Thread.sleep(5000);
        //Assert that hello world text is displayed
        Assert.assertTrue(dynamicLoding2Page.helloWorldText.isDisplayed(),
                "Text is not displayed");
    }
}
