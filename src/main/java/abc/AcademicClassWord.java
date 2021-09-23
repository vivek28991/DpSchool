package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AcademicClassWord extends AcademicAction {
	
	@Test(priority=7)
	public void classWord() throws InterruptedException
	{
		WebElement academicLink = driver.findElement(By.xpath("(//nav[@class='sidebar']//following::a)[2]"));
		academicLink.click();
		WebElement academic = driver.findElement(By.xpath("//h4[text()='Classwork']"));
		academic.click();
		WebElement sellectClass = driver.findElement(By.xpath("//select[@id='ddlClassName']"));
		Select Slvalidclass= new Select(sellectClass);
		Slvalidclass.selectByVisibleText("Nursery A");
		WebElement selectsub = driver.findElement(By.xpath("//select[@id='ddlSubject']"));
		Select slsub= new Select(selectsub);
		slsub.selectByVisibleText("Hindi");
		WebElement assigment = driver.findElement(By.xpath("//select[@id='ddlIsAssigned']"));
		Select slassigment= new Select(assigment);
		slassigment.selectByVisibleText("Assigned");
		WebElement startdate = driver.findElement(By.xpath("//input[@id='startDate']"));
		startdate.sendKeys("01-Sep-2021");
		WebElement enddate = driver.findElement(By.xpath("//input[@id='endDate']"));
		enddate.sendKeys("14-Sep-2021");
		WebElement search = driver.findElement(By.xpath("//button[@id='btnSearch']"));
		search.click();
		Thread.sleep(5000);
		WebElement reset = driver.findElement(By.xpath("//button[@id='btnReset']"));
		reset.click();
		WebElement createclass = driver.findElement(By.xpath("(//div[@class='p-2'])[4]"));
		createclass.click();
	}

}
