package homeTest;

import home.HomePageUHC;
import org.testng.annotations.Test;

public class UHCHomeTest extends HomePageUHC {
    @Test
    public void uhcTest() throws InterruptedException {
        driver.get("https://www.uhc.com/");
        indvandFamily();
        emplLink();
        mediCareLink();



    }




}
