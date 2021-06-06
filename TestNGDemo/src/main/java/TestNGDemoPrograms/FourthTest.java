package TestNGDemoPrograms;

import org.testng.annotations.*;


public class FourthTest {

    @Test(groups = {"Smoke"})
    public void logout(){
        System.out.println("FourthTest");
    }

    @Test
    public void logout2(){
        System.out.println("FourthTest2");
    }

    @Test(timeOut = 4000)
    public void logout3(){
        System.out.println("FourthTest3");
    }

    @BeforeMethod
    public void passingValueToMethod(){
        System.out.println("Will pass values to methods");
    }

    @AfterMethod(enabled = false)
    public void deletingValueToMethod(){
        System.out.println("Will delete values from the methods");
    }

    @BeforeClass
    public void beforeTheClass(){
        System.out.println("Will be executed before the class");
    }

    @AfterClass
    public void AfterTheClass(){
        System.out.println("Will be executed after the class");
    }
}
