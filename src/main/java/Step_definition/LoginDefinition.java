package Step_definition;

import base.Baseclass;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.Loginpage;


public class LoginDefinition extends Baseclass
{
		Loginpage login=new Loginpage();

		 @Given("^user is on Login page$")
		 public void user_is_on_Login_page()
		 {
			 Baseclass.Initilization();
		 }
		 

		 @And("^get the title of the page$")
		 public void get_the_title_of_the_page()
		 {
			 login.title();
		 }
		 
		 
		 @And("^enters username and password$")
		 public void enters_username_and_password()
		 {
			 login.logincredentials();
		 }
		 
		 @Then("close the browser")
		 public void close_the_browser()
		 {
			login.teardown();
		 }
	
	
}
