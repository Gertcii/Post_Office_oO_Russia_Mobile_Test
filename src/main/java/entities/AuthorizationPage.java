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

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    public List<WebElement> textFieldList;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label= 'done']")
    public WebElement doneButton;

    public AuthorizationPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
