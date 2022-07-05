import com.opencart.driver.DriverRepository;
import com.opencart.navigation.Navigation;
import com.opencart.steps.RegisterPageBL.MainPageBL;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.opencart.enums.URLs.BASE_URL;

public class AccountDataChangeTest  extends BaseTest {


        @BeforeMethod
        public void changeAccountPhone () {
            new Navigation().navigateToUrl(BASE_URL.getValue());
            MainPageBL mainPageBL = new MainPageBL();
            mainPageBL.getHeaderPageBL()
                    .OnMyAccountButtonClick()
                    .OnLoginButtonClick()
                    .ValidUserLogin()
                    .LoginCheckSuccess()
                    .myAccountEditClick()
                    .setPhone("+380636060666")
                    .editAccountInformationContinueButtonClick()
                    .AccountChangingConfirm();
        }

        @Test
        public void changeAccountEmail () {
            MainPageBL mainPageBL = new MainPageBL();
            new Navigation().navigateToUrl(BASE_URL.getValue());
            mainPageBL.getHeaderPageBL()
                    .OnMyAccountButtonClick()
                    .OnLoginButtonClick()
                    .ValidUserLogin()
                    .LoginCheckSuccess()
                    .myAccountEditClick()
                    .setEmail("vasyatest@gmail.com")
                    .editAccountInformationContinueButtonClick()
                    .AccountChangingConfirm();
        }

        @Test
        public void changeAccountFirstName () {
            MainPageBL mainPageBL = new MainPageBL();
            new Navigation().navigateToUrl(BASE_URL.getValue());
            mainPageBL.getHeaderPageBL()
                    .OnMyAccountButtonClick()
                    .OnLoginButtonClick()
                    .ValidUserLogin()
                    .LoginCheckSuccess()
                    .myAccountEditClick()
                    .setFirstName("Bill")
                    .editAccountInformationContinueButtonClick()
                    .AccountChangingConfirm();
        }


        @Test
        public void changeAccountLastName () {
            MainPageBL mainPageBL = new MainPageBL();
            new Navigation().navigateToUrl(BASE_URL.getValue());
            DriverRepository.DRIVERS.get().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            mainPageBL.getHeaderPageBL()
                    .OnMyAccountButtonClick()
                    .OnLoginButtonClick()
                    .ValidUserLogin()
                    .LoginCheckSuccess()
                    .myAccountEditClick()
                    .setLastName("Johnson")
                    .editAccountInformationContinueButtonClick()
                    .AccountChangingConfirm();
        }

        @Test
        public void changeAllAccountData () {
            MainPageBL mainPageBL = new MainPageBL();
            new Navigation().navigateToUrl(BASE_URL.getValue());
            mainPageBL.getHeaderPageBL()
                    .OnMyAccountButtonClick()
                    .OnLoginButtonClick()
                    .ValidUserLogin()
                    .LoginCheckSuccess()
                    .myAccountEditClick()
                    .setEmail("vasyatest@gmail.com")
                    .setLastName("Smith")
                    .setFirstName("John")
                    .setPhone("+380636066666")
                    .editAccountInformationContinueButtonClick()
                    .AccountChangingConfirm();
        }

    }

