package co.com.choucair.certificacion.retomiercoles.tasks;

import co.com.choucair.certificacion.retomiercoles.model.Persona;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.choucair.certificacion.retomiercoles.userinterfaces.IngresarTour.*;

public class Ingresar implements Task {

    private Persona data;

    public Ingresar(Persona data) {
        this.data = data;
    }

    public static Ingresar ThePageWith(Persona data) {
        return Tasks.instrumented(Ingresar.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.getUser().trim()).into(USER),
                Enter.theValue(data.getPass().trim()).into(PASS),
                Click.on(LOGIN));
    }

}
