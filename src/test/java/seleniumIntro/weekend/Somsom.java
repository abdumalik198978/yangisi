package seleniumIntro.weekend;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Somsom {
    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select yearDropdown= new Select(driver.findElement(By.xpath("//select[@id='year']")));
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        Select montDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        String actualMonth = montDropdown.getFirstSelectedOption().getText();
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        String actualDay = dayDropdown.getFirstSelectedOption().getText();
        System.out.println(actualDay+" "+actualMonth+" "+actualYear);

        if(actualYear.equals("2020") && actualMonth.equals("January") && actualDay.equals("27")){
            System.out.println("Today's date verification is PASSED");
        }else {
            System.out.println("Today's date verification is FAILED");
        }
        yearDropdown.selectByValue("1921");
        montDropdown.selectByIndex(11);
        dayDropdown.selectByVisibleText("31");

        String expectedYear = "1921";
        String expectedMonth = "December";
        String expectedday = "31";

        String actualYearSelected =yearDropdown.getFirstSelectedOption().getText();
        String actualMonthSelected = montDropdown.getFirstSelectedOption().getText();
        String actualDaySelected = dayDropdown.getFirstSelectedOption().getText();

        System.out.println(actualDaySelected +" "+ actualMonthSelected+" "+ actualYearSelected);

        if(expectedday.equals(actualDaySelected) && expectedMonth.equals(actualMonthSelected) &&
                expectedYear.equals(actualYearSelected)){
            System.out.println("PASSD");
        }else{
            System.out.println("FAILED");
        }

        Thread.sleep(4000);
      driver.close();
    }
}
//public class DropdownPractice1 {
//    public static void main(String[] args) {
//        //TC #1: Selecting date on dropdown and verifying
//        // 1.Open Chrome browser
//        // 2.Go to http://practice.cybertekschool.com/dropdown
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://practice.cybertekschool.com/dropdown");
//        // 3.Verify “Select your date of birth” dropdowns are selected todays date by default.
//        String expectedDay = "26";
//        String expectedMonth = "January";
//        String expectedYear = "2020";
//        Select dayDropdown = new Select(driver.findElement(By.id("day")));
//        String actualDay = dayDropdown.getFirstSelectedOption().getText();
//        Select monthDropdown = new Select(driver.findElement(By.id("month")));
//        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
//        Select yearDropdown = new Select(driver.findElement(By.id("year")));
//        String actualYear = yearDropdown.getFirstSelectedOption().getText();
//        if(expectedDay.equals(actualDay) && expectedMonth.equals(actualMonth) && expectedYear.equals(actualYear)){
//            System.out.println("Default selected options verification PASSED!");
//        }else{
//            System.out.println("Default selected options verification FAILED!!!");
//        }
//        // 4.Select “December 31st, 1921” and verify it is selected.Use all Select options
//        yearDropdown.selectByValue("1921");
//        monthDropdown.selectByIndex(11);
//        dayDropdown.selectByVisibleText("31");
//        String expectedSelectedDay = "31";
//        String expectedSelectedMonth = "December";
//        String expectedSelectedYear = "1921";
//        String actualSelectedDay = dayDropdown.getFirstSelectedOption().getText();
//        String actualSelectedMonth = monthDropdown.getFirstSelectedOption().getText();
//        String actualSelectedYear = yearDropdown.getFirstSelectedOption().getText();
//        if(actualSelectedYear.equals(expectedSelectedYear) && actualSelectedMonth.equals(expectedSelectedMonth) &&
//                actualSelectedDay.equals(expectedSelectedDay)){
//            System.out.println("Date is correct. Selected values verification PASSED!");
//        }else{
//            System.out.println("Date is incorrect. Selected values verifications FAILED!");
//        }
//    }
//}