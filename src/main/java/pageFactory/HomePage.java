package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//button[@class='fancybox-button fancybox-close-small']")
    private WebElement closePopUp;
    @FindBy(xpath = "//div[contains(@class,'mob ')]//a[contains(@href,'0-item')]//div[@class='category-box__more more']")
    private WebElement airPodsOnMainPage;
    @FindBy(xpath = "//a[text()='Письмо директору']")
    private WebElement sendLetterToDirector;
    @FindBy(xpath = "//span[text()='Умный дом']/..")
    private WebElement smartHomeMenu;
    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'apple-store')]")
    private WebElement searchAppleStore;

    public WebElement returnPopUp(){
        return closePopUp;
    }
    public void getClosePopUp(){
        if (closePopUp!=null){
            closePopUp.click();
        }
    }
    public void goAppleStore(){
        searchAppleStore.click();
    }
    public void getSmartHomeMenu(){
        smartHomeMenu.click();
    }
    public void getSendLetterToDirector(){
        sendLetterToDirector.click();
    }
    public void getAirPodsOnMainPage(){
        airPodsOnMainPage.click();
    }
    public HomePage(WebDriver driver) {
        super(driver);
    }
}
