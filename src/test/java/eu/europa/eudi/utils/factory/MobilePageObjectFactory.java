package eu.europa.eudi.utils.factory;

import eu.europa.eudi.pages.*;
import eu.europa.eudi.utils.Test;


public class MobilePageObjectFactory {

    Test test;
    Wallet wallet;
    Verifier verifier;

    public MobilePageObjectFactory(Test test) {
        this.test = test;
    }

    public Wallet wallet() {
        return (wallet == null) ? wallet = new Wallet(test) : wallet;
    }

    public Verifier verifier() {
        return (verifier == null) ? verifier = new Verifier(test) : verifier;
    }
}
