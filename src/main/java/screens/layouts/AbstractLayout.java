package screens.layouts;

import org.openqa.selenium.WebDriver;
import utils.CommonUtils;

/**
 * Created by GeorgiKamoyan on 10/19/15.
 */
public class AbstractLayout {

    protected WebDriver driver;
    protected CommonUtils utils;
    public AbstractLayout(WebDriver driver) {
        this.driver = driver;
        this.utils = new CommonUtils(driver);
    }
}
