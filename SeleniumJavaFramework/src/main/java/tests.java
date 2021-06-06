import org.openqa.selenium.WebDriver;

import java.sql.DriverManager;

public class tests {
    DriverManager driverManager;
    WebDriver driver;

    public void navigateToGoogle(){
        driverManager=DriverManagerFactory.getDriverManager(DriverType.CHROME);
        driver=driverManager.getDriver

    }
}
