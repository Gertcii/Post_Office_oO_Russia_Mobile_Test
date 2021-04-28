package scenario;

import org.testng.annotations.Test;

public class RussianPostNativeTest extends BaseTest{

    @Test(groups = {"native"}, description = "login into Russian Post")
    public void loginTest() throws Exception {
        getPageByName("postOffice").getWebElement("moreButton").click();
        getPageByName("more").getWebElement("authorization").click();
    }
}
