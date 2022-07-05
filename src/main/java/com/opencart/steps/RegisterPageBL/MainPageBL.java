package com.opencart.steps.RegisterPageBL;

import com.opencart.steps.Compare_WishListPageBL.MenuPageBL;
import com.opencart.steps.Compare_WishListPageBL.WishListPageBL;

public class MainPageBL {

    public HeaderPageBL getHeaderPageBL() {
        return new HeaderPageBL();
    }

    public WishListPageBL getWishListPageBL() {return new WishListPageBL();}

    public MenuPageBL getMenuPageBL() {return new MenuPageBL();}

}