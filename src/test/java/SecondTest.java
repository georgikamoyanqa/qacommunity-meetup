import drivers.QaCommunityDriver;
import drivers.QaCommunityDriver_ForGrid;
import org.testng.annotations.Test;
import screens.*;
import screens.layouts.DrawCloseLayout;
import screens.layouts.DrawOptionLayout;
import steps.DrawSteps;
import steps.EditorSteps;
import steps.EffectsSteps;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * Created by GeorgiKamoyan on 10/19/15.
 */

public class SecondTest extends QaCommunityDriver_ForGrid{

    EffectsSteps effectsSteps;
    HomeScreen homeScreen;
    DrawScreen drawScreen;
    DrawSteps drawSteps;

    @Test
    public void owlTest() throws InterruptedException {
        effectsSteps = new EffectsSteps(driver);

        effectsSteps._go_to_Effects_via_flickr();
        effectsSteps._choose_popart_category_from_effects();
        effectsSteps._choose_colorgradient_effect();
        Thread.sleep(5000);
    }

    @Test
    public void houseTest() throws InterruptedException {
        homeScreen = new HomeScreen(driver);
        drawScreen = new DrawScreen(driver);
        drawSteps = new DrawSteps(driver);

        homeScreen.clickExploreTab();
        homeScreen.clickWhatsNewCloseButton();
        homeScreen.clickDrawMenuButton();
        drawScreen.clickDrawOnBlankButton();
        drawScreen.clickSelectSizeDialogButton();
        drawScreen.drawHouse();
        Thread.sleep(5000);
    }
}
