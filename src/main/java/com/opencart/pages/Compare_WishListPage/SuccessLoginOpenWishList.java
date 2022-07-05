package com.opencart.pages.Compare_WishListPage;

import com.opencart.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessLoginOpenWishList extends BasePage {
    @FindBy(xpath = ".//*[@id='content']/h2[1]")
    private WebElement OpenWishList;

    public WebElement getOpenWishList() {
        return OpenWishList;
    }
    
}


        

