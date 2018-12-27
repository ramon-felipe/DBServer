package pages;

import org.openqa.selenium.By;

import base.BasePage;
import helper.FileHelper;

public class SummaryPage extends BasePage {

	public String GetProductDescription(String XPath) {						
		return super.dsl.GetElementText(By.xpath(XPath));
	}
	
	public SignInPage ProceedToCheckout() {
		super.dsl.Click(By.xpath("//div[@id='columns']//a[@title='Proceed to checkout']"));		
		FileHelper.TakeScreenShot();
		
		return new SignInPage();
	}
	
}
