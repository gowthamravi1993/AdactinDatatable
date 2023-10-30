package org.adactinstepdefinitionmap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinHotelBookingPage extends AdactinBaseClass {
 public	AdactinPojoClass p;
 
 

	 @When("user enter the firstname,lastname,Address,credit card number")
	 public void user_enter_the_firstname_lastname_Address_credit_card_number(DataTable d) {
	     p=new AdactinPojoClass();
	     List<Map<String, String>> map = d.asMaps();
	     enterText(p.getFirstname(), map.get(0).get("firstname"));
	     enterText(p.getLastname(), map.get(0).get("lastname"));
	     enterText(p.getAddressname(),map.get(0).get("Address"));
	     enterText(p.getCcnum(), map.get(0).get("credit card number"));
	     
	 }

	 @When("user select the credit card type,expiry month,expiry year,enter the cvv number")
	 public void user_select_the_credit_card_type_expiry_month_expiry_year_enter_the_cvv_number(DataTable d) {
		 p=new AdactinPojoClass();
	     List<Map<String, String>> map = d.asMaps();
	     singleDropDownText1(p.getCctype(), map.get(0).get("credit card type"));
	     singleDropDownText1(p.getCcexpmonth(), map.get(0).get("expiry month"));
	     singleDropDownText1(p.getCcexpyear(), map.get(0).get("expiry year"));
	     enterText(p.getCccvv(), map.get(0).get("enter the cvv number"));
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
		 Thread.sleep(4000);
		 System.out.println("orderno:\n"+getAttributeValue(p.getOrderno(), "value"));
	 }

	 @Then("user logout the page")
	 public void user_logout_the_page() {
		 clickElement(p.getLogout());
		 System.out.println("logout successfully");
		Assert.assertTrue(driver.findElement(By.xpath("//td[text()='You have successfully logged out. ']")).isDisplayed());
		 
	    
	 }


 
 

}
