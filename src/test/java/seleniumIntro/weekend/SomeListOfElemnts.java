package seleniumIntro.weekend;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class SomeListOfElemnts {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      driver.get("https://www.openxcell.com");

        List<WebElement> links = driver.findElements(By.xpath("//body//a"));
        int expectedNum = 188;
        int actualNum = links.size();
        if(expectedNum == actualNum){
            System.out.println("List size verification PASSED!");
        }else{
            System.out.println("List size verification FAILED!!!");
        }
        //printing out the texts of each webElement
//        for(int i=0; i<links.size(); i++){
//            links.get(i).getText();
//        }
        int counter = 0;
        for(WebElement link : links){
            System.out.println(link.getText());
            if(link.getText().equals("")){
                counter++;
            }
        }
        int expectedNumOfLinksWithNoText = 109;
        int actualNumOfLinksWithNoText = counter;
        if (expectedNumOfLinksWithNoText == actualNumOfLinksWithNoText){
            System.out.println("Links without text verification passed!");
        }else{
            System.out.println("Links without text verification failed!");
        }

        Thread.sleep(4000);
       driver.close();
    }
}
