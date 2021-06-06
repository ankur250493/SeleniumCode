import org.openqa.selenium.{By, WebDriver}
import org.scalatest._
import org.scalatest.matchers._
import org.scalatestplus.selenium._
import org.openqa.selenium.chrome.ChromeDriver
import org.scalatestplus.selenium.Chrome.webDriver

class test extends flatspec.AnyFlatSpec with should.Matchers with WebBrowser {
  System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver")
 // implicit val webDriver: WebDriver = new ChromeDriver()
  val host = "https://login.salesforce.com/?locale=in"
  val k = DataDriven.extractData("Sheet1", "Login", "TestCases")
  "The blog app home page" should "have the correct title" in {
    go to host
    emailField("username").value= k.get(1)
    pwdField("password").value = k.get(2)
    click on id("Login")
    pageTitle should be ("Login | Salesforce")
   // webDriver.close()
  }
}