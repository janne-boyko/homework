package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class HomePage extends ParentPage {
    @FindBy(xpath = ".//div[@class='header__right-side']//a[@href='/sign-up']")
    private WebElement buttonSignUp;


    public HomePage (WebDriver webDriver) {super(webDriver, "/"); }

    public boolean isButtonSignUpDisplayed(){
        return actionsWithOurElements.isElementDisplayed(buttonSignUp);
    }
}
