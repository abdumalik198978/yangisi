package seleniumIntro.beginning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyGmail {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.linkText("Gmail")).click();

        String expectedGmail = "Gmail";
        String  actualGmail = driver.getTitle();
        if(actualGmail.contains(expectedGmail)){
            System.out.println("Gmail verification Passed");
        }else{
            System.out.println("Gamil verification FAILED");
        }
        Thread.sleep(2000);
        driver.navigate().back();
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();
        if(actualGoogleTitle.contains(expectedGoogleTitle)){
            System.out.println("google title verification PASSED");
        }else{
            System.out.println("Google title verification FAILED");
        }
        Thread.sleep(2000);
        driver.navigate().forward();
        String expectedGmail2 = "Gmail";
        String  actualGmail2 = driver.getTitle();
        if(actualGmail2.contains(expectedGmail2)){
            System.out.println("Gmail 2 verification Passed");
        }else{
            System.out.println("Gamil 2 verification FAILED");
        }


        Thread.sleep(5000);
        driver.close();
    }
}
