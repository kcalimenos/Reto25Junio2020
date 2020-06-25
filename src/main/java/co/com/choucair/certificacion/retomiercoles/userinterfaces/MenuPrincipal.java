package co.com.choucair.certificacion.retomiercoles.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MenuPrincipal {
        public static final Target OFFERS = Target.the("Text").located(By.xpath("//*[@id=\"social-sidebar-menu\"]/li[14]/a"));
        public static final Target MANAGE_OFFERS = Target.the("Text").located(By.xpath("//*[@id=\"SPECIAL_OFFERS\"]/li[1]/a"));
        }
