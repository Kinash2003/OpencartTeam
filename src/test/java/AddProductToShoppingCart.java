
import com.opencart.navigation.Navigation;
import com.opencart.steps.RegisterPageBL.MainPageBL;
import org.testng.annotations.Test;
import static com.opencart.enums.URLs.BASE_URL;


public class AddProductToShoppingCart extends BaseTest {
    @Test
    public void addOneComplexProductToCartTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        mainPageBL.getMenuPageBL()
                .clickOnDesktopsButton()
                .clickOnMacButton()
                .clickOnAddToCartIMacButton()
                .verifyAddProductButton("iMac");
    }
}
