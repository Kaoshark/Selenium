package com.myfirstproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Day06_AutoSuggestions extends  TestBase{
    @Test
    public void autoSuggestion() throws InterruptedException {
        //https://testcenter.techproeducation.com/index.php?page=autocomplete
        driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");
        //when user type "uni" in the search box
        driver.findElement(By.id("myCountry")).sendKeys("Uni");
        Thread.sleep(1000);
        //and select the 'united kingdom' from the suggestions
        driver.findElement(By.xpath("//div[@id='myCountryautocomplete-list']//div[.='United Kingdom']")).click();
        Thread.sleep(3000);
        //and click on submit button
        driver.findElement(By.xpath("//input[@type='button']")).click();
        // then verify the result contains ' united kingdom'
        Assertions.assertTrue(driver.findElement(By.id("result")).getText().contains("United Kingdom"));
    }
}


