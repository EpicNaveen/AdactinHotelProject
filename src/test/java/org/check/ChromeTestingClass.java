package org.check;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ChromeTestingClass extends BaseClass {

	@Parameters({ "Browser" })
	@Test(priority = 1)
	public static void tc01(String Browser) {

		try {
			getDriver(Browser);
			windMax();
			System.out.println("Chrome Browser Launch Successfullly");
		} catch (Exception e) {
			System.out.println("Chrome Browser is not Launched" + "Error_" + e.getMessage());
		}

		try {
			getUrl("https://adactinhotelapp.com/");
			System.out.println("URL launched  Successfullly");
		} catch (Exception e) {
			System.out.println("URL is not launch" + "Error_" + e.getMessage());
		}

	}

	@Parameters({ "username", "password" })
	@Test(priority = 2)
	public void tc02(String user, String pass) throws InterruptedException {

		try {
			LoginPage a = new LoginPage();
			WebElement username = a.getUsername();
			// textSendBasedOnJS(excelRead(1, 0), username);
			username.sendKeys(user);

			WebElement password = a.getPassword();
			// textSendBasedOnJS(excelRead(1, 1), password);
			password.sendKeys(pass);

			WebElement login = a.getLogin();
			login.click();

			System.out.println("Login successfull");

		} catch (Exception e) {
			System.out.println("Login Error" + "Error_" + e.getMessage());

		}

	}

	@Test(priority = 3)

	public void tc03() {

		try {

			LoginPage a = new LoginPage();

			WebElement location = a.getLocation();
			selectMethod(location, excelRead(1, 2));

			WebElement hotels = a.getHotels();
			selectMethod(hotels, excelRead(1, 3));

			WebElement room_type = a.getRoom_type();
			selectMethod(room_type, excelRead(1, 4));

			WebElement room_nos = a.getRoom_nos();
			selectMethod(room_nos, excelRead(1, 5));

			WebElement datepick_in = a.getDatepick_in();
			textSendBasedOnJS(excelRead(1, 6), datepick_in);

			WebElement datepick_out = a.getDatepick_out();
			textSendBasedOnJS(excelRead(1, 7), datepick_out);

			WebElement adult_room = a.getAdult_room();
			selectMethod(adult_room, excelRead(1, 8));

			WebElement child_room = a.getChild_room();
			selectMethod(child_room, excelRead(1, 9));

			WebElement submit = a.getSubmit();
			submit.click();

			WebElement radiobutton_0 = a.getRadiobutton_0();
			radiobutton_0.click();

			WebElement search = a.getSearch();
			search.click();

			System.out.println("Hotel select successfull");
		} catch (Exception e) {
			System.out.println("Hotel is not selected" + "Error_" + e.getMessage());
		}
	}

	@Test(priority = 4)
	public void tc04() {

		try {
			LoginPage a = new LoginPage();
			WebElement firstname = a.getFirstname();
			textSendBasedOnJS(excelRead(4, 1), firstname);

			WebElement lastname = a.getLastname();
			textSendBasedOnJS(excelRead(4, 2), lastname);

			WebElement address = a.getAddress();
			address.sendKeys("Karur,TamilNadu");

			WebElement ccnum = a.getCcnum();
			textSendBasedOnJS(excelRead(4, 4), ccnum);

			WebElement cctype = a.getCctype();
			selectMethod(cctype, excelRead(4, 5));

			WebElement expmonth = a.getExpmonth();
			selectMethod(expmonth, excelRead(4, 6));

			WebElement expyear = a.getExpyear();
			selectMethod(expyear, excelRead(4, 7));

			WebElement cvvnum = a.getCvvnum();
			textSendBasedOnJS(excelRead(4, 8), cvvnum);

			System.out.println("Hotel is Booked");
		} catch (Exception e) {
			System.out.println("Hotel is Booked not Booked" + "Error_" + e.getMessage());
		}
	}

	@Test(priority = 5)
	public static void tc05() {

		LoginPage a = new LoginPage();

		WebElement booknow = a.getBooknow();
		booknow.click();

	}

}