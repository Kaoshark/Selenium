package com.myfirstproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class Day07_WebTables extends TestBase {
    //    https://the-internet.herokuapp.com/tables
//
//    Create a class: WebTables
//    Task 1 : Print the entire table and Assert if the last element in the table 1 is "edit delete"
//
//    Task 2 : Print All Rows
//    Task 3 : Print Last row data only
//    Task 4 : Print column 5 data in the table body
//
//    Task 5 : Write a method that accepts 2 parameters
//    Parameter 1 = row number
//    Parameter 2 = column number
//    printData(2,3);   => prints data in 2nd row 3rd column
    @Test
    public void webTablesTest(){



        driver.get("https://the-internet.herokuapp.com/tables");
//        Task 1 : Print the entire table and Assert if the last element in the table 1 is "edit delete"
        // String entireTableData = driver.findElement(By.xpath("//table[@id='table1']")).getText();
        String entireTableData = driver.findElement(By.xpath("//table//tbody")).getText();
        System.out.println( entireTableData);



        System.out.println("==================================");




        // To do assertion, we need to get each data from the table as separate webElement first and then we'll do assertion
        List<WebElement> elementsList = driver.findElements(By.xpath("//table[@id='table1']//td"));
        int index = 1;
        for (WebElement eachElement : elementsList){
            System.out.println("Data: "+index+" => " + eachElement.getText());
            index++;
        }
        // Assert if the last element in the table 1 is "edit delete"
        Assertions.assertTrue(elementsList.get(elementsList.size()-1).getText().equals("edit delete"));




        System.out.println("==================================");



//       Task 2 : Print All Rows
        List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        int rowIndex =1;
        for (WebElement eachRow : rowData){
            System.out.println("Row: "+rowIndex+"=> " +eachRow.getText());
            rowIndex++;
        }


        System.out.println("==================================");



//        Task 3 : Print Last row data only
        System.out.println("Last Row data: " + rowData.get(rowData.size()-1).getText());



        System.out.println("==================================");




        //    Task 4 : Print column 5 data in the table body
        List<WebElement> colData = driver.findElements(By.xpath("//table[@id='table1']//tr//td[5]"));
        int colmNum =1;
        for (WebElement eachColData : colData){
            System.out.println("Row:  "+colmNum+ " Column 5 => " + eachColData.getText());
            colmNum++;

            System.out.println("===========");


        /*
        Mr Yusuf's question: what if we want first row?
         */
            System.out.println(rowData.get(0).getText());
            System.out.println(rowData.get(1).getText());
            System.out.println(rowData.get(3).getText());
            Assertions.assertTrue(rowData.get(3).getText().contains("Jason"));



        }
    }
//    Homework: Task 5 : Write a method that accepts 2 parameters
//    Parameter 1 = row number
//    Parameter 2 = column number
//    printData(2,3);   => prints data in 2nd row 3rd column
}