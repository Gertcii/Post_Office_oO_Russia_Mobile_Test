package scenario;

import org.testng.annotations.Test;

import static testData.DataForTest.*;
import static org.testng.Assert.assertTrue;
import static setUp.PageNames.*;

public class RussianPostNativeTest extends BaseTest {

    @Test(groups = {"native"}, description = "login into Russian Post")
    public void loginTest() throws Exception {
        getPageByName(POST_OFFICE_PAGE).getElement("moreButton").click();
        getPageByName(MORE_PAGE).getElement("authorization").click();
        getPageByName(AUTHORIZATION).inputText("loginField", FULL_PHONE_NUMBER);
        getPageByName(AUTHORIZATION).inputText("passwordField", PASSWORD);
        getPageByName(AUTHORIZATION).getElement("doneButton").click();
        getPageByName(POST_OFFICE_PAGE).getElement("moreButton").click();
        getPageByName(MORE_PAGE).getElement("authorization").click();
        assertTrue(getPageByName(AUTHORIZATION)
                .isTextInElementsTextList("textFieldList", SHORT_PHONE_NUMBER));
    }

    @Test(groups = {"native"}, description = "search parcel by identifier code")
    public void searchParcelByParcelIdentifierCode() throws Exception {
        getPageByName(POST_OFFICE_PAGE).getElement("searchField").click();
        driver.getKeyboard().sendKeys(PARCEL_IDENTIFIER_CODE);
        getPageByName(POST_OFFICE_PAGE).getElement("searchButton").click();
        assertTrue(getPageByName(PARCEL_INFO_PAGE).isTextInElementsTextList("infoTextList", PARCEL_IDENTIFIER_CODE));
    }

    @Test(groups = {"native"}, description = "search by EMC identifier code")
    public void searchParcelByEMCIdentifierCode() throws Exception {
        getPageByName(POST_OFFICE_PAGE).getElement("searchField").click();
        driver.getKeyboard().sendKeys(EMC_IDENTIFIER_CODE);
        getPageByName(POST_OFFICE_PAGE).getElement("searchButton").click();
        assertTrue(getPageByName(PARCEL_INFO_PAGE).isTextInElementsTextList("infoTextList", EMC_IDENTIFIER_CODE));
    }
}
