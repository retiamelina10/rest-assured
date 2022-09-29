package Starter.Project.Account;

import static net.serenitybdd.rest.SerenityRest.*;

public class PostAccountGenerateToken {
    private String url, token;

    public void setUrlAndValidToken() {
        url = "https://demoqa.com/Account/v1/GenerateToken";
        token = "1324e56789ab24563acd45678";

    }

    public void requestValidToken() {
        given().header("Authorization", token)
                .header("Content-Type", "application/json");
        when().get(url);

    }

    public void validateStatusCode200() {
        then().statusCode(200);
    }

    public void setUrlAndInvalidToken() {
        url = "https://demoqa.com/Account/v1/GenerateToken";
        token = "token";

    }

    public void requestInvalidToken() {
        given().header("Authorization", token)
                .header("Content-Type", "application/json");
        when().get(url);
    }

    public void validateStatusCode400() {
        then().statusCode(400);
    }
}
