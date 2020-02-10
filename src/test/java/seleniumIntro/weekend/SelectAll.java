package seleniumIntro.weekend;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelectAll {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement languages = driver.findElement(By.name("Languages"));
        Select selectLanguages = new Select(languages);
        List<WebElement> options = selectLanguages.getOptions();
        for (WebElement option:options) {
            Thread.sleep(500);

            selectLanguages.selectByVisibleText(option.getText());
        }
        List<WebElement> selectedOptions =  selectLanguages.getAllSelectedOptions();
        for (WebElement selectedOption : selectedOptions){
            System.out.println(selectedOption.getText());
        }
        // 5.Deselect all values.
        Thread.sleep(1000);
        selectLanguages.deselectAll();


        Thread.sleep(4000);
        driver.close();
    }
}
