package Starter.Project.Bookstore;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;

public class PUTBookstoreBookIsbn {
    private String url, isbn;

    public void setUrlAndIsbn() {
        url = "https://demoqa.com/BookStore/v1/Books/9781593277574";
        isbn = "9781593277574";
    }

    public void requestWithUrlAndIsbn() {
        given()
                .header("Authorization", isbn)
                .header("Content-Type", "application/json")
                .body(bodyPUTBookstoreBookIsbn().toJSONString());
        when().post(url);
    }

    private JSONObject bodyPUTBookstoreBookIsbn() {
        JSONObject body = new JSONObject();
        body.put("isbn", "9781593277574");
        return body;
    }

    public void validateStatusCode() {
        then().statusCode(201);
    }
}
