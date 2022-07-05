package com.opencart.pages.Search_MyAccountPage;

import com.opencart.pages.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Getter
public class MyAccountPage extends BasePage {

    @FindBy(xpath = "//*[contains(text(), 'Edit your account information')]")
    WebElement myAccountEdit;

    @FindBy(xpath = "//*[contains(text(), 'Change your password']")
    WebElement myAccountPassChange;

    @FindBy(xpath = "//*[contains(text(), 'Modify your address book entries']")
    WebElement myAccountAddressBook;

    @FindBy(xpath = "//*[contains(text(), 'Modify your wish list']")
    WebElement myAccountWishList;

    @FindBy(xpath = "//*[@name='password']")
    private WebElement currentPasswordField;

    @FindBy(xpath = "//*[@name='confirm']")
    private WebElement newPasswordField;

    @FindBy(xpath = "//*[@value='Continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//div[text()='Password confirmation does not match password!']")
    private WebElement notMatchPasswordAlert;

    public WebElement getCurrentPasswordField() {
        return currentPasswordField;
    }

    public WebElement getNewPasswordField() {
        return newPasswordField;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getNotMatchPasswordAlert() {
        wait.until(ExpectedConditions.visibilityOf(notMatchPasswordAlert));
        return notMatchPasswordAlert;
    }

    @FindBy(id = "input-firstname")
    private WebElement firstNameField;

    @FindBy(xpath = "//*[@name='lastname']")
    private WebElement lastNameField;

    @FindBy(xpath = "//*[@name='email']")
    private WebElement emailField;

    @FindBy(xpath = "//*[@name='telephone']")
    private WebElement telephoneField;



    public WebElement getFirstNameField() {
        wait.until(ExpectedConditions.visibilityOf(firstNameField));
        return firstNameField;
    }

    public WebElement getLastNameField() {
        return lastNameField;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getTelephoneField() {
        return telephoneField;
    }



}
