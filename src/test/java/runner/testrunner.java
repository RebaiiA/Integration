package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {"html:reports/cucumber-html-report","json:reports/cucumber.json","pretty"}
,features = {"src/test/java/features"}	
,glue= {"seleniumgluecode"}
)

public class testrunner {

}
