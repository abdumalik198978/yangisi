package Practises.task1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase8 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("5711234354");
        WebElement phoneNumWarningMessega = driver.findElement(By.xpath("//small[.='Phone format is not correct']"));
        System.out.println(phoneNumWarningMessega.getText());
        String expectedPhoneNumWarningMsg = "Phone format is not correct";
        if(phoneNumWarningMessega.getText().equals(expectedPhoneNumWarningMsg)){
            System.out.println(" Username Warning message verificaton PASSED");
        }else{
            System.out.println("Username Warning message verificatiion FAILED");
        }
    }
}
