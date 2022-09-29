package Starter.Stepdefinition.Account;

import Starter.Project.Account.POSTAccountAuthorized;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class POSTAccountAuthorizedSteps {
    @Steps
    POSTAccountAuthorized postAccountAuthorized;
    @Given("I set url and valid user account")
    public void iSetUrlAndValidUserAccount() {
        postAccountAuthorized.setUrlAndValidUserAccount();
    }

    @When("I request with valid user account and update user new book list")
    public void iRequestWithValidUserAccountAndUpdateUserNewBookList() {
   postAccountAuthorized.requestWithValidAccountToUpdateUserNewBook();
    }
    @Then("I get status code 200")
    public void iGetStatusCode200() {
        postAccountAuthorized.validateStatusCode();
    }

    @Given("I set url and valid user data")
    public void iSetUrlAndValidUserData() {
        postAccountAuthorized.setUrlAndValidUserData();
        }

    @When("I request with valid user data and update book title")
    public void iRequestWithValidUserDataAndUpdateBookTitle() {
        postAccountAuthorized.requestWithValidDataToUpdateBookTitle();
    }

    @Then("I obtain status code 200")
    public void iObtainStatusCode200() {
        postAccountAuthorized.validateStatusCode();
    }
}
