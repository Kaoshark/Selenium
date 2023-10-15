package com.myfirstproject.practices.practices01;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.HttpClient;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Q03_BeforeEach_FillForm {
/*
    Create chrome driver by using @BeforeEach annotation and WebDriverManager
    Click on 'User Icon'
    Click on 'Register'
    Enter SSN
    Enter First Name
    Enter Last Name
    Enter Address
    Enter Phone Number
    Enter Username
    Enter Email
    Enter New password
    Enter New password confirmation
    Click on Register button
    Assert that
    Close the browser by using @AfterEach annotation
*/
    //    Create chrome driver by using @BeforeEach annotation and WebDriverManager
        WebDriver driver;

    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
    }
    @Test
    public void test01() throws InterruptedException {
        //    Go to url , https://www.gmibank.com/
driver.get("https://www.gmibank.com/");

        //    Click on 'User Icon'
   WebElement userIcon= driver.findElement(By.id("account-menu"));
   userIcon.click();

        //    Click on 'Register'
        driver.findElement(By.linkText("Register")).click();


        //    Enter SSN
        driver.findElement(By.id("ssn")).sendKeys("374-75-"+Faker.instance().number().numberBetween(1000,9999));
        //    Enter First Name
        driver.findElement(By.name("firstname")).sendKeys("Ismail");
        //    Enter Last Name
        driver.findElement(By.name("lastname")).sendKeys("saf");
        //    Enter Address
        driver.findElement(By.id("address")).sendKeys("1234567897");
        //    Enter Phone Number
        driver.findElement(By.id("mobilephone")).sendKeys("1234567899");
        //    Enter Username
        driver.findElement(By.id("username")).sendKeys("kaosharkk");
        //    Enter Email
        driver.findElement(By.id("email")).sendKeys("emcukspor@gmail.com");
        //    Enter New password
        driver.findElement(By.id("firstPassword")).sendKeys("Apartonur58*");
        //    Enter New password confirmation
        driver.findElement(By.id("secondPassword")).sendKeys("Apartonur58*");
        //    Click on Register button
        driver.findElement(By.id("register-submit")).click();
        //    Assert that
        Thread.sleep(1000);
        WebElement alert=driver.findElement(By.xpath("//div[@role='alert'][1]"));
        String alertMessage=alert.getText();
        System.out.println("Allert Message:"+alertMessage);
        assertTrue(alertMessage.contains("Registartion saved"));
    }
    //    Close the browser by using @AfterEach annotation
    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


}

