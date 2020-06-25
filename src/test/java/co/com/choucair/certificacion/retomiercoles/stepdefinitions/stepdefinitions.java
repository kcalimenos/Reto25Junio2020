package co.com.choucair.certificacion.retomiercoles.stepdefinitions;

import co.com.choucair.certificacion.retomiercoles.model.Persona;
import co.com.choucair.certificacion.retomiercoles.model.Tour;
import co.com.choucair.certificacion.retomiercoles.questions.LaRespuesta;
import co.com.choucair.certificacion.retomiercoles.questions.LaTabla;
import co.com.choucair.certificacion.retomiercoles.tasks.CrearTour;
import co.com.choucair.certificacion.retomiercoles.tasks.Ingresar;
import co.com.choucair.certificacion.retomiercoles.tasks.AbrirLa;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.choucair.certificacion.retomiercoles.utilities.Constantes.ZERO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class stepdefinitions {

    @Before
    public void configuracionInicial(){
        setTheStage(new OnlineCast());
    }

    @Given("^needs to open the homepage$")
    public void needs_to_open_the_homepage() {
        theActorCalled("Kevin").wasAbleTo(AbrirLa.Page());
    }


    @When("^Enter bad password credentials$")
    public void enter_bad_password_credentials(List<Persona> data) {
        theActorInTheSpotlight().attemptsTo(Ingresar.ThePageWith(data.get(ZERO)));
    }

    @Then("^click on the login button, verify the messageInvalid Login Credentials (.*)$")
    public void click_on_the_login_button_verify_the_messageInvalid_Login_Credentials(String pregunta) {
        theActorInTheSpotlight().should(seeThat(LaRespuesta.es(pregunta)));
    }

    @When("^Create a new tour$")
    public void create_a_new_tour(List<Tour> data) {
        theActorInTheSpotlight().attemptsTo(CrearTour.ThePageWith(data.get(ZERO)));
    }

    @Then("^Verify new tour (.*)$")
    public void verify_new_tour(String pregunta)  {
        theActorInTheSpotlight().should(seeThat(LaTabla.es(pregunta)));
    }
}
