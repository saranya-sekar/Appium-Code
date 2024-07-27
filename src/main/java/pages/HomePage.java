package pages;

import io.cucumber.java.en.Then;
import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {

    @Then("Verify Home page is displayed")
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
