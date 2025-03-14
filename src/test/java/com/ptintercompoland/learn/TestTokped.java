package com.ptintercompoland.learn;

import org.openqa.selenium.By;
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
    driver.get("https://www.tokopedia.com/");
  }

  @Test
  public void test01() {
    String expect = "Sepatu";
    WebElement search = driver.findElement(By.xpath("//*[@type='search']"));
    search.sendKeys(expect, Keys.ENTER);

    Assert.assertEquals(search.getAttribute("value"), expect);
  }

  @AfterClass
  public void tearDown() throws InterruptedException {
    Thread.sleep(5000);
    driver.quit();
  }
}
