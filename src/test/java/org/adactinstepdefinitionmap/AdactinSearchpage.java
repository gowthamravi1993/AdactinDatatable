package org.adactinstepdefinitionmap;

import java.util.List;
import java.util.Map;


import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinSearchpage extends AdactinBaseClass {
	
	public AdactinPojoClass p;
	
	@When("user enter the location,hotel,roomtype,numberofrooms")
	public void user_enter_the_location_hotel_roomtype_numberofrooms(DataTable d) {
	   p = new AdactinPojoClass();
	   List<Map<String, String>> m = d.asMaps();
	   Map<String, String> map = m.get(0);
	   String s = map.get("location");
	   singleDropDownText1(p.getLocation(), s);
	   singleDropDownText1(p.getHotel(), m.get(0).get("hotel"));
	   singleDropDownText1(p.getRoomtype(), m.get(0).get("roomtype"));
	   singleDropDownText1(p.getRoomnos(), m.get(0).get("numberofrooms"));
	}

	@When("user enter the check in date and check out date")
	public void user_enter_the_check_in_date_and_check_out_date(DataTable d) {
		p=new AdactinPojoClass();
		List<Map<String, String>> m = d.asMaps();
		clear(p.getDatein());
		enterText(p.getDatein(), m.get(0).get("check in date"));
		clear(p.getDateout());
		enterText(p.getDateout(), m.get(0).get("check out date"));
	    
	}

	@When("user enter the adults per room,childrens per room")
	public void user_enter_the_adults_per_room_childrens_per_room(DataTable d) {
		p=new AdactinPojoClass();
		List<Map<String, String>> m = d.asMaps();
		singleDropDownText1(p.getAdultroom(),m.get(0).get("adults per room"));
		singleDropDownText1(p.getChildroom(), m.get(0).get("childrens per room"));
	}

	@When("user click search button")
	public void user_click_search_button() {
		p=new AdactinPojoClass();
		clickElement(p.getSubmitbtn());
	   
	}

	@Then("user see the message next page of the select page")
	public void user_see_the_message_next_page_of_the_select_page() {
		Assert.assertTrue(driver.findElement(By.xpath("//td[text()='Select Hotel ']")).isDisplayed());
	   
	}
}
