import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver
import org.scalatest.funsuite.AnyFunSuite
import org.testng.annotations.Test


class test1 extends AnyFunSuite{
@Test
  def loginTest() {
    System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver")
    val driver = new ChromeDriver

    driver.get("https://login.salesforce.com/?locale=in")
    driver.getTitle

    driver.findElement(By.cssSelector("#username")).sendKeys("sample@gmail.com")
    driver.findElement(By.cssSelector("#password")).sendKeys("password")
    driver.findElement(By.cssSelector("#Login")).click()
  }
}