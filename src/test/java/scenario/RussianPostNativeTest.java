package scenario;

import org.testng.annotations.Test;

import static TestData.DataForTest.*;
import static setUp.PageNames.*;

public class RussianPostNativeTest extends BaseTest{

    @Test(groups = {"native"}, description = "login into Russian Post")
    public void loginTest() throws Exception {

        getPageByName(POST_OFFICE_PAGE).getElement("moreButton").click();
        getPageByName(MORE_PAGE).getElement("authorization").click();
        getPageByName(AUTHORIZATION).inputText("loginField", LOGIN);
        getPageByName(AUTHORIZATION).inputText("passwordField", PASSWORD);
        getPageByName(AUTHORIZATION).getElements("enterButton").get(1).click();
        //getPageByName(AUTHORIZATION).getWebElement("enterButton").click();
        getPageByName(AUTHORIZATION).getElement("moreAfterAuth").click();
        getPageByName(MORE_PAGE).getElement("authorization").click();
    }
}
