package runner;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import wrappers.GenericWrappers;

@CucumberOptions(features = {"src/test/resources/features"}, snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = {"pages"})

public class TestRunner extends GenericWrappers {
    @Parameters({"platformName", "udid", "appPackage", "appActivity", "automationName", "chromeDriverPort", "systemPort",
            "xcodeOrgId", "xcodeSigningId", "bundleId", "app", "mjpegServerPort", "wdaLocalPort"})
    @BeforeMethod
    public void bm(String platformName, String udid, String appPackage, String appActivity,
                   String automationName, String chromeDriverPort, String systemPort, String xcodeOrgId, String xcodeSigningId,
                   String bundleId, String app, String mjpegServerPort, String wdaLocalPort) {
        launchApp(platformName, "", udid, appPackage, appActivity, automationName, chromeDriverPort, systemPort, xcodeOrgId,
                xcodeSigningId, bundleId, app, mjpegServerPort, wdaLocalPort);
    }

    @AfterMethod
    public void am() {
        closeApp();
    }
}