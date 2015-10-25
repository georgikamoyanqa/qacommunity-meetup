package screens.layouts;

import screens.layouts.AbstractLayout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by GeorgiKamoyan on 10/19/15.
 */
public class DrawOptionLayout extends AbstractLayout {
    public DrawOptionLayout(WebDriver driver) {
        super(driver);
    }
    //Draw dialog
    static final By DRAW_ON_BLANK = By.id("com.picsart.studio:id/draw_blank_image_button");

    public void clickDrawOnBlankButton() {

        utils.click(DRAW_ON_BLANK);

    }
}
