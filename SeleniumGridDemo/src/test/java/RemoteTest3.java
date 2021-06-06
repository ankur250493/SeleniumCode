import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class RemoteTest3 {
    @Test
    public void demofunc() throws MalformedURLException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-infobars");
        options.addArguments("--proxy-pac-url=http://myPacFile.com");
        options.addArguments("--no-sandbox");
        RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.111:4444/wd/hub"), options);
        driver.get("https://google.com");


    }

}
