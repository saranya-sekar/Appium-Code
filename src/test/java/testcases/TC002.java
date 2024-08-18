package testcases;

import org.testng.annotations.Test;
import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class TC002 extends ProjectSpecificWrappers {
    @Test
    public void runMyScript() {
        new LoginPage(driver)
                .enterUserName("lokesh@testleaf.com")
                .enterPassword("Leaf@123")
                .clickLoginForFailure();
    }
}
