package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_WebdriverManagerTest {
    public static void main(String[] args) {

        /// STEP 1
        WebDriverManager.chromedriver().setup();

        /// STEP2
        WebDriver driver=new ChromeDriver();

        /// STEP 3
        driver.get("https://amazon.com");
    }
}
