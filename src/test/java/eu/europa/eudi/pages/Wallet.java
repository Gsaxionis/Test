package eu.europa.eudi.pages;

import eu.europa.eudi.data.Literals;
import eu.europa.eudi.elements.android.WalletElements;
import eu.europa.eudi.elements.ios.*;
import eu.europa.eudi.utils.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
public class Wallet {
    Test test;

    public Wallet(Test test) {
        this.test = test;
    }

    public void checkIfPageIsTrue() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            AndroidDriver driver = (AndroidDriver) test.mobileWebDriverFactory().getDriverAndroid();
            driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.welcomeScreen)).getText();
            Assert.assertEquals(Literals.Wallet.WELCOME_HEADER.label, pageHeader);
            driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        } else {
//          //  String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.welcomeScreen)).getText();
//            Assert.assertEquals(Literals.Wallet.WELCOME_HEADER.label, pageHeader);
//            IOSDriver driver = (IOSDriver) test.mobileWebDriverFactory().getDriverIos();
//            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
    }

    public void createAPin() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            WebDriver driver = test.mobileWebDriverFactory().getDriverAndroid();
            driver.findElement(WalletElements.pinTexfield1).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield2).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield3).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield4).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield5).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield6).sendKeys("1");
        } else {
            IOSDriver driver = (IOSDriver) test.mobileWebDriverFactory().getDriverIos();
            driver.findElement(WalletElementsIos.pinTexfield1).sendKeys("1");
            driver.findElement(WalletElementsIos.pinTexfield2).sendKeys("1");
            driver.findElement(WalletElementsIos.pinTexfield3).sendKeys("1");
            driver.findElement(WalletElementsIos.pinTexfield4).sendKeys("1");
            driver.findElement(WalletElementsIos.pinTexfield5).sendKeys("1");
            driver.findElement(WalletElementsIos.pinTexfield6).sendKeys("1");
        }
    }

    public void clickNextButton() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.nextButton)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.nextButton)).click();
        }
    }

    public void renterThePin() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            WebDriver driver = test.mobileWebDriverFactory().getDriverAndroid();
            driver.findElement(WalletElements.pinTexfield1).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield2).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield3).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield4).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield5).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield6).sendKeys("1");
        } else {
            IOSDriver driver = (IOSDriver) test.mobileWebDriverFactory().getDriverIos();
            driver.findElement(WalletElementsIos.pinTexfield1).sendKeys("1");
            driver.findElement(WalletElementsIos.pinTexfield2).sendKeys("1");
            driver.findElement(WalletElementsIos.pinTexfield3).sendKeys("1");
            driver.findElement(WalletElementsIos.pinTexfield4).sendKeys("1");
            driver.findElement(WalletElementsIos.pinTexfield5).sendKeys("1");
            driver.findElement(WalletElementsIos.pinTexfield6).sendKeys("1");
        }
    }

    public void clickConfirm() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickConfirm)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickConfirm)).click();
        }
    }

    public void successMessageOfSetUpPin() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.successMessage)).getText();
            Assert.assertEquals(Literals.Wallet.SUCCESS_MESSAGE.label, pageHeader);
        } else {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.successMessage)).getText();
            Assert.assertEquals(Literals.Wallet.SUCCESS_MESSAGE.label, pageHeader);
        }
    }

    public void loginWallet() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            WebDriver driver = test.mobileWebDriverFactory().getDriverAndroid();
            driver.findElement(WalletElements.pinTexfield1).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield2).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield3).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield4).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield5).sendKeys("1");
            driver.findElement(WalletElements.pinTexfield6).sendKeys("1");
        } else {
//            IOSDriver driver = (IOSDriver) test.mobileWebDriverFactory().getDriverIos();
//            driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Quick Border\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]")).sendKeys("172839");
        }
    }

    public void clickShareButton() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            AndroidDriver driver = (AndroidDriver) test.mobileWebDriverFactory().getDriverAndroid();
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickShare)).click();
            driver.terminateApp("com.android.chrome");
        } else {
            AndroidDriver driver = (AndroidDriver) test.mobileWebDriverFactory().getDriverAndroid();
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickShare)).click();
           // driver.terminateApp("com.apple.mobilesafari");        }
    }
        }

    public void authenticationSuccessfully() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.authenticationSuccess)).getText();
            Assert.assertEquals(Literals.Wallet.AUTHENTICATION_SUCCESS.label, pageHeader);
        } else {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.authenticationSuccess)).getText();
            Assert.assertEquals(Literals.Wallet.AUTHENTICATION_SUCCESS_IOS.label, pageHeader);
        }
    }


    public void loginPageIsDisplayed() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.loginPageIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.LOGIN.label, pageHeader);
        } else {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.loginPageIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.LOGIN.label, pageHeader);
        }
    }


    public void clickContinue() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickContinue)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickContinue)).click();
        }
    }

    public void loadSampleDocuments() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.chooseSampleData)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.chooseSampleData)).click();
        }
    }

    public void welcomePage() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.welcomePage)).getText();
            Assert.assertEquals(Literals.Wallet.WELCOME_PAGE.label, pageHeader);
        } else {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.welcomePage)).getText();
            Assert.assertEquals(Literals.Wallet.WELCOME_HEADER.label, pageHeader);
            IOSDriver driver = (IOSDriver) test.mobileWebDriverFactory().getDriverIos();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
    }

    public void userProfilIsDisplayed() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.userProfil)).getText();
            Assert.assertEquals(Literals.Wallet.USER_PROFIL.label, pageHeader);
        } else {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.welcomeScreen)).getText();
            Assert.assertEquals(Literals.Wallet.WELCOME_HEADER.label, pageHeader);
            IOSDriver driver = (IOSDriver) test.mobileWebDriverFactory().getDriverIos();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }
    }

    public void clickNationalId() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickNationalId)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickNationalId)).click();
        }
    }

    public void nationalIdIsDisplayed() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.nationalIdIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.NATIONAL_ID.label, pageHeader);
        } else {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.nationalIdIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.NATIONAL_ID.label, pageHeader);
        }
    }

    public void clickMdl() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickMdl)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickMdl)).click();
        }
    }

    public void mdlIsDisplayed() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.mdlIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.MDL.label, pageHeader);
        } else {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.mdlIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.MDL.label, pageHeader);
        }
    }

    public void clickDeleteButton() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickDeleteButton)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickDeleteButton)).click();
        }
    }

    public void confirmsDeletion() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.confirmsDeletion)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.confirmsDeletion)).click();
        }
    }

    public void dashboardPageIsDisplayed() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.dashboardPageIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.DASHBOARD_PAGE.label, pageHeader);
        } else {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.dashboardPageIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.DASHBOARD_PAGE.label, pageHeader);
        }
    }

    public void unselectData() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.unselectData)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.unselectData)).click();
        }
    }

    public void correspondingMessageIsDisplayed() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.correspondingMessageIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.CORRESPONDING_MESSAGE.label, pageHeader);
        } else {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.correspondingMessageIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.CORRESPONDING_MESSAGE.label, pageHeader);
        }
    }

    public void clickAgainData() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickaAgainData)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickaAgainData)).click();
        }
    }

    public void addDocButton() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.addDoc)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.addDoc)).click();
        }
    }

    public void addDocumentPageIsDisplayed() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.addDocumentPageIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.ADD_DOCUMENT.label, pageHeader);
        } else {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.addDocumentPageIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.ADD_DOCUMENT.label, pageHeader);
        }
    }

    public void clickNationalIdButton() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickNationalIdButton)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickNationalIdButton)).click();
        }
    }

    public void authenticationMethodSelection() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.authenticationMethodSelection)).getText();
            Assert.assertEquals(Literals.Wallet.AUTHENTICATION_SELECTION.label, pageHeader);
        } else {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.authenticationMethodSelection)).getText();
            Assert.assertEquals(Literals.Wallet.AUTHENTICATION_SELECTION.label, pageHeader);
        }
    }

    public void clickCountrySelection() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.countrySelection)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.countrySelection)).click();
        }
    }

    public void clickSubmit() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickSubmit)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickSubmit)).click();
        }
    }

    public void clickFormEu() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickFormEu)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickFormEu)).click();
        }
    }

    public void dataPageIsDisplayed() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.dataPageIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.DATA_PAGE.label, pageHeader);
        } else {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.dataPageIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.DATA_PAGE.label, pageHeader);
        }
    }

    public void enterGivenName() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickGivenName)).click();
            AppiumDriver driver = (AppiumDriver) test.mobileWebDriverFactory().getDriverAndroid();
            WebElement searchBar = (WebElement) driver.findElement(WalletElements.givenNameField);
            searchBar.clear();
            searchBar.sendKeys("Foteini");
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickGivenName)).click();
            IOSDriver driver = (IOSDriver) test.mobileWebDriverFactory().getDriverIos();
            WebElement searchBar = (WebElement) driver.findElement(WalletElementsIos.givenNameField);
            searchBar.clear();
            searchBar.sendKeys("Foteini");        }
    }

    public void enterFamilyName() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickFamilyName)).click();
            AppiumDriver driver = (AppiumDriver) test.mobileWebDriverFactory().getDriverAndroid();
            WebElement searchBar = (WebElement) driver.findElement(WalletElements.givenFamilyField);
            searchBar.clear();
            searchBar.sendKeys("Theofilatou");
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickFamilyName)).click();
            IOSDriver driver = (IOSDriver) test.mobileWebDriverFactory().getDriverIos();
            WebElement searchBar = (WebElement) driver.findElement(WalletElementsIos.givenFamilyField);
            searchBar.clear();
            searchBar.sendKeys("Theofilatou");        }
    }

    public void chooseBirthDate() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickBirthDate)).click();
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.chooseSet)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickBirthDate)).click();
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.chooseSet)).click();        }
    }

    public void successMessageIsDisplayed() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.successMessageIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.SUCCESS_MESSAGE_PID.label, pageHeader);
        } else {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.successMessageIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.SUCCESS_MESSAGE_PID.label, pageHeader);
        }
    }

    public void clickDrivingLicenceButton() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickDrivingLicenceButton)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickDrivingLicenceButton)).click();
        }
    }

    public void enterDocumentNumber() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.enterDocumentNumber)).click();
            AppiumDriver driver = (AppiumDriver) test.mobileWebDriverFactory().getDriverAndroid();
            WebElement searchBar = (WebElement) driver.findElement(WalletElements.documentNumberField);
            searchBar.clear();
            searchBar.sendKeys("1234");
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.enterDocumentNumber)).click();
            IOSDriver driver = (IOSDriver) test.mobileWebDriverFactory().getDriverIos();
            WebElement searchBar = (WebElement) driver.findElement(WalletElementsIos.documentNumberField);
            searchBar.clear();
            searchBar.sendKeys("1234");        }
    }

    public void chooseIssueDate() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickIssueDate)).click();
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.chooseSet)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickIssueDate)).click();
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.chooseSet)).click();        }
    }

    public void chooseExpiryDate() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickExpiryDate)).click();
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.chooseSet)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickExpiryDate)).click();
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.chooseSet)).click();        }
    }

    public void drivingLicenceIsDisplayed() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.drivingLicenceIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.DRIVING_LICENCE.label, pageHeader);
        } else {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.drivingLicenceIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.DRIVING_LICENCE.label, pageHeader);
        }
    }

    public void successMessageForDrivingIsDisplayed() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.successMessageForDrivingIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.SUCCESS_MESSAGE_DRIVING_LICENCE.label, pageHeader);
        } else {
            String pageHeader = test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.successMessageForDrivingIsDisplayed)).getText();
            Assert.assertEquals(Literals.Wallet.SUCCESS_MESSAGE_DRIVING_LICENCE.label, pageHeader);
        }
    }

    public void drivingLicenceIsDisplayedInDashboard() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElements.drivingLicenceIsDisplayedInDashboard)).getText();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WalletElementsIos.drivingLicenceIsDisplayedInDashboard)).getText();
        }
    }

    public void scrollUntilFindDate() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            WebDriver webDriver = test.mobileWebDriverFactory().getDriverAndroid();
            if (!(webDriver instanceof AppiumDriver)) {
                throw new IllegalStateException(Literals.General.WEB_DRIVER_NOT_INSTANCE_APPIUM_MESSAGE.label);
            }
            AppiumDriver appiumDriver = (AppiumDriver) webDriver;
            while (true) {
                List<WebElement> elements = appiumDriver.findElements(WalletElements.expiryDate);
                if (!elements.isEmpty()) {
                    // Element is found, break the loop.
                    break;
                } else {
                    //element not found, scroll once and then check again.
                    Dimension dimension = appiumDriver.manage().window().getSize();
                    int startX = dimension.width / 2;
                    int startY = (int) (dimension.height * 0.8);
                    int endY = (int) (dimension.height * 0.2);
                    new TouchAction((PerformsTouchActions) appiumDriver)
                            .press(PointOption.point(startX, startY))
                            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(test.envDataConfig().getAppiumShortWaitInMilliseconds())))
                            .moveTo(PointOption.point(startX, endY))
                            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(test.envDataConfig().getAppiumShortWaitInMilliseconds())))
                            .release()
                            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(test.envDataConfig().getAppiumShortWaitInMilliseconds())))
                            .perform();
                }
            }
        } else {
            IOSDriver webDriver = (IOSDriver) test.mobileWebDriverFactory().getDriverIos();
            if (!(webDriver instanceof AppiumDriver)) {
                throw new IllegalStateException(Literals.General.WEB_DRIVER_NOT_INSTANCE_APPIUM_MESSAGE.label);
            }
            AppiumDriver appiumDriver = (AppiumDriver) webDriver;
            while (true) {
                List<WebElement> elements = appiumDriver.findElements(WalletElementsIos.expiryDate);
                if (!elements.isEmpty()) {
                    // Element is found, break the loop.
                    break;
                } else {
                    //element not found, scroll once and then check again.
                    Dimension dimension = appiumDriver.manage().window().getSize();
                    int startX = dimension.width / 2;
                    int startY = (int) (dimension.height * 0.8);
                    int endY = (int) (dimension.height * 0.2);
                    new TouchAction((PerformsTouchActions) appiumDriver)
                            .press(PointOption.point(startX, startY))
                            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(test.envDataConfig().getAppiumShortWaitInMilliseconds())))
                            .moveTo(PointOption.point(startX, endY))
                            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(test.envDataConfig().getAppiumShortWaitInMilliseconds())))
                            .release()
                            .perform();
                }
            }
        }
    }

    public void clickScreen() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickScreen)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickScreen)).click();
        }
    }

    public void clickXButton() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElements.clickXButton)).click();
        } else {
            test.mobileWebDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WalletElementsIos.clickXButton)).click();
        }
    }

    public void userOpensVerifier() {
        if (test.getSystemOperation().equals(Literals.General.ANDROID.label)) {
            AndroidDriver driver = (AndroidDriver) test.mobileWebDriverFactory().getDriverAndroid();
            driver.runAppInBackground(Duration.ofSeconds(10));
            driver.activateApp("com.android.chrome");
            String url = "https://dev.verifier.eudiw.dev/home";
            Map<String, Object> args = new HashMap<>();
            args.put("command", "am");
            args.put("args", new String[]{"start", "-a", "android.intent.action.VIEW", "-d", url});
            driver.executeScript("mobile:shell", args);
        }else{
            IOSDriver driver = (IOSDriver) test.mobileWebDriverFactory().getDriverIos();
            driver.runAppInBackground(Duration.ofSeconds(10));
            driver.activateApp("com.apple.mobilesafari");
            String url = "https://dev.verifier.eudiw.dev/home";
            driver.get(url);
            Map<String, Object> args = new HashMap<>();
            args.put("bundleId", "com.apple.mobilesafari");
            driver.executeScript("mobile: launchApp", args);
        }
    }

    public void unZoomScreen() {
        IOSDriver driver = (IOSDriver) test.mobileWebDriverFactory().getDriverIos();

        WebElement screen = driver.findElement(By.className("XCUIElementTypeApplication"));
        int centerX = screen.getLocation().getX() + screen.getSize().getWidth() / 2;
        int centerY = screen.getLocation().getY() + screen.getSize().getHeight() / 2;
         int distance = 100;
         TouchAction<?> action1 = new TouchAction<>(driver)
                 .press(PointOption.point(centerX, centerY))
                 .moveTo(PointOption.point(-distance, -distance))
                 .release();
         TouchAction<?> action2 = new TouchAction<>(driver)
                 .press(PointOption.point(centerX, centerY))
                 .moveTo(PointOption.point(distance, distance))
                 .release();
         new MultiTouchAction(driver)
                 .add(action1)
                 .add(action2)
                 .perform();
    }

}