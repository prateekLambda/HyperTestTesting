

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LambdaTestLogin {

    public void Lambda(RemoteWebDriver driver, String status) {
        try {

            driver.get("https://www.lambdatest.com/");
            Thread.sleep(4000);
            JavascriptExecutor scroll = (JavascriptExecutor) driver;
            scroll.executeScript("window.scrollBy(0,500)");
            scroll.executeScript("window.scrollBy(0,-500)");
            WebElement homePageLogin = driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/nav/div/ul/li[6]/a"));
            homePageLogin.click();
            Thread.sleep(4000);
            WebElement username = driver.findElement(By.name("email"));
            username.sendKeys("prateek.delguy@gmail.com");
            Thread.sleep(3000);
            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("9582334806");
            Thread.sleep(3000);
            WebElement loginPlatform = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/form/div[3]/button"));
            loginPlatform.click();
            Thread.sleep(3000);
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());

            Thread.sleep(5000);

        } catch (Exception L) {
            System.out.println(L);
        }
    }

}
