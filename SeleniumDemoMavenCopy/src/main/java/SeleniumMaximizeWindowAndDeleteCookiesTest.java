import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class SeleniumMaximizeWindowAndDeleteCookiesTest {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed("SessionKey");

        // redirect to login page

        driver.get("https://google.com/");

        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(src,new File("/home/ankur/Documents/temp/screenshot.png"));
        driver.close();

    }
}
