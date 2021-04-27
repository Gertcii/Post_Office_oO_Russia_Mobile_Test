package setUp;

import org.openqa.selenium.WebElement;

public interface IPageObject {

    WebElement getWebElement(String weName) throws NoSuchFieldException, IllegalAccessException, InstantiationException;

    void inputText(String weName, String text) throws NoSuchFieldException, IllegalAccessException, InstantiationException;
}
