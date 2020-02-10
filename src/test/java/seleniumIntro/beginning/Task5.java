package seleniumIntro.beginning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    public static void main(String[] args)  throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
      String actualTittle = driver.getTitle();
      String expectedTitle = "Web Orders Login";

      if(actualTittle.equals(expectedTitle)){
          System.out.println("Login page veriification PAssed");
      }else{
          System.out.println("Login page verification FAILeD");
      }
driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
      driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
      driver.findElement(By.name("ctl00$MainContent$login_button")).click();
String actualLoginTitle = "Web Orders";
String expectedLoginTitle =driver.getTitle();

if(actualLoginTitle.equals(expectedLoginTitle)){
    System.out.println("Landing page title verification PASSED");
}else{
    System.out.println("Landing page title verification FAiled");
}




        Thread.sleep(5000);
        //driver.close();
    }

}
