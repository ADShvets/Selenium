import org.testng.Assert;
import org.testng.annotations.Test;

import static pageFactory.BasePage.TIME_OUT_30_SECONDS;

public class SmartHousePageTest extends BaseTest {
    private static final int EXPECTED_AMOUNT = 24;

    @Test
    public void checkButtonWillShowMore() {
        getSmartHousePage().waitVisibilityOfElement(TIME_OUT_30_SECONDS, getHomePage().returnPopUp());
        getHomePage().getClosePopUp();
        getHomePage().getSmartHomeMenu();
        getSmartHousePage().getScrollPageToShowMore();
        getHomePage().waitVisibilityOfElement(TIME_OUT_30_SECONDS, getSmartHousePage().getFindLoadElement());
        Assert.assertEquals(getSmartHousePage().getSearchResultList().size(), EXPECTED_AMOUNT);
    }
}
