package pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SmartHousePage extends BasePage {
    @FindBy(xpath = "//div[@class='pagination']//a[@class='btn-see-more js_show_more']")
    private WebElement showMore;
    @FindBy(xpath = "//div[contains(text(),'YD0010W0CN')]")
    private WebElement findLoadElement;
    @FindBy(xpath = "//div[@class='item-prod col-lg-3']")
    private List<WebElement> searchResultList;

    public WebElement getFindLoadElement() {
        return findLoadElement;
    }
    public List<WebElement> getSearchResultList() {
        return searchResultList;
    }
    public void getScrollPageToShowMore() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN);
        action.click(showMore).perform();
    }
    public SmartHousePage(WebDriver driver) {
        super(driver);
    }
}