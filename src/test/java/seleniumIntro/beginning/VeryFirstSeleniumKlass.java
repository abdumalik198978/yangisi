package seleniumIntro.beginning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeryFirstSeleniumKlass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();//this is the line conection between driver and selenium.and sets up the driver
        WebDriver driver = new ChromeDriver();//instansiating the chromeDriver instance
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().to("https://www.etsy.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
      driver.manage().window().maximize();
    }
}
