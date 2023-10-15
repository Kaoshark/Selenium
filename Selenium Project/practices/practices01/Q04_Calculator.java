package com.myfirstproject.practices.practices01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Q04_Calculator  {
/*
         Create chrome driver by using @BeforeEach annotation and WebDriverManager
         Navigate to  https://testpages.herokuapp.com/styled/index.html
         Click on  Calculator under Micro Apps
         Type any number in the first input
         Type any number in the second input
         Click on Calculate
         Get the result
         Verify the result
         Print the result
         Close the browser by using @AfterEach annotation
    */
WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

    }
    @Test
    public void MultiplcationTest(){
//         Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");


//         Click on  Calculator under Micro Apps
        driver.findElement(By.id("calculatetest")).click();



//         Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("6");
//         Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("4");
//      Select times option from functions dropdown
        WebElement functionsDropDown=driver.findElement(By.id("function"));
        Select functions=new Select(functionsDropDown);
        functions.selectByVisibleText("minus");


//         Click on Calculate
        driver.findElement(By.id("calculate")).click();
//         Get the result
        String answer=driver.findElement(By.id("answer")).getText();
        System.out.println("Answer:"+answer);

//         Verify the result
        assertEquals(24,answer);
//         Print the result
        System.out.println("Answer:"+answer);

    }







    //    Close the browser by using @AfterEach annotation
    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}
