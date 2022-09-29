package Starter.Stepdefinition.BookStore;

import Starter.Project.Bookstore.POSTBookstoreBook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class POSTBookstoreBookSteps {
    @Steps
    POSTBookstoreBook postBookstoreBook;
    @Given("I set valid user ID and ISBN")
    public void iSetValidUserIDAndISBN() {
        postBookstoreBook.setValidUserIdAndIsbn();
    }

    @When("I request with valid user ID and ISBN")
    public void iRequestWithvalidUserIDAndISBN() {
        postBookstoreBook.requestValidIDAndISBN();
    }

    @Then("I get status code 201")
    public void iGetStatusCode201() {
        postBookstoreBook.getStatusCode201();
    }
}
