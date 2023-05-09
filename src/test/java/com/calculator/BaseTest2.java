package com.calculator;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest2 {

    protected static  AndroidDriver driver;
    protected static WebDriverWait wait;


    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("appium:udid","57e216d1");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appium:platformVersion","12");
        capabilities.setCapability("appium:appPackage","com.miui.calculator");
        capabilities.setCapability("appium:appActivity",".cal.CalculatorActivity");
        capabilities.setCapability("noReset","true");
        capabilities.setCapability("fullReset","false");
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));




    }

    @AfterClass
    public void tearDown(){
        driver.quit();

    }
}
