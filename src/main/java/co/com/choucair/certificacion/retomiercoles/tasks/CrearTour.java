package co.com.choucair.certificacion.retomiercoles.tasks;

import co.com.choucair.certificacion.retomiercoles.model.Tour;
import co.com.choucair.certificacion.retomiercoles.userinterfaces.MenuPrincipal;
import co.com.choucair.certificacion.retomiercoles.userinterfaces.AdminitradorOfertas;
import co.com.choucair.certificacion.retomiercoles.userinterfaces.IngresarTour;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.certificacion.retomiercoles.userinterfaces.MenuPrincipal.OFFERS;
import static co.com.choucair.certificacion.retomiercoles.userinterfaces.AdminitradorOfertas.IFRAME;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CrearTour implements Task {
    private Tour data;

    public CrearTour(Tour data) {
        this.data = data;
    }

    public static CrearTour ThePageWith(Tour data) {
        return Tasks.instrumented(CrearTour.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.getUser().trim()).into(IngresarTour.USER),
                Enter.theValue(data.getPass().trim()).into(IngresarTour.PASS),
                Click.on(IngresarTour.LOGIN),
                WaitUntil.the(OFFERS, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(OFFERS),
                Click.on(OFFERS),
                Click.on(MenuPrincipal.MANAGE_OFFERS),
                WaitUntil.the(AdminitradorOfertas.ADD, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(AdminitradorOfertas.ADD),
                WaitUntil.the(AdminitradorOfertas.TITTLE1, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(data.getOffertittle().trim()).into(AdminitradorOfertas.TITTLE1),
                WaitUntil.the(IFRAME, isVisible()).forNoMoreThan(10).seconds());
                BrowseTheWeb.as(actor).getDriver().switchTo().frame(IFRAME.resolveFor(actor));
                actor.attemptsTo(Enter.theValue(data.getOffertittle().trim()).into(AdminitradorOfertas.DESCRIPTION));
                BrowseTheWeb.as(actor).getDriver().switchTo().parentFrame();
                actor.attemptsTo(Click.on(AdminitradorOfertas.SUBMIT));

    }
}
