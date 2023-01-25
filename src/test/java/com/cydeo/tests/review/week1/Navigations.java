package com.cydeo.tests.review.week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.rakuten.com/");
        Thread.sleep(3000);
        driver.navigate().to("https://www.etsy.com/");
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();

     //   driver.close(); // for one page
        driver.quit(); // for multiple pages
    }
}
