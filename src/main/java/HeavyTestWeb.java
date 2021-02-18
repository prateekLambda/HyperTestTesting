import org.openqa.selenium.remote.RemoteWebDriver;

public class HeavyTestWeb {

    public void heavy(RemoteWebDriver driver) {
        try {
            driver.get("https://activetheory.net/home");
            Thread.sleep(30000);
            driver.getTitle();

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            driver.get("https://sagmeisterwalsh.com/");
            Thread.sleep(30000);
            driver.getTitle();

        } catch (Exception t) {


            System.out.println(t);
        }

    }
}
