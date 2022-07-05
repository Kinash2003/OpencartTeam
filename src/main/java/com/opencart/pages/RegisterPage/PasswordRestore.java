package com.opencart.pages.RegisterPage;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class PasswordRestore {

    @FindBy(xpath = "//*[@id=\"input-email\"]")
    WebElement emailString;

    @FindBy(xpath = "//input[@type = 'submit']")
    WebElement continueButton;

    @FindBy(xpath = "//*[contains(text(),'Back')]")
    WebElement backButton;

}
