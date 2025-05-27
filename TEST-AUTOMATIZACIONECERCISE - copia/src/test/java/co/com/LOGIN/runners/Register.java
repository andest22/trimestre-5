package co.com.LOGIN.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Register.feature",
        glue = {"co.com.LOGIN.stepsdefinitions", "co.com.LOGIN.utils.hooks"},
        snippets = SnippetType.CAMELCASE)

public class Register {
}
