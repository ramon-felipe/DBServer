package pages;

import org.openqa.selenium.By;

import base.BasePage;
import helper.FileHelper;

public class SignInPage extends BasePage {

	public SignInPage FillEmail(String text) {
		super.dsl.SendKeys("Email address", text);
		FileHelper.TakeScreenShot();
		
		return this;
	}
	
	public SignInPage FillFields(String email, 
			                     String firstName, 
			                     String lastName, 
			                     String password, 
			                     String dayOfBirth, 
			                     String monthOfBirth,
			                     String yearOfBirth,
			                     String company,
			                     String adress,
			                     String city,
			                     String state,
			                     String zipCode,
			                     String homePhone,
			                     String mobilePhone) {		
		this.FillEmail(email);
		super.dsl.Click(By.xpath("//button[@id='SubmitCreate']"));
		super.dsl.ClickOnRadioButton("Mr.");
		super.dsl.SendKeys("First name", firstName);
		super.dsl.SendKeys("Last name", lastName);
		super.dsl.SendKeys("Password", password);
		FileHelper.TakeScreenShot();
		dsl.waitHelper.Sleep(1);
		
		super.dsl.SelectComboValue("Date of Birth", "days", dayOfBirth);
		super.dsl.SelectComboValue("Date of Birth", "months", monthOfBirth);
		super.dsl.SelectComboValue("Date of Birth", "years", yearOfBirth);
		super.dsl.SendKeys("Company", company);
		super.dsl.SendKeys("Address", adress);
		dsl.waitHelper.Sleep(1);
		
		super.dsl.SendKeys("City", city);
		super.dsl.SelectComboOption("State", state);
		super.dsl.SendKeys("Zip/Postal Code", zipCode);
		super.dsl.SendKeys("Home phone", homePhone);
		super.dsl.SendKeys("Mobile phone", mobilePhone);
		
		super.dsl.ClickOnButton("Register");
		FileHelper.TakeScreenShot();
		
		return this;
	}
	
}
