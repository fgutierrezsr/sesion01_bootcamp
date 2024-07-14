package com.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    WebDriver driver;

    // Identificar los WebElementes
     By fname= By.id("firstname");
     By lname=By.id("lastname");
     By email=By.id("email_address");
     By pass=By.id("password");
     By confPass=By.id("password-confirmation");
     By buttonRegister = By.xpath("//*[@id='form-validate']/div/div[1]/button/span");


    // Constructor
    public RegisterPage(WebDriver driver){
        super(driver);// el drver sera pasado desde el Base test , en el metodo setUp
        this.driver=driver;
    }

    //Metodos o funciones

    public void fillOutForm(){
        type(fname,"Pedro");
        type(lname, "Peric");
        type(email,"perod343@gmail.com");
        type(pass, "2]H9N%S9q[Dk");
        type(confPass, "2]H9N%S9q[Dk");

    }
    public void fillOutFormWithFakeData(String sFname, String sLname, String sEmail, String sPass){
        type(fname,sFname);
        type(lname, sLname);
        type(email,sEmail);
        type(pass, sPass);
        type(confPass, sPass);
    }
    public void submitData(){
        click(buttonRegister);
    }

}
