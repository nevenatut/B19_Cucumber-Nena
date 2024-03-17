package com.smart_bear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {


    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//a[.='Order']")
    WebElement orderTab;


    public void clickOnOrderBtnTab(){

        this.orderTab.click();//da koristimo cesce this. sto upucuje na ovaj WebEl
    }

}
