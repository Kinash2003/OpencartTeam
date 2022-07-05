package com.opencart.pages.Admin.Tax;

import com.opencart.pages.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class TaxClassesPage extends BasePage {

    @FindBy(xpath = "//a[@data-original-title = 'Add New']")
    private WebElement addNew;

    @FindBy(xpath = "//*[@data-original-title = 'Delete']")
    private WebElement delete;

    @FindBy(xpath = "//input[@id = 'input-title']")
    private WebElement taxClassesTitle;

    @FindBy(xpath = "//input[@id = 'input-description']")
    private WebElement taxClassesDescription;

    @FindBy(xpath = "//*[@data-original-title = 'Add Rule']")
    private WebElement addNewRule;

    @FindBy(xpath = "//*[@data-original-title = 'Save']")
    private WebElement saveNewTax;

    @FindBy(xpath = "//option[@value = 'shipping']/..")
    private WebElement basedOnForm;

    @FindBy(xpath = "//option[@value = 'shipping']")
    private WebElement selectBasedOnShipping;

    @FindBy(xpath = "//option[@value = 'payment']")
    private WebElement selectBasedOnPayment;

    @FindBy(xpath = "//input[@placeholder = 'Priority']")
    private WebElement priority;

    @FindBy(xpath = "//option[@value = 'store']")
    private WebElement selectBasedOnStoreAddress;

    @FindBy(xpath = "//td[contains(.,'Test')]/..//input")
    private WebElement selectTestTaxClasses;

    @FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible'][contains(.,'Success')]")
    private WebElement taxClassesAlert;

    @FindBy(xpath = "//td[contains(.,'Test')]/..//a")
    private WebElement editTestClassesTax;
}
