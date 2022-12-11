package com.google;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCases {
    public void searchKeywordInGoogleGobalSearch(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("testing");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.quit();
    }
}
