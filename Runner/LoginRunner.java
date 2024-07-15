package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/java/features/Login.feature"},glue="StepDefintion")
public class LoginRunner extends AbstractTestNGCucumberTests{

}