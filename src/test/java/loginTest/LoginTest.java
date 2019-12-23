package loginTest;

import abstractParentTest.AbstractParentTest;
import org.junit.Test;

public class LoginTest extends AbstractParentTest {
    @Test
    public void validLogin(){
        loginPage.openPage();
        loginPage.enterLoginInToInputLogin("zhannaboyko1990@gmail.com");
        loginPage.enterPassInToInputPassword("11111111");
        loginPage.clickOnButtonSubmit();

        checkExpectedResult(" Cabinet title isn't displayed"
                , personalCabinetPage.isCabinetTitleDisplayed());
    }

    @Test
    public void invalidLogin(){
        loginPage.openPage();
        loginPage.enterLoginInToInputLogin("zhannaboyko1990@gmail.com");
        loginPage.enterPassInToInputPassword("111111112");
        loginPage.clickOnButtonSubmit();

        checkExpectedResult("Cabinet title is displayed"
                , !personalCabinetPage.isCabinetTitleDisplayed());
    }
}
