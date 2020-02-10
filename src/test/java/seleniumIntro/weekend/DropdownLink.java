package seleniumIntro.weekend;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownLink {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropdownLink = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
        dropdownLink.click();
        Thread.sleep(1000);

        WebElement faceBookLink = driver.findElement(By.xpath("//a[.='Facebook']"));
        faceBookLink.click();


        Thread.sleep(4000);
        driver.close();
    }
}
