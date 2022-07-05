package com.opencart.steps.RegisterPageBL;

import com.opencart.pages.RegisterPage.PasswordRestore;

public class PasswordRestoreBL {

    private PasswordRestore passwordRestore;

    public PasswordRestoreBL(){ passwordRestore = new PasswordRestore(); }

    public void PasswordRestoreEmailInput(String email){
        passwordRestore.getEmailString().clear();
        passwordRestore.getEmailString().sendKeys(email);
        passwordRestore.getContinueButton().click();
    }

    public void PasswordRestoreBackButton(){
        passwordRestore.getBackButton().click();
    }
}
