package Practises.task1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Sign Up For Mailing List")).click();
        driver.findElement(By.cssSelector("input[type ='text']")).sendKeys("abdumalik");
       driver.findElement(By.cssSelector("input[type ='email']")).sendKeys("sanimxonakaligisi@yhoo.com");
       driver.findElement(By.cssSelector("button[type='submit']")).click();

       String expectedResult = "Thank you for signing up. Click the button below to return to the home page.";
       String actualMessage = driver.findElement(By.cssSelector("h3[class='subheader']")).getText();
       if(actualMessage.equals(expectedResult)){
           System.out.println("Our expected message is properly displayed - PASSED");
       }else{
           System.out.println("Our message is not dispplayed - FAILED");
       }

       WebElement homeButton = driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']"));
       if(homeButton.isDisplayed()){
           System.out.println("Home button is Displayed -PASSED");
       }else{
           System.out.println("Home button is not displayed - FAILED");
       }
    }
}
