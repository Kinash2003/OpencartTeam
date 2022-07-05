package com.opencart.steps.RegisterPageBL;

import com.opencart.datamodel.RegisterModel;
import com.opencart.driver.DriverRepository;
import com.opencart.pages.RegisterPage.LogInOutPage;
import com.opencart.repository.RegisterModelRepository;
import com.opencart.steps.Search_MyAccountPageBL.MyAccountPageBL;
import org.testng.Assert;

public class LogInOutPageBL {

    private String loginEmail;
    private String loginPassword;
    private LogInOutPage LogInOutPage;
    private static String newPassword;

    public LogInOutPageBL() { LogInOutPage = new LogInOutPage(); }


    public LogInOutPageBL loginPagePassInput(String password){
        LogInOutPage.getLoginPagePassInput().clear();
        LogInOutPage.getLoginPagePassInput().sendKeys(password);
        return this;
    }


    public LogInOutPageBL loginPageEmailInput(String email) {
        LogInOutPage.getLoginPageEmailInput().clear();
        LogInOutPage.getLoginPageEmailInput().sendKeys(email);
        return this;
    }

    public RegisterPageBL loginPageCreateAccount() {
        LogInOutPage.getLoginPageContinueCreate().click();
        return new RegisterPageBL();
    }

    public MyAccountPageBL loginPageLoginButtonClick() {
        LogInOutPage.getLoginPageLoginButton().click();
        return new MyAccountPageBL();
    }

    public PasswordRestoreBL loginPageForgottenPass() {
        LogInOutPage.getLoginPagePassForgotten().click();
        return new PasswordRestoreBL();
    }

    public MyAccountPageBL LoginCheckSuccess() {
        String expected = "http://localhost/opencart/upload/index.php?route=account/account";
        String actual = DriverRepository.DRIVERS.get().getCurrentUrl();
        Assert.assertEquals(expected, actual);
        return new MyAccountPageBL();
    }

    public LogInOutPageBL unsuccessLoginCheck() {
        String expected = "Warning: No match for E-Mail Address and/or Password.";
        String actual = LogInOutPage.getLoginFailedAlert().getText();
        Assert.assertEquals(expected, actual);
        return this;
    }

    public static void setNewPassword(String newPassword) { LogInOutPageBL.newPassword = newPassword;}

    public void setLoginEmail(String loginEmail) { this.loginEmail = loginEmail; }

    public void setLoginPassword(String loginPassword) { this.loginPassword = loginPassword; }

    public LogInOutPageBL ValidUserLogin() {
        RegisterModel loginModel = RegisterModelRepository.getValidModel();
        loginPageEmailInput(loginModel.getEmail());
        loginPagePassInput(loginModel.getPassword());
        loginPageLoginButtonClick();
        return this;
    }

    public MyAccountPageBL getMyAccountPageBL() {
        return new MyAccountPageBL();
    }
}
