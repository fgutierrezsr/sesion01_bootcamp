package com.magento.tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void doLogin(){
        loginPage.fillOutForm();
        loginPage.submitData();
        int a = 5;
    }
}
