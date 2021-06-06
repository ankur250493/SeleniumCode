package stepdefs

import cucumber.api.PendingException
import cucumber.api.scala.{EN, ScalaDsl}
import org.openqa.selenium.By
import org.openqa.selenium.firefox.FirefoxDriver
import org.scalatest.Matchers

import java.util.concurrent.TimeUnit

class MyStepdefs extends ScalaDsl with EN with Matchers {
  val driver = new FirefoxDriver()
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)

  Given("""^I have navigated to google$"""){ () =>
    driver.navigate().to("http://www.google.com")
    throw new PendingException()
  }

  When("""^I search for "(.*?)"$"""){ (searchTerm:String) =>
    driver.findElement(By.id("gbqfq")).sendKeys(searchTerm)
    driver.findElement(By.id("gbqfb")).click();
    throw new PendingException()
  }

  Then("""^the page title should be "(.*?)"$"""){ (title:String) =>
    driver.getTitle.shouldEqual(title)
    throw new PendingException()
  }

}