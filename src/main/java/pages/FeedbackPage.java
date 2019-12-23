package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class FeedbackPage extends ParentPage {

    @FindBy(xpath = ".//textarea[@type='textarea']")
    private WebElement inputFeedback;

    @FindBy(xpath = ".//button[@type='submit']")
    private WebElement buttonSubmitFeedback;

    @FindBy(xpath = ".//*[contains(text(),'Thank you! Your feedback was successfully sent!')]")
    private WebElement successMessage;


    public FeedbackPage(WebDriver webDriver) {
        super(webDriver, "/profile/feedback");
    }

    public void enterFeedbackMessage(String FeedbackMessage) {
        actionsWithOurElements.enterTextInToInput(inputFeedback, FeedbackMessage);
    }

    public void clickOnButtonSubmitFeedback() {
        actionsWithOurElements.clickOnElement(buttonSubmitFeedback);
    }

    public void fillingFeedbackFormAndSubmitIt(String FeedbackMessage) {
        enterFeedbackMessage(FeedbackMessage);
        clickOnButtonSubmitFeedback();
    }

    public boolean isFeedbackSuccessMessageDisplayed(){
        return actionsWithOurElements.isElementDisplayed(successMessage);
    }
}

