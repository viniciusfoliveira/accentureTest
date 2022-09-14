package steps;

import helpers.HelperDriver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.DataPage;
import pages.ProductPage;
import pages.VehiclePage;

public class VehicleStep {

    VehiclePage vehiclePage = new VehiclePage();
    DataPage dataPage = new DataPage();
    ProductPage productPage = new ProductPage();

    @Dado("que eu esteja na tela inicial")
    public void queEuEstejaNaTelaInicial() {
        HelperDriver.inicializar();
    }

    @Quando("preencher a aba de Vehicle Data")
    public void preencherAAbaDeVehicleData() {
        vehiclePage.selectMake("Audi");
        vehiclePage.selectModel("Scooter");
        vehiclePage.insertCylinder("1");
        vehiclePage.insertEngine("1");
        vehiclePage.insertDate("01/11/2015");
        vehiclePage.selectSeats("1");
        vehiclePage.selectFuel("Petrol");
        vehiclePage.insertPayload("1");
        vehiclePage.insertTotal("101");
        vehiclePage.insertPrice("50000");
        vehiclePage.insertAnnual("100");
        vehiclePage.clickNext();
    }

    @Quando("preencher a aba Insurent Data")
    public void preencherAAbaInsurentData() {
        dataPage.insertName("Vinicius");
        dataPage.insertLatName("Oliveira");
        dataPage.insertData("01/10/1996");
        dataPage.selectCountry("Andorra");
        dataPage.insertZipCode("08235035");
        dataPage.selectOccupation("Farmer");
        dataPage.clickHobbies();
        dataPage.clickNext();
    }
    @Quando("preencher a aba de Product Data")
    public void preencherAAbaDeProductData() {

        productPage.insertStartDate("12/09/2022");
        productPage.selectInsurence("3000000");
        productPage.selectMerit("Super Bonus");
        productPage.selectDamage("No Coverage");
        productPage.clickOptionalProducts();
        productPage.selectCar("No");
        productPage.clickNext();
    }

    @Entao("fechar a pagina")
    public void fecharAPagina() {
        HelperDriver.finalizar();
    }

}

