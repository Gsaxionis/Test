package eu.europa.eudi.utils.browsers;

import eu.europa.eudi.utils.config.EnvDataConfig;
import eu.europa.eudi.utils.config.ResourcesConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class Safari {
    ResourcesConfig resourcesConfig = new ResourcesConfig();
    EnvDataConfig envDataConfig = new EnvDataConfig();

    public WebDriver start() {
        String remoteURL = envDataConfig.getDriverRemoteURL();
        if (!remoteURL.isEmpty()) {
            try {
                RemoteWebDriver driver = new RemoteWebDriver(new URL(remoteURL), getSafariOptions());
                return driver;
            } catch (MalformedURLException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            return new SafariDriver(getSafariOptions());
        }
    }

    private SafariOptions getSafariOptions() {
        SafariOptions options = new SafariOptions();
        // Safari does not have as many options to configure as Chrome, but you can set some capabilities
//        if (envDataConfig.getHeadlessMode()) {
//            options.setHeadless(true);
//
//        }

        // Since Safari doesn't support the same level of customization as Chrome, you might not be able to directly translate all ChromeOptions settings
        // However, general capabilities like ignoring SSL errors can be set here
        options.setCapability("ignoreProtectedModeSettings", true);
        options.setCapability("automaticInspection", true); // Enable automatic opening of the inspector for tabs

        return options;
    }
}

