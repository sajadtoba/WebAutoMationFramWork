package Test_Amazon;

import Common.CommonAPI;
import amazon_Home.Home_Page;
import org.testng.annotations.Test;

public class Test_Home_Page extends Home_Page {
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
