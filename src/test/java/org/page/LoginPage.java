package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(id = "password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(id = "login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	@FindBy(id = "location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	@FindBy(id = "hotels")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}

	@FindBy(id = "room_type")
	private WebElement room_type;

	public WebElement getRoom_type() {
		return room_type;
	}

	@FindBy(id = "room_nos")
	private WebElement room_nos;

	public WebElement getRoom_nos() {
		return room_nos;
	}

	@FindBy(id = "datepick_in")
	private WebElement datepick_in;

	public WebElement getDatepick_in() {
		return datepick_in;
	}

	@FindBy(id = "datepick_out")
	private WebElement datepick_out;

	public WebElement getDatepick_out() {
		return datepick_out;
	}

	@FindBy(id = "adult_room")
	private WebElement adult_room;

	public WebElement getAdult_room() {
		return adult_room;
	}

	@FindBy(id = "child_room")
	private WebElement child_room;

	public WebElement getChild_room() {
		return child_room;
	}

	@FindBy(id = "Submit")
	private WebElement Submit;

	public WebElement getSubmit() {
		return Submit;
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;

	public WebElement getRadiobutton_0() {
		return radiobutton;
	}

	@FindBy(id = "continue")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}

	@FindBy(id = "first_name")
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}

	@FindBy(id = "last_name")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}

	@FindBy(id = "address")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}

	@FindBy(id = "cc_num")
	private WebElement ccnum;

	public WebElement getCcnum() {
		return ccnum;
	}

	@FindBy(id = "cc_type")
	private WebElement cctype;

	public WebElement getCctype() {
		return cctype;
	}

	@FindBy(id = "cc_exp_month")
	private WebElement expmonth;

	public WebElement getExpmonth() {
		return expmonth;
	}

	@FindBy(id = "cc_exp_year")
	private WebElement expyear;

	public WebElement getExpyear() {
		return expyear;
	}

	@FindBy(id = "cc_cvv")
	private WebElement cvvnum;

	public WebElement getCvvnum() {
		return cvvnum;
	}

	@FindBy(id = "book_now")
	private WebElement booknow;

	public WebElement getBooknow() {
		return booknow;
	}

}
