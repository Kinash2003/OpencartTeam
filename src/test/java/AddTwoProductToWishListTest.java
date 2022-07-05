import com.opencart.navigation.Navigation;
import com.opencart.steps.RegisterPageBL.MainPageBL;
import com.opencart.steps.Compare_WishListPageBL.WishListPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;


public class AddTwoProductToWishListTest extends BaseTest {

    @Test
    public void AddTwoProductToWishListTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        WishListPageBL wishListPage = mainPageBL.getWishListPageBL()
                    .clickAddMacBookWishButton()
                    .sendKeysWish("iPhone")
                    .sendKeysWishForProdENTER()
                    .clickAddiPhoneWishButton()
                    .clickWishListButton()
                    .loginPerson();
        WishListPageBL.verifyUserWishList();

    }
}
