package wrappers;

import io.appium.java_client.remote.SupportsContextSwitching;

public class IosWebWrappers extends IosNativeWrappers {

    public boolean launchSafariBrowser(String deviceName, String URL, String udid) {
        return launchBrowser("iOS", "Safari", deviceName, URL, udid, "", "", "", "");
    }

    public boolean launchSafariBrowserInParallel(String deviceName, String URL, String udid, String wdaLocalPort,
                                                 String webkitDebugProxyPort) {
        return launchBrowser("iOS", "Safari", deviceName, URL, udid, "", wdaLocalPort, "", webkitDebugProxyPort);
    }

    public boolean deleteSafariCookies() {
        terminateOrStopRunningApp("com.apple.Preferences");
        activateOrRelaunchApp("com.apple.Preferences");
        switchNativeView();
        swipe("down");
        enterValue(getWebElement(Locators.XPATH.asString(), "//*[@label='Search']"), "Safari");
        try {
            click(getWebElement(Locators.XPATH.asString(), "//XCUIElementTypeCell[2]//*[@name='Safari']"));
        } catch (Exception e) {
            click(getWebElement(Locators.XPATH.asString(), "//*[@label='Safari']"));
        }
        sleep(1000);
        swipeUpInAppUntilElementIsVisible(Locators.XPATH.asString(),
                "//*[@value='Clear History and Website Data' and @visible='true']");
        click(getWebElement(Locators.XPATH.asString(),
                "//*[@value='Clear History and Website Data' and @visible='true']"));
        click(getWebElement(Locators.XPATH.asString(), "//*[@label='Clear' or @label='Clear History and Data']"));
        terminateOrStopRunningApp("com.apple.Preferences");
        activateOrRelaunchApp("com.apple.mobilesafari");
        switchWebView();
        return true;
    }

    public void clickGivenKeyboardButtonInIosByName(String name) {
        boolean isNative = ((SupportsContextSwitching) getDriver()).getContext().equalsIgnoreCase("NATIVE_APP");
        String context = ((SupportsContextSwitching) getDriver()).getContext();
        if (!isNative) {
            switchNativeView();
        }
        if (isKeyboardShown()) {
            click(getWebElement(Locators.NAME.asString(), name));
        }
        if (!isNative) {
            switchContext(context);
        }
    }

    public void clickGivenKeyboardButtonInIosByAccessibilityId(String accessId) {
        boolean isNative = ((SupportsContextSwitching) getDriver()).getContext().equalsIgnoreCase("NATIVE_APP");
        String context = ((SupportsContextSwitching) getDriver()).getContext();
        if (!isNative) {
            switchNativeView();
        }
        if (isKeyboardShown()) {
            click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), accessId));
        }
        if (!isNative) {
            switchContext(context);
        }
    }

    public void clickGivenKeyboardButtonInIosByXpath(String xPath) {
        boolean isNative = ((SupportsContextSwitching) getDriver()).getContext().equalsIgnoreCase("NATIVE_APP");
        String context = ((SupportsContextSwitching) getDriver()).getContext();
        if (!isNative) {
            switchNativeView();
        }
        if (isKeyboardShown()) {
            click(getWebElement(Locators.XPATH.asString(), xPath));
        }
        if (!isNative) {
            switchContext(context);
        }
    }
}