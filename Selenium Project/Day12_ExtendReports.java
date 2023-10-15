package com.myfirstproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.IOException;

public class Day12_ExtendReports extends TestBase {

    @Test
        public void extentTest() {
        extentTest.info("Login button should be active");
        extentTest.warning("Pay attention to the Login Button");
        extentTest.skip("Registration Test skipped for now");
        extentTest.fail("Login Test failed");
        extentTest.pass("Login test passed now!!");



    }


    @Test
    public void captureScreenshotTest() throws IOException {
//        Given user is on https://testcenter.techproeducation.com/index.php?page=autocomplete
        driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");
        waitFor(1);
        extentTest.
                pass("User is at the homepage  ")
                .assignAuthor("Ismail Sahin")
                        .assignCategory("Smoke Test")
                                .assignDevice("Windows").addScreenCaptureFromPath(captureScreenshotEntirePageAsString());

        //        When User search for ‘uni’ in the search Box
        driver.findElement(By.id("myCountry")).sendKeys("uni");
        waitFor(1);
        extentTest.
                pass("Typed in 'uni' successfully ")
                        .addScreenCaptureFromPath(captureScreenshotEntirePageAsString());



        //        And select the ‘United Kingdom’ from the suggestions
        driver.findElement(By.xpath("(//div[@id='myCountryautocomplete-list']//div)[2]")).click();
        waitFor(1);
        extentTest.
                pass("'United Kingdom' is selected successfully")
                        .addScreenCaptureFromPath(captureScreenshotEntirePageAsString());


        //        Add click on submit button
        driver.findElement(By.xpath("//input[@type='button']")).click();
        waitFor(1);
//        Then verify the result contains United Kingdom
        Assertions.assertTrue(driver.findElement(By.xpath("//p[@id='result']")).getText().contains("United Kingdom"));
        extentTest
                .pass("United Kingdom is visible ")
                .addScreenCaptureFromPath(captureScreenshotEntirePageAsString());

    }
}