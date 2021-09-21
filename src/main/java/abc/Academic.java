package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Academic extends LogInDetails {
	
	public static Actions ac;
	@Test(priority=1)
	public void academicDetails()
	{
		WebElement academicLink = driver.findElement(By.xpath("(//nav[@class='sidebar']//following::a)[2]"));
		academicLink.click();
		WebElement academic = driver.findElement(By.xpath("//h4[text()='Academic']"));
		academic.click();
		
		
	}
	
	@Test(priority=2)
	public void syllobus() throws InterruptedException
	{
		WebElement syllbus = driver.findElement(By.xpath("//a[contains(text(),'Syllabus')]"));
		syllbus.click();
		WebElement slclass = driver.findElement(By.xpath("//select[@id='ddlClass']"));
		Select sc= new Select(slclass);
		sc.selectByVisibleText("B Tech");
		WebElement slsub = driver.findElement(By.xpath("//select[@id='ddlSubject']"));
		Select ssub=new Select(slsub);
		ssub.selectByVisibleText("Biology");
		WebElement text = driver.findElement(By.xpath("//input[@id='txtTitle']"));
		text.sendKeys("a new subject is add in class");
		/*ac= new Actions(driver);
		WebElement brows = driver.findElement(By.xpath("//a[contains(text(),'Browse')]"));
		//brows.click();
		brows.sendKeys("D:\bill.jpg");
		ac.doubleClick(brows).build().perform();*/

		Thread.sleep(5000);
		WebElement syllbussave = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		syllbussave.click();
		WebElement editbutton = driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-xs'])[3]"));
		editbutton.click();
		WebElement delete = driver.findElement(By.xpath("(//button[@class='btn btn-danger btn-xs'])[3]"));
		delete.click();
		Thread.sleep(3000);
		WebElement deletecancle = driver.findElement(By.xpath("//button[contains(text(),'Cancel')]"));
		deletecancle.click();
		WebElement delete1 = driver.findElement(By.xpath("(//button[@class='btn btn-danger btn-xs'])[3]"));
		delete1.click();
		Thread.sleep(3000);
		WebElement deleteok = driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
		deleteok.click();
	}
	
	@Test(priority=3)
	public void sendExMark() throws InterruptedException
	{
		WebElement exmark = driver.findElement(By.xpath("//a[contains(text(),'Send Exam Marks')]"));
		exmark.click();
		WebElement selectclass = driver.findElement(By.xpath("(//div[@class='p-2']/select)[1]"));
		Select sclass= new Select(selectclass);
		sclass.selectByVisibleText("Nursery A");
		WebElement selectstext = driver.findElement(By.xpath("(//div[@class='p-2']/select)[2]"));
		Select sttext= new Select(selectstext);
		sttext.selectByVisibleText("Test");
		WebElement search = driver.findElement(By.xpath("//div[@class='p-2']/button"));
		search.click();
		WebElement sendmsgforsub = driver.findElement(By.xpath("//button[text()='Send sms for selected subjects']"));
		sendmsgforsub.click();
		WebElement canclemsg = driver.findElement(By.xpath("//button[contains(text(),'Cancel')]"));
		canclemsg.click();
		WebElement sendmsgforsubc = driver.findElement(By.xpath("//button[text()='Send sms for selected subjects']"));
		sendmsgforsubc.click();
		WebElement sendmsg = driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
		sendmsg.click();
		Thread.sleep(5000);
	}
	
	@Test(priority=4)
	public void enterMark() throws InterruptedException
	{
		WebElement clickonmarke = driver.findElement(By.xpath("(//div[@class='btn-group']/button)[1]"));
		clickonmarke.click();
		WebElement subwise = driver.findElement(By.xpath("(//a[contains(text(),'Subject Wise')])[1]"));
		subwise.click();
		WebElement dpsltclass = driver.findElement(By.xpath("(//select[@class='form-control ng-pristine ng-untouched ng-valid'])[1]"));
		Select scclass= new Select(dpsltclass);
		scclass.selectByVisibleText("Nursery A");
		WebElement sltsub = driver.findElement(By.xpath("(//div[@class='p-2']/select)[2]"));
		Select sub= new Select(sltsub);
		sub.selectByVisibleText("English");
		WebElement slttext = driver.findElement(By.xpath("(//div[@class='p-2']/select)[3]"));
		Select subtest= new Select(slttext);
		subtest.selectByVisibleText("Test");
		WebElement getmark = driver.findElement(By.xpath("//button[text()='Get Marks']"));
		getmark.click();
		/*WebElement inputmark1 = driver.findElement(By.xpath("(//input[@class='form-control role ng-pristine ng-untouched ng-valid ng-scope'])[1]"));
		inputmark1.sendKeys("56");
		WebElement inputmaek2 = driver.findElement(By.xpath("(//input[@class='form-control role ng-pristine ng-untouched ng-valid ng-scope'])[2]"));
		inputmaek2.sendKeys("30");
		WebElement markstatus = driver.findElement(By.xpath("(//span[contains(text(),'A')])[2]"));
		markstatus.click();
		WebElement markcancle = driver.findElement(By.xpath("(//button[text()='Cancel'])[2]"));
		markcancle.click();*/
		Thread.sleep(5000);
		WebElement clickonmarke1 = driver.findElement(By.xpath("(//div[@class='btn-group']/button)[1]"));
		clickonmarke1.click();
		WebElement uploadmark = driver.findElement(By.xpath("//a[text()='Upload Exam Marks']"));
		uploadmark.click();
		WebElement slclass = driver.findElement(By.xpath("(//div[@class='col-sm-4']/select)[1]"));
		Select sclass=new Select(slclass);
		sclass.selectByVisibleText("Nursery A");
		WebElement sllclass = driver.findElement(By.xpath("(//div[@class='col-sm-4']/select)[2]"));
		Select classsl= new Select(sllclass);
		classsl.selectByVisibleText("Hindi");
		WebElement sedultext = driver.findElement(By.xpath("(//div[@class='col-sm-4']/select)[3]"));
		Select sltext= new Select(sedultext);
		sltext.selectByVisibleText("Test");
	}

}
