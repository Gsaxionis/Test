package eu.europa.eudi.pages;

import eu.europa.eudi.elements.android.WebVerifier;
import eu.europa.eudi.utils.Test;
import eu.europa.eudi.utils.TestLibrary;
import eu.europa.eudi.utils.common.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.time.Duration;

public class WebVerifierPage {

    Logger logger;

    TestLibrary test;

    public WebVerifierPage(TestLibrary test) {
        this.test = test;
    }

    public void chooseRequestPid() {
        test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.requestPid)).click();
    }

    public void clickNextButton() {
        test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.clickNext)).click();
    }

    public void copyLink() throws UnsupportedEncodingException {
        try {
        String href = test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.copyUrl)).getAttribute("href");
        System.out.println("Url: " + href);
        String decodedHref = URLDecoder.decode(href, StandardCharsets.UTF_8);
        System.out.println("Decoded Link: " + decodedHref);
        writeToFile(decodedHref, "decoded_url.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        test.webDriverFactory().getDriver().quit();
    }

    private static void writeToFile(String data, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public void entersIdAndPassword() throws InterruptedException {
        test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.clickId)).sendKeys("inga");
        test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.clickPassword)).sendKeys("inga");
        Thread.sleep(1000);
    }

    public void removesText() throws InterruptedException {
        WebElement textarea = test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.removeText));
        String currentText = textarea.getAttribute("value");
        String stringToRemove = ",\n" +
                "  \"org.iso.18013.5.1.mDL\"";
        String modifiedText = currentText.replace(stringToRemove, "").replace(",  ]", "]").replace(", ]", "]").trim();
        textarea.clear();
        textarea.sendKeys(modifiedText);
        Thread.sleep(1000);

    }

    public void entersValue() throws InterruptedException {
        test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.enterValue)).sendKeys("12345");
        Thread.sleep(1000);
    }

    public void entersInputMode() throws InterruptedException {
        test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.enterInputMode)).sendKeys("numeric");
        Thread.sleep(1000);
    }

    public void entersDescription() throws InterruptedException {
        test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.enterDescription)).sendKeys("description");
        Thread.sleep(1000);
    }

    public void clickSubmit() throws InterruptedException {
        WebElement button = test.webDriverFactory().getWait().until(ExpectedConditions.elementToBeClickable(WebVerifier.clickSubmit));
        JavascriptExecutor js = (JavascriptExecutor) test.webDriverFactory().getDriver();
        js.executeScript("arguments[0].click();", button);
        Thread.sleep(1000);
    }

    public void urlOffer() {
       String url_offer = test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='indent']/code/a"))).getAttribute("href");;
        System.out.println(url_offer);
        writeToFile(String.valueOf(url_offer), "offer_url.txt");
        test.webDriverFactory().getDriver().quit();
    }

    public void clickLoginWithGoogle() throws InterruptedException {
        test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.clickLoginGoogle)).click();
        Thread.sleep(1000);
    }

    public void instertEmail() throws InterruptedException {
        test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.instertEmail)).sendKeys("intrasoftwallet@gmail.com");
        test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.clickNextButtonEmail)).click();
        Thread.sleep(1000);
    }

    public void insertPassword() throws InterruptedException {
        test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.insertPassword)).sendKeys("intrasoftwallet2024!");
        Thread.sleep(1000);
        test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.passwordNext)).click();
        Thread.sleep(1000);
    }

    public void clickNewTestPlan() throws InterruptedException {
        WebElement button = test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.clickNewTestPlan));
        JavascriptExecutor js = (JavascriptExecutor) test.webDriverFactory().getDriver();
        js.executeScript("arguments[0].click();", button);
        Thread.sleep(1000);
    }

    public void clickTestPlanField() throws InterruptedException {
        String text = test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.testPlanCategories)).getText();
        Assert.assertEquals("Test Plan", text);
        Thread.sleep(5000);
        WebElement dropdownElement = test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.clickTestPlanField));
        Thread.sleep(2000);
        Select dropdown = new Select(dropdownElement);
        Thread.sleep(2000);
        dropdown.selectByVisibleText("OpenID for Verifiable Presentations ID2: Alpha tests (not currently part of certification program)");

    }

    public void clickCredentialFormat() throws InterruptedException {
        WebElement dropdownElement = test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.clickCredentialFormat));
        Thread.sleep(1000);
        Select dropdown = new Select(dropdownElement);
        Thread.sleep(1000);
        dropdown.selectByVisibleText("iso_mdl");

    }

    public void clickClientIdScheme() throws InterruptedException {
        WebElement dropdownElement = test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.clientIdScheme));
        Thread.sleep(1000);
        Select dropdown = new Select(dropdownElement);
        Thread.sleep(1000);
        dropdown.selectByVisibleText("x509_san_dns");
    }

    public void clickRequestUi() throws InterruptedException {
        WebElement dropdownElement = test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.requestUi));
        Thread.sleep(1000);
        Select dropdown = new Select(dropdownElement);
        Thread.sleep(1000);
        dropdown.selectByVisibleText("request_uri_signed");
    }

    public void clickRequestMode() throws InterruptedException {
        WebElement dropdownElement = test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.requestMode));
        Thread.sleep(1000);
        Select dropdown = new Select(dropdownElement);
        Thread.sleep(1000);
        dropdown.selectByVisibleText("direct_post.jwt");
    }

    public void entersAlias() {
        test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.clickAlias)).sendKeys("dtsiflitz");
    }

    public void clicksDescription() throws InterruptedException {
        test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.clickDescription)).sendKeys("ISO MDL TEST");
    }

    public void entersPresentationDefinition() {
        WebElement textArea = test.webDriverFactory().getDriver().findElement(By.cssSelector("textarea[data-json-target='client.presentation_definition']"));

        // Send text to the textarea
        textArea.sendKeys("{\n" +
                "    \"id\": \"32f54163-7166-48f1-93d8-ff217bdb0653\",\n" +
                "    \"input_descriptors\": [\n" +
                "        {\n" +
                "            \"id\": \"eudi_pid\",\n" +
                "            \"name\": \"EUDI PID\",\n" +
                "            \"purpose\": \"We need to verify your identity\",\n" +
                "            \"constraints\": {\n" +
                "                \"fields\": [\n" +
                "                    {\n" +
                "                        \"path\": [\n" +
                "                            \"$.mdoc.doctype\"\n" +
                "                        ],\n" +
                "                        \"filter\": {\n" +
                "                            \"type\": \"string\",\n" +
                "                            \"const\": \"eu.europa.ec.eudiw.pid.1\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"path\": [\n" +
                "                            \"$.mdoc.namespace\"\n" +
                "                        ],\n" +
                "                        \"filter\": {\n" +
                "                            \"type\": \"string\",\n" +
                "                            \"const\": \"eu.europa.ec.eudiw.pid.1\"\n" +
                "                        }\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"path\": [\n" +
                "                            \"$.mdoc.family_name\"\n" +
                "                        ],\n" +
                "                        \"intent_to_retain\": false\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"path\": [\n" +
                "                            \"$.mdoc.given_name\"\n" +
                "                        ],\n" +
                "                        \"intent_to_retain\": false\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"path\": [\n" +
                "                            \"$.mdoc.age_over_18\"\n" +
                "                        ],\n" +
                "                        \"intent_to_retain\": false\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        }\n" +
                "    ]\n" +
                "}");
    }

    public void entersJwks() throws InterruptedException {
        WebElement textArea = test.webDriverFactory().getDriver().findElement(By.cssSelector("textarea[data-json-target='client.jwks']"));

        // Send text to the textarea
        textArea.sendKeys("{\n" +
                "    \"keys\": [\n" +
                "        {\n" +
                "            \"kty\": \"EC\",\n" +
                "            \"x5t#S256\": \"mNSaku4wmTWrxn30vjklUlQAvZrD2WnsDc5KoaAL7xA\",\n" +
                "            \"nbf\": 1708915039,\n" +
                "            \"d\": \"oUil39Mib5aBRy58VTOnZ-YDOqPx_VyPaD-SixzY-1c\",\n" +
                "            \"use\": \"sig\",\n" +
                "            \"crv\": \"P-256\",\n" +
                "            \"kid\": \"demo.certification.openid.net\",\n" +
                "            \"x5c\": [\n" +
                "                \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSURMakNDQXJPZ0F3SUJBZ0lVQ1BmcDJLR3JjOW83V2duNFVhazFXK0xOc0xJd0NnWUlLb1pJemowRUF3SXdYREVlTUJ3R0ExVUVBd3dWVUVsRUlFbHpjM1ZsY2lCRFFTQXRJRlZVSURBeE1TMHdLd1lEVlFRS0RDUkZWVVJKSUZkaGJHeGxkQ0JTWldabGNtVnVZMlVnU1cxd2JHVnRaVzUwWVhScGIyNHhDekFKQmdOVkJBWVRBbFZVTUI0WERUSTBNREl5TmpBeU16Y3hPVm9YRFRJMk1ESXlOVEF5TXpjeE9Gb3dhVEVkTUJzR0ExVUVBd3dVUlZWRVNTQlNaVzF2ZEdVZ1ZtVnlhV1pwWlhJeEREQUtCZ05WQkFVVEF6QXdNVEV0TUNzR0ExVUVDZ3drUlZWRVNTQlhZV3hzWlhRZ1VtVm1aWEpsYm1ObElFbHRjR3hsYldWdWRHRjBhVzl1TVFzd0NRWURWUVFHRXdKVlZEQlpNQk1HQnlxR1NNNDlBZ0VHQ0NxR1NNNDlBd0VIQTBJQUJLbzNwT1JaeHU5cjZSOWx6aFN5SFZuL0dDVTlYOXdqR0NhdnM4aldBZ1V3cSsvRmp1L0FRYUJ0dGJHK25iZ1BSVTlJUkpGUHpFYitqeHBUOVpNVThXQ2pnZ0ZFTUlJQlFEQU1CZ05WSFJNQkFmOEVBakFBTUI4R0ExVWRJd1FZTUJhQUZMTnN1SkVYSE5la0dtWXhoMExoaThCQXpKVWJNQ2dHQTFVZEVRUWhNQitDSFdSbGJXOHVZMlZ5ZEdsbWFXTmhkR2x2Ymk1dmNHVnVhV1F1Ym1WME1CSUdBMVVkSlFRTE1Ba0dCeWlCakYwRkFRWXdRd1lEVlIwZkJEd3dPakE0b0RhZ05JWXlhSFIwY0hNNkx5OXdjbVZ3Y205a0xuQnJhUzVsZFdScGR5NWtaWFl2WTNKc0wzQnBaRjlEUVY5VlZGOHdNUzVqY213d0hRWURWUjBPQkJZRUZGTlExR3JEUU5Xcm1tTkRha0luRkx6ZkUyMXpNQTRHQTFVZER3RUIvd1FFQXdJSGdEQmRCZ05WSFJJRVZqQlVobEpvZEhSd2N6b3ZMMmRwZEdoMVlpNWpiMjB2WlhVdFpHbG5hWFJoYkMxcFpHVnVkR2wwZVMxM1lXeHNaWFF2WVhKamFHbDBaV04wZFhKbExXRnVaQzF5WldabGNtVnVZMlV0Wm5KaGJXVjNiM0pyTUFvR0NDcUdTTTQ5QkFNQ0Eya0FNR1lDTVFDOUpXUmJBa3VCYU9RandPd1FGeWZOV1d1ZFdlYnV4NUhMWFpkZXhWLzlMaEYvQUdITFlsYTVEMVhCZFNEUThqMENNUURxTndqQVlkL3UyUm9tcit4TGt5RnUvaXBrYmVuSndPUEJyRC9oajB3RTZWeDNaSmNBTkwzUWFxelF2T0llVzI4PQotLS0tLUVORCBDRVJUSUZJQ0FURS0tLS0t\",\n" +
                "                \"LS0tLS1CRUdJTiBDRVJUSUZJQ0FURS0tLS0tCk1JSURIVENDQXFPZ0F3SUJBZ0lVVnFqZ3RKcWY0aFVZSmtxZFl6aSsweHdod0ZZd0NnWUlLb1pJemowRUF3TXdYREVlTUJ3R0ExVUVBd3dWVUVsRUlFbHpjM1ZsY2lCRFFTQXRJRlZVSURBeE1TMHdLd1lEVlFRS0RDUkZWVVJKSUZkaGJHeGxkQ0JTWldabGNtVnVZMlVnU1cxd2JHVnRaVzUwWVhScGIyNHhDekFKQmdOVkJBWVRBbFZVTUI0WERUSXpNRGt3TVRFNE16UXhOMW9YRFRNeU1URXlOekU0TXpReE5sb3dYREVlTUJ3R0ExVUVBd3dWVUVsRUlFbHpjM1ZsY2lCRFFTQXRJRlZVSURBeE1TMHdLd1lEVlFRS0RDUkZWVVJKSUZkaGJHeGxkQ0JTWldabGNtVnVZMlVnU1cxd2JHVnRaVzUwWVhScGIyNHhDekFKQmdOVkJBWVRBbFZVTUhZd0VBWUhLb1pJemowQ0FRWUZLNEVFQUNJRFlnQUVGZzVTaGZzeHA1Ui9VRklFS1MzTDI3ZHduRmhualNnVWgyYnRLT1FFbmZiM2RveWVxTUF2QnRVTWxDbGhzRjN1ZWZLaW5DdzA4TkIzMXJ3QytkdGo2WC9MRTNuMkM5alJPSVVOOFBybmxMUzVRczRSczRaVTVPSWd6dG9hTzhHOW80SUJKRENDQVNBd0VnWURWUjBUQVFIL0JBZ3dCZ0VCL3dJQkFEQWZCZ05WSFNNRUdEQVdnQlN6YkxpUkZ4elhwQnBtTVlkQzRZdkFRTXlWR3pBV0JnTlZIU1VCQWY4RUREQUtCZ2dyZ1FJQ0FBQUJCekJEQmdOVkhSOEVQREE2TURpZ05xQTBoakpvZEhSd2N6b3ZMM0J5WlhCeWIyUXVjR3RwTG1WMVpHbDNMbVJsZGk5amNtd3ZjR2xrWDBOQlgxVlVYekF4TG1OeWJEQWRCZ05WSFE0RUZnUVVzMnk0a1JjYzE2UWFaakdIUXVHTHdFRE1sUnN3RGdZRFZSMFBBUUgvQkFRREFnRUdNRjBHQTFVZEVnUldNRlNHVW1oMGRIQnpPaTh2WjJsMGFIVmlMbU52YlM5bGRTMWthV2RwZEdGc0xXbGtaVzUwYVhSNUxYZGhiR3hsZEM5aGNtTm9hWFJsWTNSMWNtVXRZVzVrTFhKbFptVnlaVzVqWlMxbWNtRnRaWGR2Y21zd0NnWUlLb1pJemowRUF3TURhQUF3WlFJd2FYVUEzaisreGwvdGRENzZ0WEVXQ2lrZk0xQ2FSejR2ekJDN05TMHdDZEl0S2l6NkhaZVY4RVB0TkNuc2ZLcE5BakVBcXJkZUtEbnI1S3dmOEJBN3RBVGVoeE5sT1Y0SG5jMTBYTzFYVUx0aWdDd2I0OVJwa3FsUzJIdWwrRHBxT2JVcwotLS0tLUVORCBDRVJUSUZJQ0FURS0tLS0t\"\n" +
                "            ],\n" +
                "            \"x\": \"qjek5FnG72vpH2XOFLIdWf8YJT1f3CMYJq-zyNYCBTA\",\n" +
                "            \"y\": \"q-_Fju_AQaBttbG-nbgPRU9IRJFPzEb-jxpT9ZMU8WA\",\n" +
                "            \"exp\": 1771987038,\n" +
                "            \"alg\": \"ES256\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"kty\": \"EC\",\n" +
                "            \"d\": \"7N8jd8HvUp3vHC7a-xitehRnYuyZLy3kqkxG7KmpfMY\",\n" +
                "            \"use\": \"enc\",\n" +
                "            \"crv\": \"P-256\",\n" +
                "            \"kid\": \"A541J5yUqazgE8WBFkIyeh2OtK-udqUR_OC0kB7l3oU\",\n" +
                "            \"x\": \"cwYyuS94hcOtcPlrMMtGtflCfbZUwz5Mf1Gfa2m0AM8\",\n" +
                "            \"y\": \"KB7sJkFQyB8jZHO9vmWS5LNECL4id3OJO9HX9ChNonA\",\n" +
                "            \"alg\": \"ECDH-ES\"\n" +
                "        }\n" +
                "    ]\n" +
                "}");
        Thread.sleep(1000);
    }

    public void clicksCreateTestPlan() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) test.webDriverFactory().getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(1000);
        test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.clickCreateTestPlan)).click();
        Thread.sleep(1000);
    }

    public void clickRunTest() throws InterruptedException {
        WebElement button = test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.clickRunTest));
        JavascriptExecutor js = (JavascriptExecutor) test.webDriverFactory().getDriver();
        js.executeScript("arguments[0].click();", button);
        Thread.sleep(1000);
    }

    public void copiesOpenIdUrl() {
        String url_OpenId = test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.copiesOpenidUrl)).getText();
        System.out.println("OpenId url: " + url_OpenId);
        writeToFile(String.valueOf(url_OpenId), "openId_url.txt");
        test.webDriverFactory().getDriver().quit();
    }

    public void testPlanPageIsDisplayed() {
        String testPlanPage = test.webDriverFactory().getWait().until(ExpectedConditions.visibilityOfElementLocated(WebVerifier.testPlanPage)).getText();
        Assert.assertEquals(" Create a new test plan", testPlanPage);

    }
}
