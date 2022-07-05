package com.opencart.steps.Compare_WishListPageBL;

import com.opencart.pages.Compare_WishListPage.AddToComparePage;
import com.opencart.pages.Compare_WishListPage.ShoppingPage;
import org.testng.Assert;


public class ShoppingPageBL {

    ShoppingPage productTypePage = new ShoppingPage();

    private AddToComparePage addToComparePage;
    public ShoppingPageBL() {
        addToComparePage = new AddToComparePage();
    }

    public ShoppingPageBL clickOnAddToCartIMacButton() {
        productTypePage.getAddToCartIMac().click();
        return this;
    }
    public ShoppingPageBL clickOnAddToCartSamsungSyncMaster941BWButton() {
        productTypePage.getAddToCartSamsungSyncMaster941BWButton().click();
        return this;
    }
    public ShoppingPageBL clickOnAddToCartSamsungGalaxyTab10Button() {
        productTypePage.getAddToCartSamsungGalaxyTab10().click();
        return this;
    }
    public ShoppingPageBL clickOnAddToCartPalmTreoProButton() {
        productTypePage.getAddToCartPalmTreoPro().click();
        return this;
    }
    public ShoppingPageBL clickOnCanonEOS5DButton() {
        addToComparePage.getCanonEOS5DButton().click();
        return this;
    }
    public ShoppingPageBL clickOnIPhoneButton() {
        addToComparePage.getIPhoneButton().click();
        return this;
    }
    public ShoppingPageBL clickOnSamsungSyncMaster941BWButton() {
        addToComparePage.getSamsungSyncMaster941BWButton().click();
        return this;
    }
    public ShoppingPageBL clickOnAppleCinema30Button() {
        addToComparePage.getAppleCinema30Button().click();
        return this;
    }

    public ShoppingPageBL clickOnMacBookButton() {
        addToComparePage.getMacBookButton().click();
        return this;
    }

    public ShoppingPageBL clickOnMacBookAirButton() {
        addToComparePage.getMacBookAirButton().click();
        return this;
    }

    public ShoppingPageBL clickOnIPodClassicButton() {
        addToComparePage.getIPodClassicButton().click();
        return this;
    }

    public ShoppingPageBL clickOnIMacAirMenuButton() {
        addToComparePage.getIMacButton().click();
        return this;
    }
    public ShoppingPageBL clickOnSamsungGalaxyTab101Button() {
        addToComparePage.getSamsungGalaxyTab101Button().click();
        return this;
    }
    public ShoppingPageBL clickOnAddToCartButton() {
        productTypePage.getInputButtonAddToCart().click();
        return this;
    }
    public void verifyAddCanonEOS5D() {
        String expectedMessage = "Success";
        String nameItem = "Canon EOS 5D";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddIPhone() {
        String expectedMessage = "Success";
        String nameItem = "iPhone";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddSamsungSyncMaster941BW() {
        String expectedMessage = "Success";
        String nameItem = "Samsung SyncMaster 941BW";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddMacBook() {
        String expectedMessage = "Success";
        String nameItem = "MacBook";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddMacAir() {
        String expectedMessage = "Success";
        String nameItem = "MacBook Air";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddIPodClassic() {
        String expectedMessage = "Success";
        String nameItem = "iPod Classic";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddIMac() {
        String expectedMessage = "Success";
        String nameItem = "iMac";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddSamsungGalaxyTab101() {
        String expectedMessage = "Success";
        String nameItem = "Samsung Galaxy Tab 10.1";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }
    public void verifyAddAppleCinema30() {
        String expectedMessage = "Success";
        String nameItem = " Apple Cinema 30";
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to compare");
        Assert.assertTrue(addToComparePage.getAlertSuccessAdd().getText().contains(nameItem), "Other item");
    }

    public ShoppingPageBL verifyAddProductButton(String Product) {
        String expectedMessage = "Success";
        Assert.assertTrue(productTypePage.getAlertSuccessAdd().getText().contains(expectedMessage), "Failed to add item to cart");
        Assert.assertTrue(productTypePage.getAlertSuccessAdd().getText().contains(Product), "Other item");
        return this;
    }
    public void verifySubtitleNoProductInCategory() {
        String expectedMessage = "There are no products to list in this category.";
        Assert.assertTrue(productTypePage.getSubtitleNoProductInCategory().getText().contains(expectedMessage), "Incorrect page title");
    }
}
