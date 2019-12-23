package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class LoginPage extends ParentPage {
    @FindBy(xpath= ".//input[@name='email']")
    private WebElement inputLogin;

    @FindBy(xpath = ".//input[@type='password']")
    private WebElement inputPass;

    @FindBy(xpath = ".//button[@type='submit']")
    private WebElement buttonSubmit;

    public LoginPage(WebDriver webDriver) {
        super(webDriver, "/sign-in");
    }


    public void openPage() {
        try {
            webDriver.get("http://front.cf-nam.com.dev11.vintagedev.com.ua/sign-in");
        } catch (Exception e){
            Assert.fail("Cannot work with browser");
        }
    }

    public void enterLoginInToInputLogin(String login) {
        actionsWithOurElements.enterTextInToInput(inputLogin,login);
    }

    public void enterPassInToInputPassword(String password) {
        actionsWithOurElements.enterTextInToInput(inputPass,password);
    }

    public void clickOnButtonSubmit() {
        actionsWithOurElements.clickOnElement(buttonSubmit);
    }

    public void fillingLoginFormAndSubmitIt(String login, String pass) {
        openPage();
        enterLoginInToInputLogin(login);
        enterPassInToInputPassword(pass);
        clickOnButtonSubmit();
    }
}


