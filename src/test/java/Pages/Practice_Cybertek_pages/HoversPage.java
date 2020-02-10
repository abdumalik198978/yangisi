package Pages.Practice_Cybertek_pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoversPage {
    public HoversPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//img[@src ='/img/avatar-blank.jpg'])[1]")
    public WebElement user1;

    @FindBy(xpath = "(//img[@src ='/img/avatar-blank.jpg'])[2]")
    public WebElement user2;

    @FindBy(xpath = "(//img[@src ='/img/avatar-blank.jpg'])[3]")
    public WebElement user3;


    @FindBy(xpath = "(//div[@class='figcaption']/h5)[1]")
    public WebElement user1Text;
    @FindBy(xpath = "(//div[@class='figcaption']/h5)[2]")
    public WebElement user2Text;
    @FindBy(xpath = "(//div[@class='figcaption']/h5)[3]")
    public WebElement user3Text;

}
