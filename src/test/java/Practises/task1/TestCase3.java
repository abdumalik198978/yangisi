package Practises.task1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
    public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://practice-cybertekschool.herokuapp.com");
            driver.manage().window().maximize();

            driver.findElement(By.linkText("Multiple Buttons")).click();
            driver.findElement(By.xpath("//button[.='Button 1']")).click();

        WebElement button1 = driver.findElement(By.xpath("//p[.='Clicked on button one!']"));
        System.out.println(button1.getText());
        if(button1.isDisplayed()){
            System.out.println("Button 1 is Displayed - PASSED");
        }else{
            System.out.println("Button is not displayed - FAILED");
        }
    }
}
