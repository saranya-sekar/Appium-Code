package pages;

import io.appium.java_client.AppiumDriver;
import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
    public HomePage(AppiumDriver driver) {
        this.driver = driver;
        verifyFirstNameTextIsDisplayed();
    }

    public HomePage verifyFirstNameTextIsDisplayed() {
        eleIsDisplayed(getWebElement(Locators.XPATH.asString(), "//*[@text='Rajkumar Ganesan']"));
        return this;
    }

    public HomePage verifyProfileImageIsDisplayed() {
        return this;
    }

    public HomePage verifyParticipantNameTextIsDisplayed() {
        return this;
    }

    public HomePage verifyDrivingLicenseGridIsDisplayed() {
        return this;
    }

    public HomePage verifyParticipantIdGridIsDisplayed() {
        return this;
    }
//    public void clickMyInfoButton() {
//
//    }
//    public void clickScanButton() {
//
//    }
//    public void clickSettingsButton() {
//
//    }
}
