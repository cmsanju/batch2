package com.ict.springboot.selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cts.irctc.IRCTCApplication;

import io.github.bonigarcia.wdm.WebDriverManager;

@SpringBootTest(classes = IRCTCApplication.class, 
webEnvironment = WebEnvironment.DEFINED_PORT)
public class ReservationPage {
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "/Usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://localhost:7070/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*
		 driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        
		driver.get("http://localhost:8085/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		*/
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	
	@Test
	public void test1headingsPresent() {
		
		WebElement heading1 = driver.findElement(By.id("h1"));
		assertEquals("Welcome to Online IRCTC Reservation", heading1.getText());
		
	}
	
	@Test
	public void test2linksOnHomepage() {
		
		driver.findElement(By.linkText("Click here for reservation."));
	
	}
	
	
	
	@Test
	public void test3reservationPageHeading() {
		
		driver.findElement(By.linkText("Click here for reservation.")).click();
		
		WebElement heading1 = driver.findElement(By.id("h2"));
		assertEquals("Railway Reservation Form", heading1.getText());
		
	}
	
	@Test
	public void test4reservationPageFieldsType() {
		
		driver.findElement(By.linkText("Click here for reservation.")).click();
		WebElement fname = driver.findElement(By.id("fname"));
		assertNotNull(fname);
		assertEquals("input", fname.getTagName());
		
		WebElement lname = driver.findElement(By.id("lname"));
		assertNotNull(lname);
		assertEquals("input", lname.getTagName());
		
		WebElement gender1 = driver.findElement(By.id("gender1"));
		assertNotNull(gender1);
		assertEquals("input", gender1.getTagName());
		
		WebElement gender2 = driver.findElement(By.id("gender2"));
		assertNotNull(gender2);
		assertEquals("input", gender2.getTagName());
		
		WebElement brfast = driver.findElement(By.id("f1"));
		assertNotNull(brfast);
		assertEquals("input", brfast.getTagName());
		
		WebElement lunch = driver.findElement(By.id("f2"));
		assertNotNull(lunch);
		assertEquals("input", lunch.getTagName());
		
		WebElement dinner = driver.findElement(By.id("f3"));
		assertNotNull(dinner);
		assertEquals("input", dinner.getTagName());
		
		WebElement from = driver.findElement(By.id("from"));
		assertNotNull(from);
		assertEquals("select", from.getTagName());
		
		WebElement to = driver.findElement(By.id("to"));
		assertNotNull(to);
		assertEquals("select", to.getTagName());
		
		WebElement jDate = driver.findElement(By.id("jdate"));
		assertNotNull(jDate);
		assertEquals("input", jDate.getTagName());
		
		WebElement seat = driver.findElement(By.id("seat1"));
		assertNotNull(seat);
		assertEquals("input", seat.getTagName());
		
		
		
	}
	
	@Test
	public void test5fillReservationForm() {
		
		driver.findElement(By.linkText("Click here for reservation.")).click();
		
       driver.findElement(By.id("fname")).sendKeys("Sansui");  
       
       driver.findElement(By.id("lname")).sendKeys("rider");
		
       driver.findElement(By.id("gender1")).click();
       
       driver.findElement(By.id("f1")).click();
       
       driver.findElement(By.id("f2")).click();
       
       driver.findElement(By.id("f3")).click();
       
       Select from = new Select(driver.findElement(By.id("from")));
       
       from.selectByVisibleText("Hyderabad");
       
       Select to = new Select(driver.findElement(By.id("to")));
       
       to.selectByVisibleText("Bengalore");
       
       driver.findElement(By.id("jdate")).sendKeys("21/10/2020");
       
       driver.findElement(By.id("seat1")).click();
       
       driver.findElement(By.id("submit")).click();
       
       
	}
	
	@Test
	public void test6ConfirmationForm() {
		
		driver.findElement(By.linkText("Click here for reservation.")).click();
		
       driver.findElement(By.id("fname")).sendKeys("Sansui");  
       
       driver.findElement(By.id("lname")).sendKeys("rider");
		
       driver.findElement(By.id("gender1")).click();
       
       driver.findElement(By.id("f1")).click();
       
       driver.findElement(By.id("f2")).click();
       
       driver.findElement(By.id("f3")).click();
       
       Select from = new Select(driver.findElement(By.id("from")));
       
       from.selectByVisibleText("Hyderabad");
       
       Select to = new Select(driver.findElement(By.id("to")));
       
       to.selectByVisibleText("Bengalore");
       
       driver.findElement(By.id("jdate")).sendKeys("21/10/2020");
       
       driver.findElement(By.id("seat1")).click();
       
       driver.findElement(By.id("submit")).click();
     
        WebElement heading1 = driver.findElement(By.id("msg"));
		assertEquals("Your reservation is confirmed successfully. Please, re-check the details.", heading1.getText());
		
		driver.findElement(By.linkText("Book here")).click();
	}
	
	@Test
	public void test7reservationFormEmptyFormSubmit() {
		
		driver.findElement(By.linkText("Click here for reservation.")).click();
		
       
       
       driver.findElement(By.id("submit")).click();
       
      
       
	}
	
	@Test
	public void test8reservationFormErrorpage() {
		
		driver.findElement(By.linkText("Click here for reservation.")).click();
		
       driver.findElement(By.id("fname")).sendKeys("Sansui");  
       
       driver.findElement(By.id("lname")).sendKeys("rider");
		
       driver.findElement(By.id("gender1")).click();
       
       driver.findElement(By.id("f1")).click();
       
       driver.findElement(By.id("f2")).click();
       
       driver.findElement(By.id("f3")).click();
       
       Select from = new Select(driver.findElement(By.id("from")));
       
       from.selectByVisibleText("Hyderabad");
       
       Select to = new Select(driver.findElement(By.id("to")));
       
       to.selectByVisibleText("Hyderabad");
       
       driver.findElement(By.id("jdate")).sendKeys("21/10/2020");
       
       driver.findElement(By.id("seat1")).click();
       
       driver.findElement(By.id("submit")).click();
       
       driver.findElement(By.linkText("Click here for reservation.")).click();
       
	}
		
}
