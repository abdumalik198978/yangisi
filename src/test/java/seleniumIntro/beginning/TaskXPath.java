package seleniumIntro.beginning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TaskXPath {
    public static void main(String[] args)  throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        WebElement addButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        Thread.sleep(2000);
addButton.click();

        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        Thread.sleep(2000);
        deleteButton.click();

        if(driver.findElement(By.xpath("//button[.='Delete']")).isDisplayed()){
            System.out.println(" add button Verivication PASSED");
        }else{
            System.out.println("add button Verivication Failed");
        }

        addButton.click();

        if(!driver.findElement(By.xpath("//button[.='Delete']")).isDisplayed()){
            System.out.println("Delete button Verivication PASSED");
        }else{
            System.out.println("delete button Verivication Failed");
        }


        Thread.sleep(5000);
        driver.close();
    }
}
