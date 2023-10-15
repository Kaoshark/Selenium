package com.myfirstproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day08_JSE extends TestBase{
    @Test
    public void jsExecutorTest() throws InterruptedException {
        //    Given user is on the https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
//    When user click on “Account” link
        // Locate the accountTab first and then accountLink
        WebElement accountAndListTab = driver.findElement(By.id("nav-link-accountList"));
        //Step 1: create actions object and assign the driver
        Actions actions = new Actions(driver);
        // Step 2: moveToElement() to hover over the element
        actions.moveToElement(accountAndListTab).perform();
        // Now we are able to see it and click on the "Account" LINK
        WebElement accountLink = driver.findElement(By.linkText("Account"));
        // accountLink.click(); // commonly used click method in Selenium
        // actions.click(accountLink).perform();  // click method coming from Actions class
//        If these two click methods don't work, we use JS Executor click method
        // Step 1: create JavaScript Reference
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Step 2: use executeScript() method to perform the function
        js.executeScript("arguments[0].click();", accountLink);
//        Then verify the page title contains “Your Account”
        Assertions.assertTrue(driver.getTitle().contains("Your Account"));
//        Then scroll to Amazon Music element at the bottom of the page
        WebElement musicLink = driver.findElement(By.xpath("//table//td[1]//a"));
        js.executeScript("arguments[0].scrollIntoView(true);", musicLink);  // scrollIntoView(true) from JS Executor to locate the element
//        Click on it
        // js.executeScript("arguments[0].click();", musicLink);
        clickByJS(musicLink); // Reusable Method
//        Then verify Amazon Music page is displayed
        Thread.sleep(3000);
        Assertions.assertTrue(driver.getCurrentUrl().contains("music"));
//        Scroll the page up and down
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); // scroll down
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight)"); // scroll up
        scrollAllDownJS(); // scroll down by using Reusable Methods from JSExecutor
        // Locate the Search input box
        WebElement searchBox = driver.findElement(By.id("navbarSearchInput"));
        Thread.sleep(3000);
        // Type "Pop" in the search box
        // searchBox.sendKeys("Pop");  // first option -> use Selenium methods
        setValueByJS(searchBox, "Pop");
        Thread.sleep(3000);
        // Get the value from the search box
        String searchBoxValue = getValueByJS("navbarSearchInput");
        System.out.println("searchBoxValue = " + searchBoxValue);
    }
}