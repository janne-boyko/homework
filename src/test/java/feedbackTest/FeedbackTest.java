package feedbackTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class FeedbackTest extends AbstractParentTest {
    @Test
    public void feedbackMessageSuccess(){
        loginPage.fillingLoginFormAndSubmitIt("zhannaboyko1990@gmail.com","11111111");
        personalCabinetPage.clickOnButtonFeedback();
        feedbackPage.fillingFeedbackFormAndSubmitIt("тест");
        checkExpectedResult("Success message isn't displayed",
                feedbackPage.isFeedbackSuccessMessageDisplayed());
    }
}
