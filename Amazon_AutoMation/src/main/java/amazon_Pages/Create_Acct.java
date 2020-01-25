package amazon_Pages;

import Common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Create_Acct extends CommonAPI {

    public void createAC() throws InterruptedException {
        Actions action = new Actions(driver); // we are doing mouse hover action on amazon account&list element using below method
        WebElement element = driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']"));
        action.moveToElement(element).build().perform();
        Thread.sleep(1500);
    }

    public void orderSign() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[1]")).click();
        Thread.sleep(300);

    }

    public void tryingPrime() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"nav-link-prime\"]/span[2]")).click();
        Thread.sleep(420);
    }

    public void clickTryme() throws InterruptedException {
        driver.findElement(By.xpath("/html/body")).click();
        Thread.sleep(200);
    }

    public void tryClick() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"prime-header-CTA\"]/span/input")).click();
        Thread.sleep(200);
    }

    public void signIn() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
        Thread.sleep(200);
    }

    public void clickBox() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='rememberMe']")).click();
        Thread.sleep(100);
    }

    public void clickAcct() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
        driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("abcd786");
        Thread.sleep(100);
    }

    public void enterEmail() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("yahaq786y@gmail.com");
        Thread.sleep(100);
    }

    public void enterPassword() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("pakistan");
        Thread.sleep(100);
    }

    public void enterPasswordConfirm() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='ap_password_check']")).sendKeys("pakistan");
        Thread.sleep(100);
    }

    public void clickCreateAct() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        Thread.sleep(100);
    }

    public void enterTheConfirmCode() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"cvf-page-content\"]/div/div/div[1]/form/div[2]/input")).sendKeys("903980");
        Thread.sleep(100);
    }

    public void clickConfirmAcct() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0\"]/span/input")).click();
        Thread.sleep(100);
    }













//    public void clickTr(){
//        driver.findElement(By.className("a-button-text")).click();
//    }



    // This code is working.******************  //************************
//    public void clickSignBTN() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\'nav-flyout-ya-signin\']/a/span")).click();
//        Thread.sleep(500);
//    }









//    public void clickOrder() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[2]")).click();
//        Thread.sleep(200);
//    }
//


    // These both codes are working*****************************

//    public void trik() {
//        driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']"));
//
//    }
//    public void searchW() {
//        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("laptop");
//
//    }
    // These both codes are working*****************************






















}