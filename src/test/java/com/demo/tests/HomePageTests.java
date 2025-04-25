//Lesson 19

package com.demo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

// тест для проверки возврата на главную страницу сайта
public class HomePageTests extends TestBase {

    @Test
    //этот метод не универсален - он ищет только один элемент
    public void isHomeComponentPresentTest() {
        //driver.findElement(By.xpath("//div[@class='header-logo']//img"));
        //System.out.println("Home Component " + isHomeComponentPresent());
        //любой тест должен содержать только Assert, все System.out.println удаляются
        Assert.assertTrue(isHomeComponentPresent());
    }

}
