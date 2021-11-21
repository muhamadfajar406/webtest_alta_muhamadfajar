package starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpages extends PageObject {

    @FindBy(xpath ="//*[@id=\"app\"]/div/div/div[2]/div/div[6]")
    WebElement iconBooksStore;
    public void clickIconBooksStore() {
//        waitForCondition().until(ExpectedCondition.elementToBeClickable(iconBooksStore));
        iconBooksStore.click();
    }

    @FindBy(id = "login")
    WebElement buttonLogin;
    public void clickButtonLogin() {
        buttonLogin.click();
    }

    @FindBy(id = "userName")
    WebElement inputUserName;

    @FindBy(id = "password")
    WebElement inputPass;

    @FindBy(id ="login")
    WebElement ButtonLogin2;

    public void inputUserNamePassValid() {
        inputUserName.sendKeys("muhamadfajar4067");
        inputPass.sendKeys("F@jar406");
    }

    public void inputUserNameBlank() {
        inputUserName.sendKeys("");
        inputPass.sendKeys("F@jar406");
    }

    public void inputPassNameBlank() {
        inputUserName.sendKeys("muhamadfajar4067");
        inputPass.sendKeys("");
    }

    public void clickLogin2() {
        ButtonLogin2.click();
    }
}












