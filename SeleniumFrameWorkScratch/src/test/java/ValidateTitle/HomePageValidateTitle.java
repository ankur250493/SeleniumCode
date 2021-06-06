package ValidateTitle;

import BrowserInitializer.Base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.landingPage;
import pageObjects.loginPage;

import java.io.IOException;

public class HomePageValidateTitle extends Base {
    public WebDriver driver;
    landingPage obj;
    private static Logger log =  LogManager.getLogger(HomePageValidateTitle.class);
    @BeforeTest
    public void TearUp() throws IOException {
        driver = InitialiseDemo();
        driver.get(prop.getProperty("url"));
        log.info("Driver is initialized");
    }

    @Test
    public void basePageNavigation(){
        obj = new landingPage(driver);
        String validate = obj.getTitle().getText();
        Assert.assertEquals(validate, "FEATURED COURSES");
        log.info("Title is correct");

    }

    @Test
    public void validateHeader(){
        String validateHeader = obj.getPageHeader().getText();
        Assert.assertEquals(validateHeader, "An Academy to learn Everything about Testing");
        log.info("Page header is correct");
    }

    @AfterTest
    void TearDown() {
        driver.close();
        log.info("Driver is closed");
    }
}
