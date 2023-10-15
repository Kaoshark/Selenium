package com.myfirstproject.practices.practices01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q02_TheTitleTest {
    public static void main(String[] args) throws InterruptedException {
        //     Set Driver Path

        //     Create chrome driver object
        WebDriver driver=new ChromeDriver();

        //     Maximize the window
        driver.manage().window().maximize();
        //     Open google home page https://www.google.com/
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        //     Wait for 3 seconds
        //     Go to the "https://techproeducation.com/"
        driver.get("https://techproeducation.com");
        //     Get the title and URL of the page
        String techProTitle=driver.getTitle();
        System.out.println("TechproTitle:"+techProTitle);
        String techproUrl= driver.getCurrentUrl();
        System.out.println("TechproUrl:"+techproUrl);

        //     Check if the title contains the word "Bootcamps" print console "Title contains Bootcamps" or "Title does not contain Bootcamps"
        if (techProTitle.contains("Bootcamps")){
            System.out.println("Title contains Bootcamps");
        }else {
            System.out.println("Doesn't contains Bootcamps");
        }
        //     Then go to "https://medunna.com/"
        driver.get("https://medunna.com/");

        //     Check if the URL contains the word "Courses" print console "URL contains Courses" or "URL does not contain Courses"
        String medunnaTitle=driver.getTitle();
        System.out.println("MeddunTitle:"+medunnaTitle);
        String medunnaURL=driver.getCurrentUrl();
        System.out.println("MedunnaURL:"+medunnaURL);

        //     Get the title and check if it contains the word "MEDUNNA" and print "Title contains MEDUNNA" or "Title does not contain MEDUNNA"
        if (medunnaTitle.contains("MEDUNNA")){
            System.out.println("Title contains MEDUNNA");

        }else {
            System.out.println("Title does not contain MEDUNNA");
        }
        //     Navigate Back to the previous webpage
        driver.navigate().back();
        Thread.sleep(2000);
        //     Refresh the page
        driver.navigate().refresh();
        Thread.sleep(2000);
        //     Navigate to forward
        driver.navigate().forward();
        //     Wait for 3 seconds
        Thread.sleep(3000);
        //     Close the browser
        driver.quit();
    }
}
