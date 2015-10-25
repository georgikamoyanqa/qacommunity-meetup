package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by GeorgiKamoyan on 10/19/15.
 */
public class ChoosePicScreen extends AbstractScreen {
    public ChoosePicScreen(WebDriver driver) {
        super(driver);
    }

    //Choose pic screen elements

    static final By FLICKR_LAYOUT = By.id("com.picsart.studio:id/flickrLayoutId");

    public void clickFlickrButton() {

        utils.click(FLICKR_LAYOUT);

    }




}
