package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import parentPage.ParentPage;

public class PersonalCabinetPage extends ParentPage {
    @FindBy(xpath = ".//h3[@class='cabinet-title']")
    private WebElement title;


    public PersonalCabinetPage (WebDriver webDriver) {
        super(webDriver, "/profile/info");
    }
    public boolean isCabinetTitleDisplayed(){
        return actionsWithOurElements.isElementDisplayed(title);
    }

    public void checkIsCabinetTitlePresent() {
        Assert.assertTrue("Icon is not displayed", isCabinetTitleDisplayed());
    }
}
