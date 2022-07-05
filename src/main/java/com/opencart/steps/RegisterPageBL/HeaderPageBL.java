package com.opencart.steps.RegisterPageBL;
import com.opencart.steps.RegisterPageBL.LogInOutPageBL;
import com.opencart.pages.RegisterPage.HeaderPage;
import com.opencart.steps.Compare_WishListPageBL.AddToComparePageBL;
import com.opencart.steps.Search_MyAccountPageBL.SearchPageBL;
import org.openqa.selenium.Keys;

public class HeaderPageBL {

    private HeaderPage headerPage;

    public HeaderPageBL() {
        headerPage = new HeaderPage();
    }

    public HeaderPageBL OnMyAccountButtonClick() {
        headerPage.getMyAccountButton().click();
        return this;
    }
    public HeaderPageBL clickOnMyAccountButton() {
        headerPage.getMyAccountButton().click();
        return this;
    }
    public RegisterPageBL clickOnRegisterButton() {
        headerPage.getRegisterButton().click();
        return new RegisterPageBL();
    }
    public LogInOutPageBL OnLoginButtonClick(){
        headerPage.getLoginButton().click();
        return new LogInOutPageBL();
    }

    public HeaderPageBL SearchClick() {
        headerPage.getSearch().click();
        return this;
    }
    public RegisterPageBL OnRegisterButtonClick() {
        headerPage.getRegisterButton().click();
        return new RegisterPageBL();
    }

    public SearchPageBL SearchUse(String product){
        headerPage.getSearch().click();
        headerPage.getSearch().clear();
        headerPage.getSearchStrSub().click();
        return new SearchPageBL();
    }
    public HeaderPageBL SearchClear() {
        headerPage.getSearch().click();
        return this;
    }

    public HeaderPageBL sendKeysSearch(String keyWords) {
        headerPage.getSearch().sendKeys(keyWords);
        return this;
    }
    public AddToComparePageBL sendKeysSearchForCompareProdENTER() {
        headerPage.getSearch().sendKeys(Keys.ENTER);
        return new AddToComparePageBL();
    }

    public HeaderPageBL clearSearch(){
        headerPage.getSearch().click();
        return new HeaderPageBL();
    }
    public HeaderPageBL clickSearch(){
        headerPage.getSearch().click();
        return new HeaderPageBL();
    }

}