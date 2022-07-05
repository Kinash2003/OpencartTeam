package com.opencart.steps.Admin.Tax;

import com.opencart.pages.Admin.Tax.TaxClassesPage;
import org.testng.Assert;

public class TaxAddClassesPageBL {

    private TaxClassesPage taxClassesPage;

    public TaxAddClassesPageBL() { taxClassesPage = new TaxClassesPage(); }

    public TaxAddClassesPageBL addNewClass() {
        taxClassesPage.getAddNew().click();
        return this;
    }

    public TaxAddClassesPageBL setTaxClassesName(String taxClassesName) {
        taxClassesPage.getTaxClassesTitle().clear();
        taxClassesPage.getTaxClassesTitle().sendKeys(taxClassesName);
        return this;
    }

    public TaxAddClassesPageBL setTaxClassesDescription(String taxClassesDescription) {
        taxClassesPage.getTaxClassesDescription().clear();
        taxClassesPage.getTaxClassesDescription().sendKeys(taxClassesDescription);
        return this;
    }

    public TaxAddClassesPageBL setPriority(String priorityNumber) {
        taxClassesPage.getPriority().clear();
        taxClassesPage.getPriority().sendKeys(priorityNumber);
        return this;
    }

    public TaxAddClassesPageBL addRuleClick() {
        taxClassesPage.getAddNewRule().click();
        return this;
    }

    public TaxAddClassesPageBL selectBasedOnShipping() {
        taxClassesPage.getBasedOnForm().click();
        taxClassesPage.getSelectBasedOnShipping().click();
        return this;
    }

    public TaxAddClassesPageBL selectBasedOnPayment() {
        taxClassesPage.getBasedOnForm().click();
        taxClassesPage.getSelectBasedOnPayment().click();
        return this;
    }

    public TaxAddClassesPageBL selectBasedOnStore() {
        taxClassesPage.getBasedOnForm().click();
        taxClassesPage.getSelectBasedOnStoreAddress().click();
        return this;
    }

    public TaxClassesPageBL clickOnSaveButton() {
        taxClassesPage.getSaveNewTax().click();
        return new TaxClassesPageBL();
    }

    public TaxClassesPageBL taxClassesChangesCheck() {
        String expected = "Success: You have modified tax classes!";
        String actual = taxClassesPage.getTaxClassesAlert().getText().trim();
        Assert.assertTrue(actual.contains(expected), "Error: tax rates are not modified");
        return new TaxClassesPageBL();
    }

    public TaxAddClassesPageBL createTestClassesTax() {
        setTaxClassesName("TestClass");
        setTaxClassesDescription("TestDescription");
        addRuleClick();
        setPriority("2");
        selectBasedOnPayment();
        clickOnSaveButton();
        return this;
    }
}