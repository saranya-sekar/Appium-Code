package learning;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class IosFirstCodeInRealDevices {
    public static void main(String[] args) throws URISyntaxException, MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "iOS");
        dc.setCapability("automationName", "XCUITest");
        dc.setCapability("udid", "00008030-001150423ED2402E");
        dc.setCapability("showXcodeLog", true);
        dc.setCapability("bundleId", "com.apple.calculator");
//        dc.setCapability("app", System.getProperty("user.dir") + "/apks/UiCatalog.zip");
        AppiumDriver driver = new AppiumDriver(new URI("http://127.0.0.1:4723/").toURL(), dc);
        Thread.sleep(5000);
        driver.quit();
    }
}
