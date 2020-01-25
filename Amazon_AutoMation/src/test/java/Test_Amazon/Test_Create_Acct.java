package Test_Amazon;

import amazon_Pages.Create_Acct;
import org.testng.annotations.Test;

public class Test_Create_Acct extends Create_Acct {
    @Test(priority = 1)
    public void testAC() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        //Home_Page home = new Home_Page();
        //createAC();

        //clickSignBTN();
       // trik();
        //searchW();
        //orderSign();
        tryingPrime();
        clickTryme();

        tryClick();
        signIn();
        //clickTr();
        clickBox();
        clickAcct();
        enterEmail();
        enterPassword();
        enterPasswordConfirm();
        clickCreateAct();
        enterTheConfirmCode();
        clickConfirmAcct();







    }



}
