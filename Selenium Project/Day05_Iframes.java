package com.myfirstproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Day05_Iframes extends  TestBase{
    //    Given Go to https://testpages.herokuapp.com/styled/frames/frames-test.html
    //    Then Assert that "Left List Item 29" is the last element in the "Left"
    //    And Assert that "Middle List Item 39" is the last element in the "Middle"
    @Test
    public void iframes(){
        driver.get("https://testpages.herokuapp.com/styled/frames/frames-test.html");
    //    Then Assert that "Left List Item 29" is the last element in the "Left"
    //    "Left List Item 29" IS INSIDE THE IFRAME SO SWITCH TO THAT FRAME FIRST
        driver.switchTo().frame("left");
    //    NOT WE ARE INSIDE THIS IFRAME
    //    li[last()]  => XPATH RETURNS THE LAST li ELEMENT
        String lastElement = driver.findElement(By.xpath("//li[last()]")).getText();
        System.out.println("LAST ELEMENT : "+lastElement);
        Assertions.assertTrue(lastElement.equals("Left List Item 29"));

        //    And Assert that "Middle List Item 39" is the last element in the "Middle"
//        to Go to sibling frames, switch to the parent first, then switch to the child
//        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();//switching to the main html page
        driver.switchTo().frame("middle");//switching to the middle frame
        String middleLastItem = driver.findElement(By.xpath("//li[last()]")).getText();//driver is in the middle frame and getting the middle frame elements
        Assertions.assertTrue(middleLastItem.equals("Middle List Item 39"));
    }
}
