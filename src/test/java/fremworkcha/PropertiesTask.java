package fremworkcha;

import Utilities.Config;
import Vytrack.VyTracUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesTask {
    @Test
    public void test() throws Exception{
        String path = "test.properties";
        Properties properties = new Properties();
        FileInputStream file = new FileInputStream(path);
        properties.load(file);
        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));
    }



    @Test
    public void testwithUtil(){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(Config.getProperty("vytrackUrl"));
        VyTracUtils.login(driver, Config.getProperty("storemanagerUser1"), Config.getProperty("storemanagerPassword"));
    }
}
