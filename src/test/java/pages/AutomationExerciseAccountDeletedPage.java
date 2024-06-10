package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExerciseAccountDeletedPage {

    public AutomationExerciseAccountDeletedPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//b[.='Account Deleted!']")
    public WebElement deletedText;


    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButtonToHomepage;






}
