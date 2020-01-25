package amazon_Pages;

import Common.CommonAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Online_Order extends CommonAPI {

    public void findgift() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Find a Gift')]")).click();
        Thread.sleep(300);
    }
    public void woMenStuff(){
        driver.findElement(By.xpath("//span[@class='sc-bxivhb gRykup'][contains(text(),'Women')]")).click();
    }
    public void funnyStuff() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"notification-provider\"]/div/div[2]/div/div/div[2]/div[1]/ul/li[1]/button")).click();
        Thread.sleep(100);
    }
    public void funnyToo() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"notification-provider\"]/div/div[2]/div/div/div[2]/div[1]/ul/li[2]/button")).click();
        Thread.sleep(100);
    }
    public void personlized(){
        driver.findElement(By.xpath("//*[@id=\"notification-provider\"]/div/div[2]/div/div/div[2]/div[1]/ul/li[3]/button")).click();
    }
    public void unique(){
        driver.findElement(By.xpath("//button[contains(text(),'Unique')]")).click();
    }
    public void selectP(){
        driver.findElement(By.xpath("//*[@id=\"gcx-gf-section-0\"]/div/section/div[1]/figure/a/div/div[2]/div/div[1]/span")).click();
    }
    public void freeShipping() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='a-column a-span12 a-text-left a-spacing-top-micro']//a[@class='a-popover-trigger a-declarative'][contains(text(),'FREE Shipping')]")).click();
    Thread.sleep(100);
    }
    public void stopPopUp() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"a-popover-9\"]/div/div[1]/button/i")).click();
        Thread.sleep(100);
    }
//    public void selectquantity() {
//        WebElement element = driver.findElement(By.xpath("//select[@id='quantity']"));
//        Select select = new Select(element);
//        select.selectByValue("3");
//        element.submit();
//    }
//    public void selectquantity(){
//        WebElement element = driver.findElement(By.xpath("//select[@id='quantity']"));
//        Select select = new Select(element);
//        select.selectByValue("4");
//        element.submit();
//    }
    public void selectQuantity(){
        WebElement element = driver.findElement(By.xpath("//select[@id='quantity']"));

        Select select = new Select(element);
        select.selectByValue("5");
        element.submit();
    }
    public void addToCart() throws InterruptedException {
       driver.findElement(By.xpath("//*[@id=\"huc-v2-order-row-mark-gift\"]/div/label/input")).click();
       Thread.sleep(100);
    }
    public void todayDeals() throws InterruptedException {
        //driver.findElement(By.xpath("//span[@id='hlb-view-cart']")).click();
        //driver.findElement(By.xpath("//a[@id='hlb-view-cart-announce']")).click();
        //driver.findElement(By.xpath("//a[@id='hlb-ptc-btn-native']")).click();
        driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]")).click();
        Thread.sleep(200);
    }
    public void seeDetails(){
        driver.findElement(By.xpath("//a[@id='101 19339dc2-announce']")).click();
    }
    public void seeExtraDetails() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='a-truncate-cut'][contains(text(),'Brilliant Evolution Wireless LED Puck Light 6 Pack')]")).click();
        Thread.sleep(200);
    }



//     WebElement element = driver.findElement(By.xpath("//select[@id='quantity']"));
//
//        Select select = new Select(element);
//        select.selectByValue("5");
//        element.submit();



    public void addToCartLights() throws InterruptedException {
        //WebElement element = driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']"));
        WebElement element = driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
        // //*[@id="selectQuantity"]/span/div
        ////span[@class='a-declarative']//div[@class='a-row a-spacing-base']
        ////span[@id='a-autoid-0-announce']
        ////*[@id="quantity"]  The class starts from Select there we need to take the exPath........
        Select select = new Select(element);
        select.selectByValue("2");
        element.submit();
        Thread.sleep(100);
    }
    public void addExtra() throws InterruptedException {
        driver.findElement(By.xpath("")).click();
        Thread.sleep(100);
    }
    public void extraAddItems() throws InterruptedException {
        Thread.sleep(100);
    }
    public void clickcart() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\'hlb-view-cart-announce\']")).click();
        Thread.sleep(100);
    }

}
