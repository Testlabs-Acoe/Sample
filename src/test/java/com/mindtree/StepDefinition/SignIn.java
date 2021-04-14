package com.mindtree.StepDefinition;

import com.mindtree.PageObject.AddCart;
import com.mindtree.PageObject.Homepage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignIn {
	
	private static Homepage homepage;
	private static AddCart addcart;
	@Given("^I should click on signin button$")
	public void i_should_click_on_signin_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homepage=new Homepage(Hooks.driver);
		homepage.loggingin(Hooks.log,Hooks.test);
	}

	@When("^the page loads i should enter \"([^\"]*)\"$")
	public void the_page_loads_i_should_enter(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    homepage.enteremail(Hooks.log, Hooks.test, arg1);
	}

	@When("^i should click on continue$")
	public void i_should_click_on_continue() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homepage.cntnue(Hooks.log, Hooks.test);
	}

	@When("^i should enter \"([^\"]*)\"$")
	public void i_should_enter(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homepage.enterpwd(Hooks.log, Hooks.test, arg1);
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    homepage.login(Hooks.log, Hooks.test);
	}

	@Then("^I verify the page$")
	public void i_verify_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		homepage.verify(Hooks.log,Hooks.test);
	}
	
	@Given("^I click on searchbox$")
	public void i_click_on_searchbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		addcart=new AddCart(Hooks.driver);
		addcart.clickingsearchbox(Hooks.log,Hooks.test);
	}

	@When("^I enter \"([^\"]*)\"$")
	public void i_enter(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    addcart.sendingkeystosearchbox(Hooks.log,Hooks.test,arg1);
	}

	@When("^I click on searchbtn$")
	public void i_click_on_searchbtn() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		addcart.clickingsearchbtn(Hooks.log,Hooks.test);
	}

	@When("^select item from list$")
	public void select_item_from_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    addcart.clickingfromlist(Hooks.log,Hooks.test);
	}

	@When("^add it to cart$")
	public void add_it_to_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		addcart.clickAddCart(Hooks.log,Hooks.test);
	}

	@When("^click on Proceed to buy$")
	public void click_on_Proceed_to_buy() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		addcart.clickonproceed(Hooks.log,Hooks.test);
	}

}
