package entities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PostOfficePage {

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name = 'rPTabBar_moreTabBarItem']")
    public WebElement moreButton;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='trackingItemList_searchBar']")
    public WebElement searchField;

    public PostOfficePage(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
