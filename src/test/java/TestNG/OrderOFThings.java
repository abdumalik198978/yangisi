package TestNG;

import org.testng.annotations.Test;

public class OrderOFThings {

    @Test(priority = 123*25)
    public void firstTest(){
        System.out.println("Test one is running");
    }

    @Test(priority = 3)
    public void secondTest(){
        System.out.println("test two is running");
    }

    @Test(priority = -1233)
    public void thirsTest(){
        System.out.println("Test three is running");
    }
}
