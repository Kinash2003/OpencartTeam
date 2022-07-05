package com.opencart.pages.Compare_WishListPage;
import com.opencart.pages.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage {

    @FindBy(xpath  = ".//*[@data-original-title='Add to Wish List']")
    private WebElement AddWishButton;

    @FindBy(xpath = ".//*[@id='wishlist-total']")
    private WebElement oneWishListButton;

    @FindBy(id = "input-email")
    private WebElement emailInput;

    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = ".//*[@id='content']/div[2]/div/a")
    private WebElement contentButton;

    @FindBy(name = "search")
    private WebElement list;

    @FindBy(xpath = ".//*[@class='btn btn-default btn-lg']")
    private WebElement wishENTER;

    @FindBy(name = "search")
    private WebElement search;

    public WebElement getAddMacBookToWishListButton() {return AddWishButton; }

    public WebElement getAddiPhoneToWishListButton() {return AddWishButton; }

    public WebElement getAddAppleCinema30ToWishListButton() {return AddWishButton; }

    public WebElement getAddCanonEOS5DToWishListButton() {return AddWishButton; }

    public WebElement getOneWishListButton() {return oneWishListButton; }

    public WebElement getContentButton() {return contentButton; }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getWishList() {
        return list;
    }

    public WebElement getWishENTER() {return wishENTER;}

    public WebElement getSearch() {
        return search;
    }
}




