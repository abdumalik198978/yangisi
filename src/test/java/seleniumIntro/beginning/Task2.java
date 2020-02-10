package seleniumIntro.beginning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.SortedMap;

public class Task2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.cybertekschool.com ");

        String expectedTitle = "Cybertek";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Cybertek title verification PASSED");
        }else {
            System.out.println("Cybertek title verivifiation FALID");
        }
        String expectedURL = "cybertek.com";
        String  actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedURL)){
            System.out.println("Cybertek URL verificatiion PASSED");
        }else{
            System.out.println("Cybertek URL verification FAILED");
        }


    }
}
