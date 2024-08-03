package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageclass.Pagecode;

public class Stepdefinitionclass  {                  // here for every single line of feature class you need to code 

	Pagecode pc = new Pagecode();
	
	@Given("i am the user of this application")
	public void  i_am_the_user_of_an_application() throws Throwable{
		pc.openurl();
	}
		
	@When("user enter valid user name")
	public void user_enter_valid_user_name() throws Throwable {
	    pc.enterusername();
	}

	@And("user enter valid password$")
	public void user_enter_valid_password() throws Throwable {
	    pc.enterpassword();
	}

	@And("user enter loginbutton")
	public void user_enter_loginbutton() throws Throwable {
	    pc.clickloginbutton();
	}

	@Then("login succesfully")
	public void Then_login_succesfully() throws Throwable {
	    pc.verifylogin();                                  // Ensure this method correctly validates a successful login
	}

	@When("user enter invalid username")
	public void user_enter_invalid_username() throws Throwable {
	    pc.enterusername(); // Make sure this method can handle invalid usernames
	}

	@And("user enter invalid password")
	public void user_enter_invalid_password() throws Throwable {
	    pc.enterpassword(); // Ensure this method can handle invalid passwords
	}

	@And("user enter again login button")
	public void user_enter_again_loginbutton() throws Throwable {
	    pc.clickloginbutton(); // This should match the action of clicking the login button
	}

	@Then("login unsuccessfully")
	public void Then_login_unsuccesfully() throws Throwable {
	    pc.verifylogin(); // Ensure this method correctly validates an unsuccessful login
	}

}

	
	
	
	
	
	
	
	
	
	
	
	

