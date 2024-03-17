package com.web_order.step_definitions;

import com.web_order.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {

//This class is used when logging into web order app

   WebDriver driver= Hook.driver;

    MainPage mainPage=new MainPage(driver);
    @Given("user is on main page user click on group order radio button")
    public void user_is_on_main_page_user_click_on_group_order_radio_button() throws Exception {
     mainPage.clickOnRadio();
    }
    @Then("user is selected {string} from the dropdown")
    public void user_is_selected_from_the_dropdown(String location) throws Exception{
    mainPage.chooseLocation(location);
    }

    @Then("validate office address as {string}")
    public void validate_office_address_as(String address) {
    String actualAddress=mainPage.getAddressText();
    Assert.assertTrue("Failed to validatelocation address",actualAddress.contains(address)); //i ovo se probas sam Assert.assertTrue
    }

    @Then("user leaves note for guests as {string}")
    public void user_leaves_note_for_guests_as(String note) throws Exception{
     mainPage.sendKeysToGuestNotes(note);
    }

    @Then("user enter info into invitee list like {string}")
    public void user_enter_info_into_invitee_list_like(String email) throws Exception{
    mainPage.sendKeysToGuestList(email);
    }

    @Then("user click on create group order button")
    public void user_click_on_create_group_order_button() throws Exception{
       mainPage.clickOnCreateGrOrdBtn();
    }

    @Then("user validate on main header {string} on the nex Page")
    public void user_validate_on_main_header_on_the_nex_page(String header) {
       String actualHeader = mainPage.getHeaderText(driver, header);
       Assert.assertEquals("Failed to validate header ",header, actualHeader);
    }

    @Then("user validates total participant as {string}")
    public void user_validates_total_participant_as(String participantNumber) {
       String actualNumber = mainPage.getParticipantNumber();
       Assert.assertEquals("Failed to validate total participant number ",participantNumber, actualNumber);

    }

}
