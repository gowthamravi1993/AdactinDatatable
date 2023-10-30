package org.flight;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Baseclass {
	public Login() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "inboundcity")
	private WebElement elementfrom;
	
	
	@FindBy(id = "outboundcity")
	private WebElement elementto;
	

	@FindBy(xpath = "//li[text()='Cyprus'][1]")
	private WebElement country1;

	public WebElement getElementfrom() {
		return elementfrom;
	}

	public WebElement getElementto() {
		return elementto;
	}

	

	public WebElement getCountry1() {
		return country1;
	}

	

	
//	public WebElement setCountry() {
//		return country;
//	}
	@FindBy(xpath = "(//div[@class='list-column'])[1]")
	private WebElement country;

	
	public WebElement getCountry() {
		return country;
	}
}

//	public void setValue (WebElement element ,String value) {
//		element.click();
//	}

//	 @FindBy(id="username")
//		private WebElement element;
//	 
