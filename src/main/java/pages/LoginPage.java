package pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers {

    @When("I enter the username as {string}")
    public LoginPage enterUserName(String userName) {
        enterValue(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.EditText"), userName);
        return this;
    }

    @Then("Verify Login page is displayed")
    public LoginPage verifyUserNameTextBoxIsDisplayed() {
        eleIsDisplayed(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.EditText"));
        return this;
    }

    @When("I enter the password as {string}")
    public LoginPage enterPassword(String password) {
        enterValue(getWebElement(Locators.XPATH.asString(), "(//android.widget.EditText)[2]"), password);
        return this;
    }

    public HomePage clickLogin() {
        click(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.Button"));
        return new HomePage();
    }

    @When("I click the login button")
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
