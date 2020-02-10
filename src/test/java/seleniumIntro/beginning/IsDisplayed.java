package seleniumIntro.beginning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();
        driver.findElement(By.name("user_login")).sendKeys("username");
        Thread.sleep(2000);
        driver.findElement(By.name("user_password")).sendKeys("password"+ Keys.ENTER);

        if( driver.findElement(By.linkText("username")).isDisplayed()){
            System.out.println("username verification is PASSed");
        }else {
            System.out.println("username verificationn is FAILED");
        }
       

        Thread.sleep(5000);
        driver.close();
    }
}
