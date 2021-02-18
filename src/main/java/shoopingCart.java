import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class shoopingCart {

    public void amazon(RemoteWebDriver driver) {
        try {
            driver.get("https://www.amazon.com/");

            WebElement Serachbox = driver.findElement(By.id("twotabsearchtextbox"));
            Serachbox.sendKeys("HeadPhones");
            WebElement clickSearch = driver.findElement(By.id("nav-search-submit-button"));
            clickSearch.click();
            JavascriptExecutor scroll = (JavascriptExecutor) driver;
            scroll.executeScript("window.scrollBy(0,500)");
            WebElement chooseHeadphones = driver.findElement(By.linkText("Sony MDRZX110/BLK ZX Series Stereo Headphones (Black)"));
            chooseHeadphones.click();
            driver.findElement(By.linkText("Bluetooth Headphones IPX7 Waterproof Wireless Sport Earphones HiFi Bass Stereo Sweatproof Earbuds with Mic Noise Cancelling Headset for Workout Running Gym 9 Hours Play Time (Renewed)")).click();

          /*  WebElement Cart = driver.findElement(By.linkText("Cart"));
            Cart.click();*/

         /*   WebElement Checkout = driver.findElement(By.name("proceedToRetailCheckout"));
            Checkout.click();*/

        } catch (Exception a) {


            System.out.println(a);
        }
    }
}
