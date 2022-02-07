package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AirPodsPage extends BasePage {

    @FindBy(xpath = "//a[@class='main-btn main-btn--green main-btn--large']")
    private WebElement buy;

    public void getBuy() {
        buy.click();
    }
    public AirPodsPage(WebDriver driver) {
        super(driver);
    }
}
