package seleniumIntro.weekend;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Elentesfound {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.openxcell.com");



        System.out.println(driver.findElements(By.xpath("//body//a")).size());

        System.out.println(driver.findElements(By.xpath("//body//a")));




        Thread.sleep(4000);
        driver.close();
    }
}
