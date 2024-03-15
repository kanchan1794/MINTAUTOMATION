package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Featurefiles"},
        glue={"Stepdefinition"},
        plugin = {"json:target/cucumber.json"},
        //tags ="@Login or @Organization or @ViewOrganization or @Vieworganizationsubmenu or @Organizationstatusmenu @activities or @AddActivities or @Practitioner "
        tags="@EmployeeLogin or @Attendance or @Myattendance"
        //tags= "@EmployeeLogin or @Attendance or @Myattendance or @AddressBook @MyTeam or @Events&calendar or   @MyPayslip or @MyDocument or @Documents or @OrganizationDocument or @leave or @ApplyforLeave "


)

public class Testrunner {
}
