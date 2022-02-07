package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppleStorePage extends BasePage{
    public AppleStorePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class='brand-box__title']/a[contains(@href,'ipad')]")
    private WebElement ipad;

    public void getIpadPage() {
        ipad.click();
    }
}
