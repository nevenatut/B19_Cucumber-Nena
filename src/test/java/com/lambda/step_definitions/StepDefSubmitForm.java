package com.lambda.step_definitions;

import com.tumblr.stepDefinitions.Hook;
import com.lambda.pages.FormDemoPage;
import com.lambda.pages.MainPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class StepDefSubmitForm {

    WebDriver driver= Hook.driver;
    MainPage mainPage=new MainPage(driver);
    FormDemoPage demoPage=new FormDemoPage(driver);

    @Given("user is on main page of lambda user checks on ajax submit form")
    public  void user_is_on_main_page_of_lambda_user_checks_on_ajax_submit_form() {
    mainPage.clickOnSubmitForm();

    }
    @Then("user enter name and message as follows")
    public void user_enter_name_and_message_as_follows(DataTable dataTable) {
        Map<String, String> map = dataTable.asMap();
       demoPage.compWebCountry(map.get("company"),map.get("website"),map.get("country"));
    }
    @Then("user clicks on submit button")
    public void user_clicks_on_submit_button() {


    }
    @Then("user validates ajaax message as follow")
    public void user_validates_ajaax_message_as_follow(io.cucumber.datatable.DataTable dataTable) {



    }




}
