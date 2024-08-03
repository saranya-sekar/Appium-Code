package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnWebAppsInIos extends GenericWrappers {
    @Test
    public void runScript() {
        launchSafariBrowser("iPhone 15 Plus", "https://www.google.com", "");
        enterValue(getWebElement(Locators.NAME.asString(), "q"), "Lokesh");
        click(getWebElement(Locators.NAME.asString(), "q"));
//        switchNativeView();
//        click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Search"));
//        switchWebView();
        clickGivenKeyboardButtonInIosByAccessibilityId("Search");
        closeApp();
    }


}
