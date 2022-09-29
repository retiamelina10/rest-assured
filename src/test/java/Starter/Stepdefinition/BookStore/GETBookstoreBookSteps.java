package Starter.Stepdefinition.BookStore;

import Starter.Project.Bookstore.GETBookstoreBook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GETBookstoreBookSteps {
    @Steps
    GETBookstoreBook getBookstoreBook;
    @Given("I set url and book ISBN")
    public void iSetUrlAndBookISBN() {
        getBookstoreBook.setUrlAndBookISBN();
    }

    @When("I request with url and valid ISBN")
    public void iRequestWithUrlAndValidISBN() {
        getBookstoreBook.requestWithUrlAndValidISBN();
    }

    @Then("I can verify the book")
    public void iCanVerifyTheBook() {
        getBookstoreBook.verifyTheBook();
    }

    @When("I request with url and invalid ISBN")
    public void iRequestWithUrlAndInvalidISBN() {
        getBookstoreBook.requestWithUrlAndInvalidISBN();
    }

    @Then("I get status code 401")
    public void iGetStatusCode401() {
        getBookstoreBook.verifyStatusCode401();
    }

    @Given("I set url and invalid book ISBN")
    public void iSetUrlAndInvalidBookISBN() {
        getBookstoreBook.setUrlAndInvalidBookISBN();
    }
}
