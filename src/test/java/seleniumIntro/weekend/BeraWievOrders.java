package seleniumIntro.weekend;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BeraWievOrders {
    public static void main(String[] args) throws InterruptedException{

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

   SmartBear.loginToSmartBear(driver);



    Thread.sleep(4000);
   // driver.close();
}
}
