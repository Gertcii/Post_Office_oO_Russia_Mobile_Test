package entities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class MorePage {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name='moreStaticCell_authorization']")
    public MobileElement authorization;

    public MorePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
