package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExerciseAccountCreatedPage {

    public AutomationExerciseAccountCreatedPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//b[.='Account Created!']")
    public WebElement createdText;


    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;






}
