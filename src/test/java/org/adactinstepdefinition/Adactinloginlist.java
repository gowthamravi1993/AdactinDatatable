package org.adactinstepdefinition;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.core.api.Scenario;
import io.cucumber.core.logging.Logger;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactinloginlist extends AdactinBaseClass {
	AdactinPojoClass p;
	@Given("user launch Adactin application")
	public void user_launch_Adactin_application() {
		launchUrl("http://adactinhotelapp.com/");   
	}

	@When("user enter username and password")
	public void user_enter_username_and_password(DataTable d) {
		
		p=new AdactinPojoClass();
		List<List<String>> li= d.asLists();	
		List<String> secondlist = li.get(0);
		enterText(p.getElement(),secondlist.get(0));
		enterText(p.getEnterpass(),secondlist.get(1));	
}
	@When("user click login button")
	public void user_click_login_button() {
		p=new AdactinPojoClass();
		clickElement(p.getClkbtn()); 	  
	}

	@Then("user see the next page Welcome to Adactin Group of Hotels")
	public void user_see_the_next_page_Welcome_to_Adactin_Group_of_Hotels() {
		Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']")).isDisplayed());
	}
		@When("user enter valid username and invalid password")
		public void user_enter_valid_username_and_invalid_password(DataTable d) {
			p=new AdactinPojoClass();
			Map<String,String> map = d.asMap(String.class, String.class);
			enterText(p.getElement(), map.get("username"));
			enterText(p.getEnterpass(), map.get("password"));
			
		   
		}

		@Then("user see the error message of invalid login")
		public void user_see_the_error_message_of_invalid_login() {
			
			
		   
		}

		@When("user enter invalid username and valid password")
		public void user_enter_invalid_username_and_valid_password(DataTable d) {
			p=new AdactinPojoClass();
			List<Map<String, String>> map = d.asMaps();
			enterText(p.getElement(),map.get(1).get("username"));
			enterText(p.getEnterpass(), map.get(1).get("password"));
		   
		}

		@Then("user see the error message of result based")
		public void user_see_the_error_message_of_result_based() {
		    
		}

		@When("user enter username {string}and password {string}")
		public void user_enter_username_and_password(String name, String password) {
			p=new AdactinPojoClass();
			enterText(p.getElement(), name);
			enterText(p.getEnterpass(), password);
			
		}

		@Then("user see the result based on credential type {string}")
		public void user_see_the_result_based_on_credential_type(String type) {
			   if (type.equals("positive")) {
				   Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Welcome to Adactin Group of Hotels']")).isDisplayed());   
				
			}else {
				Assert.assertTrue(driver.findElement(By.xpath("//b[text()='Invalid Login details or Your Password might have expired. ']")).isDisplayed());
			}
			
		   
		}
	

	
	}

