import com.opencart.navigation.Navigation;
import com.opencart.steps.RegisterPageBL.MainPageBL;
import com.opencart.steps.Compare_WishListPageBL.AddToComparePageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;


public class AddOneProductToCompareTest extends BaseTest {

    @Test
    public void AddFourProductToWishListTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        AddToComparePageBL addToComparePageBL = mainPageBL.getMenuPageBL()
                .clickOnDesktopsButton()
                .clickOnMacButtonAddToComparePage()
                .clickOnIMacAirMenuButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddIMac();

    }
}
