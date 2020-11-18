package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {

	private String day;
	private String todayBreakfast;
	
	@Given("Today is {string}")
	public void today_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    day = string;
	}

	@When("Student asks for today's breakfast")
	public void student_asks_for_today_s_breakfast() {
	    // Write code here that turns the phrase above into concrete actions
	    todayBreakfast = checkForTodaysBreakfast(day);
	}
	private String checkForTodaysBreakfast(String dayOfTheWeek) {
		// TODO Auto-generated method stub
		if(dayOfTheWeek.equals("Sunday"))	{
			
			return "Dosey";
		}	
		else if (dayOfTheWeek.equals("Monday"))	{
			
			return "Idli";
		}
		else
		{
			return "Avalakki";
		}
	}

	@Then("Today's breakfast is {string}")
	public void today_s_breakfast_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(string, todayBreakfast);
	}
	
}
