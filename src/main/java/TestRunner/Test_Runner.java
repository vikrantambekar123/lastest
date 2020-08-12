package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\ambek\\eclipse-workspace\\Cucumber\\src\\main\\java\\Features\\home.feature", //the path of the feature files
		glue={"Step_definition"}, //the path of the step definition files
		plugin={"pretty","html:test-outout"},
		//to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = false, //it will check if any step is not defined in step definition file
		dryRun = true, //to check the mapping is proper between feature file and step def file
		tags = {"~@vikrant"}	
		)
 

public class Test_Runner {

}
