package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InputFormPage {

    public InputFormPage(){//BU PUBLİC BİR CONSTRACTIR. BU CLASS'IN OBJESİYLE AŞAĞIDAKİ WEB ELEMENTLER BASLATILiCAK.
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name= "firstname")
    public WebElement firstname;

    @FindBy(xpath = "//input[@id='surname']")
    public WebElement lastname;

    @FindBy(name = "age")
    public WebElement age;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(name= "notes")
    public WebElement notes;

    @FindBy(xpath= "//input[@type='submit']")
    public WebElement gonder;

    @FindBy(xpath= "//form[@action='/validate/input-validation']")
    public WebElement hata;

}
