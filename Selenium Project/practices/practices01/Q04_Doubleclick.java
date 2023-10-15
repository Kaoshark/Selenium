package com.myfirstproject.practices.practices01;

import com.myfirstproject.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Q04_Doubleclick extends TestBase {
    @Test
    public void doubleClicktest(){
        driver.get("https://demoqa.com/buttons");
        WebElement clickdouble=driver.findElement(By.id("doubleClickBtn"));

        Actions actions=new Actions(driver);
        actions.doubleClick(clickdouble);

    }
}
