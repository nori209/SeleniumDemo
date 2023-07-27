package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public void seleniumTest() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\shope\\IdeaProjects\\SeleniumDemo\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://qa-mesto.praktikum-services.ru/");
        driver.manage().window().maximize();

        driver.findElement(By.id("email")).sendKeys("shopenry@gmail.com");
        driver.findElement(By.id("password")).sendKeys("qwerty12345");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.className("auth-form__button")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
