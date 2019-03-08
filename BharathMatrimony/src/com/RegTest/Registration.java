package com.RegTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Registration {
	WebDriver driver;
	Select s;
  @Test(priority=1)
  public void VerifyRegistrationPage() throws Exception {
	  s=new Select(driver.findElement(By.xpath("//select[@id='REGISTERED_BY']")));
	  s.selectByIndex(1);
	  
	  driver.findElement(By.xpath("//input[@id='NAME']")).sendKeys("sri");
	  
	  driver.findElement(By.xpath("//input[@id='gendermale']")).click();
	  
	  s=new Select(driver.findElement(By.xpath("//select[@id='DOBDAY']")));
	  s.selectByIndex(1);
	  
	  s=new Select(driver.findElement(By.xpath("//select[@id='DOBMONTH']")));
	  s.selectByIndex(1);
	  
	  s=new Select(driver.findElement(By.xpath("//select[@id='DOBYEAR']")));
	  s.selectByIndex(1);
	  
	  s=new Select(driver.findElement(By.xpath("//select[@id='RELIGION']")));
	  s.selectByIndex(1);
	  
	  s=new Select(driver.findElement(By.xpath("//select[@id='MOTHERTONGUE']")));
	  s.selectByIndex(1);
	  
	  driver.findElement(By.xpath("//input[@id='MOBILENO']")).sendKeys("9395305953");
	  
	  driver.findElement(By.xpath("//input[@id='EMAIL']")).sendKeys("srikanth@123");
	  driver.findElement(By.xpath("//input[@name='PASSWD1']")).sendKeys("123456");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
  }
  @Test(priority=2)
  public void VerifySearchPage() throws Exception {
	  
	  driver.findElement(By.xpath("//input[@id='Male']")).click();

	  s=new Select(driver.findElement(By.xpath("//select[@id='MOTHERTONGUERIGHT1']")));
	  s.selectByIndex(1);
	  Thread.sleep(2000);
	  s=new Select(driver.findElement(By.xpath("//select[@id='CASTERIGHT']")));
	  s.selectByIndex(1);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@class='hp-button small']")).click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.bharatmatrimony.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	 driver.close();
  }

}
