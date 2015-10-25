package utils;

import exceptions.ElementNotPresentException;
import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by GeorgiKamoyan on 10/19/15.
 */
public class CommonUtils {

    private WebDriver driver;
    static File classpathRoot = new File(System.getProperty("user.dir"));
    static File appDir = new File(classpathRoot, "/src/main/resources");
//    static File allRunningDevices = new File(appDir, "androidresources/runningDevices.command");
//    static File runningDevicesGrep = new File(appDir, "androidresources/runningDeviceId.command");
//    long shortTimeout = 5;
    long timeout = 30;
//    private String text;


    public CommonUtils(WebDriver driver) {
        this.driver = driver;
        System.out.println("CommonUtils Driver: " + driver);

    }

    public void click(By by) {

        WebElement webElement = locateElement(by);
        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
//        webElement.click();
    }

    public boolean isElementPresent(By by) {

        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);

        try {
            List<WebElement> elements;
            elements = driver.findElements(by);
            if (elements.size() > 0)
                return true;
            else
                return false;

        } catch (org.openqa.selenium.NoSuchElementException e) {
            throw new ElementNotPresentException(by.toString());
        }

    }


    public void swipe_i2(int i) {
        ((AppiumDriver) driver).swipe(20 + (i - 1) % 5 * 140, 320 + 10 + (i - 1) / 5 * 90, 140 + (i - 1) % 5 * 140, 320 + 90 + (i - 1) / 5 * 90, 2000);
    }


    public boolean isElementPresentFast(By by) {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        try {
            List<WebElement> elements;
            elements = driver.findElements(by);
            if (elements.size() > 0)
                return true;
            else
                return false;

        } catch (org.openqa.selenium.NoSuchElementException e) {
            throw new ElementNotPresentException(by.toString());
        }
    }


    public int numOfElements(By by) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        try {
            List<WebElement> elements;
            elements = driver.findElements(by);
            return elements.size();

        } catch (org.openqa.selenium.NoSuchElementException e) {
            throw new ElementNotPresentException(by.toString());
        }
    }

    public WebElement getLastElement(By by) {
        try {
            return driver.findElements(by).get(numOfElements(by) - 1);
        } catch (org.openqa.selenium.NoSuchElementException e) {
            throw new ElementNotPresentException(by.toString());
        }
    }


    private WebElement locateElement(By by) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, 50);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return element;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            throw new ElementNotPresentException(by.toString());
        }
    }


    public void waitForElementPresent(By by) {

        try {
            new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(by));
            // driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
            //new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(by));
            driver.findElement(by);
        } catch (org.openqa.selenium.NoSuchElementException e) {
            throw new ElementNotPresentException(by.toString());
        }


    }


    public void type(By by, String value) {
        WebElement webElement = locateElement(by);
        webElement.clear();
        webElement.sendKeys(value);
    }

    public void swipe() {
        ((AppiumDriver) driver).swipe(7, 335, 702, 850, 1800);

    }


    public void drawHouse() throws InterruptedException {

        Thread.sleep(2000);
        ((AppiumDriver) driver).swipe(183, 760, 180, 513, 500);
        ((AppiumDriver) driver).swipe(187, 526, 451, 529, 500);
        ((AppiumDriver) driver).swipe(439, 537, 442, 746, 500);
        ((AppiumDriver) driver).swipe(185, 747, 437, 745, 500);
        ((AppiumDriver) driver).swipe(187, 530, 286, 369, 500);
        ((AppiumDriver) driver).swipe(286, 370, 437, 536, 500);
        ((AppiumDriver) driver).swipe(362, 449, 412, 382, 500);
        ((AppiumDriver) driver).swipe(417, 391, 446, 416, 500);
        ((AppiumDriver) driver).swipe(451, 423, 401, 480, 500);
        ((AppiumDriver) driver).swipe(310, 743, 309, 637, 500);
        ((AppiumDriver) driver).swipe(313, 648, 369, 644, 500);
        ((AppiumDriver) driver).swipe(374, 641, 374, 741, 500);
        ((AppiumDriver) driver).tap(1, 343, 690, 800);
        ((AppiumDriver) driver).swipe(546, 285, 715, 423, 500);
        ((AppiumDriver) driver).swipe(557, 321, 520, 364, 500);
        ((AppiumDriver) driver).swipe(607, 359, 563, 438, 500);
        ((AppiumDriver) driver).swipe(672, 422, 647, 489, 500);

    }


    public void swipeText() {

        ((AppiumDriver) driver).swipe(540, 395, 540, 810, 800);

        /*
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("mobile: swipe", new HashMap<String, Double>() {{
            put("touchCount", (double) 1);
            put("startX", (double) 38);
            put("startY", (double) 680);
            put("endX", (double) 195);
            put("endY", (double) 327);
            put("duration", 0.5);
        }});
*/

    }


    public void drawFace() {

        ((AppiumDriver) driver).swipe(239, 713, 239, 501, 400);
        ((AppiumDriver) driver).swipe(251, 724, 465, 728, 400);
        ((AppiumDriver) driver).swipe(458, 735, 511, 639, 400);
        ((AppiumDriver) driver).swipe(503, 658, 495, 522, 400);
        ((AppiumDriver) driver).swipe(290, 544, 298, 602, 400);
        ((AppiumDriver) driver).swipe(299, 554, 349, 582, 400);
        ((AppiumDriver) driver).swipe(306, 602, 350, 594, 400);
        ((AppiumDriver) driver).swipe(460, 557, 468, 601, 400);
        ((AppiumDriver) driver).swipe(465, 556, 425, 589, 400);
        ((AppiumDriver) driver).swipe(473, 609, 415, 592, 400);
        ((AppiumDriver) driver).swipe(325, 663, 325, 694, 400);
        ((AppiumDriver) driver).swipe(328, 669, 430, 645, 400);
        ((AppiumDriver) driver).swipe(338, 700, 405, 702, 400);
        ((AppiumDriver) driver).swipe(411, 704, 421, 659, 400);
        ((AppiumDriver) driver).swipe(247, 522, 183, 426, 400);
        ((AppiumDriver) driver).swipe(197, 441, 303, 491, 400);
        ((AppiumDriver) driver).swipe(300, 492, 340, 377, 400);
        ((AppiumDriver) driver).swipe(346, 388, 383, 486, 400);
        ((AppiumDriver) driver).swipe(392, 488, 460, 372, 400);
        ((AppiumDriver) driver).swipe(460, 390, 470, 490, 400);
        ((AppiumDriver) driver).swipe(578, 392, 477, 485, 400);
        ((AppiumDriver) driver).swipe(582, 410, 506, 551, 400);
        ((AppiumDriver) driver).swipe(361, 698, 365, 668, 400);
        ((AppiumDriver) driver).swipe(398, 668, 394, 700, 400);
        ((AppiumDriver) driver).swipe(348, 686, 417, 677, 400);

    }


    public void horizontalSwipeByRecyclerSize(By by) throws InterruptedException {
        int s_w = driver.findElement(by).getSize().getWidth();
        int s_h = driver.findElement(by).getSize().getHeight();
        int l_x = driver.findElement(by).getLocation().getX();
        int l_y = driver.findElement(by).getLocation().getY();
        ((AppiumDriver) driver).swipe(l_x + s_w - 1, l_y + s_h / 2, l_x, l_y + s_h / 2, 2000);
    }
}

