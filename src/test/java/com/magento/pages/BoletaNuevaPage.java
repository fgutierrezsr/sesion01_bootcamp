package com.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BoletaNuevaPage extends BasePage {
    By preloader = By.id("preloader");
    By numeroDocumentoReceptor = By.id("dniRuc");
    By tipoDocumentoReceptor = By.id("tipoDocumentoCliente");
    By nombreReceptor = By.id("RazonSocial");
    By buscarEntidadReceptorButton = By.xpath("/html/body/app-root/app-admin/div/div[2]/div/div/div/div/div/div/div/smrt-cntdocumentos/app-documento-factura-boleta/app-card/div/div/div/div[3]/div/div[1]/app-cabecera-documento-common/div[1]/div[1]/app-card/div/div[2]/div/form/div/div[2]/div[1]/button");
    By servicioManualButton = By.id("04010103010_btnAgregarItemmanual");
    By descripcionItemManualModal = By.id("descripcion");
    By aceptarButtonItemManualModal = By.xpath("/html/body/ngb-modal-window/div/div/app-agregar-item-manual/div[3]/div/div[1]/button");
    By emitirButton = By.id("0401010302_frBusquedaItem_btnEmitir");

    public BoletaNuevaPage(WebDriver driver) {
        super(driver);
    }

    public void fillReceptorData() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutSec));

        wait.until( d -> {
            try {
                WebElement element = d.findElement(preloader);
                return "none".equals(element.getCssValue("display"));
            } catch (Exception ex) {
                return true;
            }
        });

        wait.until( d -> {
            try {
                WebElement selectElement = d.findElement(tipoDocumentoReceptor);
                Select select = new Select(selectElement);
                List<WebElement> options = select.getOptions();
                for(WebElement option : options) {
                    if (option.getText().equalsIgnoreCase("DNI")) {
                        type(numeroDocumentoReceptor, "72190186");
                        return true;
                    }
                }

                return false;
            } catch (Exception ex) {
                return true;
        }
});

        //type(numeroDocumentoReceptor, "72190186");
        //click(buscarEntidadReceptorButton);
//        wait.until( x -> {
//            driver.findElement(nombreReceptor).
//            driver.findElement(nombreReceptor).isDisplayed();
//        });
    }

    public void fillItemManualModal() {
        click(servicioManualButton);
        type(descripcionItemManualModal, "Test item manual");
        click(aceptarButtonItemManualModal);
    }
    public void emitirComprobante() {
        click(emitirButton);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }
}
