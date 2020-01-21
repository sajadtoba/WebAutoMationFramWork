package Test_Amazon;

import Common.CommonAPI;
import amazon_Home.Home_Page;
import org.testng.annotations.Test;

public class Test_Home_Page extends Home_Page {
    @Test
    public void testAC() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        //Home_Page home = new Home_Page();
        createAC();

    }

}
