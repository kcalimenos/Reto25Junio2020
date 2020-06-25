package co.com.choucair.certificacion.retomiercoles.tasks;

import co.com.choucair.certificacion.retomiercoles.userinterfaces.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirLa implements Task {

    private PaginaInicial paginaInicial;

    public static AbrirLa Page() {
        return Tasks.instrumented(AbrirLa.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaInicial));
    }
}
