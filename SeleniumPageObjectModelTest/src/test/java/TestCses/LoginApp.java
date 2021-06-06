package TestCses;

import ObjectRepository.RediffHomePage;
import ObjectRepository.RediffHomePagePOFactory;
import ObjectRepository.RediffLoginPage;
import ObjectRepository.RediffLoginPagePOFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginApp {

    @Test
    public void Login(){
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        RediffLoginPage rd = new RediffLoginPage(driver);
        RediffHomePagePOFactory rh = new RediffHomePagePOFactory(driver);



        rd.EmailId().sendKeys("samsplemail@hhh.com");
        rd.Password().sendKeys("samplePassword");
        rd.Login().click();
        rd.Homepage().click();
        rh.HomeSearchBox().sendKeys("sampleText");
        rh.HomePageSearchButton().click();

    }

}
