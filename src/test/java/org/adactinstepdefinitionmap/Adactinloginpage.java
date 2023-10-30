package org.adactinstepdefinitionmap;

	import java.util.List;
	import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class Adactinloginpage extends AdactinBaseClass {
		AdactinPojoClass p;
		@Given("user launch Adactin application")
		public void user_launch_Adactin_application() {
			browserlaunch();
			launchUrl("http://adactinhotelapp.com/");
			maximizeBrowser();
		    
		}

//		@When("user enter username and password")
//		public void user_enter_username_and_password(DataTable d) {
//			p=new AdactinPojoClass();
//			Map<String, String> Map = d.asMap(String.class,String.class);
//			enterText(p.getElement(), Map.get("username"));
//			enterText(p.getEnterpass(),Map.get("password"));
	//}
		@When("user enter username and password")
		public void user_enter_username_and_password(DataTable d) {
			p=new AdactinPojoClass();
		List<Map<String, String>> Maps = d.asMaps();
//			Map<String, String> Map = (java.util.Map<String, String>) d.asMaps(String.class,String.class);
			enterText(p.getElement(), Maps.get(0).get("username"));
			enterText(p.getEnterpass(),Maps.get(0).get("password") );
			
			
//			enterText(p.getEnterpass(),Map.get("password"));
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


		
		

	}


