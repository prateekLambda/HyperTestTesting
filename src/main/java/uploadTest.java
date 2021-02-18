

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.concurrent.TimeUnit;

public class uploadTest {

    public void upload(RemoteWebDriver driver, String status) {
        try {
            driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_a_download");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.switchTo().frame("iframeResult");

            WebElement element = driver.findElement(By.xpath("//a[@href='/images/myw3schoolsimage.jpg']"));
            element.click();

            Thread.sleep(4000);
            //Set Selenium Local File Detector
            driver.get("https://angular-file-upload.appspot.com/");

            driver.findElement(By.xpath("//*[@id=\"editArea\"]/div/div/form/fieldset/input[1]")).sendKeys("lambdatest");

            WebElement uploadElement = driver.findElement(By.xpath("//*[@id=\"editArea\"]/div/div/form/fieldset/input[2]"));
            //Element for file upload
            uploadElement.sendKeys("/Users/ltuser/Downloads/myw3schoolsimage.jpg");
            // Upload file system path

            driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/form/fieldset/button")).click();
            //Click on upload button
            status = "passed";


        } catch (Exception u) {
            System.out.println(u);
            status = "failed";
        }

    }
}
