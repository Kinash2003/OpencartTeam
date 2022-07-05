package com.opencart.pages.RegisterPage;

import com.opencart.pages.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Getter
public class HeaderPage extends BasePage {

    @FindBy(xpath = ".//*[@title='My Account']")
    private WebElement myAccountButton;

    @FindBy(xpath = "//a[contains(.,'Register')]")
    private WebElement RegisterButton;

    @FindBy(xpath = "//ul[@class = 'dropdown-menu dropdown-menu-right']//*[contains(@href, 'login')]")
    private WebElement LoginButton;

    //Header search field
    @FindBy(xpath = ".//*[@id='search']/input")
    private WebElement searchStr;

    //Header search field button
    @FindBy(xpath = ".//*[@id='search']/span/button")
    private WebElement searchStrSub;

    @FindBy(name = "search")
    private WebElement search;

    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }
    public WebElement getSearch() {
        return search;
    }

    }