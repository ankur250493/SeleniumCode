import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;
public class Selenium4MultipleWindowsOrTabsTest {
    @Test
    public void multipleWindowHandler() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new HtmlUnitDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> windowHandler = driver.getWindowHandles();
        Iterator<String> it = windowHandler.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        Thread.sleep(5000);
        driver.get("https://rahulshettyacademy.com");
        String sampleInput = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
        driver.switchTo().window(parentId);
        driver.findElement(By.cssSelector("input[class='form-control ng-untouched ng-pristine ng-invalid']")).sendKeys(sampleInput);
        driver.close();
    }
}
