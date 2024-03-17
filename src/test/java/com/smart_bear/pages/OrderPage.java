package com.smart_bear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class OrderPage {
    public OrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    @FindBy(css = "#ctl00_MainContent_fmwOrder_ddlProduct")
    WebElement dropdown;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtQuantity")
    WebElement quantity;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtUnitPrice")
    WebElement price;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtDiscount")
    WebElement discount;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtTotal")
    WebElement total;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtName")
    WebElement name;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox2")
    WebElement address;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox3")
    WebElement city;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox4")
    WebElement state;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox5")
    WebElement zipCode;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_cardList_0")
    WebElement radioVisa;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox6")
    WebElement ccNumber;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox1")
    WebElement expirationDate;

    @FindBy(css = "#ctl00_MainContent_fmwOrder_InsertButton")
    WebElement processBtn;



    public void selectSSAndQuantity(String screenSaver,String quantity,WebDriver driver){
        BrowserUtils.selectBy(dropdown,screenSaver,"visibleText");
       BrowserUtils.sendKeys(this.quantity,driver,quantity);
       // this.quantity.sendKeys(quantity);  isto sto gore
    }
   public void priceAndDiscountAndTotal(String price,String discount,String total,WebDriver driver){

        BrowserUtils.sendKeys(this.price,driver,price);
        BrowserUtils.sendKeys(this.total,driver,total);
        BrowserUtils.sendKeys(this.discount,driver,discount);

   }

   public void  nameAddress(String name,String address,WebDriver driver){
        BrowserUtils.sendKeys(this.name,driver,name);
        BrowserUtils.sendKeys(this.address,driver,address);

   }

   public void cityStateAndZipcode(String city,String state,String zipcode,WebDriver driver){
        BrowserUtils.sendKeys(this.city,driver,city);
        BrowserUtils.sendKeys(this.state,driver,state);
        BrowserUtils.sendKeys(this.zipCode,driver,zipcode);


   }

   public void checkVisaClickCCAndExp(String ccNumber,String expiration,WebDriver driver){
        this.radioVisa.click();
        BrowserUtils.sendKeys(this.ccNumber,driver,ccNumber);
        BrowserUtils.sendKeys(this.expirationDate,driver,expiration);

   }
 public void clickOnProcessBtn(){
        this.processBtn.click();
 }

}
