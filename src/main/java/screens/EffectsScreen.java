package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AYER on 4/15/14.
 */
public class EffectsScreen extends AbstractScreen {
    public EffectsScreen(WebDriver driver) {
        super(driver);
    }

    static final By APPLY_BUTTON = By.id("com.picsart.studio:id/button_apply");
    static final By BLUR_BUTTON = By.name("Blur");
    static final By ARTISTIC_BUTTON = By.name("Artistic");
    static final By POPART_BUTTON = By.name("Pop Art");
    static final By PAPER_BUTTON = By.name("Paper");
    static final By DISTORT_BUTTON = By.name("Distort");
    static final By COLORS_BUTTON = By.name("Colors");
    static final By CORRECTIONS_BUTTON = By.name("Corrections");

    static final String EFFECT_LIGHT_CROSS = "Light Cross";
    static final String EFFECT_NONE = "None";
    static final String EFFECT_DODGER = "Dodger";
    static final String EFFECT_CINERAMA = "Cinerama";
    static final String EFFECT_TWILIGHT = "Twilight";
    static final String EFFECT_FILM = "Film";
    static final String EFFECT_FILM_B_AND_W = "Film B&W";
    static final String EFFECT_CROSS_PROCESS = "Cross Proc 1";
    static final String EFFECT_CROSS_PROCESS_2 = "Cross Proc 2";
    static final String EFFECT_WARM_COLOR = "Warm Color";
    static final String EFFECT_WARM_AMBER = "Warm Amber";
    static final String EFFECT_ORTON = "Orton";
    static final String EFFECT_LOMO = "Lomo";
    static final String EFFECT_VINTAGE_IVORY = "VintageIvory";
    static final String EFFECT_VINTAGE = "Vintage";
    static final String EFFECT_VIGNETTE = "Vignette";
    static final String EFFECT_B_W = "B&W";
    static final String EFFECT_B_W_CROSS = "B&W Cross";
    static final String EFFECT_B_W_VINTAGE = "B&W Vintage";
    static final String EFFECT_B_W_BLUR = "B&W Blur";
    static final String EFFECT_B_W_HDR = "B&W HDR";
    static final String EFFECT_B_W_LOWCON = "B&W LowCon";
    static final String EFFECT_B_W_HICON = "B&W HiCon";
    static final String EFFECT_SEPIA = "Sepia";
    static final String EFFECT_HDR_1 = "HDR 1";
    static final String EFFECT_HDR_2 = "HDR 2";
    static final String EFFECT_SHARPEN = "Sharpen";
    static final String EFFECT_POPART_POPART2 = "PopArt2";
    static final String EFFECT_SEAFOAM = "Seafoam";
    static final String EFFECT_DRAMA = "Drama";
    static final String EFFECT_VIBRANT = "Vibrant";
    static final String EFFECT_RETRO = "Retro";
    static final String EFFECT_BLUR = "Blur";
    static final String EFFECT_LENSBLUR = "Lens blur";
    static final String EFFECT_SMARTBLUR = "Smart Blur";
    static final String EFFECT_MOTIONBLUR = "Motion blur";
    static final String EFFECT_ZOOMBLUR = "Zoom Blur";
    static final String EFFECT_RADIALBLUR = "Radial Blur";
    static final String EFFECT_POLYGON = "Polygon";
    static final String EFFECT_POSTER = "Poster";
    static final String EFFECT_HALFTONEDOTS = "Halftone Dots";
    static final String EFFECT_MOTION = "Motion";
    static final String EFFECT_SHEAR = "Shear";
    static final String EFFECT_PASTEL = "Pastel";
    static final String EFFECT_COMIC = "Comic";
    static final String EFFECT_GOUACHE = "Gouache";
    static final String EFFECT_OLD_PAPER = "Old Paper";
    static final String EFFECT_NEON = "Neon";
    static final String EFFECT_WATERCOLOR = "Watercolor";
    static final String EFFECT_SKETCHER = "Sketcher";
    static final String EFFECT_CONTOUR = "Contour";
    static final String EFFECT_PENCIL = "Pencil";
    static final String EFFECT_OIL = "Oil";
    static final String EFFECT_CARTOONIZER = "Cartoonizer";
    static final String EFFECT_SKETCHER2 = "Sketcher 2";
    static final String EFFECT_SKETCHER3 = "Sketcher 3";
    static final String EFFECT_FATTAL1 = "Fattal 1";
    static final String EFFECT_FATTAL2 = "Fattal 2";
    static final String EFFECT_EMBOSS = "Emboss";
    static final String EFFECT_COLORGRADIENT = "Color gradient";
    static final String EFFECT_HOLGA1 = "Holga 1";
    static final String EFFECT_HOLGA2 = "Holga 2";
    static final String EFFECT_COLOR1 = "Color 1";
    static final String EFFECT_COLOR2 = "Color 2";
    static final String EFFECT_COLOR3 = "Color 3";
    static final String EFFECT_COLOR4 = "Color 4";
    static final String EFFECT_POPARTCOLORS = "PopArt Colors";
    static final String EFFECT_POPART1 = "PopArt 1";
    static final String EFFECT_POPART2 = "PopArt 2";
    static final String EFFECT_STENCILER1 = "Stenciler 1";
    static final String EFFECT_STENCILER2 = "Stenciler 2";
    static final String EFFECT_STENCILER3 = "Stenciler 3";
    static final String EFFECT_STENCILER4 = "Stenciler 4";
    static final String EFFECT_STENCILER5 = "Stenciler 5";
    static final String EFFECT_STENCILER6 = "Stenciler 6";
    static final String EFFECT_STENCILER7 = "Stenciler 7";
    static final String EFFECT_STENCILER8 = "Stenciler 8";
    static final String EFFECT_MIRROR = "Mirror";
    static final String EFFECT_PIXELIZE = "Pixelize";
    static final String EFFECT_CARICATURE = "Caricature";
    static final String EFFECT_FISHEYE = "Fish Eye";
    static final String EFFECT_SWIRLED = "Swirled";
    static final String EFFECT_CYLINDERMIRROR = "Cylinder Mirror";
    static final String EFFECT_BATHROOM1 = "Bathroom 1";
    static final String EFFECT_BAATHROOM2 = "Bathroom 2";
    static final String EFFECT_WATER = "Water";
    static final String EFFECT_COLORSPLASH = "Color Splash";
    static final String EFFECT_COLORREPLACE = "Color Replace";
    static final String EFFECT_COLORIZE = "Colorize";
    static final String EFFECT_HUE = "Hue";
    static final String EFFECT_BLACKANDWHITE = "Black & White";
    static final String EFFECT_NEGATIVE = "Negative";
    static final String EFFECT_SOLARIZATION = "Solarization";
    static final String EFFECT_INVERT = "Invert";
    static final String EFFECT_SATURATION = "Saturation";
    static final String EFFECT_BRIGHTNESS = "Brightness";
    static final String EFFECT_CONTRAST = "Contrast";
    static final String EFFECT_CLONE = "Clone";
    static final String EFFECT_REDEYE = "Red Eye";
    static final String EFFECT_COLOREYE = "Color Eye";
    static final String EFFECT_BLEMISHFIX = "Blemish Fix";
    static final String EFFECT_FACEFIX = "Face Fix";
    static final String EFFECT_SUNTAN = "Suntan";
    static final String EFFECT_TEETHWHITENER = "Teeth Whitener";
    static final String EFFECT_CRISP = "Crisp";

    public final String EACH_EFFECT_XPATH = "//*[@text='?' and @resource-id='com.picsart.studio:id/adapter_text_id']";
    public final By EACH_EFFECT_ID = By.xpath("//*[@resource-id='com.picsart.studio:id/adapter_text_id']");
    public final By EFFECTS_RECYCLER = By.xpath("//*[@resource-id='com.picsart.studio:id/effects_thumbs_recycler_view']");

    public boolean scroll(String effectName) throws InterruptedException {

        String lastEffectNameBeforeSwipe = null;
        String lastEffectNameAfterSwipe = null;
     do {
    if (isEffectNamePresentFast((effectName))) {
        clickEffectName(effectName);
        return true;
    } else {
        lastEffectNameBeforeSwipe = getLastEffectName();
        swipeEffectsRecycler();
        lastEffectNameAfterSwipe = getLastEffectName();
    }
     }while (!(lastEffectNameAfterSwipe.equals(lastEffectNameBeforeSwipe)));
        System.out.println("EFFECT NAME <"+effectName+"> IS NOT FOUND!");
        return false;
    }

    public void clickEffectName(String effectName) {
        utils.click(By.xpath(EACH_EFFECT_XPATH.toString().replace("?", effectName)));
    }

    public boolean isEffectNamePresentFast(String effectName) {
        return utils.isElementPresentFast(By.xpath(EACH_EFFECT_XPATH.toString().replace("?", effectName)));
    }

    public String getLastEffectName() {
        return utils.getLastElement(EACH_EFFECT_ID).getText();
    }

    public void swipeEffectsRecycler(){
        try {
            utils.horizontalSwipeByRecyclerSize(EFFECTS_RECYCLER);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void chooseBlurCategoryfromEffects() {

        utils.click(BLUR_BUTTON);

    }

    public void chooseArtisticCategoryfromEffects() {

        utils.click(ARTISTIC_BUTTON);

    }

    public void choosePopArtCategoryfromEffects() {

        utils.click(POPART_BUTTON);

    }

    public void choosePaperCategoryfromEffects() {

        utils.click(PAPER_BUTTON);
    }

    public void chooseDistortCategoryfromEffects() {

        utils.click(DISTORT_BUTTON);

    }

    public void chooseColorCategoryfromEffects() {

        utils.click(COLORS_BUTTON);
    }

    public void chooseCorrectionsCategoryfromEffects() {

        utils.click(CORRECTIONS_BUTTON);
    }

    public void chooseCloneEffect() throws InterruptedException {

        scroll(EFFECT_CLONE);
    }

    public void chooseRedEyeEffect() throws InterruptedException {

        scroll(EFFECT_REDEYE);
    }

    public void chooseColorEyeEffect() throws InterruptedException {

        scroll(EFFECT_COLOREYE);
        //utils.click(By.name(EFFECT_COLOREYE));
    }

    public void chooseBlemishFixEffect() throws InterruptedException {

        scroll(EFFECT_BLEMISHFIX);
        //utils.click(By.name(EFFECT_BLEMISHFIX));
    }

    public void chooseFaceFixEffect() throws InterruptedException {

        scroll(EFFECT_FACEFIX);
        //utils.click(By.name(EFFECT_FACEFIX));
    }

    public void chooseSuntanEffect() throws InterruptedException {

        scroll(EFFECT_SUNTAN);
        //utils.click(By.name(EFFECT_SUNTAN));
    }

    public void chooseTeethWhitenerEffect() throws InterruptedException {

        scroll(EFFECT_TEETHWHITENER);
        //utils.click(By.name(EFFECT_TEETHWHITENER));
    }

    public void chooseColorSplashEffect() throws InterruptedException {

        scroll(EFFECT_COLORSPLASH);

    }

    public void chooseColorReplaceEffect() throws InterruptedException {

        scroll(EFFECT_COLORREPLACE);
    }

    public void chooseColorizeEffect() throws InterruptedException {

        scroll(EFFECT_COLORIZE);

    }

    public void chooseHueEffect() throws InterruptedException {

        scroll(EFFECT_HUE);
        //utils.click(By.name(EFFECT_HUE));

    }

    public void chooseBlackandWhiteEffect() throws InterruptedException {

        scroll(EFFECT_BLACKANDWHITE);
        //utils.click(By.name(EFFECT_BLACKANDWHITE));

    }

    public void chooseNegativeEffect() throws InterruptedException {

        scroll(EFFECT_NEGATIVE);
        //utils.click(By.name(EFFECT_NEGATIVE));

    }

    public void chooseSolarizationEffect() throws InterruptedException {

        scroll(EFFECT_SOLARIZATION);
        //utils.click(By.name(EFFECT_SOLARIZATION));

    }

    public void chooseInvertEffect() throws InterruptedException {

        scroll(EFFECT_INVERT);
        //utils.click(By.name(EFFECT_INVERT));

    }

    public void chooseSaturationEffect() throws InterruptedException {

        scroll(EFFECT_SATURATION);
        //utils.click(By.name(EFFECT_SATURATION));

    }

    public void chooseBrightnessEffect() throws InterruptedException {

        scroll(EFFECT_BRIGHTNESS);
        //utils.click(By.name(EFFECT_BRIGHTNESS));

    }

    public void chooseContrastEffect() throws InterruptedException {

        scroll(EFFECT_CONTRAST);
        //utils.click(By.name(EFFECT_CONTRAST));

    }

    public void chooseMirrorEffect() throws InterruptedException {

        scroll(EFFECT_MIRROR);

    }

    public void choosePixelizeEffect() throws InterruptedException {

        scroll(EFFECT_PIXELIZE);

    }

    public void chooseCaricatureEffect() throws InterruptedException {

        scroll(EFFECT_CARICATURE);

    }

    public void chooseFishEyeEffect() throws InterruptedException {

        scroll(EFFECT_FISHEYE);
        //utils.click(By.name(EFFECT_FISHEYE));
    }

    public void chooseSwirledEffect() throws InterruptedException {

        scroll(EFFECT_SWIRLED);
        //utils.click(By.name(EFFECT_SWIRLED));
    }

    public void chooseCylinderMirrorEffect() throws InterruptedException {

        scroll(EFFECT_CYLINDERMIRROR);
        //utils.click(By.name(EFFECT_CYLINDERMIRROR));

    }

    public void chooseBathroom1Effect() throws InterruptedException {

        scroll(EFFECT_BATHROOM1);
        //utils.click(By.name(EFFECT_BATHROOM1));

    }

    public void chooseBathroom2Effect() throws InterruptedException {

        scroll(EFFECT_BAATHROOM2);
        //utils.click(By.name(EFFECT_BAATHROOM2));

    }

    public void chooseWaterEffect() throws InterruptedException {

        scroll(EFFECT_WATER);
        //utils.click(By.name(EFFECT_WATER));

    }

    public void chooseStenciler1Effect() throws InterruptedException {

        scroll(EFFECT_STENCILER1);

    }

    public void chooseStenciler2Effect() throws InterruptedException {

        scroll(EFFECT_STENCILER2);

    }

    public void chooseStenciler3Effect() throws InterruptedException {

        scroll(EFFECT_STENCILER3);

    }

    public void chooseStenciler4Effect() throws InterruptedException {

        scroll(EFFECT_STENCILER4);
        //utils.click(By.name(EFFECT_STENCILER4));

    }

    public void chooseStenciler5Effect() throws InterruptedException {

        scroll(EFFECT_STENCILER5);
        //utils.click(By.name(EFFECT_STENCILER5));
    }

    public void chooseStenciler6Effect() throws InterruptedException {

        scroll(EFFECT_STENCILER6);
        //utils.click(By.name(EFFECT_STENCILER6));
    }

    public void chooseStenciler7Effect() throws InterruptedException {

        scroll(EFFECT_STENCILER7);
        //utils.click(By.name(EFFECT_STENCILER7));
    }

    public void chooseStenciler8Effect() throws InterruptedException {

        scroll(EFFECT_STENCILER8);
        //utils.click(By.name(EFFECT_STENCILER8));
    }


    public void chooseColorGradientEffect() throws InterruptedException {

        scroll(EFFECT_COLORGRADIENT);
    }

    public void chooseHolga1Effect() throws InterruptedException {

        scroll(EFFECT_HOLGA1);
        //utils.click(By.name(EFFECT_HOLGA1));
    }

    public void chooseHolga2Effect() throws InterruptedException {

        scroll(EFFECT_HOLGA2);
    }

    public void chooseColor1Effect() throws InterruptedException {

        scroll(EFFECT_COLOR1);
        //utils.click(By.name(EFFECT_COLOR1));
    }

    public void chooseColor2Effect() throws InterruptedException {

        scroll(EFFECT_COLOR2);
        //utils.click(By.name(EFFECT_COLOR2));
    }

    public void chooseColor3Effect() throws InterruptedException {

        scroll(EFFECT_COLOR3);
        //utils.click(By.name(EFFECT_COLOR3));
    }

    public void chooseColor4Effect() throws InterruptedException {

        scroll(EFFECT_COLOR4);
        //utils.click(By.name(EFFECT_COLOR4));
    }

    public void choosePopArtColorsEffect() throws InterruptedException {

        scroll(EFFECT_POPARTCOLORS);
        //utils.click(By.name(EFFECT_POPARTCOLORS));
    }

    public void choosePopArt1Effect() throws InterruptedException {

        scroll(EFFECT_POPART1);
        //utils.click(By.name(EFFECT_POPART1));
    }

    public void choosePopArt2Effect() throws InterruptedException {

        scroll(EFFECT_POPART2);
        //utils.click(By.name(EFFECT_POPART2));
    }

    public void chooseBlurEffect() throws InterruptedException {

        scroll(EFFECT_BLUR);

    }

    public void chooseLensblurEffect() throws InterruptedException {

        scroll(EFFECT_LENSBLUR);
    }

    public void chooseSmartBlurEffect() throws InterruptedException {

        scroll(EFFECT_SMARTBLUR);
        //utils.click(By.name(EFFECT_SMARTBLUR));
    }

    public void chooseMotionBlurEffect() throws InterruptedException {

        scroll(EFFECT_MOTIONBLUR);
        //utils.click(By.name(EFFECT_MOTIONBLUR));
    }

    public void chooseZoomBlurEffect() throws InterruptedException {

        scroll(EFFECT_ZOOMBLUR);
        //utils.click(By.name(EFFECT_ZOOMBLUR));
    }

    public void chooseRadialBlurEffect() throws InterruptedException {

        scroll(EFFECT_RADIALBLUR);
        //utils.click(By.name(EFFECT_RADIALBLUR));
    }

    public void choosePolygonEffect() throws InterruptedException {

        scroll(EFFECT_POLYGON);
        //utils.click(By.name(EFFECT_POLYGON));
    }

    public void choosePosterEffect() throws InterruptedException {

        scroll(EFFECT_POSTER);

    }

    public void chooseHalftoneDotsEffect() throws InterruptedException {

        scroll(EFFECT_HALFTONEDOTS);
        //utils.click(By.name(EFFECT_HALFTONEDOTS));
    }

    public void chooseMotionEffect() throws InterruptedException {

        scroll(EFFECT_MOTION);
        //utils.click(By.name(EFFECT_MOTION));
    }

    public void chooseShearEffect() throws InterruptedException {

        scroll(EFFECT_SHEAR);
        //utils.click(By.name(EFFECT_SHEAR));
    }

    public void choosePastelEffect() throws InterruptedException {

        scroll(EFFECT_PASTEL);
        //utils.click(By.name(EFFECT_PASTEL));

    }

    public void chooseComicEffect() throws InterruptedException {

        scroll(EFFECT_COMIC);
        //utils.click(By.name(EFFECT_COMIC));
    }

    public void chooseGouacheEffect() throws InterruptedException {

        scroll(EFFECT_GOUACHE);
        //utils.click(By.name(EFFECT_GOUACHE));
    }

    public  void chooseOldPaperEffect() throws InterruptedException {

        scroll(EFFECT_OLD_PAPER);
        //utils.click(By.name(EFFECT_OLD_PAPER));
    }

    public void chooseNeonEffect() throws InterruptedException {

        scroll(EFFECT_NEON);
        //utils.click(By.name(EFFECT_NEON));
    }

    public void chooseWaterColorEffect() throws InterruptedException {

        scroll(EFFECT_WATERCOLOR);
        //utils.click(By.name(EFFECT_WATERCOLOR));
    }

    public void chooseSketcherEffect() throws InterruptedException {

        scroll(EFFECT_SKETCHER);
        //utils.click(By.name(EFFECT_SKETCHER));
    }

    public void chooseContourEffect() throws InterruptedException {

        scroll(EFFECT_CONTOUR);
        //utils.click(By.name(EFFECT_CONTOUR));
    }

    public void choosePencilEffect() throws InterruptedException {

        scroll(EFFECT_PENCIL);
        //utils.click(By.name(EFFECT_PENCIL));
    }

    public void chooseOilEffect() throws InterruptedException {

        scroll(EFFECT_OIL);
        //utils.click(By.name(EFFECT_OIL));
    }

    public void chooseCartoonizerEffect() throws InterruptedException {

        scroll(EFFECT_CARTOONIZER);
        //utils.click(By.name(EFFECT_CARTOONIZER));
    }

    public void chooseSketcher2_Effect() throws InterruptedException {

        scroll(EFFECT_SKETCHER2);
        //utils.click(By.name(EFFECT_SKETCHER2));
    }

    public void chooseSketcher3Effect() throws InterruptedException {

        scroll(EFFECT_SKETCHER3);
        //utils.click(By.name(EFFECT_SKETCHER3));
    }

    public void chooseFattal1Effect() throws InterruptedException {

        scroll(EFFECT_FATTAL1);
        //utils.click(By.name(EFFECT_FATTAL1));
    }

    public void chooseFattal2Effect() throws InterruptedException {

        scroll(EFFECT_FATTAL2);
        //utils.click(By.name(EFFECT_FATTAL2));
    }

    public void chooseEmbossEffect() throws InterruptedException {

        scroll(EFFECT_EMBOSS);
        //utils.click(By.name(EFFECT_EMBOSS));
    }


    public void chooseVibrantEffect() throws InterruptedException {

        scroll(EFFECT_VIBRANT);
        //utils.click(By.name(EFFECT_VIBRANT));
    }

    public void chooseDramaEffect() throws InterruptedException {

        scroll(EFFECT_DRAMA);
    }

    public void chooseSeafoamEffect() throws InterruptedException {

        scroll(EFFECT_SEAFOAM);
    }

    public void chooseLightCrossEffect() throws InterruptedException {

        scroll(EFFECT_LIGHT_CROSS);
    }

    public void chooseNone(){

        utils.click(By.name(EFFECT_NONE));
    }
    public void chooseDodgerEffect() throws InterruptedException {
        scroll(EFFECT_DODGER);
        //utils.click(By.name(EFFECT_DODGER));
    }
    public void chooseCineramaEffect() throws InterruptedException {
        scroll(EFFECT_CINERAMA);
        //utils.click(By.name(EFFECT_CINERAMA));
    }
    public void chooseTwilightEffect() throws InterruptedException {

        scroll(EFFECT_TWILIGHT);
        //utils.click(By.name(EFFECT_TWILIGHT));
    }

    public void chooseFilmEffect() throws InterruptedException {
        scroll(EFFECT_FILM);
        //utils.click(By.name(EFFECT_FILM));
    }

    public void chooseFilmBAndWEffect() throws InterruptedException {
        scroll(EFFECT_FILM_B_AND_W);
        //utils.click(By.name(EFFECT_FILM_B_AND_W));
    }

    public void chooseCrispEffect() throws InterruptedException {
        scroll(EFFECT_CRISP);
        //utils.click(By.name(EFFECT_CRISP));
    }

    public void chooseCrossProcessEffect() throws InterruptedException {
        scroll(EFFECT_CROSS_PROCESS);
        //utils.click(By.name(EFFECT_CROSS_PROCESS));
    }

    public void chooseCrossProcess2Effect() throws InterruptedException {
        scroll(EFFECT_CROSS_PROCESS_2);
        //utils.click(By.name(EFFECT_CROSS_PROCESS_2));
    }


    public void chooseWarmColorEffect() throws InterruptedException {
        scroll(EFFECT_WARM_COLOR);
        //utils.click(By.name(EFFECT_WARM_COLOR));
    }

    public void chooseWarmAmberEffect() throws InterruptedException {
        scroll(EFFECT_WARM_AMBER);
        //utils.click(By.name(EFFECT_WARM_AMBER));
    }

    public void chooseOrtonEffect() throws InterruptedException {
        scroll(EFFECT_ORTON);
        //utils.click(By.name(EFFECT_ORTON));

    }

    public void chooseLomoEffect() throws InterruptedException {
        scroll(EFFECT_LOMO);
        //utils.click(By.name(EFFECT_LOMO));
    }

    public void chooseVintageIvoryEffect() throws InterruptedException {
        scroll(EFFECT_VINTAGE_IVORY);
        //utils.click(By.name(EFFECT_VINTAGE_IVORY));
    }

    public void chooseVintageEffect() throws InterruptedException {
        scroll(EFFECT_VINTAGE);
        //utils.click(By.name(EFFECT_VINTAGE));
    }

    public void chooseVignetteEffect() throws InterruptedException {
        scroll(EFFECT_VIGNETTE);
        //utils.scrollTo(EFFECT_VIGNETTE);
        //Thread.sleep(160000);
        //utils.click(By.name(EFFECT_VIGNETTE));
    }

    public void chooseBWEffect() throws InterruptedException {
        scroll(EFFECT_B_W);
        //utils.click(By.name(EFFECT_B_W));
    }

    public void chooseBWCrossEffect() throws InterruptedException {
        scroll(EFFECT_B_W_CROSS);
        //utils.click(By.name(EFFECT_B_W_CROSS));
    }

    public void chooseBWLowConEffect() throws InterruptedException {
        scroll(EFFECT_B_W_LOWCON);
        //utils.click(By.name(EFFECT_B_W_LOWCON));
    }

    public void chooseBWVintageEffect() throws InterruptedException {
        scroll(EFFECT_B_W_VINTAGE);
        //utils.click(By.name(EFFECT_B_W_VINTAGE));
    }

    public void chooseBWBlurEffect() throws InterruptedException {
        scroll(EFFECT_B_W_BLUR);
        //utils.click(By.name(EFFECT_B_W_BLUR));
    }


    public void chooseBWHdrEffect() throws InterruptedException {
        scroll(EFFECT_B_W_HDR);
        //utils.click(By.name(EFFECT_B_W_HDR));
    }

    public void chooseBWHiConEffect() throws InterruptedException {
        scroll(EFFECT_B_W_HICON);
        //utils.click(By.name(EFFECT_B_W_HICON));
    }



    public void chooseSepiaEffect() throws InterruptedException {
        scroll(EFFECT_SEPIA);
        //utils.click(By.name(EFFECT_SEPIA));
    }


    public void chooseHdr1Effect() throws InterruptedException {
        scroll(EFFECT_HDR_1);
        //utils.click(By.name(EFFECT_HDR_1));
    }


    public void chooseHdr2Effect() throws InterruptedException {
        scroll(EFFECT_HDR_2);
        //utils.click(By.name(EFFECT_HDR_2));
    }

    public void chooseRetroEffect() throws InterruptedException {
        scroll(EFFECT_RETRO);
        //utils.click(By.name(EFFECT_RETRO));
    }


    public void choosesharpenEffect() throws InterruptedException {
        scroll(EFFECT_SHARPEN);
        //utils.click(By.name(EFFECT_SHARPEN));
    }
    public void choosePopArt2() throws InterruptedException {
        scroll(EFFECT_POPART2);
        //utils.click(By.name(EFFECT_POPART_POPART2));

    }

    public void clickApplyButton(){

        utils.click(APPLY_BUTTON);
    }

}
