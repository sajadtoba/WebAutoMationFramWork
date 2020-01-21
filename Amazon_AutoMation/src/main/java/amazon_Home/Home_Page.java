package amazon_Home;

import Common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Home_Page extends CommonAPI {

    public void createAC() throws InterruptedException {
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id='nav-link-prime']/span[2]"));
        action.moveToElement(element).build().perform();
        element.click();
        Thread.sleep(2000);
        //this.driver.findElement(By.xpath("//*[@id='nav-signin-tooltip']/a/span']")).click();





    }
}
