package com.myfirstproject.practices.practices01;

import com.myfirstproject.TestBase;
import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class homework3 extends TestBase {

    @Test
    public void explictTest(){

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.findElement(By.xpath("//div[@id='start']//button")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement helloWorld=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
        Assertions.assertEquals("Hello World!",helloWorld.getText());

    }
}
