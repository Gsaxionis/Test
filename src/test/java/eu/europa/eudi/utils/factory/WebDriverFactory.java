package eu.europa.eudi.utils.factory;

import eu.europa.eudi.utils.Test;
import eu.europa.eudi.utils.TestLibrary;
import eu.europa.eudi.utils.browsers.Chrome;
import eu.europa.eudi.utils.browsers.Firefox;
import eu.europa.eudi.utils.browsers.Safari;
import eu.europa.eudi.utils.config.EnvDataConfig;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class WebDriverFactory {
    public static final String URL = "app.url";

    TestLibrary test;

    WebDriver driver;

    WebDriverWait waitDriver;

    EnvDataConfig envDataConfig;

    FluentWait<WebDriver> fluentWait;

    ContextFactory context;

    public WebDriverFactory(TestLibrary test) {
        this.test = test;
        envDataConfig = new EnvDataConfig();
        context = test.context();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return waitDriver;
    }

    public FluentWait<WebDriver> getFluentWait() {
        return fluentWait;
    }


    public WebDriverFactory openBrowser() {
        if (driver == null) {
            switch (test.envDataConfig().getBrowser()) {
                case "chrome": {
                    Chrome chrome = new Chrome();
                    driver = chrome.start();
                    break;
                }
                case "firefox": {
                    Firefox firefox = new Firefox();
                    driver = firefox.start();
                    break;
                }
                case "safari": {
                    Safari safari = new Safari();
                    driver = safari.start();
                    break;
                }
                default:
                    throw new IllegalStateException("Invalid BROWSER value on env.properties");
            }
        }
        waitDriver = new WebDriverWait(driver, Duration.ofMillis(1000));
       // fluentWait = new FluentWait<>(driver).withTimeout(1000);
        test.context().setUiTest(true);
        return this;
    }

    public void openVerifier() {
        test.webDriverFactory().getDriver().get(envDataConfig.getURLVerifier());
    }

    public void openCredentialOffer() {
        WebDriver driver = test.webDriverFactory().getDriver();

        Thread certThread = new Thread(() -> {
            try {
                // Delay to allow the prompt to possibly appear
                Thread.sleep(1000); // Adjust this time based on when the prompt usually appears

                Robot robot = new Robot();
//                 Assuming the dialog is already focused, simulate pressing Enter
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);




            } catch (AWTException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        );

// Start the certification handling thread
        certThread.start();

// Load the page
        driver.get(envDataConfig.getURLCredential());

        try {
            certThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread was interrupted during join.");
        }


    }

    public void entersIdAndPassword() {
    }

    public void openId() {
        test.webDriverFactory().getDriver().get(envDataConfig.getURLOpenId());
    }

    /*public void closeBrowser(Scenario scenario) {
        if (scenario.isFailed())
            try {
                File screenshot =
                        ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                try {
                    scenario.attach(Files.readAllBytes(screenshot.toPath()), "image/png", "");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (ClassCastException cce) {
                cce.printStackTrace();
            }
        driver.close();
        driver.quit();
        if (System.getProperty("os.name").toLowerCase().contains("win")
                && context.getUITest()
                && envDataConfig.getRemoteURL().isEmpty()) {
            try {
                switch (envDataConfig.getBrowser()) {
                    case "chrome": {
                        Runtime.getRuntime().exec("taskkill /IM chromegetDriver().exe /F").waitFor();
                        break;
                    }
                    case "firefox": {
                        Runtime.getRuntime().exec("taskkill /IM geckogetDriver().exe /F").waitFor();
                        break;
                    }
                    case "edge": {
                        Runtime.getRuntime().exec("taskkill /IM msedgegetDriver().exe /F").waitFor();
                        break;
                    }
                    case "ie": {
                        Runtime.getRuntime().exec("taskkill /IM IEDriverServer.exe /F").waitFor();
                        break;
                    }
                }
            } catch (IOException | InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }*/

}
