package com.myfirstproject.practices.practicies04;

import com.myfirstproject.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q05_GoogleSearch extends TestBase {
     /*
     Create driver and go to http://www.google.com in the BeforeEach method
     With 3 different test methods:
      -Type "Desktop" in the search box and search it
      -Type "Smartphone" in the search box and search it
      -Type "Laptop" in the search box and search it
     NOTE: Print the result numbers in AfterEach method
     Close driver with AfterEach method
      */

    //Create driver and go to http://www.google.com in the BeforeEach method
    WebDriver driver;

    @BeforeEach
    public void beforeMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
    }


    //Type "Desktop" in the search box and search it
    @Test
    public void test1() {
        driver.findElement(By.name("q")).sendKeys("Desktop", Keys.ENTER);
    }

    //Type "Smartphone" in the search box and search it
    @Test
    public void test2() {
        driver.findElement(By.name("q")).sendKeys("Smartphone", Keys.ENTER);
    }

    //Type "Laptop" in the search box and search it
    @Test
    public void test3() {
        driver.findElement(By.name("q")).sendKeys("Laptop", Keys.ENTER);
    }

    @AfterEach
    public void afterMethod() throws InterruptedException {
        String searchResult = driver.findElement(By.id("result-stats")).getText();
        System.out.println("searchResult = " + searchResult.split(" ")[1]);
        Thread.sleep(3000);
        driver.quit();
    }

}
