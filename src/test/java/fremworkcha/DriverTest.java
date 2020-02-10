package fremworkcha;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DriverTest {
    @Test
    public void test(){
        Driver.getDriver().get("https://amazon.com");
       // Driver.getDriver().findElement(By.id())
        Driver.quitDriver();
    }
}
