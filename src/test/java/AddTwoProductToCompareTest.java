import com.opencart.navigation.Navigation;
import com.opencart.steps.RegisterPageBL.MainPageBL;
import com.opencart.steps.Compare_WishListPageBL.AddToComparePageBL;
import org.testng.annotations.Test;


import static com.opencart.enums.URLs.BASE_URL;


public class AddTwoProductToCompareTest extends BaseTest {


    @Test
    public void searchElementAndAddToCompare() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        AddToComparePageBL addToComparePageBL = mainPageBL.getMenuPageBL()
                .clickOnComponentsButton()
                .clickOnMonitorsButtonAddToComparePage()
                .clickOnAppleCinema30Button()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddAppleCinema30();


        mainPageBL.getHeaderPageBL()
                .clearSearch()
                .clickSearch()
                .sendKeysSearch("MacBook")
                .sendKeysSearchForCompareProdENTER()
                .clickOnMacBookButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddMacBook();
    }

    }

