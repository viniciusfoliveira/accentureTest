package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.Driver;

public class BasePage {

    public void escolherItemComboBox(String valor, WebElement comboBox) {
        Select select = new Select(comboBox);
        select.selectByVisibleText(valor);
    }
    public void escolherItemComboBoxByValue(String valor, WebElement comboBox) {
        Select select = new Select(comboBox);
        select.selectByValue(valor);
    }

    public void clickBotao(WebElement botao) {
        botao.click();
    }

    public void preencherCampoTexto(String texto, WebElement elemento) {
        elemento.sendKeys(texto);
    }
}