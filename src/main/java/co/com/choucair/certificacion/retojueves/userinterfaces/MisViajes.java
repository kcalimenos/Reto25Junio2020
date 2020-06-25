package co.com.choucair.certificacion.retojueves.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MisViajes {
    public static final Target DONDELOENCUENTRAS = Target.the("Text").located(By.xpath("//body/div/div/div/div/div/div/div/div/div/div/div/div/form/div/a/span[1]"));
    public static final Target MODALCR = Target.the("Text").located(By.xpath("//span[contains(text(),'VBCDGG.')]"));
}
