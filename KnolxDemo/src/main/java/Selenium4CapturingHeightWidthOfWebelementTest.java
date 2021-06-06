import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.IOException;
public class Selenium4CapturingHeightWidthOfWebelementTest {
    @Test
    public void captureWidthAndHeight() throws IOException {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement userName = driver.findElement(By.cssSelector("input[class='form-control ng-untouched ng-pristine ng-invalid']"));
        userName.sendKeys("SampleText");
        System.out.println(userName.getRect().getHeight());
        System.out.println(userName.getRect().getWidth());
        driver.close();
    }
}
