package com.myfirstproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Day04_Dropdown extends TestBase{


    @Test
    public  void DropdownTest(){
        //2014 october 31
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        //1.Locate the web elements
        WebElement year=driver.findElement(By.id("year"));
        //2.Create instance from Select Class
        Select selectYear= new Select(year);
        //3.Go to the dropdown and  selected the given element
        selectYear.selectByVisibleText("2014");

        //MONTH
        //1.
        WebElement month=driver.findElement(By.id("month"));
        //2.
        Select selectMonth=new Select(month);
        //3.
        selectMonth.selectByVisibleText("October");
        //SELECTING FIRST MONTH USING REUSABLE METHOD
        dropdownSelectByIndex(driver.findElement(By.id("month")),1);
        dropdownSelectByIndex(By.xpath("//select[@id='month']"),1);

        //Day

        WebElement day=driver.findElement(By.id("day"));
        Select selectDay=new Select(day);
        selectDay.selectByVisibleText("10");

        //Verification
        //Verify if 2014 selected
        WebElement selectedYear = selectYear.getFirstSelectedOption();
        System.out.println("Selected Year = " +selectedYear.getText());
        Assertions.assertTrue(selectedYear.getText().equals("2014"));

        //Get all the months from dropdown list and verify 'October' exists
        List<WebElement> allMonths =selectMonth.getOptions();
        boolean flag=false;
        for (WebElement w:allMonths){
            System.out.println("All months:" +w.getText());

            if (w.getText().equals("October")){
                flag=true;
            }

        }
        Assertions.assertTrue(flag);



    }
}
