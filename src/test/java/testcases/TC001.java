package testcases;

import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class TC001 extends ProjectSpecificWrappers {
    @Test
    public void runMyScript() {
        new LoginPage(driver)
                .enterUserName("rajkumar@testleaf.com")
                .enterPassword("Leaf@123")
                .clickLogin();
    }
}
