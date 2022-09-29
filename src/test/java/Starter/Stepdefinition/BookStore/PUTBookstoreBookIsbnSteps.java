package Starter.Stepdefinition.BookStore;

import Starter.Project.Bookstore.PUTBookstoreBookIsbn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PUTBookstoreBookIsbnSteps {
    @Steps
    PUTBookstoreBookIsbn putBookstoreBookIsbn;
    @Given("I set url dan book ISBN")
    public void iSetUrlDanBookISBN() {
        putBookstoreBookIsbn.setUrlAndIsbn();
    }

    @When("I request with url and ISBN")
    public void iRequestWithUrlAndISBN() {
        putBookstoreBookIsbn.requestWithUrlAndIsbn();
    }

    @Then("I will get status code 201")
    public void iWillGetStatusCode201() {
        putBookstoreBookIsbn.validateStatusCode();
    }
}
