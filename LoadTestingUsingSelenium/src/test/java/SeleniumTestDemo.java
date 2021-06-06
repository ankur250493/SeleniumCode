
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;


class SeleniumDemoTest {
    private static final Logger logger = LogManager.getLogger(SeleniumDemoTest.class);

    public static void main(String[] args) throws IOException, InterruptedException, TimeoutException {


        System.setProperty("webdriver.chrome.driver","/home/ankur/Documents/Selenium/chromedriver");
        //System.setProperty("webdriver.chrome.driver","drivers\\chromedriver\\chromedrivers.exe");


        WebDriver driver = new ChromeDriver();
        // WebDriver driver = new FirefoxDriver();

        driver.get("https://sophi.10uplabs.dev");

        Runtime.getRuntime().exec("AutoIT\\SeleniumBug.exe");
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of time to hit");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            driver.findElement(By.linkText("Investing")).click();
            driver.findElement(By.partialLinkText("Market movers: Stocks that saw action ")).click();

            driver.navigate().to("https://sophi.10uplabs.dev");
            System.out.println(i);
        }
        driver.quit();


    }
}


