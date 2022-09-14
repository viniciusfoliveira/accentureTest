package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import webdriver.Driver;

public class DataPage extends BasePage {

    @FindBy(id = "firstname")
    private WebElement firstname;

    @FindBy(id = "lastname")
    private WebElement lastname;

    @FindBy(id = "birthdate")
    private WebElement birthdate;

    @FindBy(id = "country")
    private WebElement country;

    @FindBy(id = "zipcode")
    private WebElement zipcode;

    @FindBy(id = "occupation")
    private WebElement occupation;

    @FindBy(className = "ideal-check")
    private WebElement speeding;

    @FindBy(id = "nextenterproductdata")
    private WebElement next;

    public DataPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void insertName(String text) {
        super.preencherCampoTexto(text, firstname);
    }

    public void insertLatName(String text) {
        super.preencherCampoTexto(text, lastname);

    }

    public void insertData(String text) {
        super.preencherCampoTexto(text, birthdate);
    }

    public void selectCountry(String value) {
        super.escolherItemComboBox(value, country);
    }

    public void insertZipCode(String text) {
        super.preencherCampoTexto(text, zipcode);
    }

    public void selectOccupation(String value) {
        super.escolherItemComboBox(value, occupation);
    }

    public void clickHobbies() {
        super.clickBotao(speeding);
    }

    public void clickNext(){
        super.clickBotao(next);
    }
}