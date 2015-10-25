package utils;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;


/**
 * Created by GeorgiKamoyan on 10/19/15.
 */
public class StartStopAppium {

    static File classpathRoot = new File(System.getProperty("user.dir"));
    static File appDir = new File(classpathRoot,"/src/main/resources");
    // Files Files
    static File startAppium_test = new File(appDir, "androidresources/startAppium_test.command");
    static File startTerminal = new File(appDir, "androidresources/startTerminal.command");
    static File startGenymotionVm = new File(appDir, "androidresources/startGenymotionVm.command");
    //Grid Server
    static File gridHub = new File(appDir, "androidresources/selenium-server-standalone-2.45.0.jar");
    //JSON file
    static File appiumNodeJson = new File(appDir, "androidresources/appiumNode.json");

    //Batch Files
    static File startAppiumNode = new File(appDir, "androidresources/startAppiumNode.command");
    static File stopAllTerminals = new File(appDir, "androidresources/stopAllTerminals.command");


    public void startAppium_test2(String port) throws Exception {

        try {

            String[] cmd2 = {
                    startTerminal.getAbsolutePath(),
                    startAppium_test.getAbsolutePath() + " " + port
                    //            startAppiumNode.getAbsolutePath() + " " + portNumber + " " + appiumNodeJson.getAbsolutePath()
            };
            Process p = Runtime.getRuntime().exec(cmd2);
            System.out.println("\nAppium Node Requested To Start On Port: " + port);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    };

    public void startGenymotionVm(String virtualDevice) throws Exception {

        try {

            String[] cmd = {
                    startTerminal.getAbsolutePath(),
                    startGenymotionVm.getAbsolutePath() + " '" + virtualDevice + "'"
            };
            Process p = Runtime.getRuntime().exec(cmd);
            System.out.println("\nStarting Genymotion Virtual Machine: " + virtualDevice);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    };

    public void startGridHub() throws Exception {

        try {
            String[] startGrid = {
                    startTerminal.getAbsolutePath(),
                    "java -jar " + gridHub.getAbsolutePath() + " -role hub"
            };
            System.out.println("\nStarting Grid HUB On Default Port");
            Process p = Runtime.getRuntime().exec(startGrid);
        } catch (IOException e) {
            e.printStackTrace();
        }
    };


    public void createAppiumNodeFile(String version, String port) throws Exception {

        //read Json File
        FileReader reader = new FileReader(appiumNodeJson.getAbsolutePath());

        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

        try {
            // get an array from the JSON object
            JSONArray capabilities = (JSONArray) jsonObject.get("capabilities");

            Iterator i = capabilities.iterator();

            // set "versin"
            JSONObject innerObj = (JSONObject) i.next();
            innerObj.put("version", version);

            //set "port"
            JSONObject configuration = (JSONObject) jsonObject.get("configuration");
            configuration.put("port", port);
            configuration.put("url", "http://127.0.0.1:" + port + "/wd/hub");

        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }

        try {

            // Writing to a file
            File file=new File(appiumNodeJson.getAbsolutePath());
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            System.out.println("Writing JSON object to file" + "\n-----------------------\n" + jsonObject);

            fileWriter.write(jsonObject.toJSONString());
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    };

    public void startAppiumNodes(String portNumber) throws Exception {

        try {

            String[] cmd2 = {
                    startTerminal.getAbsolutePath(),
                    startAppiumNode.getAbsolutePath() + " " + portNumber + " " + appiumNodeJson.getAbsolutePath()
            };
            Process p = Runtime.getRuntime().exec(cmd2);
            System.out.println("\nAppium Node Requested To Start On Port: " + portNumber);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    };



    public void stopGridHub() throws Exception {

        try {
            System.out.println("\nStopping Grid HUB");
            Process p = Runtime.getRuntime().exec("curl http://localhost:4444/lifecycle-manager?action=shutdown");
        } catch (IOException e) {
            e.printStackTrace();
        }
    };



    public void stopAllTerminals() throws Exception {

        try {
            System.out.println("\nStopping All Terminals on MAC");

            Process p = Runtime.getRuntime().exec(stopAllTerminals.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    };




}
