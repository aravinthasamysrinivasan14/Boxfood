package userAndroid;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;

public class login extends Main {
	
	
	public boolean scrollToEnd;
String phno = "9003490760";
	
	@Test(priority=0)
	  public void login1() throws InterruptedException {
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.TextView"))).click();
		
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.EditText"))).sendKeys(phno);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.boxfood.user:id/txt_next"))).click();
		  Thread.sleep(2000);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.EditText"))).sendKeys("12345678");
		  Thread.sleep(2000);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.boxfood.user:id/txt_next"))).click();
		  
		 
		  
	
	  }
	@Test(priority=1)
	public void order() throws InterruptedException {
		Thread.sleep(3000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.boxfood.user:id/text_view_category_name"))).click();
		
		   //Scroll down method
		 Thread.sleep(2000);
		 
//		 driver.findElement(new AppiumBy.ByAndroidUIAutomator(
//					"new UiScrollable(new UiSelector().scrollable(false)).scrollIntoView(new UiSelector().setAsVerticalList().flingToEnd(10)")).click();
		 try {
	            driver.findElements(new AppiumBy.ByAndroidUIAutomator(
	                    "new UiScrollable(new UiSelector()).setAsVerticalList().flingToEnd(10)"));
	        } catch (Exception e) {
	            // ignore
	        }
	        System.out.println("scrolldown done");
//	        try {
//	        	 driver.findElements(new AppiumBy.ByAndroidUIAutomator(
//	        			 "new UiScrollable(new UiSelector()).setAsHorizontalList().flingToBeginning(10)"));
//	        } catch (Exception e) {
//	            // ignore
//	        }
		 //testrestaurantscbe   ;
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.boxfood.user:id/home_relevence_rv"))).click();
		
		//Meals
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Meals']"))).click();
		
		//quantity 2 times
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.boxfood.user:id/item_qty_plus_img"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.boxfood.user:id/item_qty_plus_img"))).click();
		
		//Add to cart
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Add to Cart']"))).click();

		//checkout
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Checkout']"))).click();
		
		//Scrolldown
		try {
            driver.findElements(new AppiumBy.ByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector()).setAsVerticalList().flingToEnd(10)"));
        } catch (Exception e) {
            // ignore
        }
        System.out.println("scrolldown done");
        
		//promocodes
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Enter Coupon Code']"))).sendKeys("BOXFOOD");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Apply']"))).click();
		
		//Scrolldown
				try {
		            driver.findElements(new AppiumBy.ByAndroidUIAutomator(
		                    "new UiScrollable(new UiSelector()).setAsVerticalList().flingToEnd(10)"));
		        } catch (Exception e) {
		            // ignore
		        }
		        System.out.println("scrolldown done");
		        
		//placed order
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Place Order']"))).click();
		
		//Address conforrmation
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Yes']"))).click();
		
		//Payment method - Cash
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Cash/UPI']"))).click();
		
		//pay
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.Button"))).click();

	}

}
