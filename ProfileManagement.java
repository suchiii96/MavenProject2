package com.abc.stepDefinitions1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileManagement {
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
	
	//scenario
	@When("Click on profile")
	public void click_on_profile()  {
		
    WebElement title=driver.findElement(By.xpath("(//span[@dir = 'auto'])[2]"));
	title.click();
	}
	
	
	@When("click on edit profile")
	public void click_on_edit_profile()  {
		
	
	WebElement profile=driver.findElement(By.xpath("//span[text()='Edit profile']"));
	profile.click();
	}
	
	@When("click on Add")
	public void click_on_add() {
		
	WebElement add=driver.findElement(By.xpath("(//span[text()='Add'])"));	
	add.click();
	}
	
	@Then("Update profile picture")
	public void update_profile_picture() {
		
    WebElement profile=driver.findElement(By.xpath("//span[text()='Upload Photo']"));	
    profile.click();
    
	}
	
	/*@Then("click on Done")
	public void click_on_done() {
		
		
		
	WebElement picture=driver.findElement(By.xpath("//*[@id='mount_0_0_gn']/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div/div[17]/div"));
	picture.click()	;
	
	WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
	next.click();
	
	WebElement done=driver.findElement(By.xpath("//span[text()='Done']"));
	done.click();
	
	}*/
	// scenario
   @When("click on account")
   public void account() {
	   
   WebElement  acc=driver.findElement(By.xpath("(//div[@role='button'])[3]"));
   acc.click();
	 
   }
   
   @When("click on settings and privacy")
   public void click_on_settings_and_privacy() {
	   
   driver.findElement(By.xpath("//span[text()='Settings & privacy']")).click();
       
   }
   @When("click on settings")
   public void click_on_settings() {
	   
   driver.findElement(By.xpath("//span[text()='Settings']")).click();
   }
   
   @When("click on personal details")
   public void click_on_personal_details() {
       
   driver.findElement(By.xpath("//span[text()='Personal details']")).click();
   }
   
   @When("click on profiles")
   public void click_on_profiles() {
	   
   driver.findElement(By.xpath("//span[text()='Suchi Aneesh']")).click();   
    }
   
   @When("click on name")
   public void click_on_name() {
	   
   driver.findElement(By.xpath("//span[text()='Name']")).click(); 
   }
   
   @Then("update new profile name")
   public void update_new_profile_name() {
	   
   WebElement firstname=driver.findElement(By.xpath("(//input[@dir='ltr'])[1]"));
   firstname.click();
   firstname.clear();
   firstname.sendKeys("Suchi ammu");
    
    WebElement surname=driver.findElement(By.xpath("(//input[@dir='ltr'])[3]"));
    surname.click();
    surname.clear();
    surname.sendKeys("aneeesh");
    }
   
   @Then("Click on Review change")
    public void review() throws InterruptedException {
	   
	driver.findElement(By.xpath(("(//div[@role='button'])[8]"))).click() ; 
	   
	}
   
   @Then("Click on done")
   public void done () {
	   
	driver.findElement(By.xpath("//span[text()='Done']")).click();
	
   }
   //scenario
   
   @When("click on own profile")
   public void ownprofile() {
	   
   WebElement  acc=driver.findElement(By.xpath("(//div[@role='button'])[3]"));
   acc.click(); 
   
  }
   @Then("verify user can view their own profile")
   public void verify() {
	   
   WebElement verify=driver.findElement(By.xpath("(//span[@dir='auto'])[2]"));
   
   String actualtitle=verify.getText();
   String expectedtitle= "Edit profile";
   
   if(actualtitle.equals(expectedtitle))
   {
	   System.out.println("user can able to see their own profile");
	   
   }
   else {
	   
	   System.out.println("user not able to see their own profile");
   }
      }
   
   @When("search a user profile")
    public void otherUser() {
	   
	WebElement other=driver.findElement(By.xpath("(//input[@aria-label='Search Facebook']"));
	other.click();
	other.sendKeys("Suchi Ashley");
	other.sendKeys(Keys.RETURN);
	   
	   }
   
   @Then("verify user can view others profile")
   public void otherProfile() {
	   
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
   
   @When("Click on Find friends")
   public void click_on_find_friends() {
	   
   driver.findElement(By.xpath("(//span[text()='Find friends'][2]")).click();
   }
   
   @When("click on Friend Requests")
   public void click_on_friend_requests() {
	   
   driver.findElement(By.xpath("(//span[text()='Friend requests']")).click();  
   }
   
   @Then("Click on view sent Requests")
   public void click_on_view_sent_requests() {
	   
   driver.findElement(By.xpath("(//span[text()='View sent requests']")).click();   
	   
   }
   
   //scenario

   @When("Click on Find friend")
   public void click_on_find_friend() {
	   
   WebElement friend =driver.findElement(By.xpath("(//span[text()='Find friends'][2]"));   
   friend.click() ;
   }
   
   @When("click on Friend Request")
   public void click_on_friend_request() {
	   
   WebElement incomerequest =driver.findElement(By.xpath("(//span[text()='Friend requests']")); 
   incomerequest.click();
   }
       
   @Then("Click on confirm on incoming request")
   public void click_on_confirm_on_incoming_request() {
   
	driver.findElement(By.xpath("(//div[@aria-label='Confirm']")).click();
	
   }
	   
      
}
