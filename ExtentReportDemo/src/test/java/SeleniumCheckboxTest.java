import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumCheckboxTest {
    ExtentReports extent;
    @BeforeTest
    public void config(){

        String path = System.getProperty("user.dir") + "/reports/index.html";
        System.out.println(System.getProperty("user.dir"));
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("SampleReportName");
        reporter.config().setDocumentTitle("SampleDocumentTitle");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester","Ankur");
    }

    @Test
            public void extentReportTest(){
        ExtentTest test = extent.createTest("Initial demo");
        System.setProperty("webdriver.chrome.driver", "/home/ankur/Documents/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
        // Find and select the required checkbox
        System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
        // Check that the checkbox is selected or not
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        //count the number od checkboxes

        test.fail("soh");
        driver.close();
        extent.flush();

    }
}
