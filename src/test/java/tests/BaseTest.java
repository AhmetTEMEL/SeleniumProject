package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import utils.PropertiesFile;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static WebDriver driver;
    protected static ExtentReports extent;
    protected static  ExtentSparkReporter spark;
    public static final String USERNAME = "alihanozbayrak1";
    public static final String AUTOMATE_KEY = "yYzukxkJ3sAqxT1pyW7B";
    DesiredCapabilities caps;
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @BeforeSuite
    public void setupExtentReport(){
        extent = new ExtentReports();
        spark = new ExtentSparkReporter("extent.html");
        extent.attachReporter(spark);
        caps = new DesiredCapabilities();
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "latest");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.selenium_version", "3.14.0");


    }

    @BeforeTest
    public void setupTest() throws Exception{
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get(PropertiesFile.getValue("baseUrl"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
    }

    @AfterTest
    public void tearDownTest(){
        driver.close();
        driver.quit();
        System.out.println("Test is completed..");
    }

    @AfterSuite
    public void tearDownReport(){
        extent.flush();
    }
}
