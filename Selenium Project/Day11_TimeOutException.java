package com.myfirstproject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day11_TimeOutException extends TestBase{
    @Test
    public void timeOutExceptioNTest(){

        driver.get("https://www.amazon.ca/");

      //  WebElement SearchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));//Wrong Location
     //   SearchBox.sendKeys("iPhone 15");


        //using explicit wait with the webElement that is not locate properly
        //WebElement searchBox=waitForVisibility(By.xpath("//input[@id='twotabsearchtextbox']"));
               // searchBox.sendKeys("iPhone 15");
    }
}
