package org.adactinstepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinContinuePage extends AdactinBaseClass {
	AdactinPojoClass p;
	@When("user select the hotel")
	public void user_select_the_hotel() {
		p=new AdactinPojoClass();
		clickElement(p.getRadio());
	   
	}

	@Then("user click continue button")
	public void user_click_continue_button() {
		p=new AdactinPojoClass();
		clickElement(p.getcon());
	}



}
