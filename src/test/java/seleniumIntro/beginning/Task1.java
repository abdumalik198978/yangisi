package seleniumIntro.beginning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver dr = new ChromeDriver();
        dr.get("https://www.google.com");
        String expectedTitle ="Google";
        String actualTitle = dr.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Google title verification passed");
        }else{
            System.out.println("Google title verification failed");
        }


        Thread.sleep(5000);
        dr.close();
    }
}
