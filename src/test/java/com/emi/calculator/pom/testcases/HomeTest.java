package com.emi.calculator.pom.testcases;

import com.emi.calculator.pom.BaseTest;
import com.emi.calculator.pom.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    LandingPage landingPage;

    @Test
    public void emiCalculatorBtnShouldBeShown() {
        landingPage = new LandingPage();
        Assert.assertTrue(landingPage.isEmiCalculatorBtn());
    }

    @Test
    public void compareLoanBtnShouldBeShown() {
        landingPage = new LandingPage();
        Assert.assertTrue(landingPage.isCompareLoanBtn());
    }
}
