package Starter.Stepdefinition.BookStore;

import Starter.Project.Bookstore.DELETEBookstoreBoks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DELETEBookstoreBoksSteps {
    @Steps
    DELETEBookstoreBoks deleteBookstoreBoks;
    @Then("I can get status code 200")
    public void iCanGetStatusCode200() {
        deleteBookstoreBoks.verifystatusCode200();

    }

    @Given("I set url and Id collection isbn")
    public void iSetUrlAndIdCollectionIsbn() {
        deleteBookstoreBoks.setUrlAndIdCollection();
    }

    @When("I request with url and id collection")
    public void iRequestWithUrlAndIdCollection() {
        deleteBookstoreBoks.requestWithUrlAndCollectinId();
    }
}
