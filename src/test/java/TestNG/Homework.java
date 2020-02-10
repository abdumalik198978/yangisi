package TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Homework {
    WebDriver driver;

    public static void removeName(WebDriver driver, String name){
        List<WebElement> listOfNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));

        for(int i=0; i<listOfNames.size(); i++){
            if(listOfNames.get(i).getText().equals(name)){

                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" +(i+2)+"]/td[1]")).click();
            }
        }

        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_btnDelete']")).click();
    }
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement userNAme = driver.findElement(By.xpath("//input[@type='text']"));
        userNAme.sendKeys("Tester");
        WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
        passWord.sendKeys("test");
        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
    }
    @Test
    public void deleteOrder(){

    WebElement markSmith = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[3]/td[1]"));
    markSmith.click();
    driver.findElement(By.xpath("//input[@id='ctl00_MainContent_btnDelete']")).click();
        List<WebElement> listOfNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[1]"));
        Assert.assertTrue(!listOfNames.contains("Mark Smith"),"There is Mark Smith in List");

    }
    @Test
    public void editOrder(){
   driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[4]/td[13]")).click();
   WebElement nameChange =driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));
   nameChange.clear();
   nameChange.sendKeys("Michael Jordan");
   driver.findElement(By.xpath("//a[.='Update']")).click();
   WebElement michaelelement = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[4]/td[2]"));
   Assert.assertTrue(michaelelement.isDisplayed(),"Michael is not Displayed");
    }
    @Test
    public void clearName(){
        removeName(driver, "Susan McLaren");
        List<WebElement> listOfNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[1]"));
        Assert.assertTrue(!listOfNames.contains("Susan Mclaren"),"There is Susan McLaren in List");

    }
}
//
//
//package testng;
//        import io.github.bonigarcia.wdm.WebDriverManager;
//        import org.openqa.selenium.By;
//        import org.openqa.selenium.WebDriver;
//        import org.openqa.selenium.WebElement;
//        import org.openqa.selenium.chrome.ChromeDriver;
//        import org.testng.Assert;
//        import org.testng.annotations.BeforeMethod;
//        import org.testng.annotations.Test;
//        import selenium.SmartBearMain;
//        import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;
//        import java.util.List;
//        import java.util.concurrent.TimeUnit;
//public class SmartBearTests {
//    WebDriver driver;
//    @BeforeMethod
//    public void setUp(){
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
//        SmartBearMain.loginToSmartBear(driver);
//    }
//    @Test
//    public void deleteOrderTest(){
//        WebElement markSmithCheckBox = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[.='Mark Smith']/../td[1]"));
//        markSmithCheckBox.click();
//        WebElement deleteButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
//        deleteButton.click();
//        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
//        for(WebElement name : allNames) {
//            System.out.println(name.getText());
//            Assert.assertFalse(name.getText().equals("Mark Smith"), "The name is in the list. Test FAILED!!!");
//        }
//    }
//    @Test
//    public void editOrderTest(){
//        String xpathForSteveEditButton = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[.='Steve Johns']/../td[13]";
//        WebElement editButtonSteveJohns = driver.findElement(By.xpath(xpathForSteveEditButton));
//        editButtonSteveJohns.click();
//        WebElement customerNameInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
//        customerNameInput.clear();
//        customerNameInput.sendKeys("Michael Jordan");
//        WebElement updateButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton"));
//        updateButton.click();
//        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
//        for(WebElement name : allNames) {
//            System.out.println(name.getText());
//            if(name.getText().equals("Michael Jordan")) {
//                Assert.assertTrue(name.getText().equals("Michael Jordan"), "The name is NOT in the list. Test FAILED!!!");
//            }
//        }
//    }
//    @Test
//    public void deleteNameTest2(){
//        deleteName(driver, "Bob Feather");
//    }
//    public static void deleteName(WebDriver driver, String nameToBeDeleted){
//        String word = "example";
//        String sentence = "This is "+word+"my sentence";
//        String xpathForCheckboxes = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[.='"+nameToBeDeleted+"']/../td[1]";
//        WebElement dynamicCheckBox = driver.findElement(By.xpath(xpathForCheckboxes));
//        dynamicCheckBox.click();
//        WebElement deleteButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
//        deleteButton.click();
//        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
//        for(WebElement name : allNames) {
//            System.out.println(name.getText());
//            Assert.assertFalse(name.getText().equals(nameToBeDeleted), "The name is in the list. Test FAILED!!!");
//        }
//    }
//}
