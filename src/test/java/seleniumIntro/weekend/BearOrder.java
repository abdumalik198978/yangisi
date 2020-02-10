package seleniumIntro.weekend;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BearOrder {
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
         WebElement order = driver.findElement(By.xpath("//a[.='Order']"));
         order.click();
  WebElement familyAlbum = driver.findElement(By.xpath("//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']"));
        Select selectAlbum = new Select(familyAlbum);
        selectAlbum.selectByVisibleText("FamilyAlbum");
        driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']")).sendKeys(Keys.BACK_SPACE,"2");

         Faker faker = new Faker();
         String firstName = faker.name().firstName();
         String laasName = faker.name().lastName();
        String streetname = faker.address().streetName();
        String city = faker.address().city();
        String state = faker.address().state();
        String zip = faker.address().zipCode().replaceAll("-","");

        String cardNum = faker.finance().creditCard().replaceAll("-","");
       driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']")).sendKeys(firstName+" "+laasName);
       driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox2']")).sendKeys(streetname);
       driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")).sendKeys(city);
       driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox4']")).sendKeys(state);
       driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox5']")).sendKeys(zip);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']")).click();
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")).sendKeys(cardNum);
        driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox1']")).sendKeys("03/21");
       driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']")).click();
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='buttons_process']/strong"));
        if(successMessage.isDisplayed()){
            System.out.println("Message displayed. Order placed. PASS!");
        }else{
            System.out.println("Message is not displayed. Order NOT placed. FAIL!!!");
        }

        Thread.sleep(4000);
       driver.close();
    }
}
