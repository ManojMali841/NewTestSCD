package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions
	(
	features="C:/Users/Deepak.Badgotya/eclipse-workspace/NewSCD/src/test/java/feature/NewSCDLoginFeature.feature",
	glue= {"stepdefinition"},
	plugin = ("json:target/cucumber-reports/CucumberTestReport.json"),
	tags="@Smoketest1 or @Smoketest2",
			//tags="@Smoketest1 or @Smoketest2 or @Smoketest6", 
				//tags="@Smoketest1 or @Smoketest2 or @Smoketest7", 
			//@Smoketest2 or @Smoketest3 or @Smoketest4 or @Smoketest5
	monochrome = true
			)
		
	public class Runner {

}