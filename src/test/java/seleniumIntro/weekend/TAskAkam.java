package seleniumIntro.weekend;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TAskAkam {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

       WebElement selectYear=  driver.findElement(By.xpath("//select[@id='year']"));
    Select yearSelect = new Select(selectYear);

        WebElement selectMonth=  driver.findElement(By.xpath("//select[@id='month']"));
        Select monthSelect = new Select(selectMonth);


        WebElement selectDay=  driver.findElement(By.xpath("//select[@id='day']"));
        Select DaySelect = new Select(selectDay);
        if(yearSelect.getFirstSelectedOption().getText().equals("2020")&&
                monthSelect.getFirstSelectedOption().getText().equals("January")&&
                DaySelect.getFirstSelectedOption().getText().equals("26")){
            System.out.println("Birthday  verificatiin passed");
        }else{
            System.out.println("Birthday verification Failed");
        }

        Thread.sleep(4000);
        driver.close();
    }
}
