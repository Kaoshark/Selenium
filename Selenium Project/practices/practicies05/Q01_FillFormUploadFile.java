package com.myfirstproject.practices.practicies05;

import com.myfirstproject.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Q01_FillFormUploadFile extends TestBase {
    /*
    Go to https://testpages.herokuapp.com/styled/basic-html-form-test.html
    Fill the username, password and textArea comment:
    Choose a file and upload it
    Select checkbox, radio item and dropdowns
    Click on submit
    Verify that uploaded file name is on the Form Details.
*/
    @Test
    public void UploadFileTest(){

        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        WebElement usernameInput=driver.findElement(By.xpath("//input[@name='username']"));
        WebElement passwordInput=driver.findElement(By.xpath("//input[@name='password']"));
        WebElement textAreaInput=driver.findElement(By.xpath("//textarea[@name='comments']"));

        usernameInput.sendKeys("techproed2");
        passwordInput.sendKeys("12345");
        textAreaInput.sendKeys("naberslk");


        WebElement chooseFileButton=driver.findElement(By.xpath("//input[@type='file']"));
        clickByJS(chooseFileButton);
        String pathOfTheFile= "C:\\Users\\Ismail\\Desktop\\Rectangle.png";
        uploadFile(pathOfTheFile);

        WebElement checkBox1=driver.findElement(By.xpath("//input[@value='cb1']"));
        WebElement checkBox2=driver.findElement(By.xpath("//input[@value='cb2']"));
        WebElement checkBox3=driver.findElement(By.xpath("//input[@value='cb3']"));

        if (!checkBox1.isSelected()){
            checkBox1.click();
        }
        if (!checkBox2.isSelected()){
            checkBox2.click();
        }
        if (!checkBox3.isSelected()){
            checkBox3.click();
        }

        driver.findElement(By.xpath("//input[@value='rd1']"));

        WebElement dropDown=driver.findElement(By.name("dropdown"));
        new Select(dropDown).selectByIndex(0);

        WebElement clickButton=driver.findElement(By.xpath("//input[@type='submit']"));
        clickButton.click();

        String fileName=driver.findElement(By.id("_valuefilename")).getText();
        assertEquals("Rectangle.png",fileName);














    }

}
