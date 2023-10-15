package com.myfirstproject.practices.practices01;

import com.myfirstproject.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class Homework2 extends TestBase{

    @Test
    public void homeWork2(){
        driver.get("https://testpages.eviltester.com/styled/windows-test.html");
        WebElement alertsLink=driver.findElement(By.id("goalerts"));
        alertsLink.click();

        Set<String> allWindowHandles=driver.getWindowHandles();

    }
}
