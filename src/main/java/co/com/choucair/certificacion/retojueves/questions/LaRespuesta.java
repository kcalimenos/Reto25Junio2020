package co.com.choucair.certificacion.retojueves.questions;

import co.com.choucair.certificacion.retojueves.userinterfaces.MisViajes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuesta implements Question<Boolean>
{
    String palabraesperada;

    public LaRespuesta(String palabraesperada) {
        this.palabraesperada = palabraesperada;
    }

    public static LaRespuesta es(String pregunta) {
        return new LaRespuesta(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String confirm = Text.of(MisViajes.MODALCR).viewedBy(actor).asString();
        return (palabraesperada.equals(confirm));
    }
}
