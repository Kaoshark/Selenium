package com.myfirstproject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Day10_RobotClass extends TestBase{
    @Test
    public void FileuploadTest() throws InterruptedException {

        driver.get("https://www.grammarly.com/plagiarism-checker");
        driver.findElement(By.xpath("//div[@id='sectionGrammarCheck_4VB8kepvT7ciShVSz6rHX']//span[@class='iconWrapper_PbRSndwM']"));
        String path=System.getProperty("user.home")+"\\Desktop\\sampledoc.docx";
        uploadFile(path);



    }

}
