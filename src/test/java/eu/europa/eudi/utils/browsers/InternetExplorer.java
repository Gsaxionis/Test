package eu.europa.eudi.utils.browsers;

import eu.europa.eudi.utils.config.EnvDataConfig;
import eu.europa.eudi.utils.config.ResourcesConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class InternetExplorer {

    ResourcesConfig resourcesConfig = new ResourcesConfig();

    EnvDataConfig envDataConfig = new EnvDataConfig();

    public WebDriver start() {
        String remoteURL = (String) envDataConfig.getRemoteURL();
        if (!remoteURL.isEmpty()) {
            try {
                RemoteWebDriver driver = new RemoteWebDriver(new URL(remoteURL), getInternetExplorerOptions());
                driver.setFileDetector(new LocalFileDetector());
                return driver;
            } catch (MalformedURLException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            return new InternetExplorerDriver(getInternetExplorerOptions());
        }
    }


    private InternetExplorerOptions getInternetExplorerOptions() {
        //System.setProperty("browser", "ie");
        //System.setProperty("webdriver.ie.driver", resourcesConfig.getInternetExplorerDriver());
        WebDriverManager.iedriver().setup();

        InternetExplorerOptions options = new InternetExplorerOptions();
        options.setCapability("requireWindowFocus", true);
        options.setCapability("enablePersistentHover", false);
        options.setCapability("ignoreProtectedModeSettings", false);
        options.setCapability("browser.download.dir", resourcesConfig.getOutputDir());
      //  options.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
        return options;
    }
}



