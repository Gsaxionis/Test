package eu.europa.eudi.utils.common;

import eu.europa.eudi.utils.TestLibrary;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class BrowserControls {

    TestLibrary test;

    Wait wait;

    WebDriver driver;

    public BrowserControls(TestLibrary test) {
        this.test = test;
        wait = new Wait(test);
        driver = test.webDriverFactory().getDriver();
    }


    public void scrollUp() {
        scroll(-1000);
    }

    public void scrollDown() {
        scroll(450);
        wait.sleep(2, TimeUnit.SECONDS);
    }

    public void slowScrollToTop() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        while (castObjectToDouble(jse.executeScript("return window.pageYOffset;")) > 0) {
            scrollUp();
            wait.waitForLoad();
        }
    }

    public void slowScrollToBottom() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Long pageBottom = (Long) jse.executeScript("return document.body.scrollHeight");

        while ((Long) jse.executeScript("return window.pageYOffset;") < pageBottom) {
            scrollDown();
            wait.waitForLoad();
        }
    }

    public void scrollToElement(By locator) {
        wait.waitForLoad();
        WebElement element = driver.findElement(locator);
        scrollToElement(element);
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
        wait.waitForLoad();
    }

    public void scrollToElementAction(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        wait.waitForLoad();
    }

    public void scrollToElementMiddle(By locator) {
        WebElement element = driver.findElement(locator);
        scrollToElementMiddle(element);
    }

    public void scrollToElementMiddle(WebElement element) {
        String scrollElementIntoMiddle = "var viewPortHeight = " +
                "Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, element);
        wait.waitForElement(element);
        wait.sleep(1, TimeUnit.SECONDS);
    }

    private void scroll(int amount) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0," + amount + ")", "");
        wait.sleep(2, TimeUnit.SECONDS);
    }

    public void refreshPage() {
        driver.navigate().refresh();
        wait.waitForLoad();
    }

    public void goBack() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.history.go(-1)");
    }

    public void zoomBrowser(Float zoom) throws AWTException {
        Robot robot = new Robot();
        // zoom in
        if (zoom > 0) {
            for (int i = 0; i < zoom; i++) {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_EQUALS);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_EQUALS);
            }
        } // zoom out
        else if (zoom < 0) {
            zoom = Math.abs(zoom);
            for (int i = 0; i < zoom; i++) {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_MINUS);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_MINUS);
            }
        }
    }

    public void openNewTab() {
        ((JavascriptExecutor) driver).executeScript("window.open()");
        goToNewTab();
    }

    /**
     * This method closes the opened tab and returns focus on the first tab
     */
    public void closeCurrentTab() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        Assert.assertFalse("Warning! Only one tab is open! By closing it, the " + "whole browser will be closed!", tabs.size() == 1);
        driver.close();
        driver.switchTo().window(driver.getWindowHandles().stream().findFirst().get());
    }

    /**
     * This method navigates to the opened tab and returns focus on this one.
     */
    public void goToNewTab() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        Assert.assertFalse("Warning! Only one tab is open!", tabs.size() == 1);
        driver.switchTo().window(tabs.get(tabs.size() - 1));
        wait.waitForLoad();
    }

    public void closeOtherTabs() {
        String originalHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalHandle)) {
                driver.switchTo().window(handle);
                driver.close();
            }
        }
        driver.switchTo().window(originalHandle);
    }

    @SuppressWarnings("deprecation")
    private static Double castObjectToDouble(Object object) {
        assert Objects.nonNull(object);
        return new Double(object.toString());
    }
}
