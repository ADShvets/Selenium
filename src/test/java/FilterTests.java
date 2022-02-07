import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterTests extends BaseTest {
    private static final boolean EXPECT_CHECK_FILTER_BY_PRICE_RESULT = true;
    @Test
    public void checkFilterByPrice() {
        getHomePage().goAppleStore();
        getAppleStorePage().getIpadPage();
        getIpadPage().filterByPrice();
        Assert.assertTrue(getIpadPage().checkFilter(getIpadPage().getSearchResultsList()), String.valueOf(EXPECT_CHECK_FILTER_BY_PRICE_RESULT));
    }
}
