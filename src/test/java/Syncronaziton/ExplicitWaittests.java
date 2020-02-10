package Syncronaziton;

import Pages.Practice_Cybertek_pages.DynamicLoading1page;
import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaittests {

    @Test
    public void waitForInputBoxTest(){
        //1- get the page
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");
        //2-create object to use elements
        DynamicLoading1page loading1page = new DynamicLoading1page();
        //3-click to start button
        loading1page.startButoon.click();
        //4- we try to send keys

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(loading1page.usernameInput));
        loading1page.usernameInput.sendKeys("tomsmith");
    }
}
