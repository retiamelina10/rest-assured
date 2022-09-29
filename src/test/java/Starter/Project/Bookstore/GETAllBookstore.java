package Starter.Project.Bookstore;

import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class GETAllBookstore {
    private String url;
    public void setUrl() {
        url = "https://demoqa.com/BookStore/v1/Books";
    }

    public void requestWithUrl() {
        given().header("Authorization", url);
        when().get(url);
    }

    public void foundSomeBooksInBookstore() {
        then().body(equalTo("books"));
    }
    }
