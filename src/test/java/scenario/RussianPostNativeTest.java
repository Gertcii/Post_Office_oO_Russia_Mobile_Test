package scenario;

import org.testng.annotations.Test;

import static TestData.DataForTest.*;
import static setUp.PageNames.*;

public class RussianPostNativeTest extends BaseTest{

    @Test(groups = {"native"}, description = "login into Russian Post")
    public void loginTest() throws Exception {

        getPageByName(POST_OFFICE_PAGE).getWebElement("moreButton").click();
        getPageByName(MORE_PAGE).getWebElement("authorization").click();
        getPageByName(AUTHORIZATION).inputText("loginField", LOGIN);
        getPageByName(AUTHORIZATION).inputText("passwordField", PASSWORD);
        getPageByName(AUTHORIZATION).getWebElements("enterButton").get(1).click();
        //getPageByName(AUTHORIZATION).getWebElement("enterButton").click();
        getPageByName(AUTHORIZATION).getWebElement("moreAfterAuth").click();
        getPageByName(MORE_PAGE).getWebElement("authorization").click();
    }
}
