package runnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)				
@CucumberOptions(features="C:\\Users\\karthikeyan.raghu\\eclipse-workspace\\CucumberProject\\src\\main\\java\\Features"
,glue={"stepDefination"}
,format = {"pretty","html: Test-Output"}
)						

public class RunnerMain 
{
	}
