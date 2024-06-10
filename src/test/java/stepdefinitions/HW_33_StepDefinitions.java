package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.Driver;

import static org.junit.Assert.assertEquals;


public class HW_33_StepDefinitions {


    AutomationExerciseHomepage homepage = new AutomationExerciseHomepage();
    AutomationExerciseSignupPage signupPage = new AutomationExerciseSignupPage();
    AutomationExerciseLoginPage loginPage = new AutomationExerciseLoginPage();
    AutomationExerciseAccountCreatedPage createdPage = new AutomationExerciseAccountCreatedPage();
    AutomationExerciseAccountDeletedPage deletedPage = new AutomationExerciseAccountDeletedPage();
    Faker f = new Faker();


    @When("click on Signup Login")
    public void clickOnSignupLogin() {
        homepage.consentButton.click(); // Burasi bulundugum ulke ile ilgili.
        homepage.signupLoginButton.click();
    }
    @When("enter signup name, email address and click Signup button")
    public void enter_signup_name_email_address_and_click_signup_button() {
        loginPage.signupName.sendKeys(f.name().name());
        loginPage.email.sendKeys(f.internet().emailAddress());
        loginPage.signupButton.click();
    }
    @When("enter account information")
    public void enter_account_information() {
        signupPage.password.sendKeys(f.internet().password());
        signupPage.firstname.sendKeys(f.name().firstName());
        signupPage.lastname.sendKeys(f.name().lastName());
        signupPage.address1.sendKeys(f.address().streetAddress());
        Select select = new Select(signupPage.country);
        select.selectByValue("Canada");
        signupPage.state.sendKeys(f.address().state());
        signupPage.city.sendKeys(f.address().city());
        signupPage.zipcode.sendKeys(f.address().zipCode());
        signupPage.mobileNumber.sendKeys(f.phoneNumber().cellPhone());

    }
    @When("click Create Account button")
    public void click_create_account_button() {
        clickElementByJS(signupPage.createButton);
        }
    @Then("assert Account Created!")
    public void assert_account_created() {
        assertEquals("ACCOUNT CREATED!", createdPage.createdText.getText() );
    }
    @When("click Continue button")
    public void click_continue_button() {
        createdPage.continueButton.click();
    }
    @When("click Delete Account")
    public void click_delete_account() {
        homepage.deleteAccount.click();
    }
    @When("assert Account Deleted!")
    public void assert_account_deleted() {
        assertEquals("ACCOUNT DELETED!", deletedPage.deletedText.getText());
    }
    @Then("click Continue Button to Homepage")
    public void click_continue_button_to_homepage() {
        deletedPage.continueButtonToHomepage.click();
    }


    // Belirtilen WebElement'i JavaScript kullanarak tıklar.
    public static void clickElementByJS(WebElement element) {
        JavascriptExecutor jsexecutor = ((JavascriptExecutor) Driver.getDriver());
        jsexecutor.executeScript("arguments[0].click();", element);
    }
}
