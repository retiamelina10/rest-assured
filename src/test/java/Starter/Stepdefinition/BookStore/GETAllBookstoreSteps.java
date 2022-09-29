package Starter.Stepdefinition.BookStore;

import Starter.Project.Bookstore.GETAllBookstore;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GETAllBookstoreSteps {
    @Steps
    GETAllBookstore getAllBookstore;
    @Given("I set url")
    public void iSetUrl() {
        getAllBookstore.setUrl();
    }

    @When("I request with url")
    public void iRequestWithUrl() {
        getAllBookstore.requestWithUrl();
    }

    @Then("I can get some books in bookstore")
    public void iCanGetSomeBooksInBookstore() {
        getAllBookstore.foundSomeBooksInBookstore();
    }
}
