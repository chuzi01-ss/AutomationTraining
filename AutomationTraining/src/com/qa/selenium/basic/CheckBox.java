package com.qa.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    static String checkbox_Blue="input[type='checkbox'][value='blue']";
    static String appURL="https://omayo.blogspot.com/";

    public static void main (String[]args){

        WebDriver driver= new ChromeDriver();
        driver.get(appURL);
        boolean checkboxSelected=driver.findElement(By.cssSelector(checkbox_Blue)).isSelected();


        if(!checkboxSelected){
            System.out.println("Checkbox is selected or not");

            driver.findElement(By.cssSelector(checkbox_Blue)).click();
            driver.findElement(By.cssSelector(checkbox_Blue)).click();
        }





    }

}
