package com.cydeo.tests.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_BackAndForthNavigation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");
        driver.findElement(By.linkText("A/B Testing")).click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "No A/B Test";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title is " + "\"" + "No A/B Test" + "\"");
        } else {
            System.out.println("Title does not match");
        }

        driver.navigate().back();

        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "Practice";

        if (actualTitle1.equals(expectedTitle1)) {
            System.out.println("Title is " + "\"" + "Practice" + "\"");
        } else {
            System.out.println("Title does not match");
        }



    }
}
