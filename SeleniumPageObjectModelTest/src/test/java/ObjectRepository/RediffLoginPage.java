package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

    WebDriver driver;

    public  RediffLoginPage(WebDriver driver) {
this.driver = driver;
    }

    By userName = By.xpath("//*[@id='login1']");

    By password = By.id("password");

    By login = By.name("proceed");

    By homePage = By.linkText("rediff.com");

    public WebElement EmailId(){
        return driver.findElement(userName);
    }
    public WebElement Password(){
        return driver.findElement(password);
    }
    public WebElement Login(){
        return driver.findElement(login);
    }
    public WebElement Homepage(){
        return driver.findElement(homePage);
    }
}

