package com.myfirstproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Day11_CaptureScreenShot extends TestBase {
  /*
Given user is on https://testcenter.techproeducation.com/index.php?page=autocomplete
When User search for ‘uni’ in the search box
And select the ‘United Kingdom’ from the suggestions
Add click on submit button
Then verify the result contains United Kingdom
     */
        @Test
        public void captureScreenshotTest () {
//        Given user is on https://testcenter.techproeducation.com/index.php?page=autocomplete
            driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");
            waitFor(1);
            captureScreenshotEntirePage();
//        When User search for ‘uni’ in the search Box
            driver.findElement(By.id("myCountry")).sendKeys("uni");
            waitFor(1);
            captureScreenshotEntirePage();
//        And select the ‘United Kingdom’ from the suggestions
            driver.findElement(By.xpath("(//div[@id='myCountryautocomplete-list']//div)[2]")).click();
            waitFor(1);
            captureScreenshotEntirePage();
//        Add click on submit button
            driver.findElement(By.xpath("//input[@type='button']")).click();
            waitFor(1);
//        Then verify the result contains United Kingdom
            Assertions.assertTrue(driver.findElement(By.xpath("//p[@id='result']")).getText().contains("United Kingdom"));
            captureScreenshotEntirePage();
        }
    }

