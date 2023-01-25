package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
    public static void main(String[] args) throws InterruptedException{

        // Set up browser driver
        WebDriverManager.chromedriver().setup();

        //Create instance of Chrome browser
        WebDriver driver = new ChromeDriver();

        //This line will maximize the window
        driver.manage().window().maximize();
        // driver.manage().window().fullscreen(); // for only MAC

        //Go to Tesla.com
        driver.get("https://www.tesla.com/");

        String currentTitle = driver.getTitle();
        System.out.println(currentTitle);
        System.out.println(driver.getCurrentUrl());

        // Use navigate back() to go back
        driver.navigate().back();

        //Stop execution for 3 sec

        Thread.sleep(3000);

        //User navigate forward() to go forward
        driver.navigate().forward();

        //User refreshes the page uses navigate.refresh()
        driver.navigate().refresh();

        //Navigate to google.com using navigate().to()
        driver.navigate().to("https://www.google.com/");


       //Get title of the page
        System.out.println(driver.getTitle());

        driver.close();
       // driver.quit(); // for all windows




    }
}
