package eu.europa.eudi.utils.factory;


import eu.europa.eudi.pages.WebVerifierPage;
import eu.europa.eudi.utils.Test;
import eu.europa.eudi.utils.TestLibrary;
import eu.europa.eudi.utils.common.BrowserControls;

public class PageObjectFactory {

    TestLibrary test;

    BrowserControls browserControls;
    WebVerifierPage webVerifierPage;

    public PageObjectFactory(TestLibrary test) {
        this.test = test;
    }

    public BrowserControls browser() {
        return (browserControls == null) ? browserControls = new BrowserControls(test) : browserControls;
    }
    public WebVerifierPage webVerifierPage() {
        return (webVerifierPage == null) ? webVerifierPage = new WebVerifierPage(test) : webVerifierPage;
    }


}
