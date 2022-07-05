package com.opencart.steps.Search_MyAccountPageBL;

import com.opencart.datamodel.EditAccountModel;
import com.opencart.driver.DriverRepository;
import com.opencart.pages.Search_MyAccountPage.EditAccountInformation;
import com.opencart.pages.Search_MyAccountPage.MyAccountPage;
import com.opencart.repository.EditAccountModelRepository;
import org.testng.Assert;

public class MyAccountPageBL {

    private MyAccountPage  myAccountInfoPage;
    private EditAccountInformation editAccountInformation;

    public MyAccountPageBL(){  myAccountInfoPage = new MyAccountPage(); }

    public EditAccountInformationBL myAccountEditClick(){
        myAccountInfoPage.getMyAccountEdit().click();
        return new EditAccountInformationBL();
    }

    public EditAccountInformationBL myAccountPassChangeClick(){
        myAccountInfoPage.getMyAccountPassChange().click();
        return new EditAccountInformationBL();
    }

    public MyAccountPageBL LoginCheckSuccess() {
        String expected = "http://localhost/opencart/upload/index.php?route=account/account";
        String actual = DriverRepository.DRIVERS.get().getCurrentUrl();
        Assert.assertEquals(expected, actual);
        return new MyAccountPageBL();
    }

    public MyAccountPageBL AccountChangingConfirm() {
        String actual =  editAccountInformation.getChangesConfirmMessage().getText();
        String expected = "Success: Your account has been successfully updated.";
        Assert.assertTrue(actual.contains(expected), "Changes are not success");
        return new MyAccountPageBL();
    }
    public MyAccountPageBL editAllInfoAboutPerson() {
        EditAccountModel editAccountModel = EditAccountModelRepository.getEditAccountModel();
        inputFirstName(editAccountModel.getFirstName());
        inputLastName(editAccountModel.getLastName());
        inputEmail(editAccountModel.getEmail());
        inputTelephone(editAccountModel.getTelephone());
        return this;
    }

    public MyAccountPageBL editFirstNameAboutPerson() {
        EditAccountModel editAccountModel = EditAccountModelRepository.getEditAccountModel();
        inputFirstName(editAccountModel.getFirstName());
        return this;
    }

    public MyAccountPageBL editLastNameAboutPerson() {
        EditAccountModel editAccountModel = EditAccountModelRepository.getEditAccountModel();
        inputLastName(editAccountModel.getLastName());
        return this;
    }

    public MyAccountPageBL editEmailOfPerson() {
        EditAccountModel editAccountModel = EditAccountModelRepository.getEditAccountModel();
        inputEmail(editAccountModel.getEmail());
        return this;
    }

    public MyAccountPageBL editTelephoneOfPerson() {
        EditAccountModel editAccountModel = EditAccountModelRepository.getEditAccountModel();
        inputTelephone(editAccountModel.getTelephone());
        return this;
    }

    private void inputFirstName(String firstName) {
        myAccountInfoPage.getFirstNameField().clear();
        myAccountInfoPage.getFirstNameField().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        myAccountInfoPage.getLastNameField().clear();
        myAccountInfoPage.getLastNameField().sendKeys(lastName);
    }

    private void inputEmail(String email) {
        myAccountInfoPage.getEmailField().clear();
        myAccountInfoPage.getEmailField().sendKeys(email);
    }

    private void inputTelephone(String telephone) {
        myAccountInfoPage.getTelephoneField().clear();
        myAccountInfoPage.getTelephoneField().sendKeys(telephone);
    }

    public MyAccountPageBL clickOnContinueButton() {
        myAccountInfoPage.getContinueButton().click();
        return this;
    }
}