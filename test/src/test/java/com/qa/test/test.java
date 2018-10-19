package com.qa.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class test {
	 private WebDriver driver = null;
	  private String baseUrl;
	
	  @Before
	  public void setUp() throws Exception {
	    baseUrl = "https://www.katalon.com/";
	    driver.manage().window().maximize();
	  }

	  @Test
	  public void testJenkins() throws Exception {
	    driver.get("http://localhost:8080/");
	    driver.findElement(By.linkText("Manage Jenkins")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Install as Windows Service'])[1]/following::dt[1]")).click();
	    driver.findElement(By.linkText("Create User")).click();
	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("root2");
	    driver.findElement(By.name("password1")).clear();
	    driver.findElement(By.name("password1")).sendKeys("root2");
	    driver.findElement(By.name("password2")).clear();
	    driver.findElement(By.name("password2")).sendKeys("root2");
	    driver.findElement(By.name("fullname")).clear();
	    driver.findElement(By.name("fullname")).sendKeys("root2");
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("root2@root2.com");
	    driver.findElement(By.id("yui-gen1-button")).click();
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
}
}
