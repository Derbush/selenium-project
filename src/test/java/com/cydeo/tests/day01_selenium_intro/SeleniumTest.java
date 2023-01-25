package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {
        // 1. Setting up the web driver manager (from garcia)
        WebDriverManager.chromedriver().setup();

        // 2. Create the instance of Chrome browser driver (from selenium))
        WebDriver driver = new ChromeDriver();

        // 3. Test if driver and browser work as expected
        driver.get("https://www.google.com");

    }
}
