package TestCses;

//import ObjectRepository.RediffHomePage;
import ObjectRepository.RediffHomePagePOFactory;
import ObjectRepository.RediffLoginPage;
import ObjectRepository.RediffLoginPagePOFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginAppWithPOFactory {

    @Test
    public void Login(){
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        RediffLoginPagePOFactory rdPOFactory = new RediffLoginPagePOFactory(driver);
        RediffHomePagePOFactory rhPOFactory = new RediffHomePagePOFactory(driver);



        rdPOFactory.EmailId().sendKeys("samsplemail@hhh.com");
        rdPOFactory.Password().sendKeys("samplePassword");
        rdPOFactory.Login().click();
        rdPOFactory.Homepage().click();
        rhPOFactory.HomeSearchBox().sendKeys("sampleText");
        rhPOFactory.HomePageSearchButton().click();

    }
}
