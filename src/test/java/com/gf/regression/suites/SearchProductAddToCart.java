package com.gf.regression.suites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchProductAddToCart {
    ChromeDriver driver;
 @BeforeTest
  public void launchBrowser() {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
  }
  @AfterTest
  public void closeBrowser() {
      driver.close();
  }
  @Test
  public void searchTeaAddToCart() throws InterruptedException {
      driver.get("https://grofers.com/");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.manage().window().maximize();
      driver.findElement(By.xpath("//button[contains(text(),'Detect')]")).click();
      Thread.sleep(10000);
      driver.findElementByXPath("//input[@placeholder='Search for products']")
      .sendKeys("tea");
      driver.findElementByXPath("//button[@class='btn search__btn']")
      .sendKeys(Keys.ENTER);
      if(driver.findElementByXPath("//div[contains(text(),"
          + "'Get the best offers via Notifications')]").isDisplayed())
      {
          driver.findElementByXPath("//button[@class='No thanks']").click();
      }
      if(driver.findElementByXPath("//div/img[@alt="
          + "'Society Plain Tea (Pouch)']").isDisplayed()) {
          driver.findElementByXPath("(//div[@class='relative']//button[2])[1]").click();
      }
      else
      {
          System.out.println("The product is not present");
      }

      
      
  }
}
