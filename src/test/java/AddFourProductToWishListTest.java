import com.opencart.navigation.Navigation;
import com.opencart.steps.RegisterPageBL.MainPageBL;
import com.opencart.steps.Compare_WishListPageBL.WishListPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;


public class AddFourProductToWishListTest extends BaseTest {

    @Test
    public void AddFourProductToWishListTest() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        WishListPageBL wishListPage = mainPageBL.getWishListPageBL()
                    .clickAddMacBookWishButton()
                    .sendKeysWish("iPhone")
                    .sendKeysWishForProdENTER()
                    .clickAddiPhoneWishButton()
                    .clearSearch()
                    .clickSearch()
                    .sendKeysWish("Cinema")
                    .sendKeysWishForProdENTER()
                    .clickAddAppleCinema30WishButton()
                    .clearSearch()
                    .clickSearch()
                    .sendKeysWish("Canon")
                    .sendKeysWishForProdENTER()
                    .clickAddCanonEOS5DWishButton()
                    .clickWishListButton()
                    .loginPerson();
        WishListPageBL.verifyUserWishList();

    }
}
