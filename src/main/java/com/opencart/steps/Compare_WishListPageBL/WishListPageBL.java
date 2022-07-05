package com.opencart.steps.Compare_WishListPageBL;

import com.opencart.datamodel.LoginModel;
import com.opencart.pages.Compare_WishListPage.SuccessLoginOpenWishList;
import com.opencart.pages.Compare_WishListPage.WishListPage;
import com.opencart.repository.LoginModelRepository;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class WishListPageBL {
    private WishListPage wishListPage;
    private static SuccessLoginOpenWishList successLoginOpenWishList;

    public WishListPageBL() {
        wishListPage = new WishListPage();
    }

    public WishListPageBL loginPerson() {
        LoginModel loginModel = LoginModelRepository.getLoginModel();
        inputEmail(loginModel.getEmail());
        inputPassword(loginModel.getPassword());
        clickOnLoginButton();
        clickContentButton();
        successLoginOpenWishList = new SuccessLoginOpenWishList();
        return this;
    }
    public WishListPageBL  clickAddMacBookWishButton() {
        wishListPage.getAddMacBookToWishListButton().click();
        return new WishListPageBL();
    }
    public WishListPageBL  clickAddiPhoneWishButton() {
        wishListPage.getAddiPhoneToWishListButton().click();
        return new WishListPageBL();
    }
    public WishListPageBL  clickAddAppleCinema30WishButton() {
        wishListPage.getAddAppleCinema30ToWishListButton().click();
        return new WishListPageBL();
    }
    public WishListPageBL  clickAddCanonEOS5DWishButton() {
        wishListPage.getAddCanonEOS5DToWishListButton().click();
        return new WishListPageBL();
    }
    public WishListPageBL clickWishListButton() {
        wishListPage.getOneWishListButton().click();
        return new WishListPageBL();
    }

    private void inputEmail(String email) {
        wishListPage.getEmailInput().clear();
        wishListPage.getEmailInput().sendKeys(email);
    }

    private void inputPassword(String password) {
       wishListPage.getPasswordInput().clear();
       wishListPage.getPasswordInput().sendKeys(password);

    }
    private void clickOnLoginButton() {
        wishListPage.getLoginButton().click();
    }

    public WishListPageBL clickContentButton() {
        wishListPage.getContentButton().click();
        return new WishListPageBL();
    }
    public  static void verifyUserWishList() {
        String expectedMessage = "My Account";
        Assert.assertEquals(successLoginOpenWishList.getOpenWishList().getText(), expectedMessage, "Error");
    }
    public WishListPageBL sendKeysWish(String keyWords) {
        wishListPage.getWishList().sendKeys(keyWords);
        return this;
    }
    public WishListPageBL sendKeysWishForProdENTER() {
        wishListPage.getWishENTER().sendKeys(Keys.ENTER);
        return new WishListPageBL();
    }
    public WishListPageBL clearSearch(){
        wishListPage.getSearch().clear();
        return new WishListPageBL();
    }
    public WishListPageBL clickSearch(){
        wishListPage.getSearch().click();
        return new WishListPageBL();
    }
}
