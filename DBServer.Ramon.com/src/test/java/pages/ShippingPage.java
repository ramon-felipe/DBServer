package pages;

import org.openqa.selenium.By;

import base.BasePage;
import helper.FileHelper;

public class ShippingPage extends BasePage {

	public ShippingPage AgreeWithTerms() {
		dsl.Click(By.xpath("//label[contains(text(), 'I agree to the terms of service')]"));	
		FileHelper.TakeScreenShot();
		
		return this;
	}
	
	public PaymentPage ProceedToCheckout() {
		dsl.ClickOnButton("Proceed to checkout");
		FileHelper.TakeScreenShot();
		
		return new PaymentPage();
	}	
}
