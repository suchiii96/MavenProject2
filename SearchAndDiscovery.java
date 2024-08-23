package com.abc.stepDefinitions4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchAndDiscovery {
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
	public void close() {
		
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
	
	// scenario
	@When("search a user name")
	public void search_a_user_name() {
		
	WebElement other=driver.findElement(By.xpath("(//input[@aria-label='Search Facebook']"));
	other.click();
	other.sendKeys("Suchi Ashley");
	other.sendKeys(Keys.RETURN);
	    
	}
	
	@Then("verify user can view others profile")
	public void verify_user_can_view_others_profile() {
		
	driver.findElement(By.xpath("(//a[text()='Suchi Ashley']")).click();
		
	WebElement profile=driver.findElement(By.xpath("(//h1[text()='Suchi Ashley']"));
	String Actualtext=profile.getText();
	String Expectedtext="Suchi Ashley";
		
	if(Actualtext.equals(Expectedtext)) {
			
	System.out.println("user can able to see other profile");
	}
		
	else {
			
	System.out.println("user not able to see other profile");
		}
		
	}
	
	//scenario
	
	@When("Click on find Friends")
	public void click_on_find_friends() {
		
	driver.findElement(By.xpath("(//span[text()='Find friends']"));
	}
	
	
	@When("Click on suggestions")
	public void click_on_suggestions() {
		
	driver.findElement(By.xpath("(//span[text()='Suggestions']")).click();
		
	 WebElement message=driver.findElement(By.xpath("(//span[text()=\"When you have friend requests or suggestions, you'll see them here.\"]"));
	
	 System.out.println(message.getText());
	}
	
	//scenario
	
	@When("Click on My account")
	public void click_on_my_account() {
		
	WebElement account=driver.findElement(By.xpath("(//div[@role='button'][3]"));	
	account.click();
	}
	
	@Then("Click on Logout")
	public void click_on_logout() {
		
	driver.findElement(By.xpath("(//span[text()='Log out']")).click();
	
	}








	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
