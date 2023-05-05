package Boxfoodadmin;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.google.common.collect.Table.Cell;

public class Login {
	

	static Path path = Paths.get("");

	static String directoryName = path.toAbsolutePath().toString();

	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Cell cell;
	public String baseurl = "https://dev.notifynow.uk/login";

}
