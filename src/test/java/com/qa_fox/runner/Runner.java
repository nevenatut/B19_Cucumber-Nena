package com.qa_fox.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Qa_fox/login",//location of feature files(desni klik copy path/reference)
        glue = "com/qa_fox/stepdefinitions",    //location of stepDefination whole package!!!!
        dryRun = false, // for run is false  ,a za triggers that will generete snippets is is true and run from here
        //report radi plugin
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
)

public class Runner {
}
