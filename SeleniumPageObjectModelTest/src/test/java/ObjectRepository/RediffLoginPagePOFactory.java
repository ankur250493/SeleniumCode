package ObjectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RediffLoginPagePOFactory {

    WebDriver driver;

    public RediffLoginPagePOFactory(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='login1']")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(name = "proceed")
    WebElement login;

    @FindBy(linkText = "rediff.com")
    WebElement homepage;

    public WebElement EmailId(){
        return username;
    }
    public WebElement Password(){
        return password;
    }
    public WebElement Login(){
        return login;
    }
    public WebElement Homepage(){
        return homepage;
    }
}

