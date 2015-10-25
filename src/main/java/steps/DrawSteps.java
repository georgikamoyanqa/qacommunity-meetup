package steps;

import org.openqa.selenium.WebDriver;
import screens.DrawScreen;
import screens.TextScreen;

/**
 * Created by GeorgiKamoyan on 10/19/15.
 */
public class DrawSteps extends AbstractStep {

    DrawScreen drawScreen;
    TextScreen textScreen;

    public DrawSteps(WebDriver driver) {
        super(driver);

        drawScreen = new DrawScreen(driver);
        textScreen = new TextScreen(driver);
    }


    public void _swipeText(){

        drawScreen.clickAddTextButton();
        textScreen.setText("QA COMMUNITY ROCKS!!!");
        textScreen.clickApplyTextButton();
        utils.waitForElementPresent(drawScreen.BOTTOM_PANEL);
        utils.swipeText();
        //((AppiumDriver) driver).swipe(540, 400, 540, 450, 800);
    }



    public void swipe_i(int i){
        utils.swipe_i2(i);
    }







}
