package com.opencart.pages.Admin;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class AdminNavigationMenu {

    @FindBy(id = "menu-system")
    WebElement menuSystem;

    @FindBy(xpath = "//a[text() = 'Localisation']")
    WebElement submenuLocalisation;

    @FindBy(xpath = "//a[text() = 'Currencies']")
    WebElement submenuCurrencies;

    @FindBy(xpath = "//a[text() = 'Taxes']")
    WebElement submenuTaxes;

    @FindBy(xpath = "//a[text() = 'Tax Classes']")
    WebElement submenuTaxClasses;

    @FindBy(xpath = "//a[text() = 'Tax Rates']")
    WebElement submenuTaxRates;
}
