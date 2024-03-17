package com.smart_bear.step_definitions;

import com.smart_bear.pages.LoginPage;
import com.smart_bear.pages.MainPage;
import com.smart_bear.pages.OrderPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class StepDefinitions {

    WebDriver driver=SmartHook.driver;// sad smo napravili jedan driver in Smart Hook tako da smo taj uveli ovde
                    //jer sa dva u jednom trenutku moze da se pobrkaju
    LoginPage loginPage=new LoginPage(driver);

    OrderPage orderPage=new OrderPage(driver);

    MainPage mainPage=new MainPage(driver);
    @Given("user is on main page of login page and validate title as {string}")
    public void user_is_on_main_page_of_login_page_and_validate_title_as(String expectedTitle) {
        Assert.assertEquals(expectedTitle,driver.getTitle());



    }
    @Then("user enter their username as {string} and password as {string}")
    public void user_enter_their_username_as_and_password_as(String username, String password) {
    loginPage.authenticate(username,password);

    }
    @Then("user click on login button")
    public void user_click_on_login_button() {
   loginPage.clickOnLoginBtn();

    }

    @When("user is on main page user click on order tab")
    public void user_is_on_main_page_user_click_on_order_tab() {
        mainPage.clickOnOrderBtnTab();

    }
    @Then("user on order page selects {string} and enters quantity as {string}")
    public void user_on_order_page_selects_and_enters_quantity_as(String screensaver, String quantity) {
      orderPage.selectSSAndQuantity(screensaver,quantity,driver);
    }
    @Then("user enters price as {string} discount as {string} and total as {string}")
    public void user_enters_price_as_discount_as_and_total_as(String price, String discount, String total) {
      orderPage.priceAndDiscountAndTotal(price,discount,total,driver);

    }
    @Then("user enters their name as {string} and street address as {string}")
    public void user_enters_their_name_as_and_street_address_as(String name, String streetAdress) {
     orderPage.nameAddress(name,streetAdress,driver);

    }
    @When("user enters city as {string} and state as {string} and zipcode as {string}")
    public void user_enters_city_as_and_state_as_and_zipcode_as(String city, String state, String zipcode) {
    orderPage.cityStateAndZipcode(city,state,zipcode,driver);
    }
    @Then("user selects visa and provides cc as {string} and expiration data as {string}")
    public void user_selects_visa_and_provides_cc_as_and_expiration_data_as(String visaCard, String expirationDate) {
    orderPage.checkVisaClickCCAndExp(visaCard,expirationDate,driver);
    }
    @Then("user finally click on process button")
    public void user_finally_click_on_process_button() {
    orderPage.clickOnProcessBtn();

    }



}
