package Practises;

import Vytrack.SeleniumUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilitiesPractice {
    private static String userNameLocatorID = "prependedInput";
     private static String passwordLocatorID = "prependedInput2";

    public static void login(WebDriver driver, String userName, String password){
        driver.findElement(By.id(userNameLocatorID)).sendKeys("storemanager85");
        driver.findElement(By.id(passwordLocatorID)).sendKeys("UserUser123"+Keys.ENTER);
        SeleniumUtilities.pause(3);
    }

    public static void navigate(WebDriver driver, String tab, String module){
        driver.findElement(By.xpath("//span[contains(text(), '"+tab+"') and @class = 'title title-level-1']")).click();
        SeleniumUtilities.pause(2);
        driver.findElement(By.xpath("//span[.='"+module+"']")).click();
    }
}
