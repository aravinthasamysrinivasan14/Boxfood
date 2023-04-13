package userAndroid;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

import java.net.URL;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Main {

	public static AndroidDriver driver;
	public static WebDriverWait wait;
  @BeforeTest
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
    desiredCapabilities.setCapability("appium:app", "C:\\Users\\Hxtreme\\Downloads\\boxfood_v2_user_dev.apk");
    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
    desiredCapabilities.setCapability("autoGrantPermissions", true);
    URL remoteUrl = new URL("http://127.0.0.1:4723/");
    driver = new AndroidDriver(remoteUrl, desiredCapabilities);

	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  }

  
 
}