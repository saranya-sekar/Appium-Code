package learning;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class IosFirstCodewithAppCapability {
    public static void main(String[] args) throws URISyntaxException, MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "iOS");
        dc.setCapability("automationName", "XCUITest");
        //dc.setCapability("udid","<udid>");
        dc.setCapability("deviceName","iPhone 15 Plus");
        dc.setCapability("platformVersion","17.5");
        dc.setCapability("app",System.getProperty("user.dir")+"/apks/UiCatalog.zip");
        AppiumDriver driver = new AppiumDriver(new URI("http://127.0.0.1:4723/").toURL(), dc);
        driver.quit();
    }
}
