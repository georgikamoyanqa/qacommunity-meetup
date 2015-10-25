import drivers.QaCommunityDriver;
import drivers.QaCommunityDriver_ForGrid;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import screens.DrawScreen;
import screens.HomeScreen;
import screens.layouts.DrawCloseLayout;
import screens.layouts.DrawOptionLayout;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * Created by GeorgiKamoyan on 10/19/15.
 */

public class FirstTest extends QaCommunityDriver_ForGrid{

    HomeScreen homeScreen;
    DrawOptionLayout drawOptionLayout;
    DrawCloseLayout drawCloseLayout;
    DrawScreen drawScreen;

    @Test
    public void faceTest() throws IOException {

        homeScreen = new HomeScreen(driver);
        drawOptionLayout = new DrawOptionLayout(driver);
        drawScreen = new DrawScreen(driver);
        drawCloseLayout = new DrawCloseLayout(driver);

        homeScreen.clickExploreTab();
        homeScreen.clickDrawMenuButton();
        drawOptionLayout.clickDrawOnBlankButton();
        drawScreen.clickSelectSizeDialogButton();
        drawScreen.drawFace();
        drawScreen.clickCancelButton();
        drawCloseLayout.clickOkButton();
        assertTrue("It's not Draw Screen", homeScreen.isExplorePresent());

    }




}
