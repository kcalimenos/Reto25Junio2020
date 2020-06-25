package co.com.choucair.certificacion.retomiercoles.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class IngresoErrado {
    public static final Target MESSAGE = Target.the("Text").located(By.xpath("/html/body/div[2]/form[1]/div[2]/div/p"));
}
