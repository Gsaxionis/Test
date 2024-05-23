package eu.europa.eudi.utils;

import eu.europa.eudi.utils.common.Logger;
import eu.europa.eudi.utils.config.EnvDataConfig;
import eu.europa.eudi.utils.factory.ContextFactory;
import eu.europa.eudi.utils.factory.PageObjectFactory;
import eu.europa.eudi.utils.factory.WebDriverFactory;

public class TestLibrary {
    EnvDataConfig envDataConfig;
    PageObjectFactory pageObjectFactory;

    ContextFactory contextFactory;

    WebDriverFactory webDriverFactory;
    Logger logger;

    public TestLibrary() {

        contextFactory = new ContextFactory();
//        mobileWebDriverFactory = new MobileWebDriverFactory(Test.this);
        webDriverFactory = new WebDriverFactory(TestLibrary.this);
//        mobilePageObjectFactory = new MobilePageObjectFactory(Test.this);
        pageObjectFactory = new PageObjectFactory(TestLibrary.this);
        logger = new Logger();
    }
    public Logger logger() {
        return logger;
    }

    public PageObjectFactory web() {
        return pageObjectFactory;
    }

    public ContextFactory context() {
        return contextFactory;
    }

    public WebDriverFactory webDriverFactory() {
        return webDriverFactory;
    }

    public EnvDataConfig envDataConfig() {
        return (envDataConfig == null) ? envDataConfig = new EnvDataConfig() : envDataConfig;
    }
}
