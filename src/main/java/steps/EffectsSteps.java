package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import screens.ChoosePicScreen;
import screens.EditorScreen;
import screens.EffectsScreen;
import screens.HomeScreen;

/**
 * Created by GeorgiKamoyan on 10/19/15.
 */
public class EffectsSteps extends AbstractStep {

    EffectsScreen effectsScreen;
    EditorScreen editorScreen;
    HomeScreen homeScreen;
    ChoosePicScreen choosePicScreen;

    public EffectsSteps(WebDriver driver) {
        super(driver);

        effectsScreen = new EffectsScreen(driver);
        editorScreen = new EditorScreen(driver);
        homeScreen = new HomeScreen(driver);
        choosePicScreen = new ChoosePicScreen(driver);
    }


    public void _go_to_Effects_via_flickr() throws InterruptedException {
        homeScreen.clickExploreTab();
        homeScreen.clickEffectsMenuButton();
        choosePicScreen.clickFlickrButton();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.GridView[1]/android.widget.RelativeLayout[5]")).click();
    }

    public void _choose_blur_category_from_effects() {

        effectsScreen.chooseBlurCategoryfromEffects();

    }

    public void _choose_artistic_category_from_effects() {

        effectsScreen.chooseArtisticCategoryfromEffects();

    }

    public void _choose_popart_category_from_effects() {

        effectsScreen.choosePopArtCategoryfromEffects();
    }

    public void _choose_paper_category_from_effects() {

        effectsScreen.choosePaperCategoryfromEffects();
    }

    public void _choose_distort_category_from_effects() {

        effectsScreen.chooseDistortCategoryfromEffects();
    }

    public void _choose_colors_category_from_effects() {

        effectsScreen.chooseColorCategoryfromEffects();
    }

    public void _choose_corrections_category_from_effects() {

        effectsScreen.chooseCorrectionsCategoryfromEffects();
    }

    public void _choose_Clone_Effect() throws InterruptedException {

        effectsScreen.chooseCloneEffect();
    }

    public void _choose_RedEye_Effect() throws InterruptedException {

        effectsScreen.chooseRedEyeEffect();
    }

    public void _choose_ColorEye_Effect() throws InterruptedException {

        effectsScreen.chooseColorEyeEffect();
    }

    public void _choose_Blemish_Fix_Effect() throws InterruptedException {

        effectsScreen.chooseBlemishFixEffect();
    }

    public void _choose_Face_Fix_Effect() throws InterruptedException {

        effectsScreen.chooseFaceFixEffect();
    }

    public void _choose_Suntan_Effect() throws InterruptedException {

        effectsScreen.chooseSuntanEffect();
    }

    public void _choose_Teeth_Whitener_Effect() throws InterruptedException {

        effectsScreen.chooseTeethWhitenerEffect();
    }

    public void _choose_ColorSplash_Effect() throws InterruptedException {

        effectsScreen.chooseColorSplashEffect();
    }

    public void _choose_Color_Replace_Effect() throws InterruptedException {

        effectsScreen.chooseColorReplaceEffect();
    }

    public void _choose_Colorize_Effect() throws InterruptedException {

        effectsScreen.chooseColorizeEffect();
    }

    public void _choose_Hue_Effect() throws InterruptedException {

        effectsScreen.chooseHueEffect();
    }

    public void _choose_BlackandWhite_Effect() throws InterruptedException {

        effectsScreen.chooseBlackandWhiteEffect();
    }

    public void _choose_Negative_Effect() throws InterruptedException {

        effectsScreen.chooseNegativeEffect();
    }

    public void _choose_Solarization_Effect() throws InterruptedException {

        effectsScreen.chooseSolarizationEffect();

    }

    public void _choose_Invert_Effect() throws InterruptedException {

        effectsScreen.chooseInvertEffect();
    }

    public void _choose_Saturation_Effect() throws InterruptedException {

        effectsScreen.chooseSaturationEffect();
    }

    public void _choose_Brightness_Effect() throws InterruptedException {

        effectsScreen.chooseBrightnessEffect();
    }

    public void _choose_Contrast_Effect() throws InterruptedException {

        effectsScreen.chooseContrastEffect();
    }

    public void _choose_Mirror_Effect() throws InterruptedException {

        effectsScreen.chooseMirrorEffect();
    }

    public void _choose_Pixelize_Effect() throws InterruptedException {

        effectsScreen.choosePixelizeEffect();
    }

    public void _choose_Caricature_Effect() throws InterruptedException {

        effectsScreen.chooseCaricatureEffect();
    }

    public void _choose_Fisheye_Effect() throws InterruptedException {

        effectsScreen.chooseFishEyeEffect();
    }

    public void _choose_Swirled_Effect() throws InterruptedException {

        effectsScreen.chooseSwirledEffect();
    }

    public void _choose_Cylinder_Mirror_Effect() throws InterruptedException {

        effectsScreen.chooseCylinderMirrorEffect();
    }

    public void _choose_Bathroom1_Effect() throws InterruptedException {

        effectsScreen.chooseBathroom1Effect();
    }

    public void _choose_Bathroom2_Effect() throws InterruptedException {

        effectsScreen.chooseBathroom2Effect();
    }

    public void _choose_Water_Effect() throws InterruptedException {

        effectsScreen.chooseWaterEffect();

    }

    public void _choose_Stenciler1_Effect() throws InterruptedException {

        effectsScreen.chooseStenciler1Effect();
    }

    public void _choose_Stenciler2_Effect() throws InterruptedException {

        effectsScreen.chooseStenciler2Effect();
    }

    public void _choose_Stenciler3_Effect() throws InterruptedException {

        effectsScreen.chooseStenciler3Effect();
    }

    public void _choose_Stenciler4_Effect() throws InterruptedException {

        effectsScreen.chooseStenciler4Effect();
    }

    public void _choose_Stenciler5_Effect() throws InterruptedException {

        effectsScreen.chooseStenciler5Effect();
    }

    public void _choose_Stenciler6_Effect() throws InterruptedException {

        effectsScreen.chooseStenciler6Effect();
    }

    public void _choose_Stenciler7_Effect() throws InterruptedException {

        effectsScreen.chooseStenciler7Effect();
    }

    public void _choose_Stenciler8_Effect() throws InterruptedException {

        effectsScreen.chooseStenciler8Effect();
    }

    public void _choose_colorgradient_effect() throws InterruptedException {

        effectsScreen.chooseColorGradientEffect();
    }

    public void _choose_Holga1_Effect() throws InterruptedException {

        effectsScreen.chooseHolga1Effect();
    }

    public void _choose_Holga2_Effect() throws InterruptedException {

        effectsScreen.chooseHolga2Effect();
    }

    public void _choose_Color1_Effect() throws InterruptedException {

        effectsScreen.chooseColor1Effect();
    }

    public void _choose_Color2_Effect() throws InterruptedException {

        effectsScreen.chooseColor2Effect();
    }

    public void _choose_Color3_Effect() throws InterruptedException {

        effectsScreen.chooseColor3Effect();
    }

    public void _choose_Color4_Effect() throws InterruptedException {

        effectsScreen.chooseColor4Effect();
    }

    public void _choose_PopArt_Colors_Effect() throws InterruptedException {

        effectsScreen.choosePopArtColorsEffect();
    }

    public void _choose_PopArt1_Effect() throws InterruptedException {

        effectsScreen.choosePopArt1Effect();
    }

    public void _choose_PopArt2_Effect() throws InterruptedException {

        effectsScreen.choosePopArt2Effect();
    }

    public void _apply_lightcross_effect() throws InterruptedException {

        effectsScreen.chooseLightCrossEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_seafoam_effect() throws InterruptedException {

        effectsScreen.chooseSeafoamEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_dodger_effect() throws InterruptedException {

        effectsScreen.chooseDodgerEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_drama_effect() throws InterruptedException {

        effectsScreen.chooseDramaEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_cinerama_effect() throws InterruptedException {

        effectsScreen.chooseCineramaEffect();
        effectsScreen.clickApplyButton();

    }

    public void _apply_retro_effect() throws InterruptedException {

        effectsScreen.chooseRetroEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_twilight_effect() throws InterruptedException {

        effectsScreen.chooseTwilightEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_warm_amber_effect() throws InterruptedException {

        effectsScreen.chooseWarmAmberEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_warm_color_effect() throws InterruptedException {

        effectsScreen.chooseWarmColorEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_bw_lowcon_effect() throws InterruptedException {

        effectsScreen.chooseBWLowConEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_bw_hicon_effect() throws InterruptedException {

        effectsScreen.chooseBWHiConEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_film_effect() throws InterruptedException {

        effectsScreen.chooseFilmEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_film_bw_effect() throws InterruptedException {

        effectsScreen.chooseFilmBAndWEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_vibrant_effect() throws InterruptedException {

        effectsScreen.chooseVibrantEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_cross_proc_1() throws InterruptedException {

        effectsScreen.chooseCrossProcessEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_cross_proc_2() throws InterruptedException {

        effectsScreen.chooseCrossProcess2Effect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_orton_effect() throws InterruptedException {

        effectsScreen.chooseOrtonEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_lomo_effect() throws InterruptedException {

        effectsScreen.chooseLomoEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_vintagelvory_effect() throws InterruptedException {

        effectsScreen.chooseVintageIvoryEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_vintage_effect() throws InterruptedException {

        effectsScreen.chooseVintageEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_vignette_effect() throws InterruptedException {

        effectsScreen.chooseVignetteEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_bw_effect() throws InterruptedException {

        effectsScreen.chooseBWEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_bw_cross_effect() throws InterruptedException {

        effectsScreen.chooseBWCrossEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_bw_vintage_effect() throws InterruptedException {

        effectsScreen.chooseBWVintageEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_bw_blur_effect() throws InterruptedException {

        effectsScreen.chooseBWBlurEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_bw_hdr_effect() throws InterruptedException {

        effectsScreen.chooseBWHdrEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_sepia_effect() throws InterruptedException {

        effectsScreen.chooseSepiaEffect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_hdr_1_effect() throws InterruptedException {

        effectsScreen.chooseHdr1Effect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_hdr_2_effect() throws InterruptedException {

        effectsScreen.chooseHdr2Effect();
        effectsScreen.clickApplyButton();
    }

    public void _apply_sharpen_effect() throws InterruptedException {

        effectsScreen.choosesharpenEffect();
        effectsScreen.clickApplyButton();
    }

    public void _choose_Effect_button_from_Editor(){

        editorScreen.clickEffectsButton();
    }

    public void _choose_blur_effect() throws InterruptedException {

        effectsScreen.chooseBlurEffect();

    }

    public void _choose_Lens_blur_effect() throws InterruptedException {

        effectsScreen.chooseLensblurEffect();
    }

    public void _choose_Smart_blur_effect() throws InterruptedException {

        effectsScreen.chooseSmartBlurEffect();
    }

    public void _choose_Motion_blur_effect() throws InterruptedException {

        effectsScreen.chooseMotionBlurEffect();
    }

    public void _choose_Zoom_Blur_effect() throws InterruptedException {

        effectsScreen.chooseZoomBlurEffect();
    }

    public void _choose_Radial_Blur_Effect() throws InterruptedException {

        effectsScreen.chooseRadialBlurEffect();
    }

    public void _choose_Polygon_Effect() throws InterruptedException {

        effectsScreen.choosePolygonEffect();
    }

    public void _choose_Poster_Effect() throws InterruptedException {

        effectsScreen.choosePosterEffect();
    }

    public void _choose_Halftone_Dots_Effect() throws InterruptedException {

        effectsScreen.chooseHalftoneDotsEffect();
    }

    public void _choose_Motion_Effect() throws InterruptedException {

        effectsScreen.chooseMotionEffect();
    }

    public void _choose_Shear_Effect() throws InterruptedException {

        effectsScreen.chooseShearEffect();
    }

    public void _choose_Pastel_Effect() throws InterruptedException {

        effectsScreen.choosePastelEffect();
    }

    public void _choose_Comic_Effect() throws InterruptedException {

        effectsScreen.chooseComicEffect();
    }

    public void _choose_Gouache_Effect() throws InterruptedException {

        effectsScreen.chooseGouacheEffect();
    }

    public void _choose_Old_Paper_Effect() throws InterruptedException {

        effectsScreen.chooseOldPaperEffect();
    }

    public void _choose_Neon_Effect() throws InterruptedException {

        effectsScreen.chooseNeonEffect();
    }

    public void _choose_Water_Color_Effect() throws InterruptedException {

        effectsScreen.chooseWaterColorEffect();
    }

    public void _choose_Sketcher_Effect() throws InterruptedException {

        effectsScreen.chooseSketcherEffect();
    }

    public void _choose_Contour_Effect() throws InterruptedException {

        effectsScreen.chooseContourEffect();
    }

    public void _choose_Pencil_Effect() throws InterruptedException {

        effectsScreen.choosePencilEffect();
    }

    public void _choose_Oil_Effect() throws InterruptedException {

        effectsScreen.chooseOilEffect();
    }

    public void _choose_Cartoonizer_Effect() throws InterruptedException {

        effectsScreen.chooseCartoonizerEffect();
    }

    public void _choose_Sketcher2_Effect() throws InterruptedException {

        effectsScreen.chooseSketcher2_Effect();
    }

    public void _choose_Sketcher3_Effect() throws InterruptedException {

        effectsScreen.chooseSketcher3Effect();
    }

    public void _choose_Fattal1_Effect() throws InterruptedException {

        effectsScreen.chooseFattal1Effect();
    }

    public void _choose_Fattal2_Effect() throws InterruptedException {

        effectsScreen.chooseFattal2Effect();
    }

    public void _choose_Emboss_Effect() throws InterruptedException {

        effectsScreen.chooseEmbossEffect();
    }

    public void _choose_light_cross_effect() throws InterruptedException {

        effectsScreen.chooseLightCrossEffect();

    }

    public void _choose_seafoam_effect() throws InterruptedException {

        effectsScreen.chooseSeafoamEffect();
    }

    public void _choose_cinerama_effect() throws InterruptedException {

        effectsScreen.chooseCineramaEffect();

    }

    public void _choose_dodger_effect() throws InterruptedException {

        effectsScreen.chooseDodgerEffect();

    }

    public void _choose_drama_effect() throws InterruptedException {

        effectsScreen.chooseDramaEffect();
    }

    public void _choose_film_effect() throws InterruptedException {

        effectsScreen.chooseFilmEffect();

    }

    public void _choose_film_b_and_w_effect() throws InterruptedException {

        effectsScreen.chooseFilmBAndWEffect();

    }

    public void _choose_crisp_effect() throws InterruptedException {

        effectsScreen.chooseCrispEffect();
    }

    public void _choose_vibrant_effect() throws InterruptedException {

        effectsScreen.chooseVibrantEffect();
    }

    public void _choose_twilight_effect() throws InterruptedException {

        effectsScreen.chooseTwilightEffect();

    }

    public void _choose_warm_amber_effect() throws InterruptedException {

        effectsScreen.chooseWarmAmberEffect();
    }

    public void _choose_bw_lowcon_effect() throws InterruptedException {

        effectsScreen.chooseBWLowConEffect();
    }

    public void _choose_bw_hicon_effect() throws InterruptedException {

        effectsScreen.chooseBWHiConEffect();
    }

    public void _choose_cross_process_effect() throws InterruptedException {

        effectsScreen.chooseCrossProcessEffect();

    }

    public void _choose_cross_process2_effect() throws InterruptedException {

        effectsScreen.chooseCrossProcess2Effect();
    }


    public void _choose_warm_color_effect() throws InterruptedException {

        effectsScreen.chooseWarmColorEffect();

    }

    public void _choose_orton_effect() throws InterruptedException {

        effectsScreen.chooseOrtonEffect();

    }

    public void _choose_lomo_effect() throws InterruptedException {

        effectsScreen.chooseLomoEffect();

    }

    public void _choose_vintage_ivory_effect() throws InterruptedException {

        effectsScreen.chooseVintageIvoryEffect();

    }

    public void _choose_vintage_effect() throws InterruptedException {

        effectsScreen.chooseVintageEffect();

    }

    public void _choose_vignette_effect() throws InterruptedException {

        effectsScreen.chooseVignetteEffect();

    }

    public void _choose_bw_effect() throws InterruptedException {

        effectsScreen.chooseBWEffect();

    }

    public void _choose_bw_cross_effect() throws InterruptedException {

        effectsScreen.chooseBWCrossEffect();

    }

    public void _choose_bw_vintage_effect() throws InterruptedException {

        effectsScreen.chooseBWVintageEffect();

    }

    public void _choose_bw_blur_effect() throws InterruptedException {

        effectsScreen.chooseBWBlurEffect();

    }

    public void _choose_bw_hdr_effect() throws InterruptedException {

        effectsScreen.chooseBWHdrEffect();

    }

    public void _choose_sepia_effect() throws InterruptedException {

        effectsScreen.chooseSepiaEffect();

    }

    public void _choose_hdr1_effect() throws InterruptedException {

        effectsScreen.chooseHdr1Effect();

    }

    public void _choose_hdr2_effect() throws InterruptedException {

        effectsScreen.chooseHdr2Effect();

    }

    public void _choose_sharpen_effect() throws InterruptedException {

        effectsScreen.choosesharpenEffect();

    }


    //////



    public void _select_light_cross_effect() throws InterruptedException {

        effectsScreen.chooseLightCrossEffect();

    }

    public void _select_cinerama_effect() throws InterruptedException {

        effectsScreen.chooseCineramaEffect();

    }

    public void _select_dodger_effect() throws InterruptedException {

        effectsScreen.chooseDodgerEffect();

    }

    public void _select_film_effect() throws InterruptedException {

        effectsScreen.chooseFilmEffect();

    }

    public void _select_film_b_and_w_effect() throws InterruptedException {

        effectsScreen.chooseFilmBAndWEffect();

    }

    public void _select_twilight_effect() throws InterruptedException {

        effectsScreen.chooseTwilightEffect();

    }

    public void _select_cross_process_effect() throws InterruptedException {

        effectsScreen.chooseCrossProcessEffect();

    }


    public void _select_warm_color_effect() throws InterruptedException {

        effectsScreen.chooseWarmColorEffect();

    }

    public void _select_orton_effect() throws InterruptedException {

        effectsScreen.chooseOrtonEffect();

    }

    public void _select_lomo_effect() throws InterruptedException {

        effectsScreen.chooseLomoEffect();

    }

    public void _select_vintage_ivory_effect() throws InterruptedException {

        effectsScreen.chooseVintageIvoryEffect();

    }

    public void _select_vintage_effect() throws InterruptedException {

        effectsScreen.chooseVintageEffect();

    }

    public void _select_vignette_effect() throws InterruptedException {

        effectsScreen.chooseVignetteEffect();


    }

    public void _select_bw_effect() throws InterruptedException {

        effectsScreen.chooseBWEffect();

    }

    public void _select_bw_cross_effect() throws InterruptedException {

        effectsScreen.chooseBWCrossEffect();

    }

    public void _select_bw_vintage_effect() throws InterruptedException {

        effectsScreen.chooseBWVintageEffect();

    }

    public void _select_bw_blur_effect() throws InterruptedException {

        effectsScreen.chooseBWBlurEffect();

    }

    public void _select_bw_hdr_effect() throws InterruptedException {

        effectsScreen.chooseBWHdrEffect();

    }

    public void _select_sepia_effect() throws InterruptedException {

        effectsScreen.chooseSepiaEffect();

    }

    public void _select_hdr1_effect() throws InterruptedException {

        effectsScreen.chooseHdr1Effect();

    }

    public void _select_hdr2_effect() throws InterruptedException {

        effectsScreen.chooseHdr2Effect();

    }

    public void _select_sharpen_effect() throws InterruptedException {

        effectsScreen.choosesharpenEffect();

    }




    public boolean _specified_effect_is_selected(String effectName) throws InterruptedException {

        //i Element Present on the layout?




        String lastEffectNameBeforeSwipe = null;
        String lastEffectNameAfterSwipe = null;

        do {
            if (effectsScreen.isEffectNamePresentFast((effectName))) {
                effectsScreen.clickEffectName(effectName);
                return true;
            } else {
                lastEffectNameBeforeSwipe = effectsScreen.getLastEffectName();
                effectsScreen.swipeEffectsRecycler();
                lastEffectNameAfterSwipe = effectsScreen.getLastEffectName();

            }
        }while (!(lastEffectNameAfterSwipe.equals(lastEffectNameBeforeSwipe)));
        System.out.println("\nEFFECT NAME <"+effectName+"> IS NOT FOUND!!!\n");
        return false;
    }


    //HACKATON TESTS

    public void check_all_effects() throws InterruptedException {
        _choose_cross_process_effect();
        _choose_warm_color_effect();
        //_choose_orton_effect();
        //_choose_lomo_effect();
        _choose_vintage_ivory_effect();
        _choose_vintage_effect();
        _choose_vignette_effect();
        _choose_bw_effect();
        _choose_bw_cross_effect();
        //_choose_bw_vintage_effect();
        _choose_bw_blur_effect();
        _choose_bw_hdr_effect();
        _choose_sepia_effect();
        _choose_hdr1_effect();
        _choose_hdr2_effect();
        _choose_sharpen_effect();
        _choose_light_cross_effect();
        _choose_dodger_effect();
        _choose_cinerama_effect();
        _choose_twilight_effect();
        _choose_film_effect();
        _choose_film_b_and_w_effect();
        _choose_cross_process_effect();
    }


    public void check_all_effects2() throws InterruptedException {
        //editorScreen.clickEffectsButton();
        for (int i = 0; i < 5; i++) {
            _select_dodger_effect();
            _select_cinerama_effect();
            _select_film_b_and_w_effect();
            _select_cross_process_effect();
            _select_warm_color_effect();
            _select_orton_effect();
            _select_lomo_effect();
            _select_vintage_ivory_effect();
            _select_vintage_effect();
            _select_vignette_effect();
            _select_bw_effect();
            _select_bw_cross_effect();
            _select_bw_vintage_effect();
            _select_bw_blur_effect();
            _select_bw_hdr_effect();
            _select_sepia_effect();
            _select_hdr1_effect();
            _select_hdr2_effect();
            _select_sharpen_effect();
        }
    }

}
