package Starter.Project.Account;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class GETAccountUser {

    private String url, Id;
    private String UserID;
    private Integer ID;

    public void setUrlAndInvalidToken() {
        url = "https://demoqa.com/Account/v1/User/{UUID}";
        UserID = "marthas578";
    }

    public void requestWithValidUserId() {
        given().header("Authorization", UserID)
                .header("Content-Type", "application/json");
        when().get(url);
    }

    public void validateUserData() {
            then().statusCode(200);
    }

    public void validateDetailResponse() {
        then().body(equalTo("true"));
    }

    public void setUrlAndCombinationsOfNumbers() {
        url = "https://demoqa.com/Account/v1/User/{UUID}";
        ID = 4346748;
    }

    public void requestWithInvalidUserId() {
        given().header("Authorization", ID)
                .header("Content-Type", "application/json");
        when().get(url);
    }

    public void validateUnauthorizedUserData() {
        then().statusCode(401);
    }

    public void validateStatusCode() {
        then().body(equalTo("Unauthorized"));
    }
}
