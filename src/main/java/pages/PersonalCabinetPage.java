package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PersonalCabinetPage extends ParentPage {
    @FindBy(id = "icon-profile")
    private WebElement icon;


    public PersonalCabinetPage (WebDriver webDriver) {
        super(webDriver, "/profile/info");
    }
    public boolean isIconDisplayed(){
        return actionsWithOurElements.isElementDisplayed(icon);
    }

    public void checkIsAvatarPresent() {
        Assert.assertTrue("Icon is not displayed", isIconDisplayed());
    }
}
