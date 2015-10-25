package screens.layouts;

import screens.layouts.AbstractLayout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by GeorgiKamoyan on 10/19/15.
 */
public class DrawCloseLayout extends AbstractLayout {

    public DrawCloseLayout(WebDriver driver) {
        super(driver);
    }
    static final By OK_BUTTON = By.id("com.picsart.studio:id/button_okId");

    public void clickOkButton ()
    {
        utils.click(OK_BUTTON);

    }
}
