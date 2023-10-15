package com.myfirstproject.practices.practices01;

import com.myfirstproject.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Q05_alert2 extends TestBase {
    // Go to https://testcenter.techproeducation.com/index.php?page=javascript-alerts
    //    Create a class: AlertTest
    //    Create 3 test methods:
    //    acceptAlert() => click on the first alert,
    //    verify the text “I am a JS Alert” ,
    //    click OK ,
    //    and Verify “You successfully clicked an alert”
    //    dismissAlert()=> click on the second alert,
    //    verify text "I am a JS Confirm”,
    //    click cancel,
    //    and Verify “You clicked: Cancel”
    //    sendKeysAlert()=> click on the third alert,
    //    verify text “I am a JS prompt”,
    //    type “Hello World”,
    //    click OK,
    //    and Verify “You entered: Hello World”


    @Test
    public void alertTest() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        String alertText = driver.switchTo().alert().getText();
        Assertions.assertTrue(alertText.equals("I am a JS Alert"));
        driver.switchTo().alert().accept();
        Assertions.assertTrue(driver.findElement(By.id("result")).getText().equals("You successfully clicked an alert"));

    }
}
