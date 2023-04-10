package com_saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {

    static String broser = "Chrome";
    static WebDriver driver;
    static String baseurl = "https://www.saucedemo.com/";

    public static void main(String[] args) {
        //If and else if statements
        if (broser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (broser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (broser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name. ");
        }
        driver.get(baseurl);
        driver.manage().window().maximize();
        //Get the title of the page with the method of get()
        String title = driver.getTitle();
        System.out.println(title);
        //get the Current URL
        System.out.println("Current URL : " + driver.getPageSource());
        //Get the current page source
        System.out.println("Current Source Page : " + driver.getPageSource());
        //Find the Email Field element and password filed element
        WebElement usernamefield = driver.findElement(By.id("user-name"));
        usernamefield.sendKeys("XYZ@yahoo.com");
        WebElement passwordfield = driver.findElement(By.name("password"));
        passwordfield.sendKeys("Prime123");
        //Driver closing statement
        driver.close();

    }

}
