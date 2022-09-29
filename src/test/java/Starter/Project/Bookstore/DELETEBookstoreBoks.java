package Starter.Project.Bookstore;

import static net.serenitybdd.rest.SerenityRest.*;

public class DELETEBookstoreBoks {
    private String url, id;
    public void verifystatusCode200() {
        then().statusCode(200);
    }

    public void setUrlAndIdCollection() {
        url = "https://demoqa.com/BookStore/v1/Books";
        id = "ISBN 653421268127";

    }

    public void requestWithUrlAndCollectinId() {
        given().header("Authorization", "ISBN" + id);
        when().get(url);
    }
}
