package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnHybridAppsInIos extends GenericWrappers {
    @Test
    public void runScript() {
        launchIosApp("iPhone 15 Plus", "", "", "com.example.apple-samplecode.UICatalog",
                "/apks/UiCatalog.zip");
        swipe("up");
        click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Web View"));
        printContext();
        System.out.println("-----------");
        sleep(3000);
        printContext();
        sleep(5000);
        switchWebView();
        click(getWebElement(Locators.ID.asString(), "globalnav-menutrigger-button"));
        sleep(5000);
        click(getWebElement(Locators.ID.asString(), "globalnav-menutrigger-button"));
        closeApp();
    }


}
