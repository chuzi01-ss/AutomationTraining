package com.qa.selenium.basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURL {
    static String appURL="https://omayo.blogspot.com/";

    public static void main (String[]args) {
        WebDriver driver = new ChromeDriver();

        driver.get(appURL);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        System.out.println("current title is : "+driver.getTitle());
        System.out.println("current app url is : "+driver.getCurrentUrl());


        }

    }

