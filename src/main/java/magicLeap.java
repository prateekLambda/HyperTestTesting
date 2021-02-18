

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

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class magicLeap {

    public String username = "prateeks";
    public String accesskey = "IuCSesD83A7LsTFzEKS0Lb6tzvEfBQ38DMkFTEpudatxxxsdjH";
    public RemoteWebDriver driver;
    public String gridURL = "stage-hub.lambdatest.com"; // "@eu-central-1-hub.lambdatest.com/wd/hub";
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
    String BrowserValue;
    String versionValue;
    String PlatformValue;
    String FixedIpValue;
    String ResolutionValueCap;
    String TimeZoneValue;
    String GeoLocationValue;
    String hub;
    String TestName;
    String Space = "  ";
    String Tunnel;
    long SuiteStart;
    long SuiteStop;
    long SuiteTotalTime;
    String Session;
    Long AllVersions = null;


    @org.testng.annotations.Parameters(value = {"browser", "version", "platform", "fixedIp"})
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

        } catch (Exception t) {
        }
    }

    @BeforeTest
    public void setUp() throws Exception {
        System.out.println(this.TestName);

        /*String LoopNumber = System.getenv("LoopNumber");
        System.out.println("Value of Loop is" + " " + LoopNumber + " " + "Test Session");
        int LoopnumberInterger = Integer.parseInt(LoopNumber);

        System.out.println("Value of Loop is" + " " + LoopNumber + " " + "Test Session");
        for (int i = 0; i < LoopnumberInterger; i++) {*/
        try {


            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("browserName", this.BrowserValue);
            capabilities.setCapability("version", this.versionValue);
            capabilities.setCapability("platform", this.PlatformValue);
            capabilities.setCapability("fixedIP", this.FixedIpValue);
            capabilities.setCapability("build", "Mac Machines" + "  " + this.PlatformValue);
            capabilities.setCapability("resolution", "");
            capabilities.setCapability("console", true);
            capabilities.setCapability("network", true);
            capabilities.setCapability("visual", true);


            StopWatch driverStart = new StopWatch();
            driverStart.start();

            hub = "http://" + username + ":" + accesskey + "@" + gridURL + "/wd/hub";
            // hub = "http://localhost:4444/wd/hub";
            // hub = System.getenv("hub");
            System.out.println(hub);

            driver = new RemoteWebDriver(new URL(hub), capabilities);

            System.out.println(capabilities);
            driverStart.stop();

            float timeElapsed = driverStart.getTime() / 1000f;
            System.out.println("Driver initiate time" + "   " + timeElapsed);


        } catch (
                MalformedURLException e) {
            System.out.println("Invalid grid URL");
        } catch (
                Exception f) {
            status = "failed";
            System.out.println(f);

        }
        //  }

    }

    @Test
    public void DesktopScript() {
        try {
            SuiteStart = System.currentTimeMillis();

            System.out.println(driver.getCapabilities());
            driver.manage().window().maximize();
            DesignPlane Air = new DesignPlane();
            Air.plane(driver);
            GoogleExperiments exp = new GoogleExperiments();
            exp.Music(driver);


            //   driver.get("https://www.google.com");

            LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
            System.out.println(logEntries);
            GoogleSpace space = new GoogleSpace();
            space.GSpace(driver);

            TelescopeView view = new TelescopeView();
            view.Tele(driver);
            VideoUpload vid = new VideoUpload();
            vid.vidupload(driver);

            shoopingCart shop = new shoopingCart();
            shop.amazon(driver);
            DesignCar car = new DesignCar();
            car.CarDesign(driver);

            RockDoor Test = new RockDoor();
            Test.RockDoorTest(driver);
            SkyMap mapTest = new SkyMap();
            mapTest.SkyMapTest(driver);

            SessionTest tet = new SessionTest();
            tet.SessionLaunch(driver, status);
            LambdaTestLogin login = new LambdaTestLogin();
            login.Lambda(driver, status);


            //ToDo app
            TakeScreenShot screen = new TakeScreenShot();
            screen.Screenshot(driver, status);
            StreamTest stream = new StreamTest();
            stream.TestStream(driver, status);

            uploadTest upTest = new uploadTest();
            upTest.upload(driver, status);

            ResolutionTest ResolutionTestObject = new ResolutionTest();
            ResolutionTestObject.Resolution(driver, ResolutionValue, status, ResolutionTotal, this.ResolutionValueCap);
            BadSslTest nonSecure = new BadSslTest();
            nonSecure.badSsl(driver, status);
            NetSpeed net = new NetSpeed();
            net.NetSpeed(driver, status, Nettotalspeedtest);
            GeolocationTest Geo = new GeolocationTest();
            Geo.Geolocation(driver, status, GeolocationTotal);
            FakeMediaTest FK = new FakeMediaTest();
            FK.TestFakeMediaPermissions(driver);
            TestCase ractice = new TestCase();
            ractice.LongCase(driver);
            HeavyTestWeb hvy = new HeavyTestWeb();
            hvy.heavy(driver);

            SuiteStop = System.currentTimeMillis();
            SuiteTotalTime = SuiteStop - SuiteStart;
            System.out.println("Total Time Took for Test suite execute" + "   " + SuiteTotalTime / 1000f);


        } catch (Exception e) {
            System.out.println(e);
        }
    }


    @AfterTest
    @org.testng.annotations.Parameters(value = {"browser", "version", "platform"})
    public void tearDown() throws Exception {
        long quitetimestart;
        long quitetimestop;

        quitetimestart = System.currentTimeMillis();
        if (driver != null) {
            driver.quit();


        }
        quitestoptime = System.currentTimeMillis();
        quitetimestop = quitestoptime - quitetimestart;
        System.out.println("Driver Quite time" + "   " + quitetimestop / 1000f + "Sec.");

    }


}

