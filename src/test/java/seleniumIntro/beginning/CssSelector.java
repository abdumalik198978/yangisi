package seleniumIntro.beginning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
     WebElement amazonSearBox = driver.findElement(By.cssSelector("input[name = 'field-keywords']"));
     amazonSearBox.sendKeys("apple");
     WebElement amazonSearchClik = driver.findElement(By.cssSelector("input[tabindex='20']"));
     amazonSearchClik.click();


     Thread.sleep(5000);
     driver.close();
    }
}
