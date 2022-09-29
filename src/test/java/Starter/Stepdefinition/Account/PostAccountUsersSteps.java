package Starter.Stepdefinition.Account;

import Starter.Project.Account.POSTAccountUsers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PostAccountUsersSteps {
    @Steps
    POSTAccountUsers postAccountUsers;

    @Given("I set url and valid data")
    public void iSetUrlAndValidData() {
        postAccountUsers.setUrlAndValidData();

    }

    @When("I request with valid data")
    public void iRequestWithValidData() {
        postAccountUsers.requestValidData();
    }

    @Then("I get status code 200")
    public void iGetStatusCode200() {
        postAccountUsers.validateStatusCode();
    }

    @Given("I set url and invalid data")
    public void iSetUrlAndInvalidData() {
        postAccountUsers.setUrlAndInvalidData();
    }

    @When("I request with invalid data")
    public void iRequestWithInvalidData() {
        postAccountUsers.requestInvalidData();
    }

    @Then("I get status code 404")
    public void iGetStatusCode404() {
        postAccountUsers.validateUnauthorizedData();

    }
}
