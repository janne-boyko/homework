package changePhoneNumberTest;

import abstractParentTest.AbstractParentTest;
import org.junit.After;
import org.junit.Test;

public class ChangePhoneNumberTest extends AbstractParentTest {
    @Test
    public void changePhoneNumber() {
        loginPage.fillingLoginFormAndSubmitIt("zhannaboyko1990@gmail.com", "11111111");
        personalCabinetPage.enterPhoneNumber("0639999999");
        personalCabinetPage.clickOnSavePhoneButton();
        checkExpectedResult("Phone number isn't changed",
                personalCabinetPage.isPhoneNumberDisplayed("0639999999"));

    }
//    @After
//    public void deletePhone (){
//        personalCabinetPage.deletePhone("0639999999");
//    }
}