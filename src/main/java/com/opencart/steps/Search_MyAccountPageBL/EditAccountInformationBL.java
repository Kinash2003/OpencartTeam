package com.opencart.steps.Search_MyAccountPageBL;

import com.opencart.pages.Search_MyAccountPage.EditAccountInformation;

public class EditAccountInformationBL {

    private EditAccountInformation editAccountInformation;

    public EditAccountInformationBL(){ editAccountInformation = new EditAccountInformation(); }

    public EditAccountInformationBL setFirstName(String firstName){
        editAccountInformation.getFirstNameString().clear();
        editAccountInformation.getFirstNameString().sendKeys(firstName);
        return this;
    }

    public EditAccountInformationBL setLastName(String lastName){
        editAccountInformation.getLastNameString().clear();
        editAccountInformation.getLastNameString().sendKeys(lastName);
        return this;
    }

    public EditAccountInformationBL setEmail(String email){
        editAccountInformation.getEmailString().clear();
        editAccountInformation.getEmailString().sendKeys(email);
        return this;
    }

    public EditAccountInformationBL setPhone(String telephone){
        editAccountInformation.getPhoneString().clear();
        editAccountInformation.getPhoneString().sendKeys(telephone);
        return this;
    }

    public MyAccountPageBL editAccountPageBackButtonClick(){
        editAccountInformation.getEditAccountBackButton().click();
        return new MyAccountPageBL();
    }

    public MyAccountPageBL editAccountInformationContinueButtonClick(){
        editAccountInformation.getEditAccountContinueButton().click();
        return new MyAccountPageBL();
    }


}