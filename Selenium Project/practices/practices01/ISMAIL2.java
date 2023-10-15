package com.myfirstproject.practices.practices01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISMAIL2 {
    public static void main(String[] args) throws InterruptedException{
        /*
        Set Driver Path
        Create chrome driver object
        Maximize the window
        Open google home page https://www.google.com/
        Wait for 3 seconds
        Go to the "https://techproeducation.com/"
        Get the title and URL of the page
        Check if the title contains the word "Bootcamps" print console "Title contains Bootcamps" or "Title does not contain Bootcamps"
        Check if the URL contains the word "Courses" print console "URL contains Courses" or "URL does not contain Courses"
        Then go to "https://medunna.com/"
        Get the title and check if it contains the word "MEDUNNA" and print "Title contains MEDUNNA" or "Title does not contain MEDUNNA"
        Navigate Back to the previous webpage
        Refresh the page
        Navigate to forward
        Wait for 3 seconds
        Close the browser
                */

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.get("https://techproeducation.com/");
        String getProTitle=driver.getTitle();
        System.out.println("TechproTitle:"+getProTitle);
        String getProURL=driver.getCurrentUrl();
        System.out.println("getProURL:"+getProURL);
        if (getProTitle.contains("Bootcamps")){
            System.out.println("Title contains Bootcamps");

        }else {
            System.out.println("Title does not contain Bootcamps");
        }
        driver.get("https://medunna.com/");
        String medunnaTitle=driver.getTitle();
        System.out.println("MedunnaTitle:"+medunnaTitle);
        String medunnaURL=driver.getCurrentUrl();
        System.out.println("MedunnaURL:"+medunnaURL);

        if (medunnaTitle.contains("medunna")){
            System.out.println("Title contains medunna");
        }else {
            System.out.println("title does not contain medunna");
        }
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(3000);

        driver.quit();

    }
}
