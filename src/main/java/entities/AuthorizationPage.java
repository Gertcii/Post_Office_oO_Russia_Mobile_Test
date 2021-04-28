package entities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AuthorizationPage {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    public WebElement loginField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField")
    public WebElement passwordField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@value='1']")
    public WebElement moreAfterAuth;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton")
    public List<WebElement> enterButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    public List<WebElement> textFieldList;

    public AuthorizationPage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
