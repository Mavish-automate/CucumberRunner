package com.runner;




import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/java/com/featureFile/Opp.feature",
        glue = "com.stepDefinition",
        dryRun = false,
       monochrome = true,
    		   plugin = {
			        	"pretty",
			        	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			        	"rerun:src/test/resources/retry.txt"
			           }     
      
      )
public class Runner extends AbstractTestNGCucumberTests
{

}
