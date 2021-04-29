package entities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

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
            case "authorization":
                page = new AuthorizationPage(driver);
                break;
            case "parcel info":
                page = new ParcelInfoPage(driver);
                break;
            default:
                throw new Exception("page wasn't created " + pageName);
        }
    }

    public MobileElement getElement(String elName) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Field field = page.getClass().getDeclaredField(elName);
        field.setAccessible(true);
        return (MobileElement) field.get(page);
    }

    public void inputText(String elName, String text) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        getElement(elName).sendKeys(text);
    }

    public List<MobileElement> getElements(String elName) throws NoSuchFieldException, IllegalAccessException {
        Field field = page.getClass().getDeclaredField(elName);
        field.setAccessible(true);
        return (List<MobileElement>) field.get(page);
    }

    public Boolean isTextInElementsTextList(String elName, String expectedText) throws NoSuchFieldException, IllegalAccessException {
        List<MobileElement> elementList = getElements(elName);
        List<String> elementsTextList = new ArrayList<>();
        elementList.stream().forEach(x -> elementsTextList.add(x.getAttribute("value")));
        return elementsTextList.stream().anyMatch(x -> x.contains(expectedText));
    }
}
