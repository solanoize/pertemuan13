package com.ptintercompoland.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPertama {
  private WebDriver driver;

  @BeforeClass
  public void init() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");
    options.setBinary("C:\\chrome-win64\\chrome.exe");
    driver = new ChromeDriver(options);
    driver.get("https://www.saucedemo.com/v1/index.html");
  }

  @Test
  public void test01() {
    WebElement username = driver.findElement(By.xpath("//*[@id='user-name']"));
    WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

    // Enter text into the username and password fields
    username.sendKeys("standard_user");
    password.sendKeys("secret_sauce");

    WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
    loginButton.click();
  }

  @AfterClass
  public void tearDown() throws InterruptedException {
    Thread.sleep(5000);
    driver.quit();
  }
}
