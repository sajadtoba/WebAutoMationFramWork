package home;

import Common.CommonAPI;
import org.openqa.selenium.By;

public class HomePageUHC extends CommonAPI {
    public void indvandFamily() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='global-nav']//a[contains(@class,'nav-link position-relative size-16 lineHeight-h3 display-inlineBlock weight-medium pb-1 sm-pb-0')][contains(text(),'Individuals & Families')]")).click();
    Thread.sleep(200);
    }


    public void emplLink() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='global-nav']//a[contains(@class,'nav-link position-relative size-16 lineHeight-h3 display-inlineBlock weight-medium pb-1 sm-pb-0')][contains(text(),'Employers')]")).click();
    Thread.sleep(100);
    }
    public void mediCareLink() throws InterruptedException {

        driver.findElement(By.xpath("//div[@class='global-nav']//a[contains(@class,'nav-link position-relative size-16 lineHeight-h3 display-inlineBlock weight-medium pb-1 sm-pb-0')][contains(text(),'Medicare')]")).click();
        Thread.sleep(100);
    }




}
