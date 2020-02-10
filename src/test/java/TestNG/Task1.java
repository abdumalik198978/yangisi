package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1 {

    WebDriver driver;
    @Test
    public void asetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @Test
    public void deleteAll(){
        WebElement userNAme = driver.findElement(By.xpath("//input[@type='text']"));
        userNAme.sendKeys("Tester");
        WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("test");
        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();

        driver.findElement(By.xpath("//a[@id='ctl00_MainContent_btnCheckAll']")).click();
//
//        List<WebElement> listofElem = driver.findElements(By.xpath("//table[@id=‘ctl00_MainContent_orderGrid’]/tbody/tr/td[1]"));
//
//        for(WebElement element: listofElem){
//            Assert.assertTrue(element.isSelected());
//        }
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        WebElement deleteSelectButton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_btnDelete']"));
        deleteSelectButton.click();
    }

}