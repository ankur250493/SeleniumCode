package TestNGDemoPrograms;

import org.testng.Assert;
import org.testng.annotations.*;


public class TestNGTest {

    @Test
    public void Demo(){
        System.out.println("firstTest");
    }


    @Parameters({"URL"})
    @Test(groups = {"Smoke"})
    public void SecondTest(String urlName){
        System.out.println("firstTest2");
        System.out.println(urlName);
      //  Assert.fail();
    }

    @BeforeTest
    public void TearUp(){
        System.out.println("Create data");
    }
    @AfterTest
    public void TearDown(){
        System.out.println("Delete data");
    }
    @BeforeSuite
    public void settingUpData(){
        System.out.println("Will execute before tests");
    }

    @AfterSuite
    public void settingDownData(){
        System.out.println("Will execute after tests");
    }


}

