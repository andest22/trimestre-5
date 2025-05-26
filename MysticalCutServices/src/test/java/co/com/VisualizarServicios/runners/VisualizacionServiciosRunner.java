package co.com.VisualizarServicios.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Visualizar.feature",
        glue = {"co.com.VisualizarServicios.stepsdefinitions", "co.com.VisualizarServicios.utils.hooks"},
        snippets = SnippetType.CAMELCASE)

public class VisualizacionServiciosRunner {
}
