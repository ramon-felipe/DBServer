package pages;

import org.openqa.selenium.By;

import base.BasePage;
import helper.FileHelper;

public class PaymentPage extends BasePage {
	
	private double CalculateTotalPrice() {
		double totalProduct = Double.parseDouble(dsl.GetElementText(By.xpath("//td[@id='total_product']")).substring(1));
		double totalShipping = Double.parseDouble(dsl.GetElementText(By.xpath("//td[@id='total_shipping']")).substring(1));
		double tax = Double.parseDouble(dsl.GetElementText(By.xpath("//td[@id='total_tax']")).substring(1));
		
		return totalProduct + totalShipping + tax;
	}
	
	public String GetTotalPriceCalculated() {
		return "$" + Double.toString(this.CalculateTotalPrice());
	}
	
	public String GetTotalPrice() {
		return dsl.GetElementText(By.xpath("//span[@id='total_price']"));
	}	
	
	public PaymentPage SelectPaymentMethod(String paymentMethod) {
		dsl.Click("//div[@id='HOOK_PAYMENT']//p[contains(@class, 'payment_module')]/a[@class='" + paymentMethod + "']");
		FileHelper.TakeScreenShot();
		
		return this;
	}
	
	public PaymentPage ConfirmOrder() {
		dsl.ClickOnButton("I confirm my order");
		FileHelper.TakeScreenShot();
		
		return this;
	}
	
	public String GetOrderCompletePhrase() {
		FileHelper.TakeScreenShot();
		
		return dsl.GetElementText(By.xpath("//p[@class='cheque-indent']"));
	}
}
