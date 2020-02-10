package seleniumIntro.weekend;

import com.google.gson.internal.$Gson$Preconditions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckRadio {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement checkBox = driver.findElement(By.xpath("//div[@id='txtAge']"));
        if(!checkBox.isDisplayed()){
            System.out.println("Succes box is not displayed. Verification PASSED");
        }else{
            System.out.println("Succes box is displayed. Verification FAILLED");
        }

        driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();

        if(!checkBox.isDisplayed()){
            System.out.println("Succes box is not displayed. Verification FAILLED");
        }else{
            System.out.println("Succes box is displayed. Verification Passed");
        }


        Thread.sleep(4000);
        driver.close();

    }
}
