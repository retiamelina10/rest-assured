package Starter.Project.Account;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.*;

public class POSTAccountUsers {

    private String url, data;
    public void setUrlAndInvalidData() {
        url = "https://demoqa.com/Account/v1/User";
        data = "name";
        data = "password";
    }
    public JSONObject bodyPOSTAccountUsers(){
    JSONObject body = new JSONObject();
        body.put("name", 15);
        body.put("password", " ");
        return body;
        }
    public void requestInvalidData() {
        given().header("Authorization", "Bearer " + data)
                .header("Content-Type", "application/json")
                .body(bodyPOSTAccountUsers().toJSONString());
        when().post(url);
    }
    public void validateUnauthorizedData() {

        then().statusCode(404);
    }
    public void setUrlAndValidData() {
        url = "https://demoqa.com/Account/v1/User";
        data = "name";
        data = "password";
    }
    public JSONObject bodyPOSTAccountUser(){
        JSONObject body = new JSONObject();
        body.put("name", "Martha");
        body.put("password", "nevada");
        return body;
    }
    public void requestValidData() {
            given().header("Authorization", "Bearer " + data)
                    .header("Content-Type", "application/json")
                    .body(bodyPOSTAccountUsers().toJSONString());
            when().post(url);
        }
    public void validateStatusCode() {
        then().statusCode(200);
    }
}
