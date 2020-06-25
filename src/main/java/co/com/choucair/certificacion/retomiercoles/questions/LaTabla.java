package co.com.choucair.certificacion.retomiercoles.questions;

import co.com.choucair.certificacion.retomiercoles.userinterfaces.CrearTour;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaTabla implements Question<Boolean> {

    private String pregunta;

    public LaTabla(String pregunta) {
        this.pregunta = pregunta;
    }

    public static LaTabla es(String pregunta) {
        return new LaTabla(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;

        String mensaje = Text.of(CrearTour.MESSAGE).viewedBy(actor).asString();

        return (pregunta.equals(mensaje));
    }
}
