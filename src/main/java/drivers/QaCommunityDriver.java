package drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utils.StartStopAppium;
//import utils.rules.LovrsWatcherRule;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by GeorgiKamoyan on 10/19/15.
 */
public class QaCommunityDriver {

    public AppiumDriver driver;
    public WebDriverWait wait;

    StartStopAppium startStopAppium;
    String port = System.getProperty("portValue");
    String deviceModel = System.getProperty("deviceNameValue");
    String genymotionVM = System.getProperty("genymotionVMValue");

    static File classpathRoot = new File(System.getProperty("user.dir"));
    static File appDir = new File(classpathRoot,"/src/main/resources");

    // Batch Files
    static File allRunningDevices = new File(appDir, "androidresources/runningDevices.command");
    static File runningDevicesGrep = new File(appDir, "androidresources/runningDeviceId.command");


    @Rule public TestName name;

    @BeforeSuite
    public void before() throws Exception {

        startStopAppium.stopAllTerminals();
        startStopAppium = new StartStopAppium();

        System.out.println("port: " + port);
        System.out.println("genymotionVM: " + genymotionVM);
        System.out.println("deviceName: " + deviceModel);

        if (!genymotionVM.equals("")) {
            startStopAppium.startGenymotionVm(genymotionVM);
            Thread.sleep(20000);
        }
        startStopAppium.startAppium_test2(port);

    }

    @AfterSuite
    public void after() throws Exception {
        startStopAppium.stopAllTerminals();
    }

    @BeforeMethod(alwaysRun = true)
    public void startDriver() throws Exception {
        Thread.sleep(25000);
        instantiateDevice();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result){
        System.out.println(">>>>>>>>>Test Result Status:" + result.getStatus() + '\n');


        if (driver != null){
            try {
                driver.quit();
                driver = null;
            }
            catch(Exception e) {
                driver = null;
            }
        }
        else{
            System.out.println("driver = " + driver);
        }
    }
    public void instantiateDevice() throws IOException, InterruptedException {

        String deviceID = getRunningDeviceID(deviceModel);
        DesiredCapabilities capabilities = new DesiredCapabilities();

        try {
            if (driver == null) {
                File classpathRoot = new File(System.getProperty("user.dir"));
                File appDir = new File(classpathRoot, "/app");
                File app = new File(appDir, "<YOUR_APP>.apk");
                capabilities.setCapability("deviceName", "Android Emulator");
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
                capabilities.setCapability(CapabilityType.VERSION, "5.0.0");
                capabilities.setCapability(CapabilityType.PLATFORM, "MAC");
                capabilities.setCapability("autoWebview", true);
                capabilities.setCapability("app", app.getAbsolutePath());
                capabilities.setCapability("udid", deviceID);
                capabilities.setCapability("noSign", "true");
                capabilities.setCapability("fullReset", "true");
                capabilities.setCapability("appPackage", "com.picsart.studio");
                capabilities.setCapability("appActivity", "com.socialin.android.photo.picsinphoto.MainPagerActivity");
                driver = new AppiumDriver(new URL("http://127.0.0.1:" + port + "/wd/hub"), capabilities) {
                    public MobileElement scrollTo(String s) {
                        return null;
                    }

                    public MobileElement scrollToExact(String s) {
                        return null;
                    }
                };
                Thread.sleep(10000);
            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }





    public String getRunningDeviceID(String deviceModel) throws InterruptedException
    {
        String deviceId = null;

        String runningDevices;

        try {
            String[] cmd1 = {
                    allRunningDevices.getAbsolutePath()
            };
            Process p = Runtime.getRuntime().exec(cmd1);
            BufferedReader input1 = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((runningDevices = input1.readLine()) != null) {
                System.out.println(runningDevices);
            }
            input1.close();
        } catch (Exception e) {
        }

        String adbGrepOutput;


        try {
            String[] cmd2 = {
                    runningDevicesGrep.getAbsolutePath(),
                    " " + deviceModel
            };
            Process p = Runtime.getRuntime().exec(cmd2);
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((adbGrepOutput = input.readLine()) != null) {
                deviceId = adbGrepOutput.substring(0, adbGrepOutput.indexOf(" "));
                System.out.println(deviceId + " device is available for execution.");
            }
            input.close();
        } catch (Exception e) {
        }

        return deviceId;
    }
}
