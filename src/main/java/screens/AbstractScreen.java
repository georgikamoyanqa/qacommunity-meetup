package screens;

import org.openqa.selenium.WebDriver;
import utils.CommonUtils;

/**
 * Created by GeorgiKamoyan on 10/19/15.
 */
public class AbstractScreen {

    protected WebDriver driver;
    protected CommonUtils utils;
    public AbstractScreen(WebDriver driver) {
        this.driver = driver;
        this.utils = new CommonUtils(driver);
    }
}
