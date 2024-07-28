package learning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.MutableCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class IosFirsrtCodeInSaucelabs {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        MutableCapabilities caps = new MutableCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("appium:app", "storage:filename=UICatalog.zip");  // The filename of the mobile app
        caps.setCapability("appium:deviceName", "iPhone Simulator");
        caps.setCapability("appium:platformVersion", "current_major");
        caps.setCapability("appium:automationName", "XCUITest");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        sauceOptions.setCapability("username", "oauth-appiumjuly-91d1f");
        sauceOptions.setCapability("accessKey", "5c07a1ea-c599-4c68-b737-e15171d7bed3");
        sauceOptions.setCapability("build", "Appium July Build");
        sauceOptions.setCapability("name", "Test Sample 2");
        sauceOptions.setCapability("deviceOrientation", "PORTRAIT");
        caps.setCapability("sauce:options", sauceOptions);

// Start the session
        URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        IOSDriver driver = new IOSDriver(url, caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(AppiumBy.accessibilityId("Action Sheets")).click();
        driver.findElement(AppiumBy.accessibilityId("Okay / Cancel")).click();
        driver.findElement(AppiumBy.accessibilityId("OK")).click();
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name='UICatalog']")).click();


// replace with commands and assertions
        Thread.sleep(5000);
        String jobStatus = "passed"; // or "failed"
// end the session
        driver.executeScript("sauce:job-result=" + jobStatus);
        driver.quit();
    }
}
