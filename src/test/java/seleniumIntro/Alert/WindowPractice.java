package seleniumIntro.Alert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WindowPractice {
    WebDriver driver;
@BeforeClass
    public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver =new ChromeDriver();
    driver.get("http://practice.cybertekschool.com/windows");
    driver.manage().window().maximize();

}
    @Test
    public void windowHandlingTest(){
        String mainHandle = driver.getWindowHandle();
        System.out.println(mainHandle);
        // #4 assert title= Practice
        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice";
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle, "Titles are not matching!!!");
        // #5 clicking to the link to get new tab
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();
        //System.out.println(driver.getTitle());
        for(String handle : driver.getWindowHandles()){
            if(!handle.equals(mainHandle)){
                driver.switchTo().window(handle);
            }
        }
        System.out.println(driver.getTitle());
        String expectedTitleAfterClick = "New Window";
        String actualTitleAfterClick = driver.getTitle();
        Assert.assertEquals(actualTitleAfterClick, expectedTitleAfterClick, "Titles are not matching!!");
}

}
