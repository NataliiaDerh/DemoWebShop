package com.demo.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegistrationPositiveTest() {
        // 1.click on Register link
        driver.findElement(By.xpath("//a[text()='Register']")).click();

        // 2.enter first name to First name field
        //заполнение поля состоит из 3 шагов
        // 2.1 - кликнуть по нужному полю
        driver.findElement(By.xpath("//input[@id='FirstName']")).click();
        // 2.2 - очистить это поле
        driver.findElement(By.xpath("//input[@id='FirstName']")).clear();
        // 2.3 - заполнить это поле
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Nataly");

        // 3.enter last name to Last name field
        //заполнение поля состоит из 3 шагов
        // 3.1 - кликнуть по нужному полю
        driver.findElement(By.xpath("//input[@id='LastName']")).click();
        // 3.2 - очистить это поле
        driver.findElement(By.xpath("//input[@id='LastName']")).clear();
        // 3.3 - заполнить это поле
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Derh");

        // 4.enter email to Email field
        //заполнение поля состоит из 3 шагов
        // 4.1 - кликнуть по нужному полю
        driver.findElement(By.xpath("//input[@id='Email']")).click();
        // 4.2 - очистить это поле
        driver.findElement(By.xpath("//input[@id='Email']")).clear();
        // 4.3 - заполнить это поле
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("derhnat@gmail.com");

        // 5.enter password to Password field
        //заполнение поля состоит из 3 шагов
        // 5.1 - кликнуть по нужному полю
        driver.findElement(By.xpath("//input[@id='Password']")).click();
        // 5.2 - очистить это поле
        driver.findElement(By.xpath("//input[@id='Password']")).clear();
        // 5.3 - заполнить это поле
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Derh0510!");

        // 6.enter password to Confirm password
        //заполнение поля состоит из 3 шагов
        // 6.1 - кликнуть по нужному полю
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).click();
        // 6.2 - очистить это поле
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).clear();
        // 6.3 - заполнить это поле
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Derh0510!");

        // 7.click on Register button
        driver.findElement(By.xpath("//input[@id='register-button']")).click();

        // verify Log out button is displayed - подтверждает, что пользователь зарегистрировался
        Assert.assertTrue(isElementPresent(By.xpath("//a[text()='Log out']")));
    }













}
