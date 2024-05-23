package eu.europa.eudi.utils.factory;

import io.cucumber.datatable.DataTable;
import io.restassured.response.Response;
import lombok.Data;

import java.util.Properties;

@Data
public class ContextFactory {
    private Boolean uiTest;
    Boolean UITest;

    Boolean MobileTest;

    Response lastResponse;

    String contactId;

    DataTable contextTestData;

    Properties contextMultipleTestData = new Properties();


    public void setUiTest(boolean b) {
    }
}
