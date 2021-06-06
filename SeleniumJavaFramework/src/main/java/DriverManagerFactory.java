import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.sql.DriverManager;

public class DriverManagerFactory {
    public static DriverManager getDriverManager(DriverType type){
    DriverManager driverManager;
    switch (type){
        case CHROME:
            driverManager = new ChromeDriverManager();
        break;
        case FIREFOX:
            break;
        case EDGE:
            break;
        case IE:
            break;
    }
return driverManager;
    }

}
