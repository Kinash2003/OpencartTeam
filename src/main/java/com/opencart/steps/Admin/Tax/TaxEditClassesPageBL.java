package com.opencart.steps.Admin.Tax;

public class TaxEditClassesPageBL {

    private TaxAddClassesPageBL taxAddClassesPageBL;

    public TaxEditClassesPageBL() { taxAddClassesPageBL = new TaxAddClassesPageBL(); }

    public TaxEditClassesPageBL editTaxName(String newName){
        taxAddClassesPageBL.setTaxClassesName(newName);
        return this;
    }

    public TaxEditClassesPageBL editTaxDescription(String newDescription) {
        taxAddClassesPageBL.setTaxClassesDescription(newDescription);
        return this;
    }

    public TaxEditClassesPageBL saveChanges() {
        taxAddClassesPageBL.clickOnSaveButton();
        return this;
    }

    public TaxClassesPageBL editChangesCheck() {
        TaxAddClassesPageBL taxAddClassPageBL = new TaxAddClassesPageBL();
        taxAddClassPageBL.taxClassesChangesCheck();
        return new TaxClassesPageBL();
    }

    public TaxEditClassesPageBL editTestTax() {
        editTaxName("Test");
        editTaxDescription("Desc");
        saveChanges();
        return this;
    }
}
