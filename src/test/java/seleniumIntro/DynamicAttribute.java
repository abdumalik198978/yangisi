package seleniumIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement userNAme = driver.findElement(By.xpath("//input[@type='text']"));
        userNAme.sendKeys("Tester");
        WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("test");
        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
       verifyOrder(driver, "Steve Johns");
       printNamesAndCities(driver);
    }
    public static void verifyOrder(WebDriver driver, String name){
     List<WebElement> elementsOfNames  = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
     for (WebElement element: elementsOfNames) {
         if (name.equals(element.getText())) {
             System.out.println("The givenname is located in the tabel, Verification PAssed");
             return;
         } }

             System.out.println("The given name is not in the table, Verification is FAILED");

     }
     public static void printNamesAndCities(WebDriver driver){
        List<WebElement> elementsOfNames  = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        List<WebElement> elementsOfCities = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[7]"));
       // ArrayList<String> listofCitesAndNames= new ArrayList<>();
        for (int i=0; i<elementsOfCities.size(); i++){
            System.out.println(elementsOfNames.get(i).getText()+" is from--->"+ elementsOfCities.get(i).getText());
     }
    }}


