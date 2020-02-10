package seleniumIntro.beginning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApleSearch {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
       // driver.findElement(By.name("q")).sendKeys("apple");
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
       // driver.findElement(By.name("btnK")).click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "apple";

     if(actualTitle.startsWith(expectedTitle)){
         System.out.println("Apple title verification PASSed");
     }else{
         System.out.println("Apple title verification FAILED");
     }



        Thread.sleep(5000);
        driver.close();
    }
}
