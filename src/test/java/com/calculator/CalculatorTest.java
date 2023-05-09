package com.calculator;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest2 {

    @Test
    public void addShouldSucceed() throws InterruptedException {
        driver.findElement(By.id("btn_9_s")).click();
        driver.findElement(By.id("btn_9_s")).click();
        driver.findElement(By.id("btn_plus_s")).click();
        driver.findElement(By.id("btn_5_s")).click();
        driver.findElement(By.id("btn_equal_s")).click();
        driver.findElement(By.id("btn_c_s")).click();
        Thread.sleep(4000);
    }

    @Test
    public void subtractShouldSucceed() throws InterruptedException {
        driver.findElement(By.id("btn_8_s")).click();
        driver.findElement(By.id("btn_8_s")).click();
        driver.findElement(By.id("btn_minus_s")).click();
        driver.findElement(By.id("btn_2_s")).click();
        driver.findElement(By.id("btn_equal_s")).click();
        driver.findElement(By.id("btn_c_s")).click();
        Thread.sleep(4000);
    }

    @Test
    public void multiplyShouldSucceed() throws InterruptedException {
        driver.findElement(By.id("btn_6_s")).click();
        driver.findElement(By.id("btn_6_s")).click();
        driver.findElement(By.id("btn_mul_s")).click();
        driver.findElement(By.id("btn_4_s")).click();
        driver.findElement(By.id("btn_equal_s")).click();
        driver.findElement(By.id("btn_c_s")).click();
        Thread.sleep(4000);
    }

    @Test
    public void modulusShouldSucceed() throws InterruptedException {
        driver.findElement(By.id("btn_6_s")).click();
        driver.findElement(By.id("btn_percent_s")).click();
        driver.findElement(By.id("btn_4_s")).click();
        driver.findElement(By.id("btn_equal_s")).click();
        driver.findElement(By.id("btn_c_s")).click();
        Thread.sleep(4000);
    }

    @Test
    public void divisionShouldSucceed() throws InterruptedException {
        driver.findElement(By.id("btn_6_s")).click();
        driver.findElement(By.id("btn_div_s")).click();
        driver.findElement(By.id("btn_2_s")).click();
        driver.findElement(By.id("btn_equal_s")).click();
        driver.findElement(By.id("btn_c_s")).click();
        Thread.sleep(4000);
    }
}
