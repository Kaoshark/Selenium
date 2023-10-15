package com.myfirstproject.practices.practices01;

import com.myfirstproject.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.swing.plaf.TableHeaderUI;

public class Q05_alert extends TestBase {
    @Test
    public void alerTest() throws InterruptedException {


        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("promtButton")).click();
        Alert alert=driver.switchTo().alert();

        System.out.println(alert.getText());

        Thread.sleep(3000);

        alert.sendKeys("Ismail");

        alert.accept();

    }
}
