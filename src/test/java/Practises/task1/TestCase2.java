package Practises.task1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.manage().window().maximize();
        List<WebElement> listOfListedExamples = driver.findElements(By.xpath("//body//li"));
        int numOfListofListedElements = listOfListedExamples.size();
        System.out.println(numOfListofListedElements);
        if(numOfListofListedElements==48){
            System.out.println("Number of listed elements verification PASSE");
        }else{
            System.out.println("Number of listed elements verification is FAI:D");
        }
    }
}
