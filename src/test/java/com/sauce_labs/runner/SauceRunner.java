package com.sauce_labs.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/SauceLab/Validation",
        glue = "com/sauce_labs/step_definitions",
        dryRun = false,
        tags="@smoke", //moze da imam i kao "@smoke or @regretion
        plugin ={"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}

)
public class SauceRunner {






}
