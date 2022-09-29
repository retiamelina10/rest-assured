package Starter.Project.Bookstore;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;

public class POSTBookstoreBook {
    private String id, isbn;

    public void setValidUserIdAndIsbn() {
        id = "503";
        isbn = "9781449325862";
    }

        public void requestValidIDAndISBN () {
            given().header("Authorization", isbn)
                    .header("Content-Type", "application/json")
                    .body(bodyPOSTBookstoreBook().toJSONString());
            when().post(isbn);
            when().get(isbn);
        }

        public void getStatusCode201 () {
            then().statusCode(201);
        }

    private JSONObject bodyPOSTBookstoreBook() {
        JSONObject body = new JSONObject();
        body.put("id", "503");
        body.put("isbn", "9781449325862");
        return body;
    }
}
