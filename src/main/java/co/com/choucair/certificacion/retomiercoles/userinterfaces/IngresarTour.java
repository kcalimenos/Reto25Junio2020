package co.com.choucair.certificacion.retomiercoles.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class IngresarTour {
    public static final Target USER = Target.the("Text").located(By.name("email"));
    public static final Target PASS = Target.the("Text").located(By.name("password"));
    public static final Target LOGIN = Target.the("Boton").located(By.xpath("/html/body/div[2]/form[1]/button"));
}

