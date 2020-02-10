package Practises.recapByEsen;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class rewievOfUtils {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileInputStream file = new FileInputStream("review.properties");
        properties.load(file);
        System.out.println(properties.getProperty("item"));
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys(properties.getProperty("item")+ Keys.ENTER);
        System.out.println(driver.getTitle());

    }
}
