package Practises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Zara {
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.zara.com/us/");
        driver.manage().window().maximize();
    }

    @Test
    public void selec(){
        driver.findElement(By.xpath("//div[@class='menu-icon _menu-icon']")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
      driver.findElement(By.xpath("//a[@href ='https://www.zara.com/us/en/man-l534.html']/span[.='MAN']")).click();
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
      driver.findElement(By.xpath("(//span[.='SHOES'])[3]")).click();
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
       driver.findElement(By.xpath("//div[@class='sibling-title-container']/span[.='Sneakers']")).click();
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        JavascriptExecutor scrollDown = ((JavascriptExecutor) driver);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        scrollDown.executeScript("scroll(0, 250);");

    }
}
