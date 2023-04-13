package soldius;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fuctionflow {
	@Test
	public void logins() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*,--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://solidus.io/");
	}
}
