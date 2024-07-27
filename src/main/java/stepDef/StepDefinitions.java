package stepDef;

import io.cucumber.java.en.Given;
import wrappers.GenericWrappers;

public class StepDefinitions extends GenericWrappers {
    @Given("I enter the username as {string}")
    public void iEnterTheUsernameAs(String userName) {
        enterValue(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.EditText"), userName);
    }

    @Given("I enter the password as {string}")
    public void iEnterThePasswordAs(String password) {
        enterValue(getWebElement(Locators.XPATH.asString(), "(//android.widget.EditText)[2]"), password);
    }

    @Given("I click the login button")
    public void iClickTheLoginButton() {
        click(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.Button"));
    }

    @Given("Verify Home page is displayed")
    public void verifyHomePageIsDisplayed() {
        eleIsDisplayed(getWebElement(Locators.XPATH.asString(), "//*[@text='Rajkumar Ganesan']"));
    }

    @Given("Verify Login page is displayed")
    public void verifyLoginPageIsDisplayed() {
        eleIsDisplayed(getWebElement(Locators.CLASS_NAME.asString(), "android.widget.EditText"));
    }

}
