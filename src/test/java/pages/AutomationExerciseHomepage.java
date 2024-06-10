package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class AutomationExerciseHomepage {

    public AutomationExerciseHomepage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//p[@class='fc-button-label'])[1]")
    public WebElement consentButton;

    @FindBy(xpath ="//a[@href='/login']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//a[@href='/delete_account']")
    public WebElement deleteAccount;






}
