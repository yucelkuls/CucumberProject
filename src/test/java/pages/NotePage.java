package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NotePage {

    public NotePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "note-title-input")
    public WebElement title;
    @FindBy(id = "note-details-input")
    public WebElement note;
    @FindBy(id = "add-note")
    public WebElement add;

}
