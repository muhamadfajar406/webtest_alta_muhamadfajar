package starter.Testlogin;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class Loginnameblank {

    @Steps
    LoginSteps loginSteps;

    @When("I enter blank username and Password correctly")
    public void i_enter_my_username_Blank() {
        loginSteps.inputUserBlank();
    }

    @When("I click {string} button in page")
    public void i_click_button_page(String string) {
        //loginSteps.clickLogin2();
    }

    @Then("I am stay in the page Login")
    public void I_am_stay_in_the_page_Login() {
    }


}
