package com.myfirstproject.practices.practicies04;

import com.myfirstproject.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Q05_windows extends TestBase {
    @Test
    public void windowsTest(){

        driver.get("https://demoqa.com/browser-windows");
        WebElement extab=driver.findElement(By.id("tabButton"));
        extab.click();

        List<String> tabs=new ArrayList<>(driver.getWindowHandles());
        tabs.size();

        driver.switchTo().window(tabs.get(1));

        System.out.println(driver.getCurrentUrl());

        driver.close();




    }
}
