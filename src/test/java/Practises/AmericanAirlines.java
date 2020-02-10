package Practises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmericanAirlines {
    WebDriver driver;

    @BeforeMethod
            public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
         driver.get("https://practice-cybertekschool.herokuapp.com");
    driver.manage().window().maximize();
        driver.findElement(By.linkText("Registration Form")).click();
    }
    @Test
    public void case1(){
        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("wrong_dob");
        WebElement dobWarningMessage = driver.findElement(By.xpath("//small[.='The date of birth is not valid']"));
        if(dobWarningMessage.isDisplayed()){
            System.out.println("Warning message is DIsplayed, Verification PASSED");
        }else{
            System.out.println("Warning message is not Displayed, Verification Failed");
        }
    }
    @Test
    public void case2(){
        WebElement cPlusPlus =  driver.findElement(By.xpath("//label[@for='inlineCheckbox1']"));
        WebElement java = driver.findElement(By.xpath("//label[@for='inlineCheckbox2']"));
        WebElement javaScript = driver.findElement(By.xpath("//label[@for='inlineCheckbox3']"));
        if(cPlusPlus.isDisplayed() && java.isDisplayed() && javaScript.isDisplayed()){
            System.out.println("All are Displayed. Verification PASSED");
        }else{
            System.out.println("Verification FAILED");
        }
    }
    @Test
    public void case3(){
    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("s");
    WebElement nameWarningMesg = driver.findElement(By.xpath("//small[.='first name must be more than 2 and less than 64 characters long']"));
    String expectedWarningMaessage = "first name must be more than 2 and less than 64 characters long";
    if(nameWarningMesg.getText().equals(expectedWarningMaessage)){
        System.out.println("Warning message is displayed. VERIFICATION ID PASSED");
    }else{
        System.out.println("Not displayed. Verifiaction Failed");
    }
    }

}
