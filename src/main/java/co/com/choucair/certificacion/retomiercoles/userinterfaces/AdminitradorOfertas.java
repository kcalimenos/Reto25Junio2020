package co.com.choucair.certificacion.retomiercoles.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AdminitradorOfertas {
    public static final Target ADD = Target.the("Text").located(By.xpath("/html/body/div[3]/div/div[2]/form/button"));
    public static final Target DESCRIPTION = Target.the("Text").located(By.xpath("/html/body/p"));
    public static final Target TITTLE1 = Target.the("Text").located(By.name("offertitle"));
    public static final Target IFRAME = Target.the("Text").located(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/iframe[1]"));
    public static final Target SUBMIT = Target.the("Text").located(By.id("add"));
}
