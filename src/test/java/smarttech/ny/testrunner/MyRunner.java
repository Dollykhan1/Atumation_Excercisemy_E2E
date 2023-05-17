package smarttech.ny.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//runner class we write the code after the package & before the class

//How do configure testNg with Cucumber?
//How to run runner class? 

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber.json"},
	features = {".//Features/"}, // feature is nothing but location of features file
	glue = {"smarttech.ny.stepdefinations","smartttech.ny.hooks"}// glue is nothing but location of stepdefination
		)
public class MyRunner extends AbstractTestNGCucumberTests{
	
	
	

}
