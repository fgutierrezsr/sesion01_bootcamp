package com.magento.tests;

import com.github.javafaker.Faker;
import com.magento.utils.Variable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Locale;

public class RegisterTest extends BaseTest {

    Faker faker= new Faker(new Locale("en-US"));
    String email= faker.internet().emailAddress();
    String password=faker.internet().password(8,10,true);
    //@Test
    public void registerNewAccountWithFullInformation(){

    }

    //@Test
//    public void registerNewAccountWithRequiredInformation(){
//
//        String expected_message = "Account Information";
//
//        //go to register page
//        homePage.goToRegisterLink();
//
//        //fills the form with fakedata
//        registerPage.fillOutFormWithFakeData(faker.name().firstName(),faker.name().lastName(),email,password);
//
//        //submit information
//        registerPage.submitData();
//
//        //Falta la asercion
//
//
//    }

}
