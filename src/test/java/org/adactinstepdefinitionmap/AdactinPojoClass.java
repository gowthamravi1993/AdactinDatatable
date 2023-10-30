package org.adactinstepdefinitionmap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPojoClass extends AdactinBaseClass {
	public AdactinPojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement element;
	@FindBy(id = "password")
	private WebElement enterpass;
	@FindBy(name = "login")
	private WebElement clkbtn;
	@FindBy(name = "location")
	private WebElement location;
	@FindBy(name = "hotels")
	private WebElement hotel;
	@FindBy(id = "room_type")
	private WebElement roomtype;
	@FindBy(id = "room_nos")
	private WebElement roomnos;
	@FindBy(id = "datepick_in")
	private WebElement datein;
	@FindBy(id = "datepick_out")
	private WebElement dateout;
	@FindBy(id = "adult_room")
	private WebElement adultroom;
	@FindBy(id = "child_room")
	private WebElement childroom;
	@FindBy(id = "Submit")
	private WebElement submitbtn;
	@FindBy(id = "radiobutton_0")
	private WebElement radio;
	@FindBy(id = "continue")
	private WebElement con;
	@FindBy(name = "first_name")
	private WebElement firstname;
	@FindBy(id = "last_name")
	private WebElement lastname;
	@FindBy(id = "address")
	private WebElement addressname;
	@FindBy(name = "cc_num")
	private WebElement ccnum;
	@FindBy(id = "cc_type")
	private WebElement cctype;
	@FindBy(id = "cc_exp_month")
	private WebElement ccexpmonth;
	@FindBy(name = "cc_exp_year")
	private WebElement ccexpyear;
	@FindBy(name = "cc_cvv")
	private WebElement cccvv;
	@FindBy(name = "book_now")
	private WebElement booknow;
	@FindBy(id = "order_no")
	private WebElement orderno;
	@FindBy(id = "logout")
	private WebElement logout;
	@FindBy(xpath = "//td[text()='Book A Hotel ']")
	private WebElement hotelname;

	public WebElement getHotelname() {
		return hotelname;

	}

	public WebElement getElement() {
		return element;
	}

	public WebElement getEnterpass() {
		return enterpass;
	}

	public WebElement getClkbtn() {
		return clkbtn;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getcon() {
		return con;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddressname() {
		return addressname;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCccvv() {
		return cccvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getLogout() {
		return logout;
	}
}
