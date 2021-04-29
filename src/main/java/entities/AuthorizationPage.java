package entities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AuthorizationPage {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    public MobileElement loginField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeSecureTextField")
    public MobileElement passwordField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField")
    public List<MobileElement> textFieldList;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label= 'done']")
    public MobileElement doneButton;

    public AuthorizationPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
