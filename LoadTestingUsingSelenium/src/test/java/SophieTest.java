import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

public class SophieTest {

    public static void main(String[] args) {
        String text = "Sample";

        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("/home/ankur/Documents/Selenium 4.0/LoadTestingUsingSelenium/src/test/extension.crx"));
        options.addArguments("--no-sandbox");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://sophi.10uplabs.dev");




     //   driver.get("http://username:password@sophi.10uplabs.dev");
      //  driver.switchTo().activeElement().sendKeys("value");

        //driver.switchTo().alert();
//Selenium-WebDriver Java Code for entering Username & Password as below:
     //   driver.findElement(By.id("username")).sendKeys("userName");
     //   driver.findElement(By.id("password")).sendKeys("myPassword");
     //   driver.switchTo().alert().accept();
      //  driver.switchTo().defaultContent();
    }
}
