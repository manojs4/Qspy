package ty.step.definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class get_operation {
	 @Given("^user enter the base URL$")
	    public void user_enter_the_base_url() throws Throwable {
	       System.out.println("hi");
	    }

	    @When("^user enter the list of user end point with GET http request$")
	    public void user_enter_the_list_of_user_end_point_with_get_http_request() throws Throwable {
	      System.out.println("hello");
	    }

	    @Then("^user should get the statuscode as 200$")
	    public void user_should_get_the_statuscode_as_200() throws Throwable {
	       System.out.println("bye");
	    }

	    
	       
	    }

