import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pageFactory.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {
    public WebDriver driver;
    private static final String AVIC_URL="https://avic.ua/";
    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AVIC_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
    public WebDriver getDriver() {
        return driver;
    }
    public CommunicationPage getCommunicationPage(){
        return new CommunicationPage(getDriver());
    }
    public HomePage getHomePage(){
        return new HomePage(getDriver());
    }
    public SmartHousePage getSmartHousePage(){
        return new SmartHousePage(getDriver());
    }
    public AirPodsPage getAirPodsPage(){return new AirPodsPage(getDriver());}
    public AppleStorePage getAppleStorePage(){
        return new AppleStorePage(getDriver());
    }
    public IpadPage getIpadPage(){
        return new IpadPage(getDriver());
    }
    public CartPage getCartPage(){
        return new CartPage(getDriver());
    }
}
