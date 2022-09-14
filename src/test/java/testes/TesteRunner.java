package testes;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "steps",
        strict = true,
        tags = "@todos",
        plugin = { "pretty", "html:target/cucumber-html-report" },
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TesteRunner {
}
