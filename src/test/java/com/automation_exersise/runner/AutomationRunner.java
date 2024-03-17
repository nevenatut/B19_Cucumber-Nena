package com.automation_exersise.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/AutomationExercise/signUp",
        glue = "com/automation_exersise/step_definition",
        dryRun = false,
        plugin ={"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}

)
public class AutomationRunner {
}
