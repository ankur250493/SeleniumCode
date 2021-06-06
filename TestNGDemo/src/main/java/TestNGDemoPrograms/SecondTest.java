package TestNGDemoPrograms;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondTest {

    @Parameters({"URL","APIKey"})
    @Test
    public void FirstMethod(String testURL,String key){
        System.out.println("SecondTest");
        System.out.println(testURL);
        System.out.println(key);
    }

    @Test(groups = {"Smoke"})
    public void SecondMethod(){
        System.out.println("SecondTest2");
    }
}
