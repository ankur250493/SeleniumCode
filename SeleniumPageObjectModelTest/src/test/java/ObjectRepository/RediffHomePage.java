package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {

    WebDriver driver;

    public RediffHomePage(WebDriver driver) {
        this.driver = driver;
    }

    By homePageSearch = By.id("srchword");

    By homePageSearchButton = By.className("newsrchbtn");

    public WebElement HomeSearchBox() {
        return driver.findElement(homePageSearch);
    }
    public WebElement HomePageSearchButton() {
        return driver.findElement(homePageSearchButton);
    }
}