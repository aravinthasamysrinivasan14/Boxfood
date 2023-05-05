package BoxfoodRestaurant;

import org.openqa.selenium.By;

public class Menumanagement extends login{

	public void menumanagement() throws InterruptedException {
		
	Thread.sleep(5000);
	//Menu Management
	driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[3]/ul[1]/li[3]/a[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"pagecontent\"]/div/div/div[1]/h6/button")).click();
	driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/div/input")).sendKeys("nonveg");
	driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[3]/button[2]")).click();
	}
}
