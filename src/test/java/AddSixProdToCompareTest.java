import com.opencart.navigation.Navigation;
import com.opencart.steps.RegisterPageBL.MainPageBL;
import com.opencart.steps.Compare_WishListPageBL.AddToComparePageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;


public class AddSixProdToCompareTest extends BaseTest {


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

        mainPageBL.getHeaderPageBL()
                .clearSearch()
                .clickSearch()
                .sendKeysSearch("Canon")
                .sendKeysSearchForCompareProdENTER()
                .clickOnCanonEOS5DButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddCanonEOS5D();

        mainPageBL.getHeaderPageBL()
                .clearSearch()
                .clickSearch()
                .sendKeysSearch("Samsung")
                .sendKeysSearchForCompareProdENTER()
                .clickOnSamsungSyncMaster941BWButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddSamsungSyncMaster941BW();


        mainPageBL.getHeaderPageBL()
                .clearSearch()
                .clickSearch()
                .sendKeysSearch("MacBook")
                .sendKeysSearchForCompareProdENTER()
                .clickOnMacBookAirButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddMacAir();

        mainPageBL.getHeaderPageBL()
                .clearSearch()
                .clickSearch()
                .sendKeysSearch("iPod")
                .sendKeysSearchForCompareProdENTER()
                .clickOnIPodClassicButton()
                .clickOnAddToCompareButton();
        addToComparePageBL.verifyAddIPodClassic();
    }

    }

