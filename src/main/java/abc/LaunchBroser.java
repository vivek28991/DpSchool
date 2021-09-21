package abc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class LaunchBroser {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void launchBroser()
	{
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver=new ChromeDriver();
		
		
	}
	
	@BeforeTest
	public void browserDetail()
	{
		driver.get("https://demo.scientificstudy.in/login#/feemis");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().length());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl().length());
	}
	
	/*@AfterTest
	public void closeBroser() throws InterruptedException
	{
		driver.close();
		Thread.sleep(10000);
	}
	
	@AfterSuite
	public void quiteBrose() throws InterruptedException
	{
		driver.quit();
		Thread.sleep(10000);
	}
*/
}
