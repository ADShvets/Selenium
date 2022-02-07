package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy(xpath = "//span[@class='js_plus btn-count btn-count--plus ']")
    private WebElement addTwoPositionToCart;
    @FindBy(xpath = "//div[@class='btns-cart-holder']//a[contains(@class,'btn--orange')]")
    private WebElement getOrder;
    @FindBy(xpath = "//div[@class='quantity-cart js_quantity']//input[contains(@value,'2')]")
    private WebElement checkout;

    public String getCheckout(){
        String value =checkout.getAttribute("value");
        System.out.println(value);
        return value;
    }
    public WebElement returnAddTwoPositionToCart(){
        return addTwoPositionToCart;
    }

    public void getAddTwoPositionToCart() {
        addTwoPositionToCart.click();
    }

    public CartPage(WebDriver driver) {
        super(driver);
    }
}
