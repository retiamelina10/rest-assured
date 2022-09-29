package Starter.Stepdefinition.Account;

import Starter.Project.Account.GETAccountUser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GETAccountUserStep {
    @Steps
    GETAccountUser getAccountUser;
    @Given("I set url and valid user ID to get user account")
    public void iSetUrlAndValidUserIDToGetUserAccount() {
        getAccountUser.setUrlAndInvalidToken();
    }

    @When("I request with valid user ID")
    public void iRequestWithValidUserID() {
        getAccountUser.requestWithValidUserId();
    }

    @Then("I get status code 200 OK")
    public void iGetStatusCodeOK200() {
        getAccountUser.validateUserData();

    }

    @And("I can see the detail response")
    public void iCanSeeTheDetailResponse() {
        getAccountUser.validateDetailResponse();
    }

    @Given("I set url and combinations of numbers")
    public void iSetUrlAndCombinationsOfNumbers() {
        getAccountUser.setUrlAndCombinationsOfNumbers();
    }

    @When("I request with invalid USerID")
    public void iRequestWithInvalidUSerID() {
        getAccountUser.requestWithInvalidUserId();
    }

    @Then("I get status code 401 Unauthorized")
    public void iGetStatusCodeUnauthorized401() {
        getAccountUser.validateUnauthorizedUserData();
    }

    @And("I get message user not authorize")
    public void iGetMessageUserNotAuthorize() {
        getAccountUser.validateStatusCode();
    }
}
