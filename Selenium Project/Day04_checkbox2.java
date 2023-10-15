package com.myfirstproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day04_checkbox2  extends  TestBase{



    @Test
    public void checkboxTest() {
        //  Go To  https://testcenter.techproeducation.com/index.php?page=checkboxes
        driver.get("https://testcenter.techproeducation.com/index.php?page=checkboxes");
        //Locate the elements of checkboxes
        WebElement checkbox1 = driver.findElement(By.id("box1"));
        WebElement checkbox2 = driver.findElement(By.id("box2"));

        //Then click on checkbox1 if box is not selected Then click on checkbox2 if box is not selected

        if (!checkbox1.isSelected()) {
            checkbox1.click();

        }
        if (!checkbox2.isSelected()) {
            checkbox2.click();
        }

        //Then verify that checkbox1 is checked.

        Assertions.assertTrue(checkbox1.isSelected());
        Assertions.assertTrue(checkbox2.isSelected());

    }
}
