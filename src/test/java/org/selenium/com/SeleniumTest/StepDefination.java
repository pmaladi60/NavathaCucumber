package org.selenium.com.SeleniumTest;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	
	
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
	 System.out.println("I am Validating Home Page");  
	}

	@When("User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am Validating Login Page");  
	}
	
	@When("User enters UserName and Password")
	public void user_enters_UserName_and_Password() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("i will write selenium code to enter username and password");
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
	   
		assertTrue(false);
	}
	
	@When("User LogOut from the Application")
	public void user_LogOut_from_the_Application() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("user logout");
	}

	@Then("Message displayed LogOut Successfully")
	public void message_displayed_LogOut_Successfully() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("log out success");
	}
	

}
