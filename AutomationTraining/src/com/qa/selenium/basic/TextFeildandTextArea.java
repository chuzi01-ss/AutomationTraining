package com.qa.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TextFeildandTextArea {
    static String appURL = "https://www.automationexercise.com/login";

    static String btn_radio_male="input[name='gender'][value='male']";
    static String btn_radio_female="input[name='gender'][value='female']";

    public static void main (String[]args) {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector(btn_radio_male)).click();

        //driver.findElement(By.cssSelector("input[data-qa=\"signup-email\"]")).sendKeys("123235");
       // driver.findElement(By.cssSelector("div.col-sm-8  div  ul  li:nth-child(7)")).click();







    }


}
