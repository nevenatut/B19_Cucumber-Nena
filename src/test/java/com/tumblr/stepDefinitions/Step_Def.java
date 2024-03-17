package com.tumblr.stepDefinitions;

import com.tumblr.pages.LoginPage;
import com.tumblr.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class Step_Def {
      WebDriver driver=Hook.driver;
      MainPage mainPage=new MainPage(driver);
      LoginPage logInPage=new LoginPage(driver);

    @Given("user is on main page user click on login button")
    public void user_is_on_main_page_user_click_on_login_button() {
    mainPage.clickOnLogin();
    }
    @Then("user click on continue with email button")
    public void user_click_on_continue_with_email_button() {
    logInPage.clickOnContinueEmail();
    }
    @Then("user enters {string} and click on next button")
    public void user_enters_and_click_on_next_button(String email) {
    logInPage.enterEmail(email);
    }



    @Then("user enters {string} clicks on next button and validates {string}")
    public void userEntersWrongPasswordClicksOnNextButtonAndValidatesErrorMessage(String wrongPassword, String errorMessage) {
     logInPage.enterPasswordValidateError(wrongPassword,errorMessage);
    }
}
