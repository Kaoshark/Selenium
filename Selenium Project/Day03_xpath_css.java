package com.myfirstproject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day03_xpath_css {
    WebDriver driver;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));  // Selenium wait… dynamic.. because driver will wait only if it’s needed
        // Thread.sleep(5000); // Hard wait.. Java wait… It will make the driver wait for 5 seconds even if it is not needed
    }
    @Test

    public void dynamicLocators() throws InterruptedException {
//        When user goes to :https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//        And enter username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

//        And enter password
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("admin123");
        Thread.sleep(5000);

//        And click on submit button
        // driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(5000);

//        Then verify the login is successful
        Assertions.assertTrue(driver.getCurrentUrl().contains("dashboard"));
        Thread.sleep(5000);

//        Then logout the application
        driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(5000);

//        Then verify the logout is successful
        Assertions.assertTrue(driver.getCurrentUrl().contains("auth"));
        Thread.sleep(5000);
    }
     @AfterEach
    public void teardown(){
        driver.quit();
    }
}