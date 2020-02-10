package Pages.SmartBear_Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SmartBearLoginPage {
    //When we creating a POM page
    //1-Create the constructor and call PageFactory method
    public SmartBearLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //2-@FindBy annotation to locate webElements
    @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameInput;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordInput;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(id = "ctl00_MainContent_status")
    public WebElement errorMessage;


}
