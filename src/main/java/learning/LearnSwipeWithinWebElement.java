package learning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.Collections;

public class LearnSwipeWithinWebElement {
    @Test
    public void runCode() throws MalformedURLException, URISyntaxException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("automationName", "UiAutomator2");
        dc.setCapability("noReset", true);
        dc.setCapability("appPackage", "com.android.vending");
        dc.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
        AppiumDriver driver = new AppiumDriver(new URI("http://127.0.0.1:4723/").toURL(), dc);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        int maxX = driver.manage().window().getSize().getWidth();
        int maxY = driver.manage().window().getSize().getHeight();
        int startX = 0, startY = 0, endX = 0, endY = 0;
        //Swipe towards up
        startX = (int) (maxX * 0.5);
        startY = (int) (maxY * 0.8);
        endX = (int) (maxX * 0.5);
        endY = (int) (maxY * 0.2);
        PointerInput input1 = new PointerInput(PointerInput.Kind.TOUCH, "index finger");
        Sequence swipeUp = new Sequence(input1, 1);
        swipeUp.addAction(input1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipeUp.addAction(input1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipeUp.addAction(input1.createPointerMove(Duration.ofMillis(2000), PointerInput.Origin.viewport(), endX, endY));
        swipeUp.addAction(input1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(swipeUp));
        WebElement e = driver.findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"More results for Editors' Choice apps\"]/../following-sibling::android.view.View)[1]"));
        int eleStartX = e.getLocation().getX();
        int eleStartY = e.getLocation().getY();
        int eleWidth = e.getSize().getWidth();
        int eleHeight = e.getSize().getHeight();

        startX = (int) (eleStartX + (eleWidth * 0.9));
        startY = (int) (eleStartY + (eleHeight * 0.5));
        endX = (int) (eleStartX + (eleWidth * 0.1));
        endY = (int) (eleStartY + (eleHeight * 0.5));
        PointerInput input2 = new PointerInput(PointerInput.Kind.TOUCH, "index finger");
        Sequence swipeUpInElement = new Sequence(input2, 1);
        swipeUpInElement.addAction(input2.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipeUpInElement.addAction(input2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipeUpInElement.addAction(input2.createPointerMove(Duration.ofMillis(2000), PointerInput.Origin.viewport(), endX, endY));
        swipeUpInElement.addAction(input2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Collections.singletonList(swipeUpInElement));


        driver.quit();
    }
}