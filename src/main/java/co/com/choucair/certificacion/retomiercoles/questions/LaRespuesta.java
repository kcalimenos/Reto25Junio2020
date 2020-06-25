package co.com.choucair.certificacion.retomiercoles.questions;

import co.com.choucair.certificacion.retomiercoles.userinterfaces.IngresoErrado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuesta implements Question<Boolean> {
    private String pregunta;

    public LaRespuesta(String pregunta) {
        this.pregunta = pregunta;
    }

    public static LaRespuesta es(String pregunta) {
        return new LaRespuesta(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean resultado;

        String mensaje = Text.of(IngresoErrado.MESSAGE).viewedBy(actor).asString();


        return (pregunta.equals(mensaje));
    }
}