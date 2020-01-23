package home;

import Common.CommonAPI;
import org.openqa.selenium.By;

public class HomePage extends CommonAPI {

    public void openACT() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='open']")).click();
        Thread.sleep(200);
    }
    public void chkAct() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='CheckingSavings_GetStarted_2017mOAA2RS']/div/div[2]")).click();
        Thread.sleep(200);
    }

    public void actOpen() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='ProductDetails_P3_Opt1_CTA']")).click();
        Thread.sleep(200);
    }
    public void learnMore() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='ProductDetails_P3_Opt1_LearnMore']")).click();
        Thread.sleep(200);
    }
    public void closePupup() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='Modal_Close']")).click();
        Thread.sleep(200);
    }
    public void overDraftProtection() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='ProductDetails_P3_Opt2_OverdraftProtection']")).click();
        Thread.sleep(200);
    }
    public void closePup() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='Modal_Close']")).click();
        Thread.sleep(200);
    }
    public void overDraftPt() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='ProductDetails_P3_Opt3_OverdraftProtection']")).click();
        Thread.sleep(200);
    }
    public void closePop_Too() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='Modal_Close']")).click();
        Thread.sleep(200);
    }

    public void learnMoreToo() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='ProductDetails_P3_Opt2_LearnMore']")).click();
        Thread.sleep(100);
    }
    public void blockPopUp() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='Modal_Close']")).click();
        Thread.sleep(100);
    }
    public void learnMoretooa() throws InterruptedException {
        driver.findElement(By.xpath("//a[@id='ProductDetails_P3_Opt3_LearnMore']"));
        Thread.sleep(100);
    }


    }







