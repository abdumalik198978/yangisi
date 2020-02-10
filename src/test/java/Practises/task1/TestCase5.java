package Practises.task1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase5 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("123");
        WebElement lastNameWarningMessega = driver.findElement(By.xpath("//small[.='The last name can only consist of alphabetical letters and dash']"));
        System.out.println(lastNameWarningMessega.getText());
        String expectedLastNameWarningMsg = "The last name can only consist of alphabetical letters and dash";
        if(lastNameWarningMessega.getText().equals(expectedLastNameWarningMsg)){
            System.out.println(" Lastname Warning message verificaton PASSED");
        }else{
            System.out.println("Lastname Warning message verificatiion FAILED");
        }


    }
}
