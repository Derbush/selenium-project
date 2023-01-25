package com.cydeo.tests.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerification {
    public static void main(String[] args) {

       // 1. Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // go to url
        driver.get("https://practice.cydeo.com/");

        // verify url and title contains "Practice"

        String expectedUrl = "cydeo";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)){
            System.out.println("Passed");
        } else{
            System.out.println("Failed");
        }

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Passed");
        } else{
            System.out.println("Failed");
        }


        // My solution

        if (driver.getTitle().contains("Practice") && driver.getCurrentUrl().contains("cydeo")){
            System.out.println("pass");
        }else {
            System.out.println("failed");
        }

        driver.close();


    }
}
