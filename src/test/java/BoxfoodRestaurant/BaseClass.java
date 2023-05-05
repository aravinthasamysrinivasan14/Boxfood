package BoxfoodRestaurant;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriverWait wait;
	public static WebDriver driver;
	public static JavascriptExecutor js;
	
	
	@BeforeTest
	public void setup() throws InterruptedException {
		
	    ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*","disable-infobars","--incognito");
        
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
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(8000);
		driver.get("https://devres.boxfood.in");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
	}
	
	     @Test(priority = 0)
	     public void Callmethod1() throws InterruptedException {
	    	 login l1 = new login();
	    	 l1.logins();
	    	 
	     }
	     
	     @Test(priority = 1)
	     public void Callmethod2() throws InterruptedException {
	    	 Menumanagement m1 = new Menumanagement();
	    	 m1.menumanagement();
	     }
	    		 
}
