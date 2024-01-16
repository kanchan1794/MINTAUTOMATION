package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Featurefiles"},
        glue={"Stepdefinition"},
        tags ="@Login or @Organization or @ViewOrganization or  @Vieworganizationsubmenu"

)
public class Testrunner {
}
