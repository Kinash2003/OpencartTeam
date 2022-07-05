package com.opencart.steps.Search_MyAccountPageBL;

import com.opencart.pages.Search_MyAccountPage.SearchPage;
import org.openqa.selenium.WebElement;

public class SearchPageBL {

    private SearchPage searchPage;

    public SearchPageBL() {
        searchPage = new SearchPage();
    }

    public SearchPageBL setSearchCategory(String category) {
        searchPage.getSearchFormButton().click();
        for (WebElement target : searchPage.getSearchInCategories()) {
            if(target != null & target.getText().equalsIgnoreCase(category)){
                target.click();
                break;
            }
        }
        return this;
    }

    public SearchPageBL searchInDescription(){
        searchPage.getSearchInDesc().click();
        return this;
    }

    public SearchPageBL searchInSubcategories(){
        searchPage.getSearchInSubCategories().click();
        return this;
    }
}
