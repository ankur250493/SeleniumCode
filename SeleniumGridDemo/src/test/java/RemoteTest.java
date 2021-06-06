import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class RemoteTest {
    @Test
    public void demofunc() throws MalformedURLException {

       ChromeOptions option = new ChromeOptions();
       // ChromeOptions dc = new ChromeOptions();
        option.setCapability("BrowserName", "chrome");
        option.setCapability("Platform", "WIN10");
//        option.setCapability(platform,"WIN10");








//        dc.setBrowserName("chrome");
//        dc.setPlatform(Platform.WIN10);

//        RemoteWebDriver driver = new RemoteWebDriver(
//                new URL("http://192.168.0.105:4444/wd/hub"),
//                option);
        WebDriver driver= new RemoteWebDriver(new URL("http://192.168.0.111:4444/wd/hub"),option);

      //  WebDriver driver= new RemoteWebDriver(new URL("http://192.168.0.105:4444/wd/hub"),dc);
        driver.get("https://google.com");


    }

}
