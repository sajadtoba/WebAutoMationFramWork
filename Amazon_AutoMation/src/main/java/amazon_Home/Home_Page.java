package amazon_Home;

import Common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Home_Page extends CommonAPI {

    public void createAC() throws InterruptedException {
        Actions action = new Actions(driver); // we are doing mouse hover action on amazon account&list element using below method
        WebElement element = driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']"));
        action.moveToElement(element).build().perform();
        Thread.sleep(2000);
    }
    public void clickSignBTN() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\'nav-flyout-ya-signin\']/a/span")).click();
        Thread.sleep(500);
    }


}
