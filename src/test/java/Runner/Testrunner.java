package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Featurefiles"},
        glue={"Stepdefinition"},
        //tags ="@Login or @Organization or @ViewOrganization or @Vieworganizationsubmenu or @Organizationstatusmenu "
        tags="@Login or @Practitioner"

)

public class Testrunner {
}
