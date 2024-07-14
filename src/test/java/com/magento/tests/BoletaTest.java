package com.magento.tests;

import org.testng.annotations.Test;

public class BoletaTest extends BaseTest{

    @Test
    public void doEmitirBoletaSimpleConItemManual(){
        loginPage.fillOutForm();
        loginPage.submitData();
        homePage.goToNewBoleta();

        boletaNuevaPage.fillReceptorData();
        boletaNuevaPage.fillItemManualModal();
        boletaNuevaPage.emitirComprobante();

        try{
            Thread.sleep(3000);
        } catch (Exception e) {

        }
    }
}
