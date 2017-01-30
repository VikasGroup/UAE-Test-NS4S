package com.steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.uae.CheckoutPgObject;
import com.uae.ProductsPgObjects;
import com.uae.VODashboard;

import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class IRandRetailPurchase {
	@Steps
	@Managed
	WebDriver driver;
	
	VODashboard vODashboard;
	ProductsPgObjects productsPgObjects;
	CheckoutPgObject checkoutPgObject;
	
	@When("^user click on products tab$")
	public void user_click_on_products_tab() throws Throwable {
	   vODashboard.clickproduct();
	 
	}

	@When("^user click on products link$")
	public void user_click_on_products_link() throws Throwable {
	  // vODashboard.clickHomePure();
	 vODashboard.clickVTube();
	 Thread.sleep(5000);


	}

	@When("^user add products to the cart$")
	public void user_add_products_to_the_cart() throws Throwable {
		  Thread.sleep(5000);
//		productsPgObjects.clickCart();
	productsPgObjects.clickclearcart();
//		Thread.sleep(2000);
//		productsPgObjects.clickCart();
//		Thread.sleep(5000);
	   productsPgObjects.clickProd1();
	   Thread.sleep(2000);
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(3000);
	   productsPgObjects.clickAdd2cart();
	   Thread.sleep(5000);
		 
	}

	@When("^user click on shopping cart$")
	public void user_click_on_shopping_cart() throws Throwable {  
	 productsPgObjects.clickCart();
	 productsPgObjects.clickCheckOut();
	}

	@When("^user click on checkout button$")
	public void user_click_on_checkout_button() throws Throwable {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,700)", "");
	   
	   Thread.sleep(2000);
	   checkoutPgObject.check1();
	   checkoutPgObject.check2();
		
	   checkoutPgObject.clickChkPro();
	   Thread.sleep(9000);
	}

	@When("^select delivery option and click checkout \"([^\"]*)\"$")
	public void select_delivery_option_and_click_checkout(String arg1) throws Throwable {
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollBy(0,1000)", "");
	   checkoutPgObject.clickcount_btn();
	   Thread.sleep(5000);
	 
	}

	@When("^User distribute the BVs and click on countinue$")
	public void user_distribute_the_BVs_and_click_on_countinue() throws Throwable {
	   checkoutPgObject.disributrBV();
	   checkoutPgObject.disributrBV();
	   checkoutPgObject.disributrBV();
	   checkoutPgObject.disributrBV();
	   checkoutPgObject.disributrBV();
	   
	   checkoutPgObject.disributrBV();
	   checkoutPgObject.disributrBV();
	   checkoutPgObject.disributrBV();
	   checkoutPgObject.disributrBV();
	   checkoutPgObject.disributrBV();
	   
	   checkoutPgObject.disributrBV();
	   checkoutPgObject.disributrBV();
	   checkoutPgObject.disributrBV();
	   checkoutPgObject.disributrBV();
	   checkoutPgObject.disributrBV();
	   
	   checkoutPgObject.clickProceed();
	   Thread.sleep(5000);
	 
	}

	@When("^Enter purchase ecard details and validate \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_purchase_ecard_details_and_validate(String arg1, String arg2) throws Throwable {
	  checkoutPgObject.enterEcard(arg1);
	  Thread.sleep(2000);
	  checkoutPgObject.enterEcardPin(arg2);
	  checkoutPgObject.clickValidate();
	  Thread.sleep(2000);
	  checkoutPgObject.clickEcardCon();
	  Thread.sleep(2000);
	}
	
	@When("^user choose credit card option$")
	public void user_choose_credit_card_option() throws Throwable {
	    
	}

	@When("^enter Credit card details \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\"$")
	public void enter_Credit_card_details(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	   
	}
}
