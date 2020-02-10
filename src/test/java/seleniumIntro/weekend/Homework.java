package seleniumIntro.weekend;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Homework {
    public static void main(String[] args)  throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
WebElement checkBox = driver.findElement(By.xpath("//input[@value='Check All']"));
        System.out.println(checkBox.getAttribute("value"));
if(checkBox.getAttribute("value").equals("Check All")){
    System.out.println("Check all text verification is PASSED");
}else {
    System.out.println("Check all text verification is PAiled");
}

driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
checkBox.click();


        if(checkBox.getAttribute("value").equals("Uncheck All")){
            System.out.println("Uncheck all text verification is PASSED");
        }else {
            System.out.println("Uncheck all text verification is PAiled");
        }
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        checkBox.click();

Thread.sleep(4000);
driver.close();

    }
}
