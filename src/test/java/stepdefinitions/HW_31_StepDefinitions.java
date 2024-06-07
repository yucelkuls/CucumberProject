package stepdefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.InputFormPage;

public class HW_31_StepDefinitions {
    /*
Go to https://testpages.eviltester.com/styled/validation/input-validation.html
Fill form and submit
Do this with 3 scenarios
Use background and scenario outline
 */
    InputFormPage inputFormPage = new InputFormPage();

    @When("user enters form firstname {string}")
    public void user_enters_form_firstname(String firstname) {
            inputFormPage.firstname.sendKeys(firstname);
    }
    @When("user enters form lastname {string}")
    public void user_enters_form_lastname(String lastname) {
            inputFormPage.lastname.sendKeys(lastname);
    }
    @When("user enters form age {string}")
    public void user_enters_form_age(String age) {
            inputFormPage.age.sendKeys(age);
    }
    @When("user selects form country {string}")
    public void user_selects_form_country(String country) {
        Select select = new Select(inputFormPage.country);
        select.selectByVisibleText(country);
    }
    @When("user enters form notes {string}")
    public void user_enters_form_notes(String notes) {
            inputFormPage.notes.sendKeys(notes);
    }
    @When("user clicks on form gonder")
    public void user_clicks_on_form_gonder() {
            inputFormPage.gonder.click();
    }
}
