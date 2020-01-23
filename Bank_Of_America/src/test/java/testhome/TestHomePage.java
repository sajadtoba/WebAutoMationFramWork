package testhome;

import Common.CommonAPI;
import home.HomePage;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

    @Test(priority = 1)
    public void testAct() throws InterruptedException {
        driver.get("https://www.bankofamerica.com/");
        openACT();
        chkAct();
        //actOpen();
        learnMore();
        closePupup();
        overDraftProtection();
        closePup();
        overDraftPt();
        closePop_Too();
        learnMoreToo();
        blockPopUp();
        learnMoretooa();



}
}

