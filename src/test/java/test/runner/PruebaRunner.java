package test.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"test.stepdefinitions"},
        features = {"src/test/resources/features/prueba.feature"}
)

public class PruebaRunner {
}
