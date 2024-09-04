package com.qa.selenium.basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
    static String appURL = "https://the-internet.herokuapp.com/javascript_alerts";

    public static void main(String[]args)throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(appURL);
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(8000);
        Alert al =driver.switchTo().alert();
       al.sendKeys("hi");
       al.accept();




    }
}
