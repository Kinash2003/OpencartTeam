package com.opencart.pages.RegisterPage;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LogInOutPage {

    @FindBy(xpath = "//a[text() = 'Continue']")
    private WebElement loginPageContinueCreate;

    @FindBy(xpath = "//input[@id = 'input-email']")
    private WebElement loginPageEmailInput;

    @FindBy(xpath = "//input[@id = 'input-password']")
    private WebElement loginPagePassInput;

    @FindBy(xpath = "//div[@class = 'form-group']/a")
    private WebElement loginPagePassForgotten;

    @FindBy(xpath = "//input[@type = 'submit']")
    private WebElement loginPageLoginButton;

    @FindBy(xpath = "//div[@class = 'alert alert-danger alert-dismissible']")
    private WebElement LoginFailedAlert;

    @FindBy(xpath = "//a[text() = 'Continue']")
    private WebElement logoutPageContinueButton;

}
