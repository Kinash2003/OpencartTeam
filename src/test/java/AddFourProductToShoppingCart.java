import com.opencart.navigation.Navigation;
import com.opencart.steps.RegisterPageBL.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class AddFourProductToShoppingCart extends BaseTest {

    @Test
    public void add4ProductToShoppingCartTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getMenuPageBL()
                .clickOnDesktopsButton()
                .clickOnMacButton()
                .clickOnAddToCartIMacButton()
                .verifyAddProductButton("iMac");

        MainPageBL mainPageBL2 = new MainPageBL();
        mainPageBL2.getMenuPageBL()
                .clickOnComponentsButton()
                .clickOnMonitorsButton()
                .clickOnAddToCartSamsungSyncMaster941BWButton()
                .verifyAddProductButton("Samsung SyncMaster 941BW");

        mainPageBL.getMenuPageBL()
                .clickOnTabletsButton()
                .clickOnAddToCartSamsungGalaxyTab10Button()
                .verifyAddProductButton("Samsung Galaxy Tab 10.1");

        mainPageBL.getMenuPageBL()
                .clickOnSoftwareButton()
                .verifySubtitleNoProductInCategory();

        mainPageBL.getMenuPageBL()
                .clickOnPhones_PDAsButton()
                .clickOnAddToCartPalmTreoProButton()
                .verifyAddProductButton("Palm Treo Pro");
    }
}