package com.smart_bear.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class SmartHook {



     public static  WebDriver driver; //public static smo napravili da bi smo koristili samo jedan driver kroz ceo project
    @Before//this annotation is from io.cucumber.java!!!!!!
    public void initializeDriver(){
        driver= DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("smartBearURl"));
    }
      @After
    public void treatDown() throws InterruptedException {
          Thread.sleep(2000);
          driver.quit();
      }
}
