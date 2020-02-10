package Practises;


import Vytrack.SeleniumUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");


        UtilitiesPractice.login(driver,"storemanager85", "UserUser123");
        UtilitiesPractice.navigate(driver,"Activities","Calendar Events");

        String createCalendarBtnLocators = "a[title = 'Create Calendar event']";
        SeleniumUtilities.pause(2);
        driver.findElement(By.cssSelector(createCalendarBtnLocators)).click();

    }
}
