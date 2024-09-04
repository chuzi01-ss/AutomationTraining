package com.qa.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
    static String appURL = "https://omayo.blogspot.com/";

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL);

        WebElement elm = driver.findElement(By.cssSelector("select#multiselect1"));
        Select sel = new Select(elm);
        sel.selectByIndex(0);
        sel.selectByVisibleText("Audi");
        sel.selectByValue("swiftx");

        for (WebElement elem : sel.getAllSelectedOptions()) {
           System.out.println(elem.getText());
        }

        sel.deselectByIndex(0);
        sel.deselectByVisibleText("Audi");
        sel.deselectByValue("swiftx");
         sel.deselectAll();




    }
}
