package com.myfirstproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;

public class Day06_NewWindows extends  TestBase {
    @Test
    public void newTABTest () throws InterruptedException {
        //Open the 2 pages
        //Linkedin
        //I would like to open ebay page on new tab
        //driver is on the new tab at this point
        //switch back to the linkedin page
        //switch back to ebay page

        driver.get("https://www.linkedin.com");
        Assertions.assertTrue(driver.getTitle().contains("LinkedIn"));
        String linkedinHandle= driver.getWindowHandle();
        //EBay
        //I would like to open ebay page on new tab
        driver.switchTo().newWindow(WindowType.TAB);//creates a new tab switch to new tab
        //driver is on the new tab at this point
        driver.get("https://ebay.com/");
        Assertions.assertTrue(driver.getTitle().contains("eBay"));
        String ebayHandle=driver.getWindowHandle();
        Thread.sleep(3000);

        //switch back to the linkedin page
        driver.switchTo().window(linkedinHandle);
        System.out.println("linkedin url:"+driver.getCurrentUrl());
        Thread.sleep(3000);


        //switch back to ebay page
        driver.switchTo().window(ebayHandle);
        System.out.println("ebay url:"+driver.getCurrentUrl());

    }
    @Test
    public void newWindowTest() throws InterruptedException {

        driver.get("https://www.linkedin.com");
        Assertions.assertTrue(driver.getTitle().contains("LinkedIn"));
        String linkedinHandle= driver.getWindowHandle();
        //EBay
        //I would like to open ebay page on new tab
        driver.switchTo().newWindow(WindowType.WINDOW);//creates a new tab switch to new tab
        //driver is on the new tab at this point
        driver.get("https://ebay.com/");
        Assertions.assertTrue(driver.getTitle().contains("eBay"));
        String ebayHandle=driver.getWindowHandle();
        Thread.sleep(3000);

        //switch back to the linkedin page
        driver.switchTo().window(linkedinHandle);
        System.out.println("linkedin url:"+driver.getCurrentUrl());
        Thread.sleep(3000);


        //switch back to ebay page
        driver.switchTo().window(ebayHandle);
        System.out.println("ebay url:"+driver.getCurrentUrl());


    }














}
