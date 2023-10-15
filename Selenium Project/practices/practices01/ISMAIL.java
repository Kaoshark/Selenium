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

public class ISMAIL {
    WebDriver driver;
    @BeforeEach
    public void hesap(){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

    }
    @Test
    public void hesapp(){

        driver.get("https://testpages.eviltester.com/styled/index.html");
        driver.findElement(By.id("calculatetest")).click();
        driver.findElement(By.id("number1")).sendKeys("50");
        driver.findElement(By.id("number2")).sendKeys("5");
        WebElement function=driver.findElement(By.id("function"));
        Select whichFunctions=new Select(function);
        whichFunctions.selectByVisibleText("times");
        driver.findElement(By.id("calculate")).click();

        String answer=driver.findElement(By.id("answer")).getText();
        System.out.println(answer);

        assertEquals(250,answer);
    }

    @AfterEach
    public void tearDown() throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();
    }

















}
