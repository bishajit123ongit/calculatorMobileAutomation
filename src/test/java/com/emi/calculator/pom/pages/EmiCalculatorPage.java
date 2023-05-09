package com.emi.calculator.pom.pages;

import com.emi.calculator.pom.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmiCalculatorPage extends BaseTest {

    @FindBy(id = "etLoanAmount")
    WebElement etLoanAmount;

    @FindBy(id = "etInterest")
    WebElement etInterest;

    @FindBy(id = "etPeriod")
    WebElement etPeriod;

    @FindBy(id = "etMonths")
    WebElement etMonths;

    @FindBy(id = "etFee")
    WebElement etFee;

    @FindBy(id = "btnCalculate")
    WebElement btnCalculate;

    @FindBy(id = "btnReset")
    WebElement btnReset;

    @FindBy(id = "layoutTable")
    List<WebElement> layoutTableList;

    @FindBy(id = "btnDetail")
    WebElement btnDetail;

    public EmiCalculatorPage() {
        PageFactory.initElements(driver, this);
        //PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(General.WAIT_TIME)), this);
    }

    public EmiCalculatorPage fillLoanAmount(int amount) {
        etLoanAmount.isDisplayed();
        etLoanAmount.clear();
        etLoanAmount.sendKeys(String.valueOf(amount));
        return this;
    }

    public EmiCalculatorPage fillInterest(int interest) {
        etInterest.isDisplayed();
        etInterest.clear();
        etInterest.sendKeys(String.valueOf(interest));
        return this;
    }

    public EmiCalculatorPage fillYear(int year) {
        etPeriod.isDisplayed();
        etPeriod.clear();
        etPeriod.sendKeys(String.valueOf(year));
        return this;
    }

//    public EmiCalculatorPage fillMonths(int months) {
//        etMonths.isDisplayed();
//        etMonths.clear();
//        etMonths.sendKeys(String.valueOf(months));
//        return this;
//    }
    public EmiCalculatorPage fillFee(int fee) {
        etFee.isDisplayed();
        etFee.clear();
        etFee.sendKeys(String.valueOf(fee));
        return this;
    }

    public EmiCalculatorPage tapBtnCalculate() {
        btnCalculate.isDisplayed();
        btnCalculate.click();
        return this;
    }

    public EmiCalculatorPage tapBtnReset() {
        btnReset.isDisplayed();
        btnReset.click();
        return this;
    }

    public boolean hasBtnDetail() {
        return btnDetail.isDisplayed();
    }
}
