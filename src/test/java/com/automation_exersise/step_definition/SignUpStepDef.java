package com.automation_exersise.step_definition;

import com.automation_exersise.pages.LoginPage;
import com.automation_exersise.pages.MainPage;
import com.automation_exersise.pages.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SignUpStepDef {
//copy  snippets from runner package , obrisi zadnje 2 linije u svakom task
   //-and do appropriate  parametrization (String string nas ime koje odgovara)

   WebDriver driver= AutoHook.driver;
   MainPage mainPage=new MainPage(driver);
   LoginPage loginPage=new LoginPage(driver);
   SignUpPage signUpPage=new SignUpPage(driver);



    @Given("user is on main page and clicks on signup button")
    public void user_is_on_main_page_and_clicks_on_signup_button() {
       driver.get("https://www.automationexercise.com/");
       mainPage.clickOnContactUs();
    }
    @When("user enters username as {string} and email as {string} and clicks sign up")
    public void user_enters_username_as_and_email_as_and_clicks_sign_up(String username, String email) {
         loginPage.enterNameEmail(username,email);
    }
    @Then("user checks mr and validates that name is {string}")
    public void user_checks_mr_and_validates_that_name_is(String name) {
      signUpPage.checkMrValidateName(name);
    }
    @Then("user verifies that email field is disabled and enters password as {string}")
    public void user_verifies_that_email_field_is_disabled_and_enters_password_as(String password) {
       signUpPage.validateEmailEnterPassword(password);
    }
    @Then("user provides day of the month as {string} then months as {string} and year as {int}")
    public void user_provides_day_of_the_month_as_then_months_as_and_year_as(String day, String month, String year) {
         signUpPage.enterBirthdate(day,month,year);
    }
    @When("user enters firstname as {string} and lastname as {string} and adrress as {string}")
    public void user_enters_firstname_as_and_lastname_as_and_adrress_as(String firstname, String lastname, String address) {

    }
    @When("user chooses country as {string} and provides state as {string} and city as {string}")
    public void user_chooses_country_as_and_provides_state_as_and_city_as(String country, String state, String city) {

    }
    @Then("user enters zipcode as {string} and phone number as {string} and clicks create account button")
    public void user_enters_zipcode_as_and_phone_number_as_and_clicks_create_account_button(String zipcode, String phoneNumber) {
    signUpPage.zipCodePhoneAndCreate(zipcode,phoneNumber);
    }





}
