package com.web_order.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  //pise se uvek iznad class
@CucumberOptions(
        features = "src/test/resources/WebOrder",//location of feature files(desni klik copy path/reference)
        glue = "com/web_order/step_definitions",    //location of stepDefination whole package!!!!
        dryRun =false, // for run is false  ,a za triggers that will generete snippets is is true and run from here
        //radi plugin malo drugaciji report
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt",
                "json:target/cucumber-reports/cucumber.json"}
)
public class WebRunner {

}
