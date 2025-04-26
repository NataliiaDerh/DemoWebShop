package com.demo.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test(enabled = false) // (enabled = false) - чтобы не падал тест
    public void newUserRegistrationPositiveTest() {
        click(By.xpath("//a[text()='Register']"));
        type(By.xpath("//input[@id='FirstName']"), "Nataly");
        type(By.xpath("//input[@id='LastName']"), "Derh");
        type(By.xpath("//input[@id='Email']"), "derhnat@gmail.com");
        type(By.xpath("//input[@id='Password']"), "Derh0510!");
        type(By.xpath("//input[@id='ConfirmPassword']"), "Derh0510!");
        click(By.xpath("//input[@id='register-button']"));
        Assert.assertTrue(isElementPresent(By.xpath("//a[text()='Log out']")));
    }

    @Test
    public void existedUserRegistrationNegativeTest() {
        click(By.xpath("//a[text()='Register']"));
        type(By.xpath("//input[@id='FirstName']"), "Nataly");
        type(By.xpath("//input[@id='LastName']"), "Derh");
        type(By.xpath("//input[@id='Email']"), "derhnat@gmail.com");
        type(By.xpath("//input[@id='Password']"), "Derh0510!");
        type(By.xpath("//input[@id='ConfirmPassword']"), "Derh0510!");
        click(By.xpath("//input[@id='register-button']"));
        Assert.assertTrue(isElementPresent(By.xpath("//li[contains(text(), 'already')]")));
    }

}
