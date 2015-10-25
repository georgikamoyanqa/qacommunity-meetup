package steps;

import org.openqa.selenium.WebDriver;
import utils.CommonUtils;

/**
 * Created by GeorgiKamoyan on 10/19/15.
 */
public class AbstractStep {

    protected WebDriver driver;

    protected CommonUtils utils;

    public AbstractStep(WebDriver driver) {
        this.driver = driver;
        this.utils = new CommonUtils(driver);
    }

}
