package TestNGDemoPrograms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ThirdTest {

    @Test(dataProvider = "getData")
    public void login(String userName, String password){
       // System.out.println("ThirdTest");

        System.out.println(userName);
        System.out.println(password);

    }

    @Parameters({"URL"})
    @Test(dependsOnMethods = {"login"})
    public void login2(String testURLS){
        System.out.println("ThirdTest2");
        System.out.println(testURLS);
    }

    @Test(groups = {"Smoke"})
    public void login3(){
        System.out.println("ThirdTest3");
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[3][2];
        // 1st set
        data[0][0] = "firstUserName";
        data[0][1] = "Password";

        //2nd dataset
        data[1][0] = "secindUserName";
        data[1][1] = "secondPassword";

        //3rd set
        data[2][0] = "ThirdUser";
        data[2][1] = "ThirsPassword";

        return data;
    }
}
