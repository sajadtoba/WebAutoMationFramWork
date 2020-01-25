package Test_Amazon;

import amazon_Pages.Online_Order;
import org.testng.annotations.Test;

public class Test_Online_Order extends Online_Order {

    @Test(priority = 1)
    public void testOrder() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        findgift();
        woMenStuff();
//        funnyStuff();
//        funnyToo();
//        personlized();
        unique();
        selectP();
        freeShipping();
        stopPopUp();
        //selectquantity();
        selectQuantity();
        addToCart();
        todayDeals();
        seeDetails();
        seeExtraDetails();
        addToCartLights();
        //addExtra();
        //extraAddItems();
        clickcart();


    }
}
