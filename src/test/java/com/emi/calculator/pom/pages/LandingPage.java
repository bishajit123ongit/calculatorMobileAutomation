package com.emi.calculator.pom.pages;

import com.emi.calculator.pom.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BaseTest {
    @FindBy(id = "layout_emi")
    WebElement layoutEmi;

    @FindBy(id = "layout_compare_loan")
    WebElement layoutCompareLoan;

    public LandingPage() {
        PageFactory.initElements(driver, this);
        //PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(General.WAIT_TIME)), this);
    }

    public EmiCalculatorPage tapEmiCalculator() {
        layoutEmi.isDisplayed();
        layoutEmi.click();
        return new EmiCalculatorPage();
    }
    public CompareLoanPage tapCompareLoan() {
        layoutCompareLoan.isDisplayed();
        layoutCompareLoan.click();
        return new CompareLoanPage();
    }

    public boolean isEmiCalculatorBtn(){
        return layoutEmi.isDisplayed();
    }

    public boolean isCompareLoanBtn(){
        return layoutCompareLoan.isDisplayed();
    }

}
