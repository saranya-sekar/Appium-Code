package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnSwitchBetweenApps extends GenericWrappers {
    @Test
    public void runCode() {
        launchApp("Android", "", "", "", "",
                "UiAutomator2", "", "", "",
                "", "", "/apks/leaforg.apk", "",
                "");
        enterValue(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.EditText"), "rajkumar@testleaf.com");
        enterValue(getWebElement(Locators.XPATH.asString(), "(//android.widget.EditText)[2]"), "Leaf@123");
        click(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.Button"));
        activateOrRelaunchApp("com.android.vending");
        sleep(5000);
        swipe("up");
        activateOrRelaunchApp("com.testleaf.leaforg");
        activateOrRelaunchApp("com.amazon.mShop.android.shopping");
        sleep(5000);
        terminateOrStopRunningApp("com.android.vending");
        terminateOrStopRunningApp("com.amazon.mShop.android.shopping");

    }
}