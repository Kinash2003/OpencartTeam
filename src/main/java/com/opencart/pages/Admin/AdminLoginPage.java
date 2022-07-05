package com.opencart.pages.Admin;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLoginPage extends BasePage {

    @FindBy(xpath = ".//*[@id='input-username']")
    private WebElement emailInputField;

    @FindBy(xpath = ".//*[@id='input-password']")
    private WebElement passwordInputField;

    @FindBy(xpath = ".//*[@value='Login']")
    private WebElement loginButton;

    public WebElement getEmailInputField() {
        return emailInputField;
    }

    public WebElement getPasswordInputField() {
        return passwordInputField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
}