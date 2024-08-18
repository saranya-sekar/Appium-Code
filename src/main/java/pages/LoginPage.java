package pages;

import io.appium.java_client.AppiumDriver;
import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers {

    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
        verifyUserNameTextBoxIsDisplayed();
    }

    public LoginPage enterUserName(String userName) {
        enterValue(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.EditText"), userName);
        return this;
    }

    public LoginPage verifyUserNameTextBoxIsDisplayed() {
        eleIsDisplayed(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.EditText"));
        return this;
    }

    public LoginPage enterPassword(String password) {
        enterValue(getWebElement(Locators.XPATH.asString(), "(//android.widget.EditText)[2]"), password);
        return this;
    }

    public HomePage clickLogin() {
        click(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.Button"));
        return new HomePage(driver);
    }

    public LoginPage clickLoginForFailure() {
        click(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.Button"));
        return this;
    }

    public PersonalInfoPage clickCreatePasswordLink() {

        return new PersonalInfoPage();
    }

    public ResetPasswordPage clickForgotPasswordLink() {

        return new ResetPasswordPage();
    }

}
