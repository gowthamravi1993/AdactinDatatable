package org.adactinstepdefinition;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinSearchPage extends AdactinBaseClass{
	AdactinPojoClass p;
	    
		
		@When("user enter the location,hotel,roomtype,numberofrooms")
		public void user_enter_the_location_hotel_roomtype_numberofrooms(DataTable d) {
		    p=new AdactinPojoClass();
		    List<String> li = d.asList();
		    singleDropDownText1(p.getLocation(),li.get(0) );
		    singleDropDownText1(p.getHotel(), li.get(1));
		    singleDropDownText1(p.getRoomtype(), li.get(2));
		    singleDropDownText1(p.getRoomnos(), li.get(3));
		}
		
		@When("user enter the check in date and check out date")
		public void user_enter_the_check_in_date_and_check_out_date(DataTable d) {
			p=new AdactinPojoClass();
			List<String> li = d.asList();
		    clear(p.getDatein());
		    enterText(p.getDatein(), li.get(0));
		    clear(p.getDateout());
		    enterText(p.getDateout(), li.get(1));
		}

		@When("user enter the adults per room,childrens per room")
		public void user_enter_the_adults_per_room_childrens_per_room(DataTable d) {
		   p=new AdactinPojoClass();
		   List<String> li = d.asList();
		   enterText(p.getAdultroom(),li.get(0));
//		   singleDropDownText1(p.getAdultroom(), li.get(0));
		   singleDropDownText1(p.getChildroom(), li.get(1));
		}

		@When("user click search button")
		public void user_click_search_button() {
		   clickElement(p.getSubmitbtn());
		}

		@Then("user see the message next page of the select page")
		public void user_see_the_message_next_page_of_the_select_page() {
		   Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Select Hotel ']")).isDisplayed());
		}
		

		@When("user enter the invalid location,valid hotel,valid roomtype,valid numberofrooms")
		public void user_enter_the_invalid_location_valid_hotel_valid_roomtype_valid_numberofrooms(DataTable d) {
			p=new AdactinPojoClass();
			List<Map<String,String>> map = d.asMaps();
			singleDropDownText1(p.getLocation(),map.get(1).get("location") );
		    singleDropDownText1(p.getHotel(), map.get(1).get("hotel"));
		    singleDropDownText1(p.getRoomtype(), map.get(1).get("roomtype"));
		    singleDropDownText1(p.getRoomnos(), map.get(1).get("numberofrooms"));
			
			
			
		   
		}


		@Then("user see the error message of the displayed")
		public void user_see_the_error_message_of_the_displayed() {
		   
		}


	
	
	
	
	

}
