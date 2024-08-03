package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnPickerWheelInIos extends GenericWrappers {
    @Test
    public void runScript() {
        launchIosApp("iPhone 15 Plus", "", "", "com.example.apple-samplecode.UICatalog",
                "/apks/UiCatalog.zip");
        click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Picker View"));
        swipeWithinWebElement("up", getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Red color component value"));
        enterValue(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Red color component value"), "10", false);
        chooseNextOptionInPickerWheel(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Red color component value"));
        choosePreviousOptionInPickerWheel(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Red color component value"));
        sleep(5000);
        closeApp();
    }


}
