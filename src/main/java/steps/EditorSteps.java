package steps;

import org.openqa.selenium.WebDriver;
import screens.DrawScreen;
import screens.HomeScreen;
import screens.layouts.DrawOptionLayout;

/**
 * Created by GeorgiKamoyan on 10/19/15.
 */
public class EditorSteps extends AbstractStep {
    HomeScreen homeScreen;
    DrawOptionLayout drawOptionLayout;
    DrawScreen drawScreen;

    public EditorSteps(WebDriver driver) {
        super(driver);
        drawScreen = new DrawScreen(driver);
        drawOptionLayout = new DrawOptionLayout(driver);
        homeScreen = new HomeScreen(driver);
    }

    public void  _go_to_editor_with_draw () {
        homeScreen.clickExploreTab();
        homeScreen.clickDrawMenuButton();
        drawOptionLayout.clickDrawOnBlankButton();
        drawScreen.clickSelectSizeDialogButton();
        utils.swipe();
        drawScreen.clickActionDoneButton();
        drawScreen.clickSaveDraftDialogOkButton();

    }
}
