package Vytrack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class VyTracUtils {
    private static String usernameLocatorID = "prependedInput";
    private  static String passwordLocatorID = "prependedInput2";
    public static void login(WebDriver driver, String userName, String Password) {
        driver.findElement(By.id(usernameLocatorID)).sendKeys("storemanager85");
        driver.findElement(By.id(passwordLocatorID)).sendKeys("UserUser123" + Keys.ENTER);
        SeleniumUtilities.pause(5);
    }

    public static void navigateToModule(WebDriver driver, String tab, String module){
        String tabLocatorXpath = "//span[contains(text(), '" + tab +"') and @class = 'title title-level-1']";
        String moduleLocatorXpath = "//span[.= '" + module+ "']";


        driver.findElement(By.xpath(tabLocatorXpath)).click();
        SeleniumUtilities.pause(2);
        driver.findElement(By.xpath(moduleLocatorXpath)).click();
    }
}
