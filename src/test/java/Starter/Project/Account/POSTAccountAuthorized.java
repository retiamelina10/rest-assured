package Starter.Project.Account;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;

public class POSTAccountAuthorized {
    private String url, data;

    public void setUrlAndValidUserAccount() {
        url = "https://demoqa.com/Account/v1/Authorized";
        data = "name";
        data = "password";
        data = "NewBook";
    }

    public JSONObject bodyPOSTAccountAuthorized() {
        JSONObject body = new JSONObject();
        body.put("name", "Martha");
        body.put("password", "nevada");
        body.put("newbook", "Maze Runner");
        return body;
    }

    public void requestWithValidAccountToUpdateUserNewBook() {
        given().header("Authorization", "name" + data)
                .header("Authorization", "password" + data)
                .header("Authorization", "new book" + data)
                .header("Content-Type", "application/json")
                .body(bodyPOSTAccountAuthorized().toJSONString());
        when().post(url);
    }

    public void validateStatusCode() {
        then().statusCode(200);
    }

    public void setUrlAndValidUserData() {
        url = "https://demoqa.com/Account/v1/Authorized";
        data = "name";
        data = "password";
        data = "NewBook";
    }

    public void bodyPOSTAccounAuthorized() {
        JSONObject body = new JSONObject();
        body.put("name", "Martha");
        body.put("password", "nevada");
        body.put("book title", "Hery Potter");
    }

    public void requestWithValidDataToUpdateBookTitle() {
        given().header("Authorization", "nama" + data)
                .header("Authorization", "password" + data)
                .header("Authorization", "boob title" + data)
                .header("Content-Type", "application/json")
                .body(bodyPOSTAccountAuthorized().toJSONString());
        when().post(url);
    }
}
