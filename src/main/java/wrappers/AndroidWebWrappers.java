package wrappers;

public class AndroidWebWrappers extends AndroidNativeWrappers {

    public boolean launchChromeBrowser(String URL) {
        return launchBrowser("Android", "Chrome", "", URL, "", "", "", "", "");
    }

    public boolean launchChromeBrowserInParallel(String URL, String udid, String chromeDriverPort,
                                                 String mjpegServerPort) {
        return launchBrowser("Android", "Chrome", "", URL, udid, chromeDriverPort, "", mjpegServerPort, "");
    }

    public boolean deleteChromeCookies() {
        getDriver().manage().deleteAllCookies();
        return true;
    }

}