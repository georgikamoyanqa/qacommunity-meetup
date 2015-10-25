package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by GeorgiKamoyan on 10/19/15.
 */
public class HomeScreen extends AbstractScreen {

    public HomeScreen(WebDriver driver) {
        super(driver);
    }

    //Home Menu Elements
    static final By EFFECTS = By.id("com.picsart.studio:id/start_fx_id");
    static final By DRAW = By.id("com.picsart.studio:id/start_draw_id");
    static final By WHATS_NEW_SKIP_BUTTON = By.id("com.picsart.studio:id/welcome_picsart_skipButton");
    static final By EXPLORE_TAB = By.id("com.picsart.studio:id/tab_explore_id");
    static final By GRID_ITEMS = By.id("com.picsart.studio:id/studio_grid");

    public void clickExploreTab() {

        utils.click(EXPLORE_TAB);

    }


    public void clickEffectsMenuButton() {

        utils.click(EFFECTS);

    }

    public void clickDrawMenuButton() {

        utils.click(DRAW);

    }


    public void clickWhatsNewCloseButton() {

        if (isWelcomeTourPresent()) {
            utils.click(WHATS_NEW_SKIP_BUTTON);
        } else {
            System.out.println("There is no WHATS NEW screen!");
        }

    }



    public boolean isWelcomeTourPresent() {
        return utils.isElementPresent(WHATS_NEW_SKIP_BUTTON);
    }


    public boolean isExplorePresent() {
        return utils.isElementPresent(GRID_ITEMS);
    }

}
