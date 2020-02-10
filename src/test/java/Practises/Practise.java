package Practises;

import Vytrack.SeleniumUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Practise {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id = 'prependedInput']")).sendKeys("storemanager85"+Keys.ENTER);
        driver.findElement(By.xpath("//input[@id = 'prependedInput2']")).sendKeys("UserUser123"+Keys.ENTER);
        SeleniumUtilities.pause(5);
        driver.findElement(By.xpath("//span[contains(text(), 'Activities') and @class = 'title title-level-1']")).click();
        SeleniumUtilities.pause(2);
        driver.findElement(By.xpath("//span[.='Calls']")).click();
        SeleniumUtilities.pause(2);
        WebElement callButton = driver.findElement(By.xpath("//a[@title = 'Log call']"));
        SeleniumUtilities.pause(2);
        if(callButton.isDisplayed()){
            System.out.println("Our test 1 -- PASSED");
        }else{
            System.out.println("Our test 1 -- FAILED");
        }



    }
}
