package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnWebAppsInAndroid extends GenericWrappers {
    @Test
    public void runCode() {
        launchChromeBrowser("https://www.google.com");
        enterValue(getWebElement(Locators.NAME.asString(), "q"), "Lokesh");
        pressEnter();
        click(getWebElement(Locators.XPATH.asString(), "(//div[text()='Lokesh Kanagaraj'])[1]"));
    }
}