

import gherkin.lexer.Fa;
import gherkin.lexer.Vi;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class magicLeap {

    public String username = "saurabhlambdatest";
    public String accesskey = "3822ZWc92Nlj14URYtqggRpVYHVk7pu7rs7Dqx1AjJe5NUHPRA";
    public RemoteWebDriver driver;
    public String gridURL = "preprod-hub.lambdatest.com";
    ; // "@eu-central-1-hub.lambdatest.com/wd/hub";
    String status;
    String ResolutionValue;
    long quitestoptime;
    long totaltime;
    long totaltimeforlocaltest;
    long Nettotalspeedtest;
    long GeolocationTotal;
    long ResolutionTotal;
    long totaltesttimeDuration;
    SessionId session;
    String BrowserValue = null;
    String versionValue = null;
    String PlatformValue = null;
    String FixedIpValue = null;
    String ResolutionValueCap;
    String TimeZoneValue;
    String GeoLocationValue;
    String hub = null;
    String TestName;
    String Space = "  ";
    String Tunnel;
    long SuiteStart;
    long SuiteStop;
    long SuiteTotalTime;
    String Session;
    Long AllVersions = null;


    @org.testng.annotations.Parameters(value = {"browser", "version", "platform","fixedIp"})
    public magicLeap(String browser, String version, String platform, String fixedIp) {
        try {

            BrowserValue = browser;
            versionValue = version;
            PlatformValue = platform;
            FixedIpValue = fixedIp;
            Tunnel = System.getProperty("tunnel");
            if (BrowserValue != null) {
                TestName = BrowserValue;
                if (PlatformValue != null) {
                    TestName = BrowserValue + Space + PlatformValue;
                    if (versionValue != null) {
                        TestName = BrowserValue + Space + PlatformValue + Space + versionValue;
                        if (FixedIpValue != null)
                            TestName = BrowserValue + Space + PlatformValue + Space + versionValue + Space + FixedIpValue;

                    }
                }
            }
            System.out.println(BrowserValue + versionValue + PlatformValue + FixedIpValue);
        } catch (Exception t) {
        }
    }

    @BeforeTest
    public void setUp() throws Exception {
        System.out.println(this.TestName);

        for (int i =0 ; i<50;i++) {
            try {

                ChromeOptions capabilities = new ChromeOptions();
                capabilities.setCapability("browserName", this.BrowserValue);
                capabilities.setCapability("browserVersion", this.versionValue);
                capabilities.setCapability("platform", this.PlatformValue);
                capabilities.setCapability("build", System.getProperty("buildName"));
                //capabilities.setCapability("visual", System.getProperty("visual"));
                capabilities.setCapability("fixedIP", FixedIpValue);
                capabilities.addExtensions(new File("Extension/chrome_successful.zip"));

                // capabilities.setCapability("accessKey", accesskey);

                StopWatch driverStart = new StopWatch();
                driverStart.start();

                hub = "https://" + username + ":" + accesskey + "@" + gridURL + "/wd/hub";
                // hub = "http://localhost:4444/wd/hub";

                System.out.println(hub);

                driver = new RemoteWebDriver(new URL(hub), capabilities);

                System.out.println(capabilities);
                driverStart.stop();

                float timeElapsed = driverStart.getTime() / 1000f;
                System.out.println("Driver initiate time" + "   " + timeElapsed);
                DesktopScript();
                tearDown();
                driver.quit();
            } catch (MalformedURLException e) {
                System.out.println("Invalid grid URL");
                System.out.println("Please set the hub URL in the env variable");

            } catch (Exception f) {
                status = "failed";
                System.out.println(f);

            }
        }
    }


    @Test
    public void DesktopScript() {
        try {
            /*String LoopNumber = System.getenv("LoopNumber");
            System.out.println("Value of Loop is" + " " + LoopNumber + " " + "Test Session");
            int LoopnumberInterger = Integer.parseInt(LoopNumber);

            System.out.println("Value of Loop is" + " " + LoopNumber + " " + "Test Session");
            for (int i = 0; i < LoopnumberInterger; i++) {*/
            SuiteStart = System.currentTimeMillis();


            driver.manage().window().maximize();

//            DesignPlane Air = new DesignPlane();
//            Air.plane(driver);
//            GoogleExperiments exp = new GoogleExperiments();
//            exp.Music(driver);


            //   driver.get("https://www.google.com");


//            GoogleSpace space = new GoogleSpace();
//            space.GSpace(driver);
//            TakeScreenShot scr = new TakeScreenShot();
//            scr.Screenshot(driver, status);
//            TelescopeView view = new TelescopeView();
//            view.Tele(driver);
//            scr.Screenshot(driver, status);
//            VideoUpload vid = new VideoUpload();
//            vid.vidupload(driver);
//
//            scr.Screenshot(driver, status);
//
//            shoopingCart shop = new shoopingCart();
//            shop.amazon(driver);
//
//            scr.Screenshot(driver, status);
//            DesignCar car = new DesignCar();
//            car.CarDesign(driver);
//
//            scr.Screenshot(driver, status);
//
//            RockDoor Test = new RockDoor();
//            Test.RockDoorTest(driver);
//
//            scr.Screenshot(driver, status);
//            SkyMap mapTest = new SkyMap();
//            mapTest.SkyMapTest(driver);
//
//            scr.Screenshot(driver, status);
//
//            SessionTest tet = new SessionTest();
//            tet.SessionLaunch(driver, status);
//
//            scr.Screenshot(driver, status);
//            LambdaTestLogin login = new LambdaTestLogin();
//            login.Lambda(driver, status);
//
//            scr.Screenshot(driver, status);


            //ToDo app
            TakeScreenShot screen = new TakeScreenShot();
            screen.Screenshot(driver, status);
            StreamTest stream = new StreamTest();
            stream.TestStream(driver, status);

//            scr.Screenshot(driver, status);
//            uploadTest upTest = new uploadTest();
//            upTest.upload(driver, status);
//            scr.Screenshot(driver, status);
//            scr.Screenshot(driver, status);
//            ResolutionTest ResolutionTestObject = new ResolutionTest();
//            ResolutionTestObject.Resolution(driver, ResolutionValue, status, ResolutionTotal, this.ResolutionValueCap);
//            scr.Screenshot(driver, status);
//            BadSslTest nonSecure = new BadSslTest();
//            nonSecure.badSsl(driver, status);
//            scr.Screenshot(driver, status);
//            NetSpeed net = new NetSpeed();
//            net.NetSpeed(driver, status, Nettotalspeedtest);
//            scr.Screenshot(driver, status);
//            GeolocationTest Geo = new GeolocationTest();
//            Geo.Geolocation(driver, status, GeolocationTotal);
//            FakeMediaTest FK = new FakeMediaTest();
//            FK.TestFakeMediaPermissions(driver);
//            TestCase ractice = new TestCase();
//            ractice.LongCase(driver);
            //                HeavyTestWeb hvy = new HeavyTestWeb();
            //                hvy.heavy(driver);
            driver.get("https://www.google.com/");

            SuiteStop = System.currentTimeMillis();
            SuiteTotalTime = SuiteStop - SuiteStart;
            System.out.println("Total Time Took for Test suite execute" + "   " + SuiteTotalTime / 1000f);
            //}

        } catch (Exception e) {
            System.out.println(e);

            System.out.println("Please set the loop value in the environment value");
        }
    }


    @AfterTest
    @org.testng.annotations.Parameters(value = {"browser", "version", "platform"})
    public void tearDown() throws Exception {
        long quitetimestart;
        long quitetimestop;

        quitetimestart = System.currentTimeMillis();
        if (driver != null) {
           // driver.quit();


        }
        quitestoptime = System.currentTimeMillis();
        quitetimestop = quitestoptime - quitetimestart;
        System.out.println("Driver Quite time" + "   " + quitetimestop / 1000f + "Sec.");

    }


}

