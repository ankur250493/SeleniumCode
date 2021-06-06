import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SeleniumHeadlessTest {

    @Test
    public void HeadlessTest(){
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/?locale=in");
        System.out.println(driver.getTitle());

        driver.findElement(By.cssSelector("#username")).sendKeys("sample@gmail.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("password");
        driver.findElement(By.cssSelector("#Login")).click();

        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.findElement(By.id("error")).getText());





//        driver.get("https://google.com");
//        System.out.println(driver.getTitle());
//
//       // driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("amazon");
//        driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("amazon" + Keys.ENTER);
//
//        System.out.println(driver.getTitle());


       // driver.findElement(By.cssSelector("input[class='gNO89b']")).click();

    }
}
