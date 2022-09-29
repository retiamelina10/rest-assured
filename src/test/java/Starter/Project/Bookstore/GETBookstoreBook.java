package Starter.Project.Bookstore;
import static net.serenitybdd.rest.SerenityRest.*;
import static org.hamcrest.Matchers.equalTo;

public class GETBookstoreBook {
    private String url, isbn;


    public void setUrlAndBookISBN() {
        url = "https://demoqa.com/BookStore/v1/Book?ISBN=9781449325862";
        isbn = "9781449325862";
    }

    public void requestWithUrlAndValidISBN() {
        given().header("Authorization", isbn);
        when().get(url);
    }

    public void verifyTheBook() {
        then().body("book", equalTo(isbn));
    }

    public void requestWithUrlAndInvalidISBN() {
        given().header("Authorization", isbn);
        when().get(url);
    }

    public void verifyStatusCode401() {
        then().statusCode(401);
    }

    public void setUrlAndInvalidBookISBN() {
        url = "https://demoqa.com/BookStore/v1/Book?ISBN=9781449325862";
        isbn = "isbn";
    }
}
