package logoutTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class LogoutTest extends AbstractParentTest {
    @Test
    public void logOut(){
        loginPage.fillingLoginFormAndSubmitIt("zhannaboyko1990@gmail.com","11111111");
        personalCabinetPage.clickOnButtonLogout();
        checkExpectedResult("Sign up button is not present",
                homePage.isButtonSignUpDisplayed());

    }
}
