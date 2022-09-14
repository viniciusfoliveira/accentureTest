package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import webdriver.Driver;

public class VehiclePage extends BasePage {

    @FindBy(id = "make")
    private WebElement make;

    @FindBy(id = "model")
    private WebElement model;

    @FindBy(id = "cylindercapacity")
    private WebElement cylindercapacity;

    @FindBy(id = "engineperformance")
    private WebElement engineperformance;

    @FindBy(id = "dateofmanufacture")
    private WebElement dateofmanufacture;

    @FindBy(id = "numberofseats")
    private WebElement numberofseats;

    @FindBy(id = "numberofseatsmotorcycle")
    private WebElement numberofseatsmotorcycle;

    @FindBy(id = "fuel")
    private WebElement fuel;

    @FindBy(id = "payload")
    private WebElement payload;

    @FindBy(id = "totalweight")
    private WebElement totalweight;

    @FindBy(id = "listprice")
    private WebElement listprice;

    @FindBy(id = "annualmileage")
    private WebElement annualmileage;

    @FindBy(id = "nextenterinsurantdata")
    public WebElement next;

    public VehiclePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void selectMake(String value) {
        super.escolherItemComboBox(value, make);
    }

    public void selectModel(String value) {
        super.escolherItemComboBox(value, model);
    }

    public void insertCylinder(String text) {
        super.preencherCampoTexto(text, cylindercapacity);
    }

    public void insertEngine(String text) {
        super.preencherCampoTexto(text, engineperformance);
    }

    public void insertDate(String date) {
        super.preencherCampoTexto(date, dateofmanufacture);
    }

    public void selectSeats(String value) {
        super.preencherCampoTexto(value, numberofseats);
    }

    public void selectSeatsMotocycle(String value) {
        super.escolherItemComboBox(value, numberofseatsmotorcycle);
    }

    public void selectFuel(String value) {
        super.escolherItemComboBox(value, fuel);
    }

    public void insertPayload(String text){
        super.preencherCampoTexto(text, payload);
    }
    public void insertTotal(String text){
        super.preencherCampoTexto(text,totalweight);
    }

    public void insertPrice(String text){

         super.preencherCampoTexto(text, listprice);
    }

    public void insertAnnual(String text){
        super.preencherCampoTexto(text, annualmileage);
    }

    public void clickNext(){
        super.clickBotao(next);
    }

}