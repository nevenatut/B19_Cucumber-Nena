package com.cucumber_recup;

public class CucumberRecap {

    /*
    colaborative tool between tehnocal and non tehnical

    Framework that we built usualu titled as BDD framework

    1.Features
    we have feature files where we written oure test language in Gearken language  with key words Given,And,THEn...

    2.How do you creat your framework from scratch?
    prvo pricaj kao
   Pom  -> page object model
   pom.xpm -->Project Object model

   Pages ->
   Runner  --> trigger out test and take snippets
            features = "src/test/resources/lambda/FormDemo",//location of feature files(desni klik copy path/reference)
        glue = "com/lambda/step_definitions",    //location of stepDefination whole package!!!!
        dryRun = false, // for run is false  ,a za triggers that will generete snippets is is true and run from here
        //report radi plugin
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}
        tags="@smoke"
        class Runner
   StepDefinition

  3.How do you parametrize your test data?
   directly in Feature file with single Quanation
   -DAtaTable and treate with Map interface from jave

   unitilize Scenario Outline with ExampelTabel


   TestNG  and JUnit-> slican framework
   koristimo i mi developeri

   Test New Generation





     */





}
