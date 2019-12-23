package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PersonalCabinetPage extends ParentPage {
    @FindBy(xpath = ".//h3[@class='cabinet-title']")
    private WebElement title;

    @FindBy(xpath= ".//nav[@class='cabinet-menu']//a[@href='/profile/sign-out']")
    private WebElement buttonLogout;

    @FindBy(xpath= ".//nav[@class='cabinet-menu']//a[@href='/profile/feedback']")
    private WebElement buttonFeedback;

    @FindBy(xpath= ".//input[@name='phone']")
    private WebElement phoneInput;

    @FindBy(xpath= ".//*[@title='Контакні дані']//button[@type='submit']")
    private WebElement buttonSave;


    public PersonalCabinetPage (WebDriver webDriver) {
        super(webDriver, "/profile/info");
    }

    public boolean isCabinetTitleDisplayed(){
        return actionsWithOurElements.isElementDisplayed(title);
    }

    public void clickOnButtonLogout() {
        actionsWithOurElements.clickOnElement(buttonLogout);
    }

    public void clickOnButtonFeedback() {
        actionsWithOurElements.clickOnElement(buttonFeedback);
    }

    public void enterPhoneNumber(String phone){
        actionsWithOurElements.enterTextInToInput(phoneInput, phone);
    }

    public void clickOnSavePhoneButton(){
        actionsWithOurElements.clickOnElement(buttonSave);
    }

    public boolean isPhoneNumberDisplayed(String phone){
        return actionsWithOurElements.isElementDisplayed(".//input[@name='phone' and @value='" + phone + "']");
    }
}
