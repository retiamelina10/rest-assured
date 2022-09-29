package Starter.Stepdefinition.Account;

import Starter.Project.Account.PostAccountGenerateToken;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class POSTAccountGenerateTokenSteps {
    @Steps
    PostAccountGenerateToken postAccountGenerateToken;
    @Given("I set url and valid token")
    public void iSetUrlAndValidToken() {
        postAccountGenerateToken.setUrlAndValidToken();
    }

    @When("I request with valid token")
    public void iRequestWithValidToken() {
        postAccountGenerateToken.requestValidToken();
    }
    @Then("I get status code 200")
    public void iGetStatusCode200(){
        postAccountGenerateToken.validateStatusCode200();

    }

    @Given("I set url and invalid token")
    public void iSetUrlAndInvalidToken() {
        postAccountGenerateToken.setUrlAndInvalidToken();
    }

    @When("I request with invalid token")
    public void iRequestWithInvalidToken() {
        postAccountGenerateToken.requestInvalidToken();
    }
    @Then("I get status code 400")
    public void iGetStatusCode400() {
        postAccountGenerateToken.validateStatusCode400();
    }
}
