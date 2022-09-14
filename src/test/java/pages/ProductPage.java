package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webdriver.Driver;

public class ProductPage extends BasePage {

    @FindBy(id = "startdate")
    private WebElement startdate;


    @FindBy(id = "insurancesum")
    private WebElement insurancesum;

    @FindBy(id = "meritrating")
    private WebElement meritrating;

    @FindBy(id = "damageinsurance")
    private WebElement damageinsurance;

    @FindBy(xpath = "//*[@id='insurance-form']//div[5]/p/label[1]/span")
    private WebElement euroProtection;

    @FindBy(id = "courtesycar")
    private WebElement courtesycar;

    @FindBy(id = "nextselectpriceoption")
    private WebElement next;

    public ProductPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void insertStartDate(String text){
        super.preencherCampoTexto(text, startdate);
    }
    public void selectInsurence(String value){
        super.escolherItemComboBoxByValue(value, insurancesum);
    }

    public void selectMerit(String value){
        super.escolherItemComboBox(value, meritrating);
    }

    public void selectDamage(String value){

       super.escolherItemComboBox(value, damageinsurance);
    }

    public void clickOptionalProducts(){
        super.clickBotao(euroProtection);
    }

    public void selectCar(String value){
        super.escolherItemComboBoxByValue(value, courtesycar);
    }

    public void clickNext(){
        super.clickBotao(next);
    }
}
