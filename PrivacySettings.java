package com.abc.stepDefinitions3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PrivacySettings {
	
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
	public void enter_the_valid_email(String trueEmail) {
		
	driver.findElement(By.id("email")).sendKeys(trueEmail);  
	}
	   
	@When("Enter the valid password {string}")
	public void enter_the_valid_password(String truePassword) {
		
	driver.findElement(By.id("pass")).sendKeys(truePassword);
	}
	@When("click on login")
	public void click_on_login() {
	    
	driver.findElement(By.name("login")).click(); 
    }
	
	//scenario
	
	@When("Click on Account")
	public void Account() {
		
	driver.findElement(By.xpath("(//div[@role=\"button\"][3]")).click();
		
	}
	
	@When("click on Settings and Privacy")
	public void click_on_settings_and_privacy() {
		
	driver.findElement(By.xpath("(//span[text()='Settings & privacy']")).click();
	}
	
	@When("Click on Privacy Checkup")
	public void click_on_privacy_checkup() {
		
	driver.findElement(By.xpath("(//span[text()='Privacy Checkup']")).click(); 
	}
	
	@When("Click on who can see what you share")
	public void click_on_who_can_see_what_you_share() {
		
	driver.findElement(By.xpath("(//span[text()='Who can see what you share']")).click();
	}
	
	@Then("Click on Continue")
	public void click_on_continue() {
		
	driver.findElement(By.xpath("(//div[@aria-label='Continue']")).click();  
	}
	
	@Then("verify who can see your profile details")
	public void verify_who_can_see_your_profile_details() {
		
	   //email
		
	driver.findElement(By.xpath("(//span[text()='Only me']")).click();
	//boolean friends=driver.findElement(By.xpath("//span[text()='Friends']")).isDisplayed();
	WebElement friends=driver.findElement(By.xpath("(//i[@data-visualcompletion='css-img'][17]"));
	friends.click();
	driver.findElement(By.xpath("//div[@aria-label='Save']")).click();
	
	
	//friends and following
	
	driver.findElement(By.xpath("//span[text()='Public']")).click();
	WebElement onlyme=driver.findElement(By.xpath("(//i[@data-visualcompletion='css-img'][20]"));
	onlyme.click();
	
	driver.findElement(By.xpath("(//div[@aria-label='Save']")).click();
	
	
	}
	
   //scenario
	
	
	@When("Click on Menu")
	public void click_on_menu() {
		
	driver.findElement(By.xpath("(//div[@aria-label='Menu']")).click();
	}
	
	@When("Click on post")
	public void click_on_post() {
		
	driver.findElement(By.xpath("(//span[text()='Post']")).click(); 
	}
	
	@Then("Click on dropdown")
	public void click_on_dropdown() {
		
	WebElement dropDown=driver.findElement(By.xpath("(//i[@data-visualcompletion='css-img'][9]"));
	dropDown.click();
	}
	
	@Then("Select defualt audience")
	public void select_defualt_audience() {
		
	WebElement friends=driver.findElement(By.xpath("(//i[@data-visualcompletion='css-img'][13]"));
	friends.click() ;
	 
	driver.findElement(By.xpath("(//div[@aria-label='Done']"));
		
	}





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


