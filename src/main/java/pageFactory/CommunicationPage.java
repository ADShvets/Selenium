package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommunicationPage extends BasePage{
    @FindBy(xpath = "//a[text()='Служба поддержки']")
    private WebElement support;
    @FindBy(xpath = "//div[@class='tab-content shown']//input[@name='user_name']")
    private WebElement writeName;
    @FindBy(xpath = "//div[@class='tab-content shown']//input[@name='user_email']")
    private WebElement writeEmail;
    @FindBy(xpath = "//div[@class='tab-content shown']//form/div/div/textarea")
    private WebElement writeText;
    @FindBy(xpath = "//div[@class='tab-content shown']//button[@type='submit']")
    private WebElement sendMessage;
    @FindBy(xpath = "//div[@class='ttl color-green']")
    private WebElement report;
    public String getReport(){
      return   report.getText();
    }

    public void getSendMessageButton(){
        sendMessage.click();
    }

    public void getWriteText(){
        writeText.sendKeys("Text");
    }
    public void getWriteEmail(){
        writeEmail.sendKeys("cyber_police@gmail.com");
    }
    public void getWriteName(){
        writeName.sendKeys("Hello");
    }
    public void getSupport(){
        support.click();
    }
    public CommunicationPage(WebDriver driver) {
        super(driver);
    }
}
