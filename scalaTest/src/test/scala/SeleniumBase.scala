//import com.sun.org.slf4j.internal.LoggerFactory
//import org.openqa.selenium.WebDriver
//import org.scalatest.funsuite.AnyFunSuite
//import org.scalatest.{BeforeAndAfterAll, GivenWhenThen}
//import org.scalatest.matchers.should.Matchers
//import org.scalatest.tags.ChromeBrowser
//import org.scalatest.FunSuite
//
//
//class SeleniumBase extends FunSuite with Matchers with BeforeAndAfterAll with GivenWhenThen with ChromeBrowser{
//
//  implicit val driver : WebDriver = SeleniumSetup.setupBrowser()
//  val log = Logger(LoggerFactory.getLogger(getClass))
//
//  override def afterAll {
//    driver.quit()
//  }
//}
