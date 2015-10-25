package data;

/**
 * Created by GeorgiKamoyan on 8/30/15.
 */

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GridConfigData {

        static File classpathRoot = new File(System.getProperty("user.dir"));
        static File appDir = new File(classpathRoot,"/src/main/resources");

        //Grid Server
        static File gridConfigFile = new File(appDir, "androidresources/gridConfig.xml");


        Map deviceAndAppiumNodeMap;
        List<Map> giridconfigList = new ArrayList();

        public List<Map> readXmlData() {


            try {

                File fXmlFile = new File(gridConfigFile.getAbsolutePath());
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(fXmlFile);

                doc.getDocumentElement().normalize();

                NodeList nList = doc.getElementsByTagName("deviceModel");

                for (int temp = 0; temp < nList.getLength(); temp++) {

                    Node nNode = nList.item(temp);

                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                        Element eElement = (Element) nNode;

                        deviceAndAppiumNodeMap = new HashMap();

                        deviceAndAppiumNodeMap.put("DeviceModel",eElement.getAttribute("name"));
                        deviceAndAppiumNodeMap.put("NodeVersion",eElement.getElementsByTagName("appiumNodeVersion").item(0).getTextContent());
                        deviceAndAppiumNodeMap.put("NodePort",eElement.getElementsByTagName("appiumNodePort").item(0).getTextContent());
                        deviceAndAppiumNodeMap.put("GenymotionVm",eElement.getElementsByTagName("genymotionVm").item(0).getTextContent());
                    }

                    giridconfigList.add(deviceAndAppiumNodeMap);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            return giridconfigList;
        }

}