package Practises.task1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase6 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("user");
        WebElement userNameWarningMessega = driver.findElement(By.xpath("//small[.='The username must be more than 6 and less than 30 characters long']"));
        System.out.println(userNameWarningMessega.getText());
        String expectedUserNameWarningMsg = "The username must be more than 6 and less than 30 characters long";
        if(userNameWarningMessega.getText().equals(expectedUserNameWarningMsg)){
            System.out.println(" Username Warning message verificaton PASSED");
        }else{
            System.out.println("Username Warning message verificatiion FAILED");
        }
    }
}
