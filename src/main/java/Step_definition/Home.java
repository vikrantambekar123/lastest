package Step_definition;

import cucumber.api.java.en.When;

public class Home 
{

	@When("^ user is google $")
	public void user_is_google()
	{
		System.out.println("google");
	}
	
	@When("^ user is yahoo$")
	public void user_is_yahoo()
	{
		System.out.println("yahhoo");
	}
	
	@When("^ user is gmail$")
	public void user_is_gmail()
	{
		System.out.println("gmail");
	}
	
	@When("^ user is youtube$")
	public void user_is_youtube()
	{
		System.out.println("youtube");
	}
	
	@When("^ user is vikrant $")
	public void user_is_vikrant()
	{
		System.out.println("vikrant is here");
	}
	
}
