package co.com.Services.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Login.feature",
        glue = {"co.com.Services.stepsdefinitions", "co.com.Services.utils.hooks"},
        snippets = SnippetType.CAMELCASE)

public class LoginRunner {
}
