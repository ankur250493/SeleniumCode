import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class RemoteTest2 {
    @Test
    public void demofunc() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("browserName", "chrome");
        chromeOptions.setCapability("platformName", "WIN10");
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.105:4444/wd/hub"), chromeOptions);
        driver.get("http://www.google.com");
        driver.quit();
    }

}
