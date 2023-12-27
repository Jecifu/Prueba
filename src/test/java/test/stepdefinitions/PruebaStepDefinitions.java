package test.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.AddArticle;
import tasks.GoTo;
import tasks.Login;
import tasks.SigUp;

public class PruebaStepDefinitions {

    @Before

    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Jeimmy");
    }
    @Given("that user has opened the website")
    public void that_user_has_opened_the_website() {

        OnStage.theActorInTheSpotlight().wasAbleTo(GoTo.theUrl());
    }
    @When("he enter the information")
    public void he_enter_the_information(DataTable data) {
        OnStage.theActorInTheSpotlight().attemptsTo(SigUp.Use(data));

    }

    @When("he login with information")
    public void he_login_with_information(DataTable data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.UseTo(data));

    }

    @Then("he should add the product")
    public void he_should_add_the_product(DataTable data) {
        OnStage.theActorInTheSpotlight().attemptsTo(AddArticle.Used(data));
        //OnStage.theActorInTheSpotlight().should(seeThat(ProductWas.Added()));
    }


}
