import org.testng.Assert;
import org.testng.annotations.Test;

import static pageFactory.BasePage.TIME_OUT_30_SECONDS;

public class AirPodsTest extends BaseTest {
    private static final String EXPECTED_AMOUNT = "2";

    @Test
    public void checkAddingTwoItemsToCart() {
        getHomePage().getAirPodsOnMainPage();
        getAirPodsPage().getBuy();
        getHomePage().waitVisibilityOfElement(TIME_OUT_30_SECONDS,getCartPage().returnAddTwoPositionToCart());
        getCartPage().getAddTwoPositionToCart();
        Assert.assertEquals(getCartPage().getCheckout(), EXPECTED_AMOUNT);
    }
}
