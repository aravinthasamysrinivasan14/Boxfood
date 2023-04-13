package BoxfoodRestaurant;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	public static WebDriverWait wait;
	public static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		//notification parms
		Map<String, Object> contentSettings = new HashMap<String, Object>();
		Map<String, Object> prefs = new HashMap<String, Object>();
	    Map<String, Object> profile = new HashMap<String, Object>();
	    // SET CHROME OPTIONS
	    // 0 - Default, 1 - Allow, 2 - Block
	    contentSettings.put("notifications", 1);
	    profile.put("managed_default_content_settings", contentSettings);
	    prefs.put("profile", profile);
	    options.setExperimentalOption("prefs", prefs);
	    
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://devres.boxfood.in/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	     @Test
		 public void logins() throws InterruptedException {
						
			
			
			//username
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testrestaurantscbe@mailinator.com");
			
			//password
			driver.findElement(By.xpath("//input[@name='login_pass']")).sendKeys("12345678");
			
			//submit
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			//Order history
			driver.findElement(By.xpath("//a[normalize-space()='ORDERS HISTORY']")).click();
			
			//Order Toast message
			WebElement element = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'toaster\']/div/div[2]/h2")));
			driver.findElement(By.xpath("//*[@id=\'toaster\']/div/div[2]/h2")).click();
}
		
		@Test
		public void MenuManagement() {
			
			driver.findElement(By.xpath("//a[normalize-space()='MENU MANAGEMENT']")).click();
			
		}
	}
	
