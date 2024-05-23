package eu.europa.eudi.elements.android;

import org.openqa.selenium.By;

public class WebVerifier {
    public static By requestPid = By.id("mat-radio-3");
    public static By clickNext = By.id("next_button");
    public static By copyUrl = By.className("authorize");
    public static By clickId = By.id("loginId");
    public static By clickPassword = By.id("password");
    public static By removeText = By.id("credentialConfigurationIds");
    public static By enterValue = By.id("txCode");
    public static By enterInputMode = By.id("txCodeInputMode");
    public static By enterDescription = By.id("txCodeDescription");
    public static By clickSubmit = By.cssSelector("button.submit_button[type='submit'][name='authorized'][value='Submit']");
    public static By offerUrl = By.xpath("//a[@href='https://trial.authlete.net/api/offer/tEcsTSqrjVlt67hX9IhYfGFadYcj7LYpHpAI-m41OSI']");
    public static By clickLoginGoogle = By.cssSelector(".btn.btn-lg.btn-danger.bg-gradient.border.border-secondary");
    public static By instertEmail = By.id("identifierId");
    public static By clickNextButtonEmail = By.id("identifierNext");
    public static By insertPassword = By.cssSelector("input[type='password'][name='Passwd'][aria-label='Enter your password']");
    public static By passwordNext = By.id("passwordNext");
    public static By clickNewTestPlan = By.cssSelector("a.btn.btn-sm.btn-info.bg-gradient.border.border-secondary[href='schedule-test.html']");
    public static By clickTestPlanField = By.id("planSelect");
    public static By testPlanCategories = By.cssSelector("label[for='planSelect']");
    public static By clickCredentialFormat = By.id("vp_credential_format");
    public static By clientIdScheme = By.id("vp_client_id_scheme");
    public static By requestUi = By.id("vp_request_method");
    public static By requestMode = By.id("vp_response_mode");
    public static By clickAlias = By.cssSelector("input[data-json-target='alias']");
    public static By clickDescription = By.cssSelector("input[data-json-target='description']");
    public static By clickCreateTestPlan = By.id("createPlanBtn");
    public static By clickRunTest = By.cssSelector("button.btn.btn-sm.btn-light.bg-gradient.border.border-secondary.startBtn");
    public static By copiesOpenidUrl = By.cssSelector("dd.col-sm-6.wrapLongStrings i");
    public static By testPlanPage = By.cssSelector("a.btn.btn-sm.btn-info.bg-gradient.border.border-secondary");
}
