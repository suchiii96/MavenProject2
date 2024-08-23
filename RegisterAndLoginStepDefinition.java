package com.abc.stepdefinitions;

import java.util.List;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterAndLoginStepDefinition {
	ChromeDriver driver;
	
	
	@Before
	public void beforeHook() {
		
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	 
	}
	
	@After
	public void close() {
		
	driver.close();
	}
	
	
	@When("Click on create new account")
	public void SignUp()  {
		
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		}
	
	@When("Enter a valid firstname")
	public void Firstname() {
		
	driver.findElement(By.name("firstname")).sendKeys("suchiammu");
	}
	
	@When("Enter a valid surname")
	public void Surname() {
		
	driver.findElement(By.name("lastname")).sendKeys("aneesh");
	}
	
	@When("Enter a valid email {string}")
	public void Email(String myEmail) {
		
	driver.findElement(By.name("reg_email__")).sendKeys(myEmail);
	}
	
	
	@When("Reenter the  valid email   {string}")
	public void reenter_the_valid_email(String reEmail) {
		
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys(reEmail);	
	    
	}

    @When("Enter a valid password {string}")
	public void password(String myPassword) {
		
	driver.findElement(By.id("password_step_input")).sendKeys(myPassword);
	}
	
	@When("Enter date of birth")
	public void dateofBirth() {
		
	WebElement dropdown=driver.findElement(By.name("birthday_day"));
	dropdown.click();
	Select date= new Select(dropdown);
	date.selectByVisibleText("25");
		
	WebElement dropdown1=driver.findElement(By.name("birthday_month"));
	dropdown1.click();
	Select month= new Select(dropdown1);
	month.selectByVisibleText("Apr");
		
	WebElement dropdown2=driver.findElement(By.name("birthday_year"));
	dropdown2.click();
	Select year= new Select(dropdown2);
	year.selectByVisibleText("1998");
		
	}
	@When("Enter gender")
	public void Gender() {
		
	driver.findElement(By.xpath("//input[@value='2']")).click();
	}
	
	@When("click on sign up")
	public void signup() throws InterruptedException {
		
	Thread.sleep(2000);
	driver.findElement(By.name("websubmit")).click();
	
	}
	
	@Then("verify sucessfull registration process")
	public void verification() {
		
     WebElement title= (WebElement) driver.findElements(By.xpath("//*[@id='content']/div/div/div[1]/div[1]/div/div[2]/h2"));
	 String newTitle=title.getText();
	 System.out.println(newTitle);
	 }
	
	
	@When("Enter a invalid email {string}")
	public void enter_a_invalid_email(String myEmail) {
		
	driver.findElement(By.name("reg_email__")).sendKeys(myEmail);
		
		}
	    
	@When("Reenter invalid  email {string}")
	public void reenter_the_invalidemail(String reEmail) {
		
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys(reEmail);	
	}
	    
	@When("Enter a invalid password {string}")
	public void enter_a_invalid_password(String myPassword) {
	
	driver.findElement(By.id("password_step_input")).sendKeys(myPassword);
		
		}
	
	/*@Then("verify error message")
	public void Error() {
		
		
	}*/
	
	   
    
    
    
    
      //Login functionality
    
    
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
    
    /*@Then("Verify home page")
    public void verifyHomePage() {
    	
    String expectedOutput= "Welcome to Facebook, Suchi";
    String actualOutput= driver.findElement(By.xpath("//*[@id='mount_0_0_K4']/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[2]/div/div/div[1]/span")).getText();
    	
    if(expectedOutput.equals(actualOutput)) {
    	
    	System.out.println("Home page is displayed");
    }
    else {
    	System.out.println("Home page not displayed");
    }
    	
    	}*/
    
    
    @When("Enter the invalid email  {string}")
    public void enter_the_invalid_email(String invalidemail) {
    	
    driver.findElement(By.id("email")).sendKeys(invalidemail);
        
    }

    
    @When("Enter the invalid password {string}")
    public void enter_the_invalid_password(String invalidpass) {
    	
    driver.findElement(By.id("pass")).sendKeys(invalidpass);
    	
    }
        
   
  /* @Then("Verify error message")
    public void errormessage() {
	   
	  String errorMessage=driver.findElement(By.xpath("//div[text()='The password that you've entered is incorrect.']" )).getText();
    	
	  if(errorMessage != "") {
		  
		  System.out.println("There is a error message");
	  }
	  else {
		  
		  System.out.println("Error message is not displayed");
	  }
    	
    }*/
    
    
    
    
    
    
       
}
