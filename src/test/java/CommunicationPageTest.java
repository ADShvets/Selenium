import org.testng.Assert;
import org.testng.annotations.Test;

import static pageFactory.BasePage.TIME_OUT_30_SECONDS;

public class CommunicationPageTest extends BaseTest {
    private static final String EXPECT_RESULT_FOR_CHECK_EMAIL_SUPPORT = "Сообщение успешно отправлено";
    @Test
    public void checkSendAnEmailToSupport() {
        getHomePage().implicitWait(TIME_OUT_30_SECONDS);
        getHomePage().getClosePopUp();
        getHomePage().getSendLetterToDirector();
        getCommunicationPage().getSupport();
        getCommunicationPage().getWriteName();
        getCommunicationPage().getWriteEmail();
        getCommunicationPage().getWriteText();
        getCommunicationPage().getSendMessageButton();
        Assert.assertEquals(getCommunicationPage().getReport(), EXPECT_RESULT_FOR_CHECK_EMAIL_SUPPORT);

    }
}
