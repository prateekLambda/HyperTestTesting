import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class RockDoor {

    public void RockDoorTest(RemoteWebDriver driver) {

        try {

            driver.get("https://www.google.com/earth/");

            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Launch Earth")));
            driver.findElement(By.linkText("Launch Earth")).click();
            ArrayList tabs = new ArrayList(driver.getWindowHandles());
            System.out.println(tabs.size());
            driver.switchTo().window((String) tabs.get(1));
            Thread.sleep(10000);
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            WebElement pegman = (WebElement) jse.executeScript("return document.querySelector(\"body > earth-app\").shadowRoot.querySelector(\"#street-view\").shadowRoot.querySelector(\"#pegman-icon\")");          //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("zoom-buttons")));
            String click = "arguments[0].click();";
            ((JavascriptExecutor) driver).executeScript(click, pegman);

            WebElement zoomin = (WebElement) jse.executeScript("return document.querySelector(\"body > earth-app\").shadowRoot.querySelector(\"#zoom-buttons\").shadowRoot.querySelector(\"#zoom-in\")");
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", zoomin);

            WebElement search = (WebElement) jse.executeScript("return document.querySelector(\"body > earth-app\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\")");
            ((JavascriptExecutor) driver).executeScript(click, search);
            WebElement searchbox = (WebElement) jse.executeScript("return document.querySelector(\"body > earth-app\").shadowRoot.querySelector(\"#drawer-container\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#omnibox\").shadowRoot.querySelector(\"#omnibox-input\")");
            String sendKeys = "arguments[0].setAttribute('value','India')";
            ((JavascriptExecutor) driver).executeScript(sendKeys, searchbox);
            WebElement searchEnter = (WebElement) jse.executeScript("return document.querySelector(\"body > earth-app\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#random-icon\")");
            ((JavascriptExecutor) driver).executeScript(click, searchEnter);
            Thread.sleep(10000);
            WebElement Globe = (WebElement) jse.executeScript("return document.querySelector(\"body > earth-app\").shadowRoot.querySelector(\"#nav-globe\").shadowRoot.querySelector(\"#globe-canvas\")");
            ((JavascriptExecutor) driver).executeScript(click, Globe);

            WebElement MapStyle = (WebElement) jse.executeScript("return document.querySelector(\"body > earth-app\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#map-style\")");
            ((JavascriptExecutor) driver).executeScript(click, MapStyle);
            Thread.sleep(10000);

            WebElement CleanBorders = (WebElement) jse.executeScript("return document.querySelector(\"body > earth-app\").shadowRoot.querySelector(\"#drawer-container\").shadowRoot.querySelector(\"#mapstyle\").shadowRoot.querySelector(\"#header-layout > aside > paper-radio-group > earth-radio-card.iron-selected\")");

            ((JavascriptExecutor) driver).executeScript(click, CleanBorders);
            Thread.sleep(5000);
            ((JavascriptExecutor) driver).executeScript(click, Globe);

            WebElement GridLines = (WebElement) jse.executeScript("return document.querySelector(\"body > earth-app\").shadowRoot.querySelector(\"#drawer-container\").shadowRoot.querySelector(\"#mapstyle\").shadowRoot.querySelector(\"#gridlines-toggle\")");
            ((JavascriptExecutor) driver).executeScript(click, GridLines);
            Thread.sleep(5000);
            WebElement Projects = (WebElement) jse.executeScript("return document.querySelector(\"body > earth-app\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#projects\")");
            ((JavascriptExecutor) driver).executeScript(click, Projects);


            WebElement WatchVideo = (WebElement) jse.executeScript("return document.querySelector(\"body > earth-app\").shadowRoot.querySelector(\"#drawer-container\").shadowRoot.querySelector(\"#myplaces\").shadowRoot.querySelector(\"#places-view\").shadowRoot.querySelector(\"#watch-tutorial-button\")");
            ((JavascriptExecutor) driver).executeScript(click, WatchVideo);
            Thread.sleep(2000);
            ((JavascriptExecutor) driver).executeScript(click, Projects);









//


            //   ((JavascriptExecutor) driver).executeScript(click, zoomin);
            Thread.sleep(10000);

//            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//          //  driver.findElement(By.id("pegman-icon")).click();
//
//            driver.findElement(By.id("search")).click();
//
//
//        //    driver.findElement(By.id("icon")).click();
//            WebElement canvas = driver.findElement(By.id("#zoom-in"));
//            Actions dragging = new Actions(driver);
//            dragging.dragAndDropBy(canvas, 1530, 556).build().perform();


        } catch (Exception r) {
            System.out.println(r);

        }
    }

}
