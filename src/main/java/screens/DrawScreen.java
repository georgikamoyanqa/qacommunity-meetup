package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by GeorgiKamoyan on 10/19/15.
 */
public class DrawScreen extends AbstractScreen {
    public DrawScreen(WebDriver driver) {
        super(driver);
    }

    static final By CANCEL_BUTTON = By.id("com.picsart.studio:id/btn_action_cancel");
    static final By ACTION_DONE_BUTTON = By.id("com.picsart.studio:id/btn_action_done");
    static final By SELECT_SIZE_DIALOG_OK_BUTTON = By.id("com.picsart.studio:id/ok");
    static final By ADD_TEXT_BUTTON = By.id("com.picsart.studio:id/btn_add_text");
    static final public By BOTTOM_PANEL = By.id("com.picsart.studio:id/panel_bottom");

    static final By SAVE_DRAFT_OK_BUTTON = By.id("com.picsart.studio:id/button_okId");

    //Draw dialog
    static final By DRAW_ON_BLANK = By.id("com.picsart.studio:id/draw_blank_image_button");

    public void clickAddTextButton() {

        utils.click(ADD_TEXT_BUTTON);

    }


    public void clickCancelButton() {

        utils.click(CANCEL_BUTTON);

    }

    public void clickActionDoneButton() {

        utils.click(ACTION_DONE_BUTTON);

    }

    public void clickDrawOnBlankButton() {

        utils.click(DRAW_ON_BLANK);

    }

    public void clickSelectSizeDialogButton() {

        utils.click(SELECT_SIZE_DIALOG_OK_BUTTON);

    }

    public void clickSaveDraftDialogOkButton() {

      //  utils.waitForElementPresent(SAVE_DRAFT_OK_BUTTON);
        utils.click(SAVE_DRAFT_OK_BUTTON);

    }


    public void drawHouse() throws InterruptedException {

        utils.drawHouse();
    }

    public void drawFace() {

        utils.drawFace();
    }

}
