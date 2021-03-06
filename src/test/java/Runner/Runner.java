package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/Feature/login.Feature", tags="@login, @cartierSearch", glue="stepDefinitions")
public class Runner {

}
