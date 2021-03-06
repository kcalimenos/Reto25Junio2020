package co.com.choucair.certificacion.retojueves.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/reto.feature",
        tags = "@Regression",
        glue = "co.com.choucair.certificacion.retojueves.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class run {
}
