package co.com.choucair.certificacion.retojueves.tasks;

import co.com.choucair.certificacion.retojueves.userinterfaces.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirLa implements Task {

    private PaginaInicial paginaInicial;

    public static AbrirLa Pagina() {
        return Tasks.instrumented(AbrirLa.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaInicial));
    }
}
