import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DesignCar {

    public void CarDesign(RemoteWebDriver driver) {
        try {

            driver.get("http://www.3dtuning.com/en-US/");

            WebElement choose = driver.findElement(By.cssSelector("body > div.modal.project-chooser-modal-wrapper.ng-scope.top.am-fade > div.project-chooser-modal-body > div > div.truck-configurator-section.selectable-item > div.configurator-image-section > div.configurator-image"));
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.modal.project-chooser-modal-wrapper.ng-scope.top.am-fade > div.project-chooser-modal-body > div > div.truck-configurator-section.selectable-item > div.configurator-image-section > div.configurator-image")));
            choose.click();
            Thread.sleep(5000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.main-content > div.body.clearfix.ng-scope > div > div.carchooser-view.ng-scope > div.pickup-tuning-start-section.ng-scope > div > div.tuning-start-section > div")));
            driver.findElement(By.cssSelector("body > div.main-content > div.body.clearfix.ng-scope > div > div.carchooser-view.ng-scope > div.pickup-tuning-start-section.ng-scope > div > div.tuning-start-section > div")).click();
            driver.findElement(By.cssSelector("body > div.modal.small-modal.agreement-modal.ng-scope.top.am-fade > div > div > div.modal-footer > button.btn.btn-success.ng-binding")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.main-content > div.body.clearfix.ng-scope > div > div > tuning > div.tuning-stage > tuning-sound > div")));
            driver.findElement(By.cssSelector("body > div.main-content > div.body.clearfix.ng-scope > div > div > tuning > div.tuning-stage > tuning-sound > div")).click();
            Thread.sleep(5000);
            driver.findElement(By.cssSelector("body > div.main-content > div.body.clearfix.ng-scope > div > div > tuning > div.tuning-stage > tuning-sound > div.sound-wrapper.engineOff")).click();
            driver.findElement(By.cssSelector("body > div.main-content > div.body.clearfix.ng-scope > div > div > tuning > div.tuning-bottom-wrapper > component-types > div.components-types-list-wrapper.swiper-container-initialized.swiper-container-horizontal.swiper-container-free-mode > div > div.comp-type.swiper-slide.ng-scope.swiper-slide-active > div > div.comp-image.packs")).click();

            driver.findElement(By.cssSelector("body > div.main-content > div.body.clearfix.ng-scope > div > div > tuning > div.tuning-bottom-wrapper > components-list > div:nth-child(2) > div > div.component-block.swiper-container.swiper-container-initialized.swiper-container-horizontal.swiper-container-free-mode > div.swiper-wrapper.custom-scroller > ng-container:nth-child(3) > div > div > div.component-block-icon")).click();
            driver.findElement(By.cssSelector("body > div.main-content > div.body.clearfix.ng-scope > div > div > tuning > div.tuning-stage > div.components-colors-wrapper > div.parts-toggle-section.sel-elem")).click();
            driver.findElement(By.cssSelector("body > div.main-content > div.body.clearfix.ng-scope > div > div > tuning > div.tuning-bottom-wrapper > component-types > div.components-types-list-wrapper.swiper-container-initialized.swiper-container-horizontal.swiper-container-free-mode > div > div.comp-type.swiper-slide.ng-scope.swiper-slide-next")).click();
            driver.findElement(By.cssSelector("body > div.main-content > div.body.clearfix.ng-scope > div > div > tuning > div.tuning-bottom-wrapper > components-list > div:nth-child(2) > div > div.component-block.swiper-container.swiper-container-initialized.swiper-container-horizontal.swiper-container-free-mode > div.swiper-wrapper.custom-scroller > ng-container.swiper-slide.ng-scope.swiper-slide-active.cur > div > div > component-toolkit > div.component-toolkit-wrapper")).click();

        } catch (Exception c) {
            System.out.println(c);
        }
    }
}
