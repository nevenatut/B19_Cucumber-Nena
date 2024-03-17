package com.automation_exersise.step_definition;

import com.automation_exersise.pages.ContactUsPage;
import com.automation_exersise.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.DriverHelper;

public class StepDefs {

    WebDriver driver = DriverHelper.getDriver();//ubacili smo utilis iz Selenium project,pa mozemo da ga koristimo
    MainPage mainPage = new MainPage(driver);
    ContactUsPage contactUsPage = new ContactUsPage(driver);


    @Given("user is on main page user click on contat us link")
    public void user_is_on_main_page_user_click_on_contat_us_link() {
        // in Pyton je pisano zato pise user_is_on sa under scor
        driver.get("https://www.automationexercise.com/");// note: this was not written in feature file,ali smo morali
        mainPage.clickOnContactUs();                          //da ubacimo ovde da bi radilo jer smo zaboravili da uradimo u feature

    }

    @When("user is on conntact us page  user validate url and title of the page")
    public void user_is_on_conntact_us_page_user_validate_url_and_title_of_the_page() throws InterruptedException {
        String expectedUrL = "https://www.automationexercise.com/contact_us";
        Assert.assertEquals(expectedUrL, driver.getCurrentUrl());
        Thread.sleep(2000);
        String expectedTitle = "Automation Exercise - Contact Us";
        Assert.assertEquals(expectedTitle, BrowserUtils.getTitleWithJS(driver));
       // Assert here is coming from junit not testNG,like in Selenijum i ovde trazi obrnuto da se unosi
       //prvo expected,pa onda actual nego kod testNG

    }

    @Then("user enters name and emails")
    public void user_enters_name_and_emails() {
        contactUsPage.enterNameEmail("Tomas Tom", "tom@test.com");

    }

    @Then("user enter subject of the message and message itself")
    public void user_enter_subject_of_the_message_and_message_itself() {
        contactUsPage.enterSubjectAndMessage("Complain about your webcite", "Please,fix it");


    }

    @Then("user attaches file and click on submit button")
    public void user_attaches_file_and_click_on_submit_button() {
        contactUsPage.attacheFileAndSubmit("C:\\Users\\ntutu\\OneDrive\\Desktop\\Batch19\\tomandjerry.jpeg");
        BrowserUtils.acceptAlert(driver); //pojavi se popoup
    }
         // second scenario ,but copy just last 3 since the first is the same in bought scenario
    @When("user is on contact us page user verifies Contact us text")
    public void user_is_on_contact_us_page_user_verifies_contact_us_text() {
        String expectedText = "CONTACT US";
        Assert.assertEquals(expectedText, contactUsPage.getTextContactUs());
        String actualText = contactUsPage.getTextContactUs();
        System.out.println(actualText);

    }
    @Then("user validate Get In Touch text")
    public void user_validate_get_in_touch_text() {
        String expectedText = "GET IN TOUCH";
        Assert.assertEquals(expectedText, contactUsPage.getTextGetInTouch());
        String actualText = contactUsPage.getTextGetInTouch();
        System.out.println(actualText);
    }
    @Then("user validate Feedback For Us text")
    public void user_validate_feedback_for_us_text() {
        String expectedText = "FEEDBACK FOR US";
        Assert.assertEquals(expectedText, contactUsPage.getTextFeedback());
        String actualText = contactUsPage.getTextFeedback();
        System.out.println(actualText);
    }


}
