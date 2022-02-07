package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class IpadPage extends BasePage{
    private static final String PRICE_FILTER_MIN_FORM_VALUE = "30000";
    private static final String PRICE_FILTER_MAX_FORM_VALUE = "40000";

    public IpadPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@class='form-control form-control-min']")
    private WebElement minPrice;
    @FindBy(xpath = "//input[@class='form-control form-control-max']")
    private WebElement clearMaxPrice;
    @FindBy(xpath = "//input[@class='form-control form-control-max']")
    private WebElement maxPrice;
    @FindBy(xpath = "//div[@class='form-group filter-group js_filter_parent open-filter-tooltip']/" +
            "/span[@class='filter-tooltip-inner']")
    private WebElement searchButton;
    @FindBy(xpath = "//div[@class='prod-cart__prise-new']")
    private List<WebElement> ipadFilterList;

    public List<WebElement> getSearchResultsList(){
        List<WebElement> webElements = ipadFilterList;
        return webElements;
    }

    public void filterByPrice(){
//        minPrice.clear();
        minPrice.sendKeys(PRICE_FILTER_MIN_FORM_VALUE);
//        maxPrice.clear();
        maxPrice.sendKeys(PRICE_FILTER_MAX_FORM_VALUE);
        implicitWait(TIME_OUT_30_SECONDS);
        searchButton.click();
        getSearchResultsList();
    }
    public boolean checkFilter(List<WebElement> webElements) {
        boolean booleanVariable = true;
        for (int i = 0; i < webElements.size(); i++) {
            String stringFromChar = webElements.get(i).getText().split(" ")[0];
            int integerFromString = Integer.parseInt(stringFromChar);
            if (integerFromString > Integer.parseInt(PRICE_FILTER_MAX_FORM_VALUE )|| integerFromString < Integer.parseInt(PRICE_FILTER_MIN_FORM_VALUE)) {
                booleanVariable = false;
            }
        }
        return booleanVariable;
    }


}
