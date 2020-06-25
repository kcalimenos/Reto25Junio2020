package co.com.choucair.certificacion.retojueves.stepdefinitions;

import co.com.choucair.certificacion.retojueves.questions.LaRespuesta;
import co.com.choucair.certificacion.retojueves.tasks.IngresarA;
import co.com.choucair.certificacion.retojueves.tasks.AbrirLa;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class stepdefinitions {

    @Before
    public void configuracionInicial(){
        setTheStage(new OnlineCast());
    }

    @Dado("^Que necesito abrir la pagina$")
    public void queNecesitoAbrirLaPagina() throws Exception {
        theActorCalled("Kevin").wasAbleTo(AbrirLa.Pagina());
    }


    @Cuando("^Ejecute el flujo para mirar ejemplo del codigo de reserva$")
    public void ejecuteElFlujoParaMirarEjemploDelCodigoDeReserva() {
        theActorInTheSpotlight().attemptsTo(IngresarA.Lapagina());
    }

    @Entonces("^Valido que el codigo de reserva tenga seis caracteres (.*)$")
    public void valido_que_el_codigo_de_reserva_tenga_seis_caracteres(String pregunta)  {
        theActorInTheSpotlight().should(seeThat(LaRespuesta.es(pregunta)));
    }
}
