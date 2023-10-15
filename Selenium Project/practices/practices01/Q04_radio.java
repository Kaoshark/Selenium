package com.myfirstproject.practices.practices01;

import com.myfirstproject.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Q04_radio extends TestBase {
    @Test
    public void radioTest(){

        driver.get("https://demoqa.com/radio-button");

        WebElement radio =driver.findElement(By.cssSelector("label[for='yesRadio']"));
        if (!radio.isSelected()){
            radio.click();
        }
        Assertions.assertTrue(radio.isSelected());
    }
}
