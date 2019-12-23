package abstractParentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import libs.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FeedbackPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PersonalCabinetPage;

import java.util.concurrent.TimeUnit;

public class AbstractParentTest {
    WebDriver webDriver;
    protected LoginPage loginPage;
    protected PersonalCabinetPage personalCabinetPage;
    protected HomePage homePage;
    protected FeedbackPage feedbackPage;
    protected static ConfigProperties configProperties =
            ConfigFactory.create(ConfigProperties.class);
    protected Logger logger = Logger.getLogger(getClass());

    @Before
    public void setUp() throws Exception {
        webDriver = driverInit();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage= new LoginPage(webDriver);
        personalCabinetPage = new PersonalCabinetPage(webDriver);
        homePage = new HomePage(webDriver);
        feedbackPage = new FeedbackPage(webDriver);

    }
    private WebDriver driverInit() throws Exception {
        String browser = System.getProperty("browser");
        if ((browser==null) || ("chrome".equalsIgnoreCase(browser))) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }  else {
            throw new Exception("Check browser var");
        }
    }

    @After
    public void tearDown () {
        webDriver.quit();
    }


    protected void checkExpectedResult(String message, boolean actualResult) {
        Assert.assertEquals(message, true, actualResult);
    }

}
