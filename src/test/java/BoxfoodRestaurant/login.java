package BoxfoodRestaurant;


import org.openqa.selenium.By;

public class login extends BaseClass {

		 public void logins() throws InterruptedException {
						
			Thread.sleep(5000);
			
			//username
			driver.findElement(By.id("login_username")).sendKeys("restauranttime@mailinator.com");
			
			//password
			driver.findElement(By.xpath("//input[@name='login_pass']")).sendKeys("12345678");
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//button[@type='submit']")).submit();
			Thread.sleep(5000);
			//Order history
			driver.findElement(By.xpath("//a[normalize-space()='ORDERS HISTORY']")).click();
			
			//Order Toast message
//			WebElement element = wait.until(
//			ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'toaster\']/div/div[2]/h2")));
//			driver.findElement(By.xpath("//*[@id=\'toaster\']/div/div[2]/h2"));
//			element.click();
}
		
		
	}
	
