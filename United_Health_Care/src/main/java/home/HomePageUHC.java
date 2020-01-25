package home;

import Common.CommonAPI;
import org.openqa.selenium.By;

public class HomePageUHC extends CommonAPI {
    String QLocator = "//h1[text()=\"What do Medicare Parts A and B (Original Medicare) cover?\"]";

    public void medicare() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/header/div/div/div[1]/div[1]/div[2]/div[1]/div/nav/ul/li[4]/a")).click();

        //driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div[1]/div/h1")).click();

        driver.findElement(By.xpath("//ul/li/a[text()=\"Medicare Parts A & B\"]")).click();
        System.out.println(driver.findElement(By.xpath(QLocator)).getText());
        Thread.sleep(200);
    }

    public void DefineMedicare() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/nav/ul/li/ul/li[1]/a")).click();
        Thread.sleep(200);
    }

    public void MedicaePartA() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/nav/ul/li/ul/li[2]/a")).click();
        Thread.sleep(200);
    }

    public void blockopup() throws InterruptedException {
        driver.findElement(By.xpath("/html/body")).click();
        Thread.sleep(100);
    }

    public void findMedicarePlan() {
        driver.findElement(By.xpath("//*[@id='1012630300']"));
    }


    public void FindAdva() throws InterruptedException {
//    driver.findElement(By.xpath("//*[@id='main-content']"));
        driver.findElement(By.xpath("//*[@id='main-content']")).click();

        Thread.sleep(100);
    }
// ....................

    public void stoppopupt() {
        driver.findElement(By.xpath("/html/body")).click();
    }

//    public void findMedicarePlan2() throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/nav/ul/li/ul/li[5]/a")).click();
//        Thread.sleep(300);
//    }

    public void pupup() {
        driver.findElement(By.xpath("//*[@id='closeButton']"));
    }

    public void findMore() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/nav/ul/li/ul/li[6]/a")).click();
        Thread.sleep(200);
    }
    public void signIn(){
        driver.findElement(By.xpath("//*[@id='main-content']")).click();
    }
    public void popp(){
        driver.findElement(By.xpath("/html/body")).click();
    }
    public void contactT() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/footer/div[2]/div/nav/ul/li[1]/a"));
        Thread.sleep(200);
    }
        public void carrearE(){
            driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/footer/div[2]/div/nav/ul/li[2]/a")).click();
        }
        public void PupopAnswer(){
        driver.findElement(By.xpath("//*[@id=\"nav\"]/button[2]")).click();
        }
        public void carrearFurther() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div[3]/a")).click();
        Thread.sleep(50);
        }
        public void optiumTry() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/div/div[5]/p[3]/a")).click();
        Thread.sleep(400);
        }
        public void profileMy() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div/div[2]/div[4]/div[1]/ul/li[1]/a")).click();
        Thread.sleep(20);
        }






//        public void learnMore() throws InterruptedException {
//        driver.findElement(By.xpath("/html/body/div[2]/div/section[2]/div/div[1]/div/div[3]/p[3]/a")).click();
//        Thread.sleep(100);
//        }









//    public void playVideo(){
//        driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[1]/div/div[8]/div/div[1]/div/div/div/div/div[1]/div[1]/button"))
//    }
//










//
//    public void pupp(){
//        driver.findElement(By.xpath("//*[@id='closeButton']")).click();
//    }
















//    public void visitApi(){
//        driver.findElement(By.xpath("<a href=\"https://www.aarp.org/health/medicare-insurance/?intcmp=GLBNAV-SL-HEA-MEDI\" id=\"aarplink\" dtmid=\"acq_top_nav\" class=\"aarporg_lnk\" dtmname=\"Top Nav:Visit AARP.org\">Visit AARP.org<span class=\"/content/dam/UCP/Individual/PrivacyPolicy_HealthPlan_NPPs_UHCMS-Member_2013-09.pdf\" lang=\"en\"></span></a>")).click();
//    }


//    public void clickHeart() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id='shopping-cart']/img")).click();
//        Thread.sleep(200);
//    }


//    public void shopForPlan(){
//        driver.findElement(By.xpath("//*[@id='ghn_lnk_2']/span")).click();
//    }


//    public void MedicareAdvantage() throws InterruptedException {
//        driver.findElement(By.xpath("//a[@class='weight-medium position-relative pr-4 display-inlineBlock'][contains(text(),'Medicare Parts A & B')]")).click();
//        Thread.sleep(200);
//    }


//    public void indvandFamily() throws InterruptedException {
//        driver.findElement(By.xpath("//div[@class='global-nav']//a[contains(@class,'nav-link position-relative size-16 lineHeight-h3 display-inlineBlock weight-medium pb-1 sm-pb-0')][contains(text(),'Individuals & Families')]")).click();
//    Thread.sleep(200);
//    }


//    public void indiFamily(){
//        driver.findElement(By.xpath("//div[@class='global-nav']//a[@class='nav-link position-relative size-16 lineHeight-h3 display-inlineBlock weight-medium pb-1 sm-pb-0 active'][contains(text(),'Individuals & Families')]")).click();
//    }
//
//
//    public void emplLink() throws InterruptedException {
//        driver.findElement(By.xpath("//div[@class='global-nav']//a[contains(@class,'nav-link position-relative size-16 lineHeight-h3 display-inlineBlock weight-medium pb-1 sm-pb-0')][contains(text(),'Employers')]")).click();
//    Thread.sleep(100);
//    }
//
//    public void indFamily() throws InterruptedException {
//        driver.findElement(By.xpath("//span[@id='internalNavHeading']")).click();
//        Thread.sleep(100);
//    }


//    public void mediCareLink() throws InterruptedException {
//
//        driver.findElement(By.xpath("//div[@class='global-nav']//a[contains(@class,'nav-link position-relative size-16 lineHeight-h3 display-inlineBlock weight-medium pb-1 sm-pb-0')][contains(text(),'Medicare')]")).click();
//        Thread.sleep(100);
//    }

//
//    public void mediCareLink() throws InterruptedException {
//       driver.findElement(By.xpath("//div[@class='global-nav']//a[@class='nav-link position-relative size-16 lineHeight-h3 display-inlineBlock weight-medium pb-1 sm-pb-0 active'][contains(text(),'Medicare')]")).click();
//    Thread.sleep(100);
//    }


}
