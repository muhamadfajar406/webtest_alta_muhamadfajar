package starter.Steps;

import starter.Pages.Loginpages;

public class LoginSteps {

    Loginpages loginPages;
    public void openHomePage() {
        loginPages.open();
    }

    public void openLoginPage() {
//      loginPages.clickIconBooksStore();
        loginPages.clickButtonLogin();
    }

    public void inputAccountValid() {
        loginPages.inputUserNamePassValid();
    }

    public void clickLogin2() {
        loginPages.clickLogin2();
    }





}
