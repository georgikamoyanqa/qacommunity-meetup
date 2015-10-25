package drivers;

import data.GridConfigData;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utils.StartStopAppium;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by GeorgiKamoyan on 10/19/15.
 */
public class QaCommunityDriver_ForGrid {


    public AppiumDriver driver;

    public WebDriverWait wait;

    // private String deviceModel;
    // private String eshutyun;


    protected StartStopAppium startStopAppium;
    protected GridConfigData gridConfigData;
    String version = null;
    int port = 0;

    static File classpathRoot = new File(System.getProperty("user.dir"));
    static File appDir = new File(classpathRoot, "/src/main/resources");

    // Batch Files
    static File allRunningDevices = new File(appDir, "androidresources/runningDevices.command");
    static File runningDevicesGrep = new File(appDir, "androidresources/runningDeviceId.command");

    static File startTerminal = new File(appDir, "androidresources/startTerminal.command");

    public List<Map> gridconfigList;

    @Rule
    public TestName name;


    @BeforeSuite
    public void before() throws Exception {

        startStopAppium = new StartStopAppium();
        startStopAppium.startGridHub();
        Thread.sleep(15000);
        gridconfigList = new ArrayList();
        gridconfigList = gridConfigData.readXmlData();

        // Running Appium Node on Grid.

        gridconfigList = new ArrayList();
        gridConfigData = new GridConfigData();
        gridconfigList = gridConfigData.readXmlData();

        String version = null;
        String port = null;
        String genyMotionVm = null;

        //Starting Appium Nodes. The Amount of Nodes to be started is based on the gridconfigList


        for (int i = 0; i < gridconfigList.size(); i++) {
            version = gridconfigList.get(i).get("NodeVersion").toString();
            port = gridconfigList.get(i).get("NodePort").toString();
            genyMotionVm = gridconfigList.get(i).get("GenymotionVm").toString();
            System.out.println("\nCreating Appium Node JSON file with port=" + port + " AND version=" + version);
            startStopAppium.createAppiumNodeFile(version, port);
            Thread.sleep(5000);
            System.out.println("Starting Appium Node on port=" + port);
            startStopAppium.startAppiumNodes(port);
            Thread.sleep(35000);
            startStopAppium.startGenymotionVm(genyMotionVm);
            Thread.sleep(20000);
        }

    }


    @AfterSuite
    public void after() throws Exception {

        startStopAppium.stopGridHub();
        startStopAppium.stopAllTerminals();

    }


    //String deviceModel="Samsung_Galaxy_S3___4_3___API_18___720x1280";

    @Parameters("DeviceModel")
    @BeforeMethod (alwaysRun = true)
    public void startAppium(String deviceModel) throws Exception {

        driver = null;

        startStopAppium = new StartStopAppium();
        gridconfigList = new ArrayList<Map>();
        gridConfigData = new GridConfigData();
        gridconfigList = gridConfigData.readXmlData();

        boolean deviceExist = false;

        // Running Instances

        for (int i = 0; i < gridconfigList.size(); i++) {

            if (gridconfigList.get(i).get("DeviceModel").equals(deviceModel)) {
                Thread.sleep(2000);
                String deviceId = getRunningDeviceID(deviceModel);
                Thread.sleep(2000);
                instantiateDevice2(version, deviceId);
                deviceExist = true;
                break;
            } else {
                Thread.sleep(17000);
            }
        }
        if (deviceExist == false) {
            System.out.print("Device Does not Exist in gridConfig.xml file: <" + deviceModel + ">");
        }

        Thread.sleep(15000);

    }
//    }

    @AfterMethod (alwaysRun = true)
    public void tearDown(ITestResult result) {

        System.out.println(">>>>>>>>>Result Status:" + result.getStatus() + '\n');

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
            System.out.println("Esle - driver = " + driver);
        }
    }


    public void instantiateDevice2(String version, String deviceUDID) throws IOException {

        DesiredCapabilities capabilities = new DesiredCapabilities();



        try {
            if (driver == null) {

                File classpathRoot = new File(System.getProperty("user.dir"));
                File appDir = new File(classpathRoot, "/app");
                File app = new File(appDir, "<YOUR_APP>.apk");
                capabilities.setCapability("deviceName", "Android Emulator");
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
                capabilities.setCapability(CapabilityType.VERSION, version);
                capabilities.setCapability(CapabilityType.PLATFORM, "MAC");
                capabilities.setCapability("autoWebview", true);
                capabilities.setCapability("app", app.getAbsolutePath());
                capabilities.setCapability("udid", deviceUDID);
                capabilities.setCapability("noSign", "true");
                capabilities.setCapability("fullReset", "true");
                capabilities.setCapability("appPackage", "com.picsart.studio");
                capabilities.setCapability("appActivity", "com.socialin.android.photo.picsinphoto.MainPagerActivity");
                driver = new AppiumDriver(new URL("http://127.0.0.1:" + "4444" + "/wd/hub"), capabilities) {
                    public MobileElement scrollTo(String s) {
                        return null;
                    }

                    public MobileElement scrollToExact(String s) {
                        return null;
                    }
                };

                Thread.sleep(2000);
                System.out.println("8. After Initiation - driver = " + driver);

            }
        } catch (Exception e) {
            System.out.print(e);
            System.out.println("9. Exception on Initiation - driver = " + driver);

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


