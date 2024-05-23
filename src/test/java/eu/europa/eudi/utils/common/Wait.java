package eu.europa.eudi.utils.common;

import eu.europa.eudi.utils.TestLibrary;
import eu.europa.eudi.utils.config.EnvDataConfig;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Wait {

    TestLibrary test;

    EnvDataConfig envDataConfig;

    WebDriver driver;

    public Wait(TestLibrary test) {
        this.test = test;
        envDataConfig = new EnvDataConfig();
        driver = test.webDriverFactory().getDriver();
    }

    public void waitForLoad() {
        ExpectedCondition<Boolean> expectation =
                driver -> {
                    assert driver != null;
                    return ((JavascriptExecutor) test.webDriverFactory().getDriver())
                            .executeScript("return document.readyState").toString().equals("complete");
                };
        try {
            test.webDriverFactory().getWait().until(expectation);
            waitForLoadingImage();
            waitForJQueryAndPrimeFaces();
            sleep(200, TimeUnit.MILLISECONDS);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }

    public void waitForLoadingImage() {
        final By loadingImageLocator = By.xpath("//div[contains(@style,'visibility: visible')]//img[contains(@src,'loader')]");
        if (!test.webDriverFactory()
                .getDriver()
                .findElements(loadingImageLocator)
                .isEmpty()) {
            test.webDriverFactory()
                    .getFluentWait()
                    .pollingEvery(Duration.ofMillis(250))
                    .until(ExpectedConditions.invisibilityOfElementLocated(loadingImageLocator));
        }
    }

    public void waitForElement(WebElement element) {
        if (element != null) {
            test.webDriverFactory().getWait()
                    .until(ExpectedConditions.visibilityOf(element));
        } else {
            System.out.println("ERROR Element is NOT present.");
        }
    }

    public void sleep(int timeout, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitForElementToBeClickable(By by) {
        try {
            test.webDriverFactory().getFluentWait()
                    .until(ExpectedConditions.elementToBeClickable(by));
        } catch (Exception e) {
            System.out.println("ERROR Element is NOT present.");
        }

    }

    public void waitForDropdownElement(By by) {
        sleep(500, TimeUnit.MILLISECONDS);
        waitForElementToBeClickable(by);
    }

    public void waitForElementToBeDisplayed(By by) {
        test.webDriverFactory().getFluentWait()
                .until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitForJQueryAndPrimeFaces() {
        final String JS_JQUERY_DEFINED = "return typeof jQuery != 'undefined';";
        final String JS_PRIMEFACES_DEFINED = "return typeof PrimeFaces != 'undefined';";
        final String JS_JQUERY_ACTIVE = "return jQuery.active != 0;";
        final String JS_PRIMEFACES_QUEUE_NOT_EMPTY = "return !PrimeFaces.ajax.Queue.isEmpty();";

        test.webDriverFactory()
                .getFluentWait()
                .pollingEvery(Duration.ofMillis(200))
                .until(input -> {
                    boolean ajax = false;
                    boolean jQueryDefined = executeBooleanJavascript(input, JS_JQUERY_DEFINED);
                    boolean primeFacesDefined = executeBooleanJavascript(input, JS_PRIMEFACES_DEFINED);

                    if (jQueryDefined) {
                        // jQuery is still active
                        ajax |= executeBooleanJavascript(input, JS_JQUERY_ACTIVE);
                    }
                    if (primeFacesDefined) {
                        // PrimeFaces queue isn't empty
                        ajax |= executeBooleanJavascript(input, JS_PRIMEFACES_QUEUE_NOT_EMPTY);
                    }
                    // continue if all ajax request are processed
                    return !ajax;
                });
    }

    private boolean executeBooleanJavascript(WebDriver input, String javascript) {
        return (Boolean) ((JavascriptExecutor) input).executeScript(javascript);
    }

    //Explicit Wait Methods

    public void waitForElementInvisible(WebElement element) {
        if (element != null) {
            test.webDriverFactory().getWait().until(ExpectedConditions.invisibilityOf(element));
        } else {
            System.out.println("ERROR Element is visible after " + envDataConfig.getTimeout() + " seconds");
        }

    }

    public void waitForAttributeContainText(By by, String attribute, String expectedValue) {
        test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(by));
        test.webDriverFactory().getWait().until(ExpectedConditions.attributeContains(by, attribute, expectedValue));
    }

    public void waitForElementPresent(By by) {
        test.webDriverFactory().getWait().until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void waitForElementVisible(By by) {
        test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(by));
    }

}
