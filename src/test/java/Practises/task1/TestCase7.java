package Practises.task1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase7 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testers@email");
        WebElement emailWarningMessege1 = driver.findElement(By.xpath("//small[.='email address is not a valid']"));
        WebElement emailWarningMessage2 = driver.findElement(By.xpath("//small[.='Email format is not correct']"));
        String actualWarningMsg = emailWarningMessege1.getText()+" " +emailWarningMessage2.getText();
        System.out.println(actualWarningMsg);
        String expectedEmailWarningMsg = "email address is not a valid Email format is not correct";
        if(actualWarningMsg.equals(expectedEmailWarningMsg)){
            System.out.println(" Email Warning message verificaton PASSED");
        }else{
            System.out.println("Email Warning message verificatiion FAILED");
        }
    }
}
