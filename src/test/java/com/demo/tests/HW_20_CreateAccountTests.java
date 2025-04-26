package com.demo.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW_20_CreateAccountTests extends TestBase {
    @Test//(enabled = false) // (enabled = false) - чтобы не падал тест
    public void newUserRegistrationPositiveTest() {
        int i = (int)((System.currentTimeMillis()/1000)%3600);
        click(By.xpath("//a[text()='Register']"));
        type(By.xpath("//input[@id='FirstName']"), "Xa-xa-Test");
        type(By.xpath("//input[@id='LastName']"), "La-la-Test");
        type(By.xpath("//input[@id='Email']"), "Xaxa" + i + "@gmail.com");
        type(By.xpath("//input[@id='Password']"), "Xaxa1234!");
        type(By.xpath("//input[@id='ConfirmPassword']"), "Xaxa1234!");
        click(By.xpath("//input[@id='register-button']"));
        Assert.assertTrue(isElementPresent(By.xpath("//a[text()='Log out']")));
    }

}
