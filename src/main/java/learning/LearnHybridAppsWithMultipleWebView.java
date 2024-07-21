package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnHybridAppsWithMultipleWebView extends GenericWrappers {

    @Test
    public void runCode() {
        launchAndroidApp("", "", "UiAutomator2",
                "/apks/TheApp-v1.10.0.apk");
        click(getWebElement(Locators.XPATH.asString(), "//android.widget.TextView[@text=\"Dual Webview Demo\"]"));
        printContext();
        switchContext("WEBVIEW_io.cloudgrey.the_app");
        sleep(3000);
        switchToLastWindow();
        String text = getText(getWebElement(Locators.TAG_NAME.asString(), "h2"));
        System.out.println(text);
        switchToFirstWindow();
        text = getText(getWebElement(Locators.TAG_NAME.asString(), "h2"));
        System.out.println(text);
        closeApp();

    }
}