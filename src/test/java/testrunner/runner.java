package testrunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import static io.cucumber.core.snippets.SnippetType.CAMELCASE;

@CucumberOptions(
        features ={"src/test/java/features/login.feature"},
        dryRun =false,
        glue = "Steps",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true



)
public class runner extends AbstractTestNGCucumberTests {
}
