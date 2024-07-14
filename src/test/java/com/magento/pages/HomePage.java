package com.magento.pages;

import com.magento.utils.Variable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePage extends BasePage {

    By facturaLinkQuickMenu = By.xpath("/html/body/app-root/app-admin/div/div[2]/div/div/div/div/div/div/div/smrt-menu-inicio/app-card/div/div/div/div/div[3]/div[1]/div[2]/div/div[1]/div/a");
    By boletaLinkQuickMenu = By.xpath("/html/body/app-root/app-admin/div/div[2]/div/div/div/div/div/div/div/smrt-menu-inicio/app-card/div/div/div/div/div[3]/div[1]/div[2]/div/div[2]/div/a");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void  goToNewFactura(){
        click(facturaLinkQuickMenu);
    }
    public void  goToNewBoleta(){
        click(boletaLinkQuickMenu);
    }
}
