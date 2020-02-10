package seleniumIntro.beginning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/forgot_password");
        driver.manage().window().maximize();
       driver.findElement(By.name("email")).sendKeys("abdumalik1989@gmail.com"+ Keys.ENTER);

       String actualURL = driver.getCurrentUrl();
       String expectedURL = "email_sent";
       if(actualURL.contains(expectedURL)){
           System.out.println("URL verification is PASSED");
       }else{
           System.out.println("URL verification is FAILED");
       }

        Thread.sleep(5000);
        //driver.close();
    }
}
