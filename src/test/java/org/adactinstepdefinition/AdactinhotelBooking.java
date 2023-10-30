package org.adactinstepdefinition;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinhotelBooking extends AdactinBaseClass {
	AdactinPojoClass p;

	@When("user enter the firstname,lastname,Address,credit card number")
	public void user_enter_the_firstname_lastname_Address_credit_card_number(
			DataTable d) {
		p=new AdactinPojoClass();
		List<String> li = d.asList();
		enterText(p.getFirstname(),li.get(0));
		enterText(p.getLastname(), li.get(1));
		enterText(p.getAddressname(),li.get(2));
		enterText(p.getCcnum(), li.get(3));	
	}

	@When("user select the credit card type,expiry month,expiry year,enter the cvv number")
	public void user_select_the_credit_card_type_expiry_month_expiry_year_enter_the_cvv_number(DataTable d) {
		p=new AdactinPojoClass();
		List<String> li = d.asList();
		singleDropDownText1(p.getCctype(), li.get(0));
		singleDropDownText1(p.getCcexpmonth(), li.get(1));
		singleDropDownText1(p.getCcexpyear(), li.get(2));
		enterText(p.getCccvv(), li.get(3));
	}

	@When("user click book now button")
	public void user_click_book_now_button() throws InterruptedException {
		p=new AdactinPojoClass();
		clickElement(p.getBooknow());
		Thread.sleep(4000);
	}

	@When("order number is generated")
	public void order_number_is_generated() throws InterruptedException {
		p=new AdactinPojoClass();
		Thread.sleep(3000);	

		System.out.println("order no");
		System.out.println(getAttributeValue(p.getOrderno(),"value"));
	}

	@Then("user logout the page")
	public void user_logout_the_page() {
		p=new AdactinPojoClass();
		clickElement(p.getLogout());
		System.out.println("logout the page");
		Assert.assertTrue(driver.findElement(By.id("//td[text()='You have successfully logged out. ']")).isDisplayed());
	}
	

	@When("user enter the firstname,lastname,Address,invalid credit card number")
	public void user_enter_the_firstname_lastname_Address_invalid_credit_card_number(DataTable d) {
		p=new AdactinPojoClass();
		List<Map<String, String>> map = d.asMaps();
		enterText(p.getFirstname(),map.get(0).get("firstname"));
		enterText(p.getLastname(),map.get(0).get("lastname"));
		enterText(p.getAddressname(),map.get(0).get("address"));
		enterText(p.getCcnum(), map.get(0).get("credit card number"));	
		
		
//		singleDropDownText1(p.getFirstname(), map.get(0).get("firstname"));
//		singleDropDownText1(p.getLastname(), map.get(0).get("lastname"));
//		singleDropDownText1(p.getAddressname(), map.get(0).get("address"));
//		enterText(p.getCcnum(), map.get(0).get("credit card number"));
	}

	@Then("user see the error message")
	public void user_see_the_error_message() {
		Assert.assertTrue(driver.findElement(By.xpath("	//label[contains(text(),'Credit')]")).isDisplayed());
	   
	}
	

}
