package seleniumIntro.weekend;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
          if(!checkBox1.isSelected()){
              System.out.println("Checkboxes 1 is not selected by Default");
          }else{
              System.out.println("Checkbox 1 selected by Default");
          }

          WebElement checkBox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
          if (checkBox2.isSelected()){
              System.out.println("CheckBox 2 selected by default");
          }else {
              System.out.println("CHeckbox 2 is not selected by default");
          }
          checkBox1.click();
          checkBox2.click();

        if(!checkBox1.isSelected()){
            System.out.println("Checkboxes 1 is not selected by Default");
        }else{
            System.out.println("Checkbox 1 selected by Default");
        }

        if (checkBox2.isSelected()){
            System.out.println("CheckBox 2 selected by default");
        }else {
            System.out.println("CHeckbox 2 is not selected by default");
        }



        Thread.sleep(4000);
        driver.close();
    }
}
