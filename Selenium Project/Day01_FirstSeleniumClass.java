package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_FirstSeleniumClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");

    }
}
