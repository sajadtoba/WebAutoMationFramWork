package homeTest;

import home.HomePageUHC;
import org.testng.annotations.Test;

public class UHCHomeTest extends HomePageUHC {
    @Test
    public void uhcTest() throws InterruptedException {
        driver.get("https://www.uhc.com/");

        medicare();
        DefineMedicare();
        MedicaePartA();
        blockopup();
        FindAdva();
        stoppopupt();
        //findMedicarePlan2();
        findMore();
        signIn();
        popp();
        //pupp();
        //playVideo();
        contactT();
        carrearE();
        //PupopAnswer();
        carrearFurther();
        //learnMore();
       // optiumTry();
        profileMy();












//        shopForPlan();
//        clickHeart();
//        pupup();
//        visitApi();




        //MedicareAdvantage();







       //..... indvandFamily();
//        emplLink();
//        //mediCareLink();
//        //mediCareLink();
//        indiFamily();
//        indFamily();




    }




}
