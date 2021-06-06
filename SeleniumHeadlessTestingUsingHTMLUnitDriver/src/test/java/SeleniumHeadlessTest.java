import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

import javax.print.attribute.standard.Chromaticity;
import java.util.concurrent.TimeUnit;

public class SeleniumHeadlessTest {

    @Test
    public void HeadlessTest(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/?locale=in");
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#username")).sendKeys("sample@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("password");
        driver.findElement(By.cssSelector("#Login")).click();

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.findElement(By.id("error")).getText());

    }
}
