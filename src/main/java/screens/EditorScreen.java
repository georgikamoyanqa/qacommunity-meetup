package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by GeorgiKamoyan on 10/19/15.
 */
public class EditorScreen extends AbstractScreen {

    public EditorScreen(WebDriver driver) {
        super(driver);
    }

    //Editor screen elements

    static final By EFFECTS_BUTTON = By.id("com.picsart.studio:id/btn_effect");

    public void clickEffectsButton() {

        utils.click(EFFECTS_BUTTON);

    }

}