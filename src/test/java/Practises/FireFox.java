package Practises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FireFox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id='PageList1']/div/div[1]/div[1]/div/ul/li[5]/a")).click();
        if(driver.getTitle().contains("Java")){
            System.out.println("Java tab validation done");
        }else{
            System.out.println("Java tab validation failed");
        }

driver.findElement(By.xpath("//*[@id='PageList1']/div/div[1]/div[1]/div/ul/li[1]/a")).click();

        driver.findElement(By.xpath("//*[@id='PageList1']/div/div[1]/div[1]/div/ul/li[2]/a")).click();
        if(driver.getTitle().contains("Selenium")){
            System.out.println("Selenium tab validation done");
        }else{
            System.out.println("Selenium tab validation failed");
        }
        driver.findElement(By.xpath("//*[@id='PageList1']/div/div[1]/div[1]/div/ul/li[1]/a")).click();

        driver.findElement(By.xpath("//*[@id='PageList1']/div/div[1]/div[1]/div/ul/li[6]/a")).click();
        if(driver.getTitle().contains("Selenium")){
            System.out.println("TestNG tab validation done");
        }else{
            System.out.println("TestNG tab validation failed");
        }
        driver.findElement(By.xpath("//*[@id='PageList1']/div/div[1]/div[1]/div/ul/li[1]/a")).click();


    }
}
