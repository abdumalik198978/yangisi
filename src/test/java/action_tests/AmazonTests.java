package action_tests;

import Pages.amazon_Pages.AmazonLandingPage;
import Utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class AmazonTests {
@Test
    public void signInHoverTEst(){
    //1-get the gape
    Driver.getDriver().get("https://amazon.com");
    //2- create the object of pages class to reach the web elements
    AmazonLandingPage landingPage = new AmazonLandingPage();
    //3-create the object of Actions classs and passs the driver clss int consstructor
    Actions actions = new Actions(Driver.getDriver());
    //4- we will move to the link using action instance and meethod
    actions.moveToElement(landingPage.signInLink).perform();
}
}
