package com.opencart.steps.Admin;

import com.opencart.datamodel.LoginModel;
import com.opencart.pages.Admin.AdminLoginPage;
import com.opencart.repository.LoginModelRepository;

public class AdminLoginPageBL {

    private AdminLoginPage adminLoginPage;

    public AdminLoginPageBL() {
        adminLoginPage = new AdminLoginPage();
    }

    public AdminLoginPageBL loginPerson() {
        LoginModel loginModel = LoginModelRepository.getLoginModel();
        inputEmail(loginModel.getEmail());
        inputPassword(loginModel.getPassword());
        clickOnLoginButton();
        return this;
    }

    private AdminLoginPageBL inputEmail(String email) {
        adminLoginPage.getEmailInputField().clear();
        adminLoginPage.getEmailInputField().sendKeys(email);
        return this;
    }

    private AdminLoginPageBL inputPassword(String password) {
        adminLoginPage.getPasswordInputField().clear();
        adminLoginPage.getPasswordInputField().sendKeys(password);
        return this;
    }

    private AdminLoginPageBL clickOnLoginButton() {
        adminLoginPage.getLoginButton().click();
        return this;
    }
}