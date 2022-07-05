package com.opencart.steps.Admin.Tax;

import com.opencart.driver.DriverRepository;
import com.opencart.pages.Admin.Tax.TaxClassesPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaxClassesPageBL {
    private TaxClassesPage taxClassesPage;

    public TaxClassesPageBL() { taxClassesPage = new TaxClassesPage(); }

    public TaxAddClassesPageBL clickOnAddNew() {
        taxClassesPage.getAddNew().click();
        return new TaxAddClassesPageBL();
    }

    public TaxClassesPageBL deleteTestTax() {
        taxClassesPage.getSelectTestTaxClasses().click();
        taxClassesPage.getDelete().click();
        Alert alert = (new WebDriverWait(DriverRepository.DRIVERS.get(), 10).until(ExpectedConditions.alertIsPresent()));
        DriverRepository.DRIVERS.get().switchTo().alert().accept();
        return this;
    }

    public TaxEditClassesPageBL clickOnTestEdit() {
        taxClassesPage.getEditTestClassesTax().click();
        return new TaxEditClassesPageBL();
    }

    public TaxClassesPageBL taxClassChangesCheck() {
        TaxAddClassesPageBL taxAddClassPageBL = new TaxAddClassesPageBL();
        return this;
    }
}
