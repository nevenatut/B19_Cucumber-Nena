package com.lambda.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[.='Input Form Submit']")
    WebElement submitFormDemo;

    @FindBy(xpath = "//a[.='Ajax Form Submit']")
    WebElement ajaxSubmitForm;

    public void clickOnAjax(){
        this.ajaxSubmitForm.click();
    }

    public void clickOnSubmitForm(){
        this.submitFormDemo.click();
    }




}
