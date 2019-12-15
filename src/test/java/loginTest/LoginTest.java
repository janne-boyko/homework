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

        checkExpectedResult("Icon is not present"
                , personalCabinetPage.isIconDisplayed());
    }
}
