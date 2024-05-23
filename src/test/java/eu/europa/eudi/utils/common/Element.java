package eu.europa.eudi.utils.common;

import eu.europa.eudi.utils.TestLibrary;
import eu.europa.eudi.utils.config.EnvDataConfig;
import net.thucydides.junit.annotations.TestData;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Element {

    TestLibrary test;

    EnvDataConfig envDataConfig;

    TestData testData;

    Wait wait;

    WebDriver driver;

//    public Element(Test test) {
//        this.test = test;
//        envDataConfig = new EnvDataConfig();
//        testData = new TestData(test);
//        wait = new Wait(test);
//        driver = test.webDriverFactory().getDriver();
//    }


//    public Html html() {
//        return (html == null) ? html = new Html(test) : html;
//    }


    public boolean isElementPresent(By by) {
        return !driver.findElements(by).isEmpty();
    }

    public WebElement getElement(By by) {
        return driver.findElement(by);
    }

    public List<WebElement> getElements(By by) {
        return driver.findElements(by);
    }

    public static By getByFromElement(WebElement element) {
        By by = null;
        String[] pathVariables = null;

        if (element.toString().contains("->")) {
            pathVariables = (element.toString().split("->")[1].replaceFirst("(?s)(.*)\\]", "$1" + ""))
                    .split(":");
        } else {
            String target = element.toString().split("'By.")[1];
            target = target.substring(0, target.length() - 1);
            pathVariables = target.split(":");
        }

        String selector = pathVariables[0].trim();
        String value = pathVariables[1].trim();
        // Workaround for leftover square brackets
        if (StringUtils.countMatches(value, "[") != StringUtils.countMatches(value, "]")) {
            value = value.substring(0, value.length() - 1);
        }

        switch (selector) {
            case "id":
                by = By.id(value);
                break;
            case "className":
                by = By.className(value);
                break;
            case "tagName":
                by = By.tagName(value);
                break;
            case "xpath":
                by = By.xpath(value);
                break;
            case "cssSelector":
                by = By.cssSelector(value);
                break;
            case "linkText":
                by = By.linkText(value);
                break;
            case "name":
                by = By.name(value);
                break;
            case "partialLinkText":
                by = By.partialLinkText(value);
                break;
            default:
                throw new IllegalStateException("locator: " + selector + " not found!");
        }
        return by;
    }
}
