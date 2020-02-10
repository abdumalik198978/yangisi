package Pages.Practice_Cybertek_pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoading1page {
    public DynamicLoading1page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButoon;

    @FindBy(id = "username")
    public WebElement usernameInput;


}
