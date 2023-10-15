package com.myfirstproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Day06_AuthenticationTest extends TestBase{

    //username : admin
    //password name : admin
    //url :the-internet.herokuapp.com/basic_auth
    @Test
    public void authTest(){
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");//this authenticates the login

        Assertions.assertTrue(driver.findElement(By.xpath("//p")).getText().contains("Congratulations!"));
    }
}
