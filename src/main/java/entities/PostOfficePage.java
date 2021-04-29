package entities;

import com.epam.jdi.light.mobile.elements.common.app.Button;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.PageFactory;

public class PostOfficePage {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name = 'rPTabBar_moreTabBarItem']")
    public MobileElement moreButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='trackingItemList_searchBar']")
    public MobileElement searchField;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@label= 'search']")
    public MobileElement searchButton;

    public PostOfficePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
