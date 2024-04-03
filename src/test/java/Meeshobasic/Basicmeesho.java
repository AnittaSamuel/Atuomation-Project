package Meeshobasic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Basicmeesho {
	public static WebDriver driver;
	 
	 @BeforeTest
	 public void setUp()
	 {
		 driver=new ChromeDriver();
		 driver.get("https://shoppydigital.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	 }
	 @AfterTest
	 public void meeshoo()
	 {
		 System.out.println("After test execution..");
	 }
	

}
