package com.myfirstproject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class Day07_Cookies  extends TestBase{

    //Go to https://www.amazon.com
    //Find the total number of cookies
    //Print all the cookies
    //Get the cookies by their name
    //Add new cookie
    //Delete all cookies
    @Test
    public void cookiesTest(){
        // Go to amazon
        driver.get("https://amazon.com");
        //Find the total number of cookies
        Set<Cookie> cookieList=driver.manage().getCookies();
        System.out.println("Number of cookies:"+cookieList.size());
        System.out.println("=========");


        //print all cookies
        for (Cookie eachCookie: cookieList){
            System.out.println(eachCookie);
            System.out.println("cookie name:"+eachCookie.getName());
            System.out.println("cookie value:"+eachCookie.getValue());
        }

        // get the cookies by their name

        System.out.println("=========");
        driver.manage().getCookieNamed("sp-cdn");

        // add new cookie
        Cookie myFavCookie= new Cookie("my cookie","login cookie");
        driver.manage().addCookie(myFavCookie);

        for (Cookie eachCookie:driver.manage().getCookies()){
            System.out.println(eachCookie);
        }


        //delete all cookies
        System.out.println("=========");

        driver.manage().deleteAllCookies();
        System.out.println("cookies:"+driver.manage().getCookies().size());


    }
}
