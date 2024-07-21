package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnAndroidWrappers extends GenericWrappers {
    @Test
    public void runCode() {
        launchAndroidApp("", "", "UiAutomator2",
                "/apks/leaforg.apk");
        startAnAppUsingActivity("com.amazon.mShop.android.shopping", "com.amazon.mShop.home.HomeActivity");
        sleep(10000);
        activateOrRelaunchApp("com.testleaf.leaforg");
        dataOffInAndroid();
        sleep(5000);
        dataOnInAndroid();
        showNotificationMenu();
        hideNotificationMenu();
        System.out.println(getCurrentActivity());
        System.out.println(getCurrentAppPackage());

    }
}