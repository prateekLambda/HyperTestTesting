import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.ArrayList;

public class SkyMap {

    public void SkyMapTest(RemoteWebDriver driver) {
        try {
            ((JavascriptExecutor) driver).executeScript("window.open()");
            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(2));
            driver.get("https://stellarium-web.org/");


            driver.findElement(By.xpath("/html/body/div[2]/div/div/main/div/div/div/div/div/div[3]/div/div[1]/button")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div/div/main/div/div/div/div/div/div[1]/header/div/button")).click();
            driver.findElement(By.cssSelector("#stel > div > div > div:nth-child(11) > div:nth-child(8) > a > img")).click();
            driver.findElement(By.cssSelector("#stel > div > div > div:nth-child(11) > div:nth-child(10) > a > img")).click();
            driver.findElement(By.cssSelector("#stel > div > div > div:nth-child(11) > div:nth-child(3) > a > img")).click();
            driver.findElement(By.cssSelector("#stel > div > div > div:nth-child(11) > div:nth-child(8) > a > img")).click();
            driver.findElement(By.cssSelector("#stel > div > div > div:nth-child(11) > div.bottom-button.mr-auto.hidden-xs-only > a > img")).click();

            WebElement rollerclass = driver.findElement(By.id("stel-canvas"));
            Actions roller = new Actions(driver);
            roller.dragAndDropBy(rollerclass, 150, 180).build().perform();
            roller.dragAndDropBy(rollerclass, -50, 180).build().perform();
            roller.dragAndDropBy(rollerclass, 0, 0).build().perform();
            Thread.sleep(5000);
            roller.clickAndHold();
            roller.moveByOffset(100, 150).build().perform();
            driver.findElement(By.cssSelector("#stel > div > div > div:nth-child(11) > div.bottom-button.mr-auto.hidden-xs-only > a > img")).click();
            driver.findElement(By.cssSelector("#stel > div > div > div:nth-child(11) > div:nth-child(10) > a > img")).click();
            driver.findElement(By.cssSelector("#stel > div > div > div:nth-child(11) > div:nth-child(5) > a > img")).click();
            driver.findElement(By.id("input-33")).sendKeys("moon");
            driver.findElement(By.cssSelector("#toolbar-image > header > div > div.tsearch > div > div > div.v-input__prepend-outer > div > i")).click();
            driver.findElement(By.id("input-33")).sendKeys("Sirius");
            driver.findElement(By.cssSelector("#toolbar-image > header > div > div.tsearch > div > div > div.v-input__prepend-outer > div > i")).click();

            driver.findElement(By.cssSelector("#stel > div > div > div:nth-child(11) > button > span > span")).click();
            Actions slider = new Actions(driver);
            WebElement daylight = driver.findElement(By.cssSelector("#app > div.v-menu__content.theme--dark.v-menu__content--fixed.menuable__content__active > div > div:nth-child(2) > div.v-input.v-input--is-label-active.v-input--is-dirty.theme--dark.v-input__slider > div > div.v-input__slot > div > div.v-slider__track-container > div.v-slider__track-background"));
            slider.dragAndDropBy(daylight, 50, 0).build().perform();
            slider.dragAndDropBy(daylight, 10, 0).build().perform();
            slider.dragAndDropBy(daylight, -50, 0).build().perform();
            slider.dragAndDropBy(daylight, -100, 0).build().perform();
            slider.dragAndDropBy(daylight, -150, 0).build().perform();
            slider.dragAndDropBy(daylight, -200, 0).build().perform();
            slider.dragAndDropBy(daylight, -250, 0).build().perform();
            slider.dragAndDropBy(daylight, -350, 0).build().perform();
            slider.dragAndDropBy(daylight, -400, 0).build().perform();




           /* driver.findElement(By.id("input-210")).sendKeys("50");
            driver.findElement(By.id("input-210")).sendKeys("150");*/


        } catch (Exception s) {
            System.out.println(s);
        }
    }
}
