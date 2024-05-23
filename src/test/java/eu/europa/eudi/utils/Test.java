package eu.europa.eudi.utils;

import eu.europa.eudi.utils.config.EnvDataConfig;
import eu.europa.eudi.utils.factory.*;
import io.cucumber.java.Scenario;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.WebDriverFactory;

public class Test {
    EnvDataConfig envDataConfig;
    MobileWebDriverFactory mobileWebDriverFactory;

    MobilePageObjectFactory mobilePageObjectFactory;

    ContextFactory contextFactory;

    String systemOperation;

    Scenario scenario;
  //  boolean noReset;
    public Test(boolean noReset, String systemOperation, Scenario scenario) {
//        this.system_operation = Literals.General.ANDROID.label;
//        this.noReset = false;
        this.systemOperation = systemOperation;
        this.scenario = scenario;
        mobileWebDriverFactory = new MobileWebDriverFactory(Test.this, noReset);
        mobilePageObjectFactory = new MobilePageObjectFactory(Test.this);

    }



    public MobilePageObjectFactory mobile() {
        return mobilePageObjectFactory;
    }

    public ContextFactory context() {
        return contextFactory;
    }

    public MobileWebDriverFactory mobileWebDriverFactory() {
        return mobileWebDriverFactory;
    }


    public EnvDataConfig envDataConfig() {
        return (envDataConfig == null) ? envDataConfig = new EnvDataConfig() : envDataConfig;
    }

    public void startAndroidDriverSession() {

        mobileWebDriverFactory.startAndroidDriverSession();
    }

    public void startIosDriverSession() {

        mobileWebDriverFactory.startIosDriverSession();
    }

    public void stopAndroidDriverSession() {
        mobileWebDriverFactory.quitDriverAndroid();
    }
    public void stopIosDriverSession() {
        mobileWebDriverFactory.quitDriverIos();
    }

//    public void setNoReset(boolean noReset){
//        this.noReset = noReset;
//    }
//
//    public void setSystemOperation(String system_operation){
//        this.system_operation = system_operation;
//    }

    public String getSystemOperation(){
        return systemOperation;
    }
//    public Boolean getNoReset(){
//        return noReset;
//    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }
    public Scenario getScenario() {
        return scenario;
    }






}
