package entities;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import java.lang.reflect.Field;

public class BasePage {

    Object page;

    public BasePage(String pageName, AppiumDriver driver) throws Exception {
        switch (pageName) {
            case "postOffice":
                page = new PostOfficePage(driver);
                break;
            case "more":
                page = new MorePage(driver);
                break;
            default: throw new Exception("page wasn't created " + pageName);
        }
    }

    public WebElement getWebElement(String weName) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Field field = page.getClass().getDeclaredField(weName);
        field.setAccessible(true);
        return (WebElement) field.get(page);
    }

    public void inputText(String weName, String text) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        getWebElement(weName).sendKeys(text);
    }
}
