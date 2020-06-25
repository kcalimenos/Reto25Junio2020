package co.com.choucair.certificacion.retojueves.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MenuPrincipal {
        public static final Target MISVIAJES = Target.the("Text").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[2]/div[1]/nav/div[4]/a/div/div[2]"));
        }
