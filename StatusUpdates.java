package com.abc.stepDefinitions2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StatusUpdates {
	ChromeDriver driver;
	ChromeOptions options= new ChromeOptions();
	
	@Before
	public void beforeHook() {
		
	options.addArguments("--disable-notifications");	
	driver= new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	 
	}
	
	/*@After
	public void afterHook() {
		
	driver.close();
	}*/
	
	
	@When("Enter the valid email {string}")
	public void enter_the_valid_email(String orgEmail) {
		
	driver.findElement(By.id("email")).sendKeys(orgEmail);  
	}
	   
	@When("Enter the valid password {string}")
	public void enter_the_valid_password(String orgPassword) {
		
	driver.findElement(By.id("pass")).sendKeys(orgPassword);
	}
	@When("click on login")
	public void click_on_login() {
	    
	driver.findElement(By.name("login")).click(); 
    }
	//scenario
	
	@When("click on Menu")
	public void click_on_menu() {
		
	driver.findElement(By.xpath("//div[@aria-label='Menu']")).click();	
	}
	
	@When("click on post status")
	public void click_on_post_status() {
		
	driver.findElement(By.xpath("//span[text()='Post']")).click();	
	}
	
	@Then("create story")
	public void create_story() {
		
	WebElement story=driver.findElement(By.xpath("//div[@aria-label=\"What's on your mind, Suchi?\"]"));
	story.sendKeys("Hi good morning");
	
	}
	
	@Then("click on post")
	public void click_on_post() {
		
	driver.findElement(By.xpath("//div[@aria-label=\"Post\"]")).click();
	    
	}
	
	
	//scenario
	
	
	@When("click on Feeds")
	public void click_on_feeds() {
		
	WebElement feed=driver.findElement(By.xpath("//span[text()='Feeds']"));
	feed.click();   
	}
	
	@Then("Verify the status updates")
	public void verify_the_status_updates() {
		
	WebElement verify=driver.findElement(By.xpath("//div[text()='Hi good morning']"));
	String actualfeed=verify.getText();
	String expectedfeed="Hi good morning";
	 
	 if(actualfeed.equals(expectedfeed)) {
		 
		System.out.println("message:verified the status updates"); 
	 }
	 else {
		 System.out.println("Status update is not verified");
	 }
	 
    }

   //scenario
	
	
	@When("Click on Profile")
	public void click_on_profile() {
		
	WebElement prof=driver.findElement(By.xpath("(//span[@dir = 'auto'])[2]"));
	prof.click();
	}
	
	@When("click on action button")
	public void action() {
		
	driver.findElement(By.xpath("(//div[@aria-label='Actions for this post']")).click();
	}
	
	@Then("click on save post")
	public void click_on_save_post() {
	    
	driver.findElement(By.xpath("(//span[text()='Save Post']")).click(); 
	}
	
	//scenario
	
	
	@When("click on user profile")
	public void click_on_user_profile() {
	
	WebElement title=driver.findElement(By.xpath("(//span[@dir = 'auto'])[2]"));
	title.click();
	    
	}
	
	@Then("click on Like button")
	public void click_on_like_button() {
	
	driver.findElement(By.xpath("(//span[text()='Like'])[1]")).click();
	}
	
	@Then("Click on Comment")
	public void click_on_comment() {
	
	driver.findElement(By.xpath("(//span[text()='Comment'])[1]")).click();
	
	    }
	
	@Then("Post a comment")
	public void post_a_comment() {
		/*(//div[@aria-label="Write a comment…"])[1]*/
		
	WebElement comment =driver.findElement(By.xpath("(//div[@aria-label='Write a comment…'])[1]"));
	comment.sendKeys("hiii");
	
	}
	
	@Then("Click on comment button")
	public void commentbutton() {
		
		driver.findElement(By.xpath("(//div[@aria-label='Comment'])[1]"));
	}










	
	
	
	
	
	
	
	

}
