package Vytrack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCalendarTask {
    public static void main(String[] args) {
        WebDriver driver;

        String createCalendarBtnLocators = "a[title = 'Create Calendar event']";

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");

        VyTracUtils.login(driver,"storemanager85","UseUser123");
        VyTracUtils.navigateToModule(driver,"Activities","Calendar Events");
        SeleniumUtilities.pause(2);
        if(driver.findElement(By.cssSelector(createCalendarBtnLocators)).isDisplayed()){
            System.out.println("Test 2 - Passed");
        }else {
            System.out.println("Test 2 -Failed");
        }
    }
}
