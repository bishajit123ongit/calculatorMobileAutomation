package com.emi.calculator.pom.testcases;

import com.emi.calculator.pom.BaseTest;
import com.emi.calculator.pom.pages.EmiCalculatorPage;
import com.emi.calculator.pom.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmiCalculatorTest extends BaseTest {

    LandingPage landingPage;
    EmiCalculatorPage emiCalculatorPage;

    @Test
    public void emiCalculateShouldSucceed() {
        landingPage = new LandingPage();
        Assert.assertTrue(landingPage.isEmiCalculatorBtn());
        emiCalculatorPage = landingPage.tapEmiCalculator().fillLoanAmount(500000)
                .fillInterest(9)
                .fillYear(1)
                .fillFee(2)
                .tapBtnCalculate();
        Assert.assertTrue(emiCalculatorPage.hasBtnDetail());
    }

    @Test
    public void resetEmiShouldSucceed() {
        emiCalculatorPage = emiCalculatorPage
                .fillLoanAmount(35000)
                .fillInterest(9)
                .fillYear(1)
                .fillFee(6)
                .tapBtnCalculate();
        Assert.assertTrue(emiCalculatorPage.hasBtnDetail());
    }
}
