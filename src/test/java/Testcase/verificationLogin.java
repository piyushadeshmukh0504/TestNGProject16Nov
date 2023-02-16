package Testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import Resource.baseclass;
import pageobjectMethod.Loginpage;

public class verificationLogin extends baseclass {


	 @Test
	 public void login() throws IOException {
	  
	  driverInitilize();
	  //This driver have scope
	  driver.get("https://login.salesforce.com/");
	  
	  Loginpage obj=new Loginpage(driver);
	  
	  obj.enterUsername().sendKeys("rahul");
	  
	  obj.enterPassword().sendKeys("test");
	  
	  obj.clickOnLogin().click();
	  
	    
	 }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
