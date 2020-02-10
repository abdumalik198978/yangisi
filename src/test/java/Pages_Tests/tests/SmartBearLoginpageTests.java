package Pages_Tests.tests;

import Pages.SmartBear_Pages.SmartBearLoginPage;
import Utilities.Config;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmartBearLoginpageTests {
    SmartBearLoginPage loginPage = new SmartBearLoginPage();
    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get(Config.getProperty("smartBearUrl"));

    }
    @Test
    public void wrongUsername(){
        //2- we enter wrong username
        String wrongusername = Config.getProperty("wrongUsername");
        loginPage.usernameInput.sendKeys(wrongusername);
        //3- we enter correct password
        String correctpassword = Config.getProperty("correctPassword");
        loginPage.passwordInput.sendKeys(correctpassword);
        //4- click login button
        loginPage.loginButton.click();
        //5- verify error message
        Assert.assertTrue(loginPage.errorMessage.isDisplayed(), "Error message is NOT displayed!");
    }
    @Test
    public void wrongPassword(){
        //2- we enter coreect username
        String correctUsername = Config.getProperty("correctUsername");
        loginPage.usernameInput.sendKeys(correctUsername);
        //3- we enter wrong password
        String wrongPassword = Config.getProperty("wrongPassword");
        loginPage.passwordInput.sendKeys(wrongPassword);
        //4- click login button
        loginPage.loginButton.click();
        //5- verify error message
        Assert.assertTrue(loginPage.errorMessage.isDisplayed(), "Error message is NOT displayed!");
    }

    @Test
    public void noUsername(){
            String wrongPassword = Config.getProperty("wrongPassword");
            loginPage.passwordInput.sendKeys(wrongPassword);
            loginPage.loginButton.click();
            Assert.assertTrue(loginPage.errorMessage.isDisplayed(), "Error message is NOT displayed!");

    }
    @Test
    public void noPassword(){
        //2- we enter coreect username
        String correctUsername = Config.getProperty("correctUsername");
        loginPage.usernameInput.sendKeys(correctUsername);
        //3- we do not enter  password

        //4- click login button
        loginPage.loginButton.click();
        //5- verify error message
        Assert.assertTrue(loginPage.errorMessage.isDisplayed(), "Error message is NOT displayed!");
    }
}
