package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("User is on login page")
    public void userIsOnLoginPage() {
        System.out.println("1");
    }

    @When("user login into the website")
    public void userLoginIntoTheWebsite() {
        System.out.println("2");
    }

    @Then("home page is populated")
    public void homePageIsPopulated() {
        System.out.println("3");
    }

    @And("cards are displayed")
    public void cardsAreDisplayed() {
        System.out.println("4");
    }
}
