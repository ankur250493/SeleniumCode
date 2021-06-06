import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;
public class Selenium4RelativeLocators {
    @Test
    public void RelativeLocators() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
        System.out.println(driver.findElement(withTagName("label").above(nameEditBox)).getText());
        WebElement iceCreamLabel = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        driver.findElement(withTagName("input").toLeftOf(iceCreamLabel)).click();
        WebElement dateOfBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
        driver.findElement(withTagName("input").below(dateOfBirth)).sendKeys("02/02/1992");
        WebElement rb = driver.findElement(By.id("inlineRadio1"));
        System.out.println(driver.findElement(withTagName("label").toRightOf(rb)).getText());
        driver.close();
    }
}

