package TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTestNg {
    @AfterClass
    public void tearDown(){
        System.out.println("After class is running");
    }
    @AfterMethod
    public void afterMetod(){
        System.out.println("afteer method is running");
    }
    @Test
    public void firstTest(){
        System.out.println("First test is running");
        Assert.assertTrue("sentence".contains("e"),"sentence does not contain given parameter");
    }
    @Test
    public void secondTest(){
        System.out.println("Second test is running");
        Assert.assertEquals("actual", "actual","Second is Failed");
        Assert.assertEquals(1, 1,"Second is Passed");
    }
    @BeforeClass
    public void setUp(){
        System.out.println("before class is running");
    }
    @BeforeMethod
    public void beforeMetod(){
        System.out.println("Before method is running");
    }

}
