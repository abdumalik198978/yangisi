package Practises.task1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("123");
        WebElement firstNameWarningMessega = driver.findElement(By.xpath("//small[.='first name can only consist of alphabetical letters']"));
        System.out.println(firstNameWarningMessega.getText());
        String expectedFirstNameWarningMsg = "first name can only consist of alphabetical letters";
        if(firstNameWarningMessega.getText().equals(expectedFirstNameWarningMsg)){
            System.out.println("Warning message verificaton PASSED");
        }else{
            System.out.println("Warning message verificatiion FAILED");
        }


    }
}
