package seleniumIntro.beginning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyExpathpractice {

        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://etsy.com");
            WebElement etsySearBox = driver.findElement(By.xpath("//input[@name='search_query']"));
            etsySearBox.sendKeys("apple");
            WebElement etsySearchClik = driver.findElement(By.xpath("//button[@value='Search']"));
            etsySearchClik.click();

            String actualTitle = driver.getTitle();
            String expectedTilte = "Apple";

            if(actualTitle.contains(expectedTilte)){
                System.out.println("Title verivifaction PASSED");
            }else{
                System.out.println("title verification FAILED");
            }


            Thread.sleep(5000);
            driver.close();

    }
}
