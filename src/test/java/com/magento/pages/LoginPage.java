package com.magento.pages;

import com.magento.utils.Variable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    // Identificar los WebElementes
    By usuario = By.id("0000000002_frmLogin_inUsuario");
    By password = By.id("0000000003_frmLogin_inPassword");
    By ingresarButton = By.id("0000000004_frmLogin_btnIngresar");

    // Constructor
    public LoginPage(WebDriver driver) {// el drver sera pasado desde el Base test , en el metodo setUp
        super(driver);
        visit(Variable.BASE_URL);
    }

    //Metodos o funciones
    public void fillOutForm() {
        type(usuario,"demo-pvlg");
        type(password, "demo123");
    }

    public void submitData() {
        click(ingresarButton);
    }

}
