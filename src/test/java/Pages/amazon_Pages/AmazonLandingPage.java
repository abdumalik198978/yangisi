package Pages.amazon_Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLandingPage {
    public AmazonLandingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "nav-link-accountList")
    public WebElement signInLink;

}
