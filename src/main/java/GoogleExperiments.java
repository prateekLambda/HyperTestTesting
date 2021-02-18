import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GoogleExperiments {
    public void Music(RemoteWebDriver driver) {
        try {
            driver.get("https://musiclab.chromeexperiments.com/Song-Maker");

            Actions slider = new Actions(driver);
            WebElement daylight = driver.findElement(By.id("instrument-canvas"));
            slider.clickAndHold(daylight).build().perform();
            slider.dragAndDropBy(daylight, 50, 0).build().perform();
            slider.dragAndDropBy(daylight, 10, 0).build().perform();
            slider.dragAndDropBy(daylight, -50, 0).build().perform();
            slider.dragAndDropBy(daylight, 100, 50).build().perform();
            slider.dragAndDropBy(daylight, 150, 100).build().perform();
            slider.dragAndDropBy(daylight, 200, 0).build().perform();
            slider.dragAndDropBy(daylight, 25, 200).build().perform();
            slider.dragAndDropBy(daylight, 50, 150).build().perform();
            driver.findElement(By.id("play-button")).click();
            Thread.sleep(5000);

        } catch (Exception m) {
            System.out.println(m);
        }
    }
}
