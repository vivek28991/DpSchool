package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LogInDetails extends LaunchBroser {
	
	
	
	@Test(priority=0)
	public void logInData()
	{
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUserName']"));
		username.sendKeys("Shubhambmc");
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("study2020");
		WebElement submite = driver.findElement(By.xpath("//button[@id='btnLogin']"));
		submite.click();
		WebElement continu = driver.findElement(By.xpath("//a[text()=' Continue']"));
		continu.click();
	}
	

}
