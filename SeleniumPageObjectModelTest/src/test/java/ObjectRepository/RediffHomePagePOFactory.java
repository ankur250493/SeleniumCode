package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RediffHomePagePOFactory {

    WebDriver driver;

    public RediffHomePagePOFactory(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "srchword")
    WebElement homePageSearch;

    @FindBy(className = "newsrchbtn")
    WebElement homePageSearchButton;

    public WebElement HomeSearchBox() {
        return homePageSearch;
    }
    public WebElement HomePageSearchButton() {
        return homePageSearchButton;
    }
}

