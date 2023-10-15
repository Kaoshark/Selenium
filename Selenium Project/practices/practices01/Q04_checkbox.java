package com.myfirstproject.practices.practices01;

import com.myfirstproject.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Q04_checkbox extends TestBase {

    @Test
    public void checkboxTest(){

        driver.get("https://app.endtest.io/guides/docs/how-to-test-checkboxes/");

        WebElement checkbox=driver.findElement(By.id("pet1"));

        if (!checkbox.isSelected()){

            checkbox.click();
        }

        Assertions.assertTrue(checkbox.isSelected());




    }
}
