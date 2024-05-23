package eu.europa.eudi.stepdefs;

import eu.europa.eudi.utils.Test;
import eu.europa.eudi.utils.TestLibrary;
import eu.europa.eudi.utils.common.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.UnsupportedEncodingException;

public class GeneralStepDefsLibrary {
    Logger logger;
    TestLibrary test;

    public GeneralStepDefsLibrary() {

        this.test = new TestLibrary();
        logger = test.logger();
    }
    @Given("user opens web Verifier App")
    public void userOpensWebVerifierApp() {
        test.webDriverFactory().openBrowser().openVerifier();
    }

    @And("user selects request for the entire PID")
    public void userSelectsRequestForTheEntirePID() {
        test.web().webVerifierPage().chooseRequestPid();
    }

    @And("user clicks next button on verifier")
    public void userClicksNextButtonOnVerifier() {
        test.web().webVerifierPage().clickNextButton();
    }

    @And("user copies url link and decode it")
    public void userCopiesUrlLink() throws UnsupportedEncodingException {
        test.web().webVerifierPage().copyLink();
    }

    @Given("user opens Credential Offer page")
    public void userOpensCredentialOfferPage() {
        test.webDriverFactory().openBrowser().openCredentialOffer();
    }

    @And("user enters id and password")
    public void userEntersIdAndPassword() throws InterruptedException {
        test.web().webVerifierPage().entersIdAndPassword();
    }

    @And("user removes a text")
    public void userRemovesAText() throws InterruptedException {
        test.web().webVerifierPage().removesText();

    }

    @And("user enters value")
    public void userEntersValue() throws InterruptedException {
        test.web().webVerifierPage().entersValue();
    }

    @And("user enters input mode")
    public void userEntersInputMode() throws InterruptedException {
        test.web().webVerifierPage().entersInputMode();
    }

    @And("user enters description")
    public void userEntersDescription() throws InterruptedException {
        test.web().webVerifierPage().entersDescription();
    }

    @And("user clicks submit")
    public void userClicksSubmit() throws InterruptedException {
        test.web().webVerifierPage().clickSubmit();
    }

    @Then("user copies url link offer and decode it")
    public void userCopiesUrlLinkOfferAndDecodeIt() {
        test.web().webVerifierPage().urlOffer();
    }

    @Given("user opens Credential OpenId page")
    public void userOpensCredentialOpenIdPage() {
        test.webDriverFactory().openBrowser().openId();
    }

    @And("user clicks login with google")
    public void userClicksLoginWithGoogle() throws InterruptedException {
        test.web().webVerifierPage().clickLoginWithGoogle();
    }

    @And("user inserts email")
    public void userInsertsEmail() throws InterruptedException {
        test.web().webVerifierPage().instertEmail();
    }

    @And("user inserts password")
    public void userInsertsPassword() throws InterruptedException {
        test.web().webVerifierPage().insertPassword();
    }

    @And("user clicks new test plan")
    public void userClicksNewTestPlan() throws InterruptedException {
        test.web().webVerifierPage().testPlanPageIsDisplayed();
        test.web().webVerifierPage().clickNewTestPlan();
    }

    @And("user clicks test plan field")
    public void userClickTestPlanField() throws InterruptedException {
        test.web().webVerifierPage().clickTestPlanField();
    }

    @And("user clicks Credential Format")
    public void userClicksCredentialFormat() throws InterruptedException {
        test.web().webVerifierPage().clickCredentialFormat();
    }

    @And("user clicks Client Id Scheme")
    public void userClicksClientIdScheme() throws InterruptedException {
        test.web().webVerifierPage().clickClientIdScheme();
    }

    @And("user clicks request uri")
    public void userClicksRequestUri() throws InterruptedException {
        test.web().webVerifierPage().clickRequestUi();
    }

    @And("user clicks Response Mode")
    public void userClicksResponseMode() throws InterruptedException {
        test.web().webVerifierPage().clickRequestMode();
    }

    @And("user enters an Alias")
    public void userEntersAnAlias() {
        test.web().webVerifierPage().entersAlias();
    }

    @And("user clicks description")
    public void userClicksDescription() throws InterruptedException {
        test.web().webVerifierPage().clicksDescription();
    }

    @And("user enters presentation definition")
    public void userEntersPresentationDefinition() {
        test.web().webVerifierPage().entersPresentationDefinition();
    }

    @And("user enters jwks")
    public void userEntersJwks() throws InterruptedException {
        test.web().webVerifierPage().entersJwks();
    }

    @And("user clicks create test plan")
    public void userClicksCreateTestPlan() throws InterruptedException {
        test.web().webVerifierPage().clicksCreateTestPlan();
    }

    @And("user clicks run test")
    public void userClicksRunTest() throws InterruptedException {
        test.web().webVerifierPage().clickRunTest();
    }

    @And("user copies openid url link")
    public void userCopiesOpenidUrlLink() {
        test.web().webVerifierPage().copiesOpenIdUrl();
    }
}

