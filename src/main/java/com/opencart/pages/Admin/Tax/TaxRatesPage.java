package com.opencart.pages.Admin.Tax;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class TaxRatesPage {

    @FindBy(xpath = "//*[@data-original-title = 'Add New']")
    private WebElement addNew;

    @FindBy(xpath = "//*[@data-original-title = 'Delete']")
    private WebElement delete;

    @FindBy(xpath = "//input[@id = 'input-name']")
    private WebElement addTaxName;

    @FindBy(xpath = "//input[@id = 'input-rate']")
    private WebElement addTaxRate;

    @FindBy(xpath = "//select[@id = 'input-type']")
    private WebElement typeForm;

    @FindBy(xpath = "//option[@value = 'P']")
    private WebElement typePercentage;

    @FindBy(xpath = "//option[@value = 'F']")
    private WebElement typeFixedAmount;

    @FindBy(xpath = "//input[@value = '1']")
    private WebElement checkboxDefault;

    @FindBy(xpath = "//select[@name = 'geo_zone_id']")
    private WebElement geoZoneForm;

    @FindBy(xpath = "//option[@value = '4']")
    private WebElement ukShipping;

    @FindBy(xpath = "//option[@value = '3']")
    private WebElement ukVATZone;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
    private WebElement taxRateAlert;

    @FindBy(xpath = "//*[@data-original-title = 'Save']")
    private WebElement saveNewRateTax;

    @FindBy(xpath = "//td[contains(.,'Test')]/..//a")
    private WebElement editTestTax;

    @FindBy(xpath = "//td[contains(.,'EditedTaxName')]/..//input")
    private WebElement selectTestCheckbox;
}
