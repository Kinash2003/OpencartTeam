package com.opencart.pages.Compare_WishListPage;
import com.opencart.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MenuPage extends BasePage {

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement alertSuccessAdd;

    @FindBy(xpath = ".//a[text()='Components']")
    private WebElement componentsButton;

    @FindBy(xpath = ".//a[contains(text(), 'Monitors')]")
    private WebElement monitorsButton;

    public WebElement getTabletsButton() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//a[text()='Tablets']"))));
        return driver.findElement(By.xpath(".//a[text()='Tablets']"));
    }

    public WebElement getSoftwareButton() {
        return driver.findElement(By.xpath(".//a[text()='Software']"));
    }

    public WebElement getDesktopsButton() {
        return driver.findElement(By.xpath("//a[text()='Desktops']"));
    }

    public WebElement getMac(){
        return driver.findElement(By.xpath("//a[contains(text(), 'Mac')]"));
    }

    public WebElement getLaptops_NotebooksButton(){
        return driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
    }

    public WebElement getComponentsButton() {
        return componentsButton;
    }

    public WebElement getMonitors(){
        return monitorsButton;
    }

    public WebElement getPhones_PDAsButton() {
        return driver.findElement(By.xpath(".//a[text()='Phones & PDAs']"));
    }

    public WebElement getCamerasButton() {
        return driver.findElement(By.xpath(".//a[text()='Cameras']"));
    }

    public WebElement getMP3playerButton() {
        return driver.findElement(By.xpath(".//a[text()='MP3 Players']"));
    }

    public WebElement getAlertSuccessAdd() {
        wait.until(ExpectedConditions.visibilityOf(alertSuccessAdd));
        return alertSuccessAdd;
    }
}
