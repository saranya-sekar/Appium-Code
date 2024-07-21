package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnFirstCodeUsingWrappers extends GenericWrappers {
    @Test
    public void runCode() {
        launchApp("Android", "", "", "", "",
                "UiAutomator2", "", "", "",
                "", "", "/apks/leaforg.apk", "",
                "");
        verifyAndInstallApp("com.testleaf.leaforg", "/apks/leaforg.apk");
        activateOrRelaunchApp("com.testleaf.leaforg");
        enterValue(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.EditText"), "rajkumar@testleaf.com");
        enterValue(getWebElement(Locators.XPATH.asString(), "(//android.widget.EditText)[2]"), "Leaf@123");
        click(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.Button"));
        setLandscapeOrientation();
        sleep(3000);
        System.out.println(getOrientation());
        setPortraitOrientation();
        sleep(3000);
        System.out.println(getOrientation());
        closeApp();
    }
}