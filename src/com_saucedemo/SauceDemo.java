package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SauceDemo {

    public static void main(String[] args) {


        //Launch the browser (How to launch the webbrowser
        String baseUrl = "https://www.saucedemo.com/";
        //open the URL at WebBrowser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        //Getting title for URL and print
        String title = driver.getTitle();
        System.out.println(title);
        //getting Current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());
        System.out.println("");
        //Maximise window while opening Browser window
        driver.manage().window().maximize();
        //Getting a page source statement
        System.out.println("Page Source : " + driver.getPageSource());
        //Wait statement
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Enter the username to username field and password to password field
        WebElement usernamfield = driver.findElement(By.id("user-name"));
        usernamfield.sendKeys("Prime");
        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("Prime123");
        //closing driver statement
        driver.close();

    }
}