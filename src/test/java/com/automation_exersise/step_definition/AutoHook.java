package com.automation_exersise.step_definition;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class AutoHook {

    public static WebDriver driver;
    @Before
    public void initializeDriver(){
        driver = DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("autoURL"));
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }





}
