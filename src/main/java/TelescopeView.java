import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class TelescopeView {

    public void Tele(RemoteWebDriver driver) {
        try {
            driver.get("https://worldwidetelescope.org/webclient/");
            driver.manage().window().maximize();
            Thread.sleep(7000);
            driver.findElement(By.cssSelector("#btnCloseIntro")).click();
            driver.findElement(By.cssSelector("body > div > div.ng-scope > div.context-panel > div.thumbnails.nearby-objects.rel.ng-scope > div:nth-child(5) > ng-include > div > div")).click();
            Thread.sleep(5000);
            driver.findElement(By.cssSelector("body > div > div.ng-scope > div.context-panel > div.thumbnails.nearby-objects.rel.ng-scope > div:nth-child(3) > ng-include > div > div")).click();
            Thread.sleep(3000);
            Select dropdown = new Select(driver.findElement(By.id("lstLookAt")));

            dropdown.selectByIndex(0);
            Thread.sleep(3000);
            dropdown.selectByIndex(1);
            Thread.sleep(3000);
            dropdown.selectByIndex(2);

            driver.findElement(By.cssSelector("#topPanel > div > div > div:nth-child(7) > ng-include > div > div")).click();
            Thread.sleep(3000);
            driver.findElement(By.cssSelector("body > div > div.ng-scope > div.context-panel > div.thumbnails.nearby-objects.rel.ng-scope > div:nth-child(9) > ng-include > div > div")).click();
            Thread.sleep(5000);
            driver.findElement(By.cssSelector("#topPanel > div > div > div:nth-child(13) > ng-include > div > div")).click();
            Thread.sleep(5000);

        } catch (Exception T) {
            System.out.println(T);
        }
    }
}
