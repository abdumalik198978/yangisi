package seleniumIntro.weekend;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBear {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement userNAme = driver.findElement(By.xpath("//input[@type='text']"));
        userNAme.sendKeys("Tester");
        WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("test");
       WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
       login.click();

        List<WebElement> links = driver.findElements(By.xpath("//body//a"));
        System.out.println(links);
        System.out.println(links.size());


        for(WebElement link : links){
            System.out.println(link.getText());

        }
        Thread.sleep(4000);
        driver.close();
    }
    public static  void loginToSmartBear(WebDriver driver){
        WebElement userNAme = driver.findElement(By.xpath("//input[@type='text']"));
        userNAme.sendKeys("Tester");
        WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("test");
        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
    }
}
