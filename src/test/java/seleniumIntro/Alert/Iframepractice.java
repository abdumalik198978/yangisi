package seleniumIntro.Alert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Iframepractice {
WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/iframe");
        driver.manage().window().maximize();
    }

    @Test
    public void iframe() {
        driver.switchTo().frame("mce_0_ifr");
        WebElement messeage = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        String expectedMSG = "Your content goes here.";
        Assert.assertEquals(messeage.getText(),expectedMSG, "Message is  not displayed");

        driver.switchTo().parentFrame();
        WebElement ContainMSG = driver.findElement(By.xpath("//h3"));
        String expectedMsg = "An iFrame containing the TinyMCE WYSIWYG Editor";
        Assert.assertEquals(ContainMSG.getText(),expectedMsg, "The verification is not passed");
    }
}
