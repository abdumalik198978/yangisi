package seleniumIntro.beginning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAtribute2 {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();
       String  valueofPass = driver.findElement(By.partialLinkText("password")).getAttribute("href");
   System.out.println(valueofPass);
    String actualvaluePass = valueofPass;
    String expectedValuePass = "/forgot-password.html";

    if(actualvaluePass.contains(expectedValuePass)){
        System.out.println("Href verification Passed");
    }else{
        System.out.println("Href value verification FAILED");
    }


        Thread.sleep(5000);
        driver.close();
    }
}
