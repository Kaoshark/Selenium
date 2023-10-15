package com.myfirstproject.practices.practices01;

import com.myfirstproject.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;

public class ISMAIL06 extends TestBase {
    @Test
    public void windowsTest(){
        //Open the 2 pages
        //Linkedin
        driver.get("https://www.linkedin.com");
        Assertions.assertTrue(driver.getTitle().contains("LinkedIn"));
        String linkedinHandle=driver.getWindowHandle();
        //I would like to open ebay page on new tab
        driver.switchTo().newWindow(WindowType.TAB);
        //driver is on the new tab at this point
        driver.get("https://www.ebay.com");
        Assertions.assertTrue(driver.getTitle().contains("eBay"));
        String ebayHandle=driver.getWindowHandle();
        //switch back to the linkedin page
        driver.switchTo().window(linkedinHandle);
        System.out.println("linkedin url:"+driver.getCurrentUrl());
        //switch back to ebay page
        driver.switchTo().window(ebayHandle);
        System.out.println("ebay url:"+driver.getCurrentUrl());


    }
}
