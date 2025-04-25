package com.demo.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod(enabled = false) // (enabled = false) - пишем, когда хотим, чтобы сайт НЕ закрывался
    public void tearDown() {
        driver.quit();
    }

    //метод возвращает true если элемент найден на странице
    public boolean isHomeComponentPresent() {
        return driver.findElements(By.xpath("//div[@class='header-logo']//img")).size() > 0;
    }

    //этот метод универсален - он будет искать любой элемент, который мы укажем
    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size()>0;
    }
}
