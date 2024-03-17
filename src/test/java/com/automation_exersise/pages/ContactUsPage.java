package com.automation_exersise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class ContactUsPage {


    public ContactUsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(css = "input[name='name']")
    WebElement name;

    @FindBy(css = "input[name='email']")
    WebElement email;

    @FindBy(css = "input[name='subject']")
    WebElement subject;

    @FindBy(css = "#message")
    WebElement messageBody;

    @FindBy(css = "input[name='upload_file']")
    WebElement uploadFile;

    @FindBy(css = "input[name='submit']")
    WebElement submitBtn;

    @FindBy(xpath = "//h2[contains(.,'Contact')]")
    WebElement contactUsText;

    @FindBy(xpath = "//h2[contains(.,'Get')]")
    WebElement getInTouchText;

    @FindBy(xpath = "//h2[contains(.,'Feed')]")
    WebElement feedBackText;





    // NOTE: in BDD framework
    // it is recommended strictly follow scenarios written
    // in feature file and create methods
    // as per those scenarios.
     // citas u cucumber class i follow that instruction,you write down methods


    public void enterNameEmail(String name, String email){
        // NOTE: in BDD framework
        // it is recommended strictly follow scenarios written
        // in feature file and create methods
        // as per those scenarios.
        this.name.sendKeys(name);
        this.email.sendKeys(email);
    }

    public void enterSubjectAndMessage(String subject, String message){
        this.subject.sendKeys(subject);
        this.messageBody.sendKeys(message);
    }

    public void attacheFileAndSubmit(String path){
        this.uploadFile.sendKeys(path);
        this.submitBtn.click();
    }
                      //return String,jer skidamo text sa header
    public String getTextContactUs(){

        return BrowserUtils.getText(contactUsText);
    }

    public String getTextGetInTouch(){

        return BrowserUtils.getText(getInTouchText);
    }

    public String getTextFeedback(){

        return BrowserUtils.getText(feedBackText);
    }






    //saljemo lokaciju od file koji hocemo da uploaded(lokacija je na properties)





}





