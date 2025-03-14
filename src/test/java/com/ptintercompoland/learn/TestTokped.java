package com.ptintercompoland.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestTokped {
  private WebDriver driver;

  @BeforeClass
  public void init() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");
    options.setBinary("C:\\chrome-win64\\chrome.exe");
    driver = new ChromeDriver(options);
    driver.get("https://www.cermati.com");
  }

  @Test
  public void test01() throws InterruptedException {
    // String expect = "Sepatu";
    // WebElement search = driver.findElement(By.xpath("//*[@type='search']"));
    // search.sendKeys(expect, Keys.ENTER);

    // search = driver.findElement(By.xpath("//*[@type='search']"));
    // String actual = search.getAttribute("value");

    // JavascriptExecutor jse = (JavascriptExecutor) driver;
    // jse.executeAsyncScript("document.querySelector(\"#mobilePhone\").value =
    // \"ayam\"");
    // Thread.sleep(15000);
    // Assert.assertTrue(!actual.isEmpty());

    JavascriptExecutor jse = (JavascriptExecutor) driver;
    jse.executeAsyncScript("scrollTo({" + //
        "  top: 2000," + //
        "  behavior: 'smooth'," + //
        "});");
    Thread.sleep(15000);
  }

  @AfterClass
  public void tearDown() throws InterruptedException {
    Thread.sleep(5000);
    driver.quit();
  }
}
