package eu.europa.eudi.pages;

import eu.europa.eudi.data.Literals;
import eu.europa.eudi.elements.android.WalletElements;
import eu.europa.eudi.elements.ios.WalletElementsIos;
import eu.europa.eudi.utils.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Verifier {
    Test test;
    public AndroidDriver androidDriver;
    WebDriverWait wait;
    public Verifier(Test test) {
        this.test = test;
    }

    public void selectShareAttributes() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickShareData)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickShareData)).click();
        }
    }

    public void clickNext() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickNext)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickNext)).click();
        }
    }

    public void chooseData() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.chooseData)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.chooseData)).click();
        }
    }

    public void chooseWallet() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.chooseWallet)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.chooseWallet)).click();
        }
    }



    public void viewDataPage() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.viewDataPage)).getText();
            Assert.assertEquals(Literals.Verifier.VIEW_DATA_PAGE.label, pageHeader);
        } else {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.viewDataPage)).getText();
            Assert.assertEquals(Literals.Verifier.VIEW_DATA_PAGE_IOS.label, pageHeader);
        }
    }

    public void authorizeData() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            WebDriver driver = test.mobileWebDriverFactory().getDriverAndroid();
            driver.findElement(WalletElements.pinTexfield1).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield2).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield3).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield4).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield5).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield6).sendKeys("1");
        }else{
            IOSDriver driver = (IOSDriver) test.mobileWebDriverFactory().getDriverIos();
            driver.findElement(WalletElementsIos.pinTexfield1).sendKeys("1");
            driver.findElement(WalletElementsIos.pinTexfield2).sendKeys("1");
            driver.findElement(WalletElementsIos.pinTexfield3).sendKeys("1");
            driver.findElement(WalletElementsIos.pinTexfield4).sendKeys("1");
            driver.findElement(WalletElementsIos.pinTexfield5).sendKeys("1");
            driver.findElement(WalletElementsIos.pinTexfield6).sendKeys("1");        }
    }

    public void appOpensSuccefully() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.appOpensSuccessfully)).getText();
            Assert.assertEquals(Literals.Verifier.APP_OPEN_SUCCESSFULLY.label, pageHeader);
        } else {
            IOSDriver driver = (IOSDriver) test.mobileWebDriverFactory().getDriverIos();
//            driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.appOpensSuccessfully)).getText();
            Assert.assertEquals(Literals.Verifier.APP_OPEN_SUCCESSFULLY.label, pageHeader);
        }
    }

    public void AuthenticationPageIsDisplayed() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.authenticationPageIsDisplayed)).getText();
            Assert.assertEquals(Literals.Verifier.AUTHENTICATION_PAGE.label, pageHeader);
        } else {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.authenticationPageIsDisplayed)).getText();
            Assert.assertEquals(Literals.Verifier.AUTHENTICATION_PAGE.label, pageHeader);
        }
    }
}