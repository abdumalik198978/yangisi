package seleniumIntro.beginning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        String  valueofImages = driver.findElement(By.linkText("Images")).getAttribute("href");
        System.out.println(valueofImages);
        System.out.println(driver.findElement(By.linkText("Images")).getAttribute("data-pid"));


        Thread.sleep(5000);
        driver.close();
    }
}
