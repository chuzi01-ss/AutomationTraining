package com.qa.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    static String appURL = "https://omayo.blogspot.com/";

    static String btn_radio_male="input[name='gender'][value='male']";
    static String btn_radio_female="input[name='gender'][value='female']";


    public static void main (String[]args){
        WebDriver driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();


      boolean btnSelected=  driver.findElement(By.cssSelector(btn_radio_female)).isSelected();
        if(!btnSelected) {
            System.out.println("button is selected or not "+btnSelected);


            driver.findElement(By.cssSelector(btn_radio_female)).click();





        }





    }
}
