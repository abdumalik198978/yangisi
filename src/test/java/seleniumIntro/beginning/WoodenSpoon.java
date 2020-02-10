package seleniumIntro.beginning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoodenSpoon {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("wooden spoon"+ Keys.ENTER);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Wooden spoon";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
        Thread.sleep(5000);
        driver.close();
    }
}
