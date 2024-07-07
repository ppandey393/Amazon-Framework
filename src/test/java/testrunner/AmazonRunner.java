package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/features"}, 
				glue = {"stepdefinition"},
				plugin = {"pretty"},
				//tags = "@Homepage or @Bestseller"
				tags = "not @ignore"  //run everything except ignore tag
				)

public class AmazonRunner {

}
