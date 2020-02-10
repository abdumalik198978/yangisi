package Pages_Tests.tests;

import Pages.vytrack_pages.VytrackLoginPage;
import Utilities.Config;
import Utilities.Driver;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void positiveLoginScenario(){

        String username = Config.getProperty("storemanagerUsername");
        String password = Config.getProperty("storemanagerPassword");
        Driver.getDriver().get(Config.getProperty("vytrackUrl"));

        VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
        vytrackLoginPage.usernameInput.sendKeys(username);
        vytrackLoginPage.passwordInput.sendKeys(password);
        vytrackLoginPage.loginButton.click();
    }
}
