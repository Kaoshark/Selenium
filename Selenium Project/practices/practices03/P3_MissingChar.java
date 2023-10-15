package com.myfirstproject.practices.practices03;

import com.github.javafaker.Faker;
import com.myfirstproject.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class P3_MissingChar extends TestBase {

    //The paper on which your password is written has gotten wet, and the last character of your password cannot be read.
    // Write a code that randomly generates a solution for this issue.
    //App: https://testcenter.techproeducation.com/index.php?page=form-authentication
    @Test
    public void test(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=form-authentication");

        //Enter username
        driver.findElement(By.id("exampleInputEmail1")).sendKeys("techproed");

        //Enter password
        String password="SuperSecretPassword"+ Faker.instance().lorem().characters(1);
        System.out.println("Password:"+password);
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("SuperSecretPassword");

        //Click On submit
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Assert Success Message'
        String succesMesasge=driver.findElement(By.xpath("//div[@role='alert']\n")).getText();
        System.out.println("cevap:"+succesMesasge);
        assertTrue(succesMesasge.contains("You logged into secure"));



    }
}
