package co.com.choucair.certificacion.retojueves.tasks;

import co.com.choucair.certificacion.retojueves.userinterfaces.MenuPrincipal;
import co.com.choucair.certificacion.retojueves.userinterfaces.MisViajes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarA implements Task {


    public static IngresarA Lapagina() {
        return Tasks.instrumented(IngresarA.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuPrincipal.MISVIAJES),
                Click.on(MisViajes.DONDELOENCUENTRAS)
        );
    }

}
