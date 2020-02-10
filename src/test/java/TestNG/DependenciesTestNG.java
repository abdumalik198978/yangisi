package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesTestNG {

    @Test(priority = 2)
    public void login(){
        System.out.println("Loggimg in..");
        Assert.fail("On purpose fail");
    }

    @Test(priority = 1, dependsOnMethods = "login")
    public void makePurchase(){
        System.out.println("Making Purchase..");

    }

    @Test
    public void homePage(){
        System.out.println("HomePage is tested");
    }

}
