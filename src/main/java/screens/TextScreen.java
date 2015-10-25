package screens;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by GeorgiKamoyan on 10/19/15.
 */
public class TextScreen extends AbstractScreen {
    public TextScreen(WebDriver driver) {
        super(driver);
    }

    public static String Default_text = "Preview text";

    static final By APPLY_TEXT = By.name("Done");
    static final By TEXT_FIELD = By.id("com.picsart.studio:id/preview");

    public void clickApplyTextButton() {

        utils.click(APPLY_TEXT);

    }

    public void setText(String text) {

        utils.type(TEXT_FIELD, text);

    }
}
