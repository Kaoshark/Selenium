package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifyTitleTest {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");

        String actualTitle= driver.getTitle();

        if (actualTitle.contains("Amazon")){
            System.out.println("passed");
        }else {
            System.out.println("fails");
            System.out.println("actual title:"+actualTitle+"doesn`t contain expected amazon");
        }


driver.quit();
        }
    }
