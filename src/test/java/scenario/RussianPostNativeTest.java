package scenario;

import org.testng.annotations.Test;

import static TestData.DataForTest.*;
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
}
