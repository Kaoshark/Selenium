package com.myfirstproject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day11_NoSuchElementException extends TestBase{
    @Test
    public void noSuchElementTest() {

        driver.get("https://www.amazon.ca/");
        WebElement SearchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        SearchBox.sendKeys("iPhone 15");

    }
    @Test
    public void noSuchElementTest2(){
        //        Given user is on https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");

        // switchIframeByIndex(0);
        WebElement sourceElement = driver.findElement(By.id("draggable"));
        WebElement targetElement = driver.findElement(By.id("droppable"));


        // destination(Drop here)
        Actions actions = new Actions(driver);
        waitFor(2);
        actions.dragAndDrop(sourceElement, targetElement).perform();


    }
}
