package com.demo.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginPositiveTest(){
        click(By.xpath("//a[text()='Log in']"));
        type(By.xpath("//input[@id='Email']"), "derhnat@gmail.com");
        type(By.xpath("//input[@id='Password']"), "Derh0510!");
        click(By.xpath("//input[@class='button-1 login-button']"));
        Assert.assertTrue(isElementPresent(By.xpath("//a[text()='Log out']")));
    }
}
