package BrowserInitializer;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class Base {
    public WebDriver driver;
    public Properties prop = new Properties();

    public WebDriver InitialiseDemo() throws IOException {


        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/Data.properties");
        prop.load(fis);
      //  String browserName = System.getProperty("browser");
          String browserName = prop.getProperty("browser");


        switch (browserName) {
            case "firefox":
                FirefoxOptions ffOptions = new FirefoxOptions();
                //initialize ffOptions
                ffOptions.setCapability("browserName", "firefox");
                //Define on which browser you want to execute your tests.
                ffOptions.setCapability("platformName","LINUX");
                //Define the platform on which you will execute your tests
                driver = new RemoteWebDriver(new URL("http://172.17.0.1:4444/wd/hub"), ffOptions);
                break;
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                //initialize chromeOptions
                chromeOptions.setCapability("browserName", "chrome");
                //Define on which browser you want to execute your tests.
                chromeOptions.setCapability("platformName","LINUX");
                //Define the platform on which you will execute your tests
                driver = new RemoteWebDriver(new URL("http://172.17.0.1:4444/wd/hub"), chromeOptions);
                break;
            case "IE":

                break;
        }
        return driver;
    }

    public String getScreenshotPath(String testCaseName, WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir") + "/screenshot/reports/" + testCaseName + ".png";
        FileUtils.copyFile(source, new File(destinationFile));
        return destinationFile;

    }
}
